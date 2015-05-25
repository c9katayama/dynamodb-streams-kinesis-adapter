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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.regions.Region;
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

/**
 * Interface for accessing AmazonDynamoDBStreams.
 * 
 */
public interface AmazonDynamoDBStreams {

	/**
	 * Overrides the default endpoint for this client
	 * ("http://streams.preview-dynamodb.us-east-1.amazonaws.com"). Callers can
	 * use this method to control which AWS region they want to work with.
	 * <p>
	 * Callers can pass in just the endpoint (ex:
	 * "streams.preview-dynamodb.us-east-1.amazonaws.com") or a full URL,
	 * including the protocol (ex:
	 * "http://streams.preview-dynamodb.us-east-1.amazonaws.com"). If the
	 * protocol is not specified here, the default protocol from this client's
	 * {@link ClientConfiguration} will be used, which by default is HTTPS.
	 * <p>
	 * For more information on using AWS regions with the AWS SDK for Java, and
	 * a complete list of all available endpoints for all AWS services, see: <a
	 * href=
	 * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
	 * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
	 * 3912</a>
	 * <p>
	 * <b>This method is not threadsafe. An endpoint should be configured when
	 * the client is created and before any service requests are made. Changing
	 * it afterwards creates inevitable race conditions for any service requests
	 * in transit or retrying.</b>
	 *
	 * @param endpoint
	 *            The endpoint (ex:
	 *            "streams.preview-dynamodb.us-east-1.amazonaws.com") or a full
	 *            URL, including the protocol (ex:
	 *            "http://streams.preview-dynamodb.us-east-1.amazonaws.com") of
	 *            the region specific AWS endpoint this client will communicate
	 *            with.
	 *
	 * @throws IllegalArgumentException
	 *             If any problems are detected with the specified endpoint.
	 */
	public void setEndpoint(String endpoint)
			throws java.lang.IllegalArgumentException;

	/**
	 * An alternative to {@link AmazonDynamoDBStreams#setEndpoint(String)}, sets
	 * the regional endpoint for this client's service calls. Callers can use
	 * this method to control which AWS region they want to work with.
	 * <p>
	 * By default, all service endpoints in all regions use the https protocol.
	 * To use http instead, specify it in the {@link ClientConfiguration}
	 * supplied at construction.
	 * <p>
	 * <b>This method is not threadsafe. A region should be configured when the
	 * client is created and before any service requests are made. Changing it
	 * afterwards creates inevitable race conditions for any service requests in
	 * transit or retrying.</b>
	 *
	 * @param region
	 *            The region this client will communicate with. See
	 *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
	 *            accessing a given region.
	 * @throws java.lang.IllegalArgumentException
	 *             If the given region is null, or if this service isn't
	 *             available in the given region. See
	 *             {@link Region#isServiceSupported(String)}
	 * @see Region#getRegion(com.amazonaws.regions.Regions)
	 * @see Region#createClient(Class,
	 *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
	 */
	public void setRegion(Region region)
			throws java.lang.IllegalArgumentException;

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
			GetShardIteratorRequest getShardIteratorRequest)
			throws AmazonServiceException, AmazonClientException;

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
			DescribeStreamRequest describeStreamRequest)
			throws AmazonServiceException, AmazonClientException;

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
	public GetRecordsResult getRecords(GetRecordsRequest getRecordsRequest)
			throws AmazonServiceException, AmazonClientException;

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
	public ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest)
			throws AmazonServiceException, AmazonClientException;

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
			AmazonClientException;

	/**
	 * Shuts down this client object, releasing any resources that might be held
	 * open. This is an optional method, and callers are not expected to call
	 * it, but can if they want to explicitly release any open resources. Once a
	 * client has been shutdown, it should not be used to make any more
	 * requests.
	 */
	public void shutdown();

	/**
	 * Returns additional metadata for a previously executed successful request,
	 * typically used for debugging issues where a service isn't acting as
	 * expected. This data isn't considered part of the result data returned by
	 * an operation, so it's available through this separate, diagnostic
	 * interface.
	 * <p>
	 * Response metadata is only cached for a limited period of time, so if you
	 * need to access this extra diagnostic information for an executed request,
	 * you should use this method to retrieve it as soon as possible after
	 * executing a request.
	 *
	 * @param request
	 *            The originally executed request.
	 *
	 * @return The response metadata for the specified request, or null if none
	 *         is available.
	 */
	public ResponseMetadata getCachedResponseMetadata(
			AmazonWebServiceRequest request);
}
