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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
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
 * Interface for accessing AmazonDynamoDBStreams asynchronously. Each
 * asynchronous method will return a Java Future object, and users are also
 * allowed to provide a callback handler.
 * 
 */
public interface AmazonDynamoDBStreamsAsync extends AmazonDynamoDBStreams {
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
			GetShardIteratorRequest getShardIteratorRequest)
			throws AmazonServiceException, AmazonClientException;

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
			GetShardIteratorRequest getShardIteratorRequest,
			AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler)
			throws AmazonServiceException, AmazonClientException;

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
			DescribeStreamRequest describeStreamRequest)
			throws AmazonServiceException, AmazonClientException;

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
			DescribeStreamRequest describeStreamRequest,
			AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler)
			throws AmazonServiceException, AmazonClientException;

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
			GetRecordsRequest getRecordsRequest) throws AmazonServiceException,
			AmazonClientException;

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
			GetRecordsRequest getRecordsRequest,
			AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler)
			throws AmazonServiceException, AmazonClientException;

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
			ListStreamsRequest listStreamsRequest)
			throws AmazonServiceException, AmazonClientException;

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
			ListStreamsRequest listStreamsRequest,
			AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler)
			throws AmazonServiceException, AmazonClientException;
}
