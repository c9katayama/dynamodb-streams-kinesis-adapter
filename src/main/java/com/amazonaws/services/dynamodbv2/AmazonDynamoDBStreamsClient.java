/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeStreamResult;
import com.amazonaws.services.dynamodbv2.model.ExpiredIteratorException;
import com.amazonaws.services.dynamodbv2.model.GetRecordsRequest;
import com.amazonaws.services.dynamodbv2.model.GetRecordsResult;
import com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest;
import com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult;
import com.amazonaws.services.dynamodbv2.model.InternalServerErrorException;
import com.amazonaws.services.dynamodbv2.model.LimitExceededException;
import com.amazonaws.services.dynamodbv2.model.ListStreamsRequest;
import com.amazonaws.services.dynamodbv2.model.ListStreamsResult;
import com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException;
import com.amazonaws.services.dynamodbv2.model.TrimmedDataAccessException;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeStreamRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.DescribeStreamResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ExpiredIteratorExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.GetRecordsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.GetRecordsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.GetShardIteratorRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.GetShardIteratorResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.InternalServerErrorExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.LimitExceededExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListStreamsRequestMarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ListStreamsResultJsonUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.ResourceNotFoundExceptionUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.transform.TrimmedDataAccessExceptionUnmarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;

/**
 * Client for accessing AmazonDynamoDBStreams. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * 
 */
public class AmazonDynamoDBStreamsClient extends AmazonWebServiceClient
		implements AmazonDynamoDBStreams {

	/** Provider for AWS credentials. */
	private AWSCredentialsProvider awsCredentialsProvider;

	private static final Log log = LogFactory
			.getLog(AmazonDynamoDBStreams.class);

	/**
	 * List of exception unmarshallers for all AmazonDynamoDBStreams exceptions.
	 */
	protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

	/**
	 * Constructs a new client to invoke service methods on
	 * AmazonDynamoDBStreams. A credentials provider chain will be used that
	 * searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the Amazon EC2
	 * metadata service</li>
	 * </ul>
	 *
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 *
	 * @see DefaultAWSCredentialsProviderChain
	 */
	public AmazonDynamoDBStreamsClient() {
		this(new DefaultAWSCredentialsProviderChain(),
				new ClientConfiguration());
	}

	/**
	 * Constructs a new client to invoke service methods on
	 * AmazonDynamoDBStreams. A credentials provider chain will be used that
	 * searches for credentials in this order:
	 * <ul>
	 * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
	 * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
	 * <li>Instance profile credentials delivered through the Amazon EC2
	 * metadata service</li>
	 * </ul>
	 *
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 *
	 * @param clientConfiguration
	 *            The client configuration options controlling how this client
	 *            connects to AmazonDynamoDBStreams (ex: proxy settings, retry
	 *            counts, etc.).
	 *
	 * @see DefaultAWSCredentialsProviderChain
	 */
	public AmazonDynamoDBStreamsClient(ClientConfiguration clientConfiguration) {
		this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
	}

	/**
	 * Constructs a new client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials.
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 *
	 * @param awsCredentials
	 *            The AWS credentials (access key ID and secret key) to use when
	 *            authenticating with AWS services.
	 */
	public AmazonDynamoDBStreamsClient(AWSCredentials awsCredentials) {
		this(awsCredentials, new ClientConfiguration());
	}

	/**
	 * Constructs a new client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials and
	 * client configuration options.
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 *
	 * @param awsCredentials
	 *            The AWS credentials (access key ID and secret key) to use when
	 *            authenticating with AWS services.
	 * @param clientConfiguration
	 *            The client configuration options controlling how this client
	 *            connects to AmazonDynamoDBStreams (ex: proxy settings, retry
	 *            counts, etc.).
	 */
	public AmazonDynamoDBStreamsClient(AWSCredentials awsCredentials,
			ClientConfiguration clientConfiguration) {
		super(adjustClientConfiguration(clientConfiguration));

		this.awsCredentialsProvider = new StaticCredentialsProvider(
				awsCredentials);

		init();
	}

	/**
	 * Constructs a new client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials
	 * provider.
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 *
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 */
	public AmazonDynamoDBStreamsClient(
			AWSCredentialsProvider awsCredentialsProvider) {
		this(awsCredentialsProvider, new ClientConfiguration());
	}

	/**
	 * Constructs a new client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials
	 * provider and client configuration options.
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 *
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 * @param clientConfiguration
	 *            The client configuration options controlling how this client
	 *            connects to AmazonDynamoDBStreams (ex: proxy settings, retry
	 *            counts, etc.).
	 */
	public AmazonDynamoDBStreamsClient(
			AWSCredentialsProvider awsCredentialsProvider,
			ClientConfiguration clientConfiguration) {
		this(awsCredentialsProvider, clientConfiguration, null);
	}

	/**
	 * Constructs a new client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials
	 * provider, client configuration options and request metric collector.
	 * 
	 * <p>
	 * All service calls made using this new client object are blocking, and
	 * will not return until the service call completes.
	 *
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 * @param clientConfiguration
	 *            The client configuration options controlling how this client
	 *            connects to AmazonDynamoDBStreams (ex: proxy settings, retry
	 *            counts, etc.).
	 * @param requestMetricCollector
	 *            optional request metric collector
	 */
	public AmazonDynamoDBStreamsClient(
			AWSCredentialsProvider awsCredentialsProvider,
			ClientConfiguration clientConfiguration,
			RequestMetricCollector requestMetricCollector) {
		super(adjustClientConfiguration(clientConfiguration),
				requestMetricCollector);

		this.awsCredentialsProvider = awsCredentialsProvider;

		init();
	}

	private void init() {
		jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
		jsonErrorUnmarshallers.add(new ExpiredIteratorExceptionUnmarshaller());
		jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
		jsonErrorUnmarshallers
				.add(new InternalServerErrorExceptionUnmarshaller());
		jsonErrorUnmarshallers
				.add(new TrimmedDataAccessExceptionUnmarshaller());
		jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());

		jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());

		// calling this.setEndPoint(...) will also modify the signer accordingly
		this.setEndpoint("streams.preview-dynamodb.us-east-1.amazonaws.com");

		HandlerChainFactory chainFactory = new HandlerChainFactory();
		requestHandler2s
				.addAll(chainFactory
						.newRequestHandlerChain("/com/amazonaws/services/dynamodbv2/request.handlers"));
		requestHandler2s
				.addAll(chainFactory
						.newRequestHandler2Chain("/com/amazonaws/services/dynamodbv2/request.handler2s"));
	}

	private static ClientConfiguration adjustClientConfiguration(
			ClientConfiguration orig) {
		ClientConfiguration config = orig;

		return config;
	}

	/**
	 *
	 * @param getShardIteratorRequest
	 *            Container for the necessary parameters to execute the
	 *            GetShardIterator service method on AmazonDynamoDBStreams.
	 * 
	 * @return The response from the GetShardIterator service method, as
	 *         returned by AmazonDynamoDBStreams.
	 * 
	 * @throws ResourceNotFoundException
	 * @throws InternalServerErrorException
	 * @throws TrimmedDataAccessException
	 *
	 * @throws AmazonClientException
	 *             If any internal errors are encountered inside the client
	 *             while attempting to make the request or handle the response.
	 *             For example if a network connection is not available.
	 * @throws AmazonServiceException
	 *             If an error response is returned by AmazonDynamoDBStreams
	 *             indicating either a problem with the data in the request, or
	 *             a server side issue.
	 */
	public GetShardIteratorResult getShardIterator(
			GetShardIteratorRequest getShardIteratorRequest) {
		ExecutionContext executionContext = createExecutionContext(getShardIteratorRequest);
		AWSRequestMetrics awsRequestMetrics = executionContext
				.getAwsRequestMetrics();
		awsRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetShardIteratorRequest> request = null;
		Response<GetShardIteratorResult> response = null;

		try {
			awsRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetShardIteratorRequestMarshaller()
						.marshall(getShardIteratorRequest);
				// Binds the request metrics to the current request.
				request.setAWSRequestMetrics(awsRequestMetrics);
			} finally {
				awsRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			Unmarshaller<GetShardIteratorResult, JsonUnmarshallerContext> unmarshaller = new GetShardIteratorResultJsonUnmarshaller();
			JsonResponseHandler<GetShardIteratorResult> responseHandler = new JsonResponseHandler<GetShardIteratorResult>(
					unmarshaller);

			response = invoke(request, responseHandler, executionContext);

			return response.getAwsResponse();
		} finally {

			endClientExecution(awsRequestMetrics, request, response,
					LOGGING_AWS_REQUEST_METRIC);
		}
	}

	/**
	 *
	 * @param describeStreamRequest
	 *            Container for the necessary parameters to execute the
	 *            DescribeStream service method on AmazonDynamoDBStreams.
	 * 
	 * @return The response from the DescribeStream service method, as returned
	 *         by AmazonDynamoDBStreams.
	 * 
	 * @throws ResourceNotFoundException
	 * @throws InternalServerErrorException
	 *
	 * @throws AmazonClientException
	 *             If any internal errors are encountered inside the client
	 *             while attempting to make the request or handle the response.
	 *             For example if a network connection is not available.
	 * @throws AmazonServiceException
	 *             If an error response is returned by AmazonDynamoDBStreams
	 *             indicating either a problem with the data in the request, or
	 *             a server side issue.
	 */
	public DescribeStreamResult describeStream(
			DescribeStreamRequest describeStreamRequest) {
		ExecutionContext executionContext = createExecutionContext(describeStreamRequest);
		AWSRequestMetrics awsRequestMetrics = executionContext
				.getAwsRequestMetrics();
		awsRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<DescribeStreamRequest> request = null;
		Response<DescribeStreamResult> response = null;

		try {
			awsRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new DescribeStreamRequestMarshaller()
						.marshall(describeStreamRequest);
				// Binds the request metrics to the current request.
				request.setAWSRequestMetrics(awsRequestMetrics);
			} finally {
				awsRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			Unmarshaller<DescribeStreamResult, JsonUnmarshallerContext> unmarshaller = new DescribeStreamResultJsonUnmarshaller();
			JsonResponseHandler<DescribeStreamResult> responseHandler = new JsonResponseHandler<DescribeStreamResult>(
					unmarshaller);

			response = invoke(request, responseHandler, executionContext);

			return response.getAwsResponse();
		} finally {

			endClientExecution(awsRequestMetrics, request, response,
					LOGGING_AWS_REQUEST_METRIC);
		}
	}

	/**
	 *
	 * @param getRecordsRequest
	 *            Container for the necessary parameters to execute the
	 *            GetRecords service method on AmazonDynamoDBStreams.
	 * 
	 * @return The response from the GetRecords service method, as returned by
	 *         AmazonDynamoDBStreams.
	 * 
	 * @throws ExpiredIteratorException
	 * @throws ResourceNotFoundException
	 * @throws LimitExceededException
	 * @throws InternalServerErrorException
	 * @throws TrimmedDataAccessException
	 *
	 * @throws AmazonClientException
	 *             If any internal errors are encountered inside the client
	 *             while attempting to make the request or handle the response.
	 *             For example if a network connection is not available.
	 * @throws AmazonServiceException
	 *             If an error response is returned by AmazonDynamoDBStreams
	 *             indicating either a problem with the data in the request, or
	 *             a server side issue.
	 */
	public GetRecordsResult getRecords(GetRecordsRequest getRecordsRequest) {
		ExecutionContext executionContext = createExecutionContext(getRecordsRequest);
		AWSRequestMetrics awsRequestMetrics = executionContext
				.getAwsRequestMetrics();
		awsRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<GetRecordsRequest> request = null;
		Response<GetRecordsResult> response = null;

		try {
			awsRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new GetRecordsRequestMarshaller()
						.marshall(getRecordsRequest);
				// Binds the request metrics to the current request.
				request.setAWSRequestMetrics(awsRequestMetrics);
			} finally {
				awsRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			Unmarshaller<GetRecordsResult, JsonUnmarshallerContext> unmarshaller = new GetRecordsResultJsonUnmarshaller();
			JsonResponseHandler<GetRecordsResult> responseHandler = new JsonResponseHandler<GetRecordsResult>(
					unmarshaller);

			response = invoke(request, responseHandler, executionContext);

			return response.getAwsResponse();
		} finally {

			endClientExecution(awsRequestMetrics, request, response,
					LOGGING_AWS_REQUEST_METRIC);
		}
	}

	/**
	 *
	 * @param listStreamsRequest
	 *            Container for the necessary parameters to execute the
	 *            ListStreams service method on AmazonDynamoDBStreams.
	 * 
	 * @return The response from the ListStreams service method, as returned by
	 *         AmazonDynamoDBStreams.
	 * 
	 * @throws ResourceNotFoundException
	 * @throws InternalServerErrorException
	 *
	 * @throws AmazonClientException
	 *             If any internal errors are encountered inside the client
	 *             while attempting to make the request or handle the response.
	 *             For example if a network connection is not available.
	 * @throws AmazonServiceException
	 *             If an error response is returned by AmazonDynamoDBStreams
	 *             indicating either a problem with the data in the request, or
	 *             a server side issue.
	 */
	public ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest) {
		ExecutionContext executionContext = createExecutionContext(listStreamsRequest);
		AWSRequestMetrics awsRequestMetrics = executionContext
				.getAwsRequestMetrics();
		awsRequestMetrics.startEvent(Field.ClientExecuteTime);
		Request<ListStreamsRequest> request = null;
		Response<ListStreamsResult> response = null;

		try {
			awsRequestMetrics.startEvent(Field.RequestMarshallTime);
			try {
				request = new ListStreamsRequestMarshaller()
						.marshall(listStreamsRequest);
				// Binds the request metrics to the current request.
				request.setAWSRequestMetrics(awsRequestMetrics);
			} finally {
				awsRequestMetrics.endEvent(Field.RequestMarshallTime);
			}
			Unmarshaller<ListStreamsResult, JsonUnmarshallerContext> unmarshaller = new ListStreamsResultJsonUnmarshaller();
			JsonResponseHandler<ListStreamsResult> responseHandler = new JsonResponseHandler<ListStreamsResult>(
					unmarshaller);

			response = invoke(request, responseHandler, executionContext);

			return response.getAwsResponse();
		} finally {

			endClientExecution(awsRequestMetrics, request, response,
					LOGGING_AWS_REQUEST_METRIC);
		}
	}

	/**
	 * 
	 * @return The response from the ListStreams service method, as returned by
	 *         AmazonDynamoDBStreams.
	 * 
	 * @throws ResourceNotFoundException
	 * @throws InternalServerErrorException
	 *
	 * @throws AmazonClientException
	 *             If any internal errors are encountered inside the client
	 *             while attempting to make the request or handle the response.
	 *             For example if a network connection is not available.
	 * @throws AmazonServiceException
	 *             If an error response is returned by AmazonDynamoDBStreams
	 *             indicating either a problem with the data in the request, or
	 *             a server side issue.
	 */
	public ListStreamsResult listStreams() throws AmazonServiceException,
			AmazonClientException {
		return listStreams(new ListStreamsRequest());
	}

	@Override
	public void setEndpoint(String endpoint) {
		super.setEndpoint(endpoint);
	}

	@Override
	public void setEndpoint(String endpoint, String serviceName, String regionId)
			throws IllegalArgumentException {
		super.setEndpoint(endpoint, serviceName, regionId);
	}

	/**
	 * Returns additional metadata for a previously executed successful,
	 * request, typically used for debugging issues where a service isn't acting
	 * as expected. This data isn't considered part of the result data returned
	 * by an operation, so it's available through this separate, diagnostic
	 * interface.
	 * <p>
	 * Response metadata is only cached for a limited period of time, so if you
	 * need to access this extra diagnostic information for an executed request,
	 * you should use this method to retrieve it as soon as possible after
	 * executing the request.
	 *
	 * @param request
	 *            The originally executed request
	 *
	 * @return The response metadata for the specified request, or null if none
	 *         is available.
	 */
	public ResponseMetadata getCachedResponseMetadata(
			AmazonWebServiceRequest request) {
		return client.getResponseMetadataForRequest(request);
	}

	private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
			Request<Y> request,
			HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
			ExecutionContext executionContext) {
		request.setEndpoint(endpoint);
		request.setTimeOffset(timeOffset);

		AWSRequestMetrics awsRequestMetrics = executionContext
				.getAwsRequestMetrics();
		AWSCredentials credentials;
		awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
		try {
			credentials = awsCredentialsProvider.getCredentials();
		} finally {
			awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
		}

		AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
		if (originalRequest != null
				&& originalRequest.getRequestCredentials() != null) {
			credentials = originalRequest.getRequestCredentials();
		}

		executionContext.setCredentials(credentials);
		JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(
				jsonErrorUnmarshallers);
		Response<X> result = client.execute(request, responseHandler,
				errorResponseHandler, executionContext);
		return result;
	}
}
