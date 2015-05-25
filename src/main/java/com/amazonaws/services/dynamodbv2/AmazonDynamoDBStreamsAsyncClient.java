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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.dynamodbv2.model.DescribeStreamRequest;
import com.amazonaws.services.dynamodbv2.model.DescribeStreamResult;
import com.amazonaws.services.dynamodbv2.model.GetRecordsRequest;
import com.amazonaws.services.dynamodbv2.model.GetRecordsResult;
import com.amazonaws.services.dynamodbv2.model.GetShardIteratorRequest;
import com.amazonaws.services.dynamodbv2.model.GetShardIteratorResult;
import com.amazonaws.services.dynamodbv2.model.ListStreamsRequest;
import com.amazonaws.services.dynamodbv2.model.ListStreamsResult;

/**
 * Asynchronous client for accessing AmazonDynamoDBStreams. All asynchronous
 * calls made using this client are non-blocking. Callers could either process
 * the result and handle the exceptions in the worker thread by providing a
 * callback handler when making the call, or use the returned Future object to
 * check the result of the call in the calling thread.
 * 
 */
public class AmazonDynamoDBStreamsAsyncClient extends
		AmazonDynamoDBStreamsClient implements AmazonDynamoDBStreamsAsync {

	/**
	 * Executor service for executing asynchronous requests.
	 */
	private ExecutorService executorService;

	private static final int DEFAULT_THREAD_POOL_SIZE = 50;

	/**
	 * Constructs a new asynchronous client to invoke service methods on
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
	public AmazonDynamoDBStreamsAsyncClient() {
		this(new DefaultAWSCredentialsProviderChain());
	}

	/**
	 * Constructs a new asynchronous client to invoke service methods on
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
	public AmazonDynamoDBStreamsAsyncClient(
			ClientConfiguration clientConfiguration) {
		this(new DefaultAWSCredentialsProviderChain(), clientConfiguration,
				Executors.newFixedThreadPool(clientConfiguration
						.getMaxConnections()));
	}

	/**
	 * Constructs a new asynchronous client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials.
	 * Default client settings will be used, and a fixed size thread pool will
	 * be created for executing the asynchronous tasks.
	 *
	 * <p>
	 * All calls made using this new client object are non-blocking, and will
	 * immediately return a Java Future object that the caller can later check
	 * to see if the service call has actually completed.
	 *
	 * @param awsCredentials
	 *            The AWS credentials (access key ID and secret key) to use when
	 *            authenticating with AWS services.
	 */
	public AmazonDynamoDBStreamsAsyncClient(AWSCredentials awsCredentials) {
		this(awsCredentials, Executors
				.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
	}

	/**
	 * Constructs a new asynchronous client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials and
	 * executor service. Default client settings will be used.
	 *
	 * <p>
	 * All calls made using this new client object are non-blocking, and will
	 * immediately return a Java Future object that the caller can later check
	 * to see if the service call has actually completed.
	 *
	 * @param awsCredentials
	 *            The AWS credentials (access key ID and secret key) to use when
	 *            authenticating with AWS services.
	 * @param executorService
	 *            The executor service by which all asynchronous requests will
	 *            be executed.
	 */
	public AmazonDynamoDBStreamsAsyncClient(AWSCredentials awsCredentials,
			ExecutorService executorService) {
		super(awsCredentials);
		this.executorService = executorService;
	}

	/**
	 * Constructs a new asynchronous client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials,
	 * executor service, and client configuration options.
	 *
	 * <p>
	 * All calls made using this new client object are non-blocking, and will
	 * immediately return a Java Future object that the caller can later check
	 * to see if the service call has actually completed.
	 *
	 * @param awsCredentials
	 *            The AWS credentials (access key ID and secret key) to use when
	 *            authenticating with AWS services.
	 * @param clientConfiguration
	 *            Client configuration options (ex: max retry limit, proxy
	 *            settings, etc).
	 * @param executorService
	 *            The executor service by which all asynchronous requests will
	 *            be executed.
	 */
	public AmazonDynamoDBStreamsAsyncClient(AWSCredentials awsCredentials,
			ClientConfiguration clientConfiguration,
			ExecutorService executorService) {
		super(awsCredentials, clientConfiguration);
		this.executorService = executorService;
	}

	/**
	 * Constructs a new asynchronous client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials
	 * provider. Default client settings will be used, and a fixed size thread
	 * pool will be created for executing the asynchronous tasks.
	 *
	 * <p>
	 * All calls made using this new client object are non-blocking, and will
	 * immediately return a Java Future object that the caller can later check
	 * to see if the service call has actually completed.
	 *
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 */
	public AmazonDynamoDBStreamsAsyncClient(
			AWSCredentialsProvider awsCredentialsProvider) {
		this(awsCredentialsProvider, Executors
				.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
	}

	/**
	 * Constructs a new asynchronous client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials
	 * provider and executor service. Default client settings will be used.
	 *
	 * <p>
	 * All calls made using this new client object are non-blocking, and will
	 * immediately return a Java Future object that the caller can later check
	 * to see if the service call has actually completed.
	 *
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 * @param executorService
	 *            The executor service by which all asynchronous requests will
	 *            be executed.
	 */
	public AmazonDynamoDBStreamsAsyncClient(
			AWSCredentialsProvider awsCredentialsProvider,
			ExecutorService executorService) {
		this(awsCredentialsProvider, new ClientConfiguration(), executorService);
	}

	/**
	 * Constructs a new asynchronous client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials
	 * provider and client configuration options.
	 *
	 * <p>
	 * All calls made using this new client object are non-blocking, and will
	 * immediately return a Java Future object that the caller can later check
	 * to see if the service call has actually completed.
	 *
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 * @param clientConfiguration
	 *            Client configuration options (ex: max retry limit, proxy
	 *            settings, etc).
	 */
	public AmazonDynamoDBStreamsAsyncClient(
			AWSCredentialsProvider awsCredentialsProvider,
			ClientConfiguration clientConfiguration) {
		this(awsCredentialsProvider, clientConfiguration, Executors
				.newFixedThreadPool(clientConfiguration.getMaxConnections()));
	}

	/**
	 * Constructs a new asynchronous client to invoke service methods on
	 * AmazonDynamoDBStreams using the specified AWS account credentials
	 * provider, executor service, and client configuration options.
	 *
	 * <p>
	 * All calls made using this new client object are non-blocking, and will
	 * immediately return a Java Future object that the caller can later check
	 * to see if the service call has actually completed.
	 *
	 * @param awsCredentialsProvider
	 *            The AWS credentials provider which will provide credentials to
	 *            authenticate requests with AWS services.
	 * @param clientConfiguration
	 *            Client configuration options (ex: max retry limit, proxy
	 *            settings, etc).
	 * @param executorService
	 *            The executor service by which all asynchronous requests will
	 *            be executed.
	 */
	public AmazonDynamoDBStreamsAsyncClient(
			AWSCredentialsProvider awsCredentialsProvider,
			ClientConfiguration clientConfiguration,
			ExecutorService executorService) {
		super(awsCredentialsProvider, clientConfiguration);
		this.executorService = executorService;
	}

	/**
	 * Returns the executor service used by this async client to execute
	 * requests.
	 *
	 * @return The executor service used by this async client to execute
	 *         requests.
	 */
	public ExecutorService getExecutorService() {
		return executorService;
	}

	/**
	 * Shuts down the client, releasing all managed resources. This includes
	 * forcibly terminating all pending asynchronous service calls. Clients who
	 * wish to give pending asynchronous service calls time to complete should
	 * call getExecutorService().shutdown() followed by
	 * getExecutorService().awaitTermination() prior to calling this method.
	 */
	@Override
	public void shutdown() {
		super.shutdown();
		executorService.shutdownNow();
	}

	/**
	 *
	 * @param getShardIteratorRequest
	 *            Container for the necessary parameters to execute the
	 *            GetShardIterator operation on AmazonDynamoDBStreams.
	 * 
	 * @return A Java Future object containing the response from the
	 *         GetShardIterator service method, as returned by
	 *         AmazonDynamoDBStreams.
	 * 
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
	public Future<GetShardIteratorResult> getShardIteratorAsync(
			final GetShardIteratorRequest getShardIteratorRequest)
			throws AmazonServiceException, AmazonClientException {
		return executorService.submit(new Callable<GetShardIteratorResult>() {
			public GetShardIteratorResult call() throws Exception {
				return getShardIterator(getShardIteratorRequest);
			}
		});
	}

	/**
	 *
	 * @param getShardIteratorRequest
	 *            Container for the necessary parameters to execute the
	 *            GetShardIterator operation on AmazonDynamoDBStreams.
	 * @param asyncHandler
	 *            Asynchronous callback handler for events in the life-cycle of
	 *            the request. Users could provide the implementation of the
	 *            four callback methods in this interface to process the
	 *            operation result or handle the exception.
	 * 
	 * @return A Java Future object containing the response from the
	 *         GetShardIterator service method, as returned by
	 *         AmazonDynamoDBStreams.
	 * 
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
	public Future<GetShardIteratorResult> getShardIteratorAsync(
			final GetShardIteratorRequest getShardIteratorRequest,
			final AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler)
			throws AmazonServiceException, AmazonClientException {
		return executorService.submit(new Callable<GetShardIteratorResult>() {
			public GetShardIteratorResult call() throws Exception {
				GetShardIteratorResult result;
				try {
					result = getShardIterator(getShardIteratorRequest);
				} catch (Exception ex) {
					asyncHandler.onError(ex);
					throw ex;
				}
				asyncHandler.onSuccess(getShardIteratorRequest, result);
				return result;
			}
		});
	}

	/**
	 *
	 * @param describeStreamRequest
	 *            Container for the necessary parameters to execute the
	 *            DescribeStream operation on AmazonDynamoDBStreams.
	 * 
	 * @return A Java Future object containing the response from the
	 *         DescribeStream service method, as returned by
	 *         AmazonDynamoDBStreams.
	 * 
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
	public Future<DescribeStreamResult> describeStreamAsync(
			final DescribeStreamRequest describeStreamRequest)
			throws AmazonServiceException, AmazonClientException {
		return executorService.submit(new Callable<DescribeStreamResult>() {
			public DescribeStreamResult call() throws Exception {
				return describeStream(describeStreamRequest);
			}
		});
	}

	/**
	 *
	 * @param describeStreamRequest
	 *            Container for the necessary parameters to execute the
	 *            DescribeStream operation on AmazonDynamoDBStreams.
	 * @param asyncHandler
	 *            Asynchronous callback handler for events in the life-cycle of
	 *            the request. Users could provide the implementation of the
	 *            four callback methods in this interface to process the
	 *            operation result or handle the exception.
	 * 
	 * @return A Java Future object containing the response from the
	 *         DescribeStream service method, as returned by
	 *         AmazonDynamoDBStreams.
	 * 
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
	public Future<DescribeStreamResult> describeStreamAsync(
			final DescribeStreamRequest describeStreamRequest,
			final AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler)
			throws AmazonServiceException, AmazonClientException {
		return executorService.submit(new Callable<DescribeStreamResult>() {
			public DescribeStreamResult call() throws Exception {
				DescribeStreamResult result;
				try {
					result = describeStream(describeStreamRequest);
				} catch (Exception ex) {
					asyncHandler.onError(ex);
					throw ex;
				}
				asyncHandler.onSuccess(describeStreamRequest, result);
				return result;
			}
		});
	}

	/**
	 *
	 * @param getRecordsRequest
	 *            Container for the necessary parameters to execute the
	 *            GetRecords operation on AmazonDynamoDBStreams.
	 * 
	 * @return A Java Future object containing the response from the GetRecords
	 *         service method, as returned by AmazonDynamoDBStreams.
	 * 
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
	public Future<GetRecordsResult> getRecordsAsync(
			final GetRecordsRequest getRecordsRequest)
			throws AmazonServiceException, AmazonClientException {
		return executorService.submit(new Callable<GetRecordsResult>() {
			public GetRecordsResult call() throws Exception {
				return getRecords(getRecordsRequest);
			}
		});
	}

	/**
	 *
	 * @param getRecordsRequest
	 *            Container for the necessary parameters to execute the
	 *            GetRecords operation on AmazonDynamoDBStreams.
	 * @param asyncHandler
	 *            Asynchronous callback handler for events in the life-cycle of
	 *            the request. Users could provide the implementation of the
	 *            four callback methods in this interface to process the
	 *            operation result or handle the exception.
	 * 
	 * @return A Java Future object containing the response from the GetRecords
	 *         service method, as returned by AmazonDynamoDBStreams.
	 * 
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
	public Future<GetRecordsResult> getRecordsAsync(
			final GetRecordsRequest getRecordsRequest,
			final AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler)
			throws AmazonServiceException, AmazonClientException {
		return executorService.submit(new Callable<GetRecordsResult>() {
			public GetRecordsResult call() throws Exception {
				GetRecordsResult result;
				try {
					result = getRecords(getRecordsRequest);
				} catch (Exception ex) {
					asyncHandler.onError(ex);
					throw ex;
				}
				asyncHandler.onSuccess(getRecordsRequest, result);
				return result;
			}
		});
	}

	/**
	 *
	 * @param listStreamsRequest
	 *            Container for the necessary parameters to execute the
	 *            ListStreams operation on AmazonDynamoDBStreams.
	 * 
	 * @return A Java Future object containing the response from the ListStreams
	 *         service method, as returned by AmazonDynamoDBStreams.
	 * 
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
	public Future<ListStreamsResult> listStreamsAsync(
			final ListStreamsRequest listStreamsRequest)
			throws AmazonServiceException, AmazonClientException {
		return executorService.submit(new Callable<ListStreamsResult>() {
			public ListStreamsResult call() throws Exception {
				return listStreams(listStreamsRequest);
			}
		});
	}

	/**
	 *
	 * @param listStreamsRequest
	 *            Container for the necessary parameters to execute the
	 *            ListStreams operation on AmazonDynamoDBStreams.
	 * @param asyncHandler
	 *            Asynchronous callback handler for events in the life-cycle of
	 *            the request. Users could provide the implementation of the
	 *            four callback methods in this interface to process the
	 *            operation result or handle the exception.
	 * 
	 * @return A Java Future object containing the response from the ListStreams
	 *         service method, as returned by AmazonDynamoDBStreams.
	 * 
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
	public Future<ListStreamsResult> listStreamsAsync(
			final ListStreamsRequest listStreamsRequest,
			final AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler)
			throws AmazonServiceException, AmazonClientException {
		return executorService.submit(new Callable<ListStreamsResult>() {
			public ListStreamsResult call() throws Exception {
				ListStreamsResult result;
				try {
					result = listStreams(listStreamsRequest);
				} catch (Exception ex) {
					asyncHandler.onError(ex);
					throw ex;
				}
				asyncHandler.onSuccess(listStreamsRequest, result);
				return result;
			}
		});
	}

}
