/*
 * Copyright 2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.streamsadapter.model;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.amazonaws.services.dynamodbv2.model.GetRecordsResult;
import com.amazonaws.services.dynamodbv2.model.Record;
import com.amazonaws.services.dynamodbv2.streamsadapter.model.GetRecordsResultAdapter;
import com.amazonaws.services.dynamodbv2.streamsadapter.model.RecordAdapter;

public class GetRecordsResultAdapterTest {
    private final String TEST_STRING = "TestString";

    @Mock
    private GetRecordsResult mockResult;

    private GetRecordsResultAdapter adapter;

    @Before
    public void setUpTest() {
        MockitoAnnotations.initMocks(this);
        java.util.List<Record> records = new java.util.ArrayList<Record>();
        records.add(new Record());
        when(mockResult.getRecords()).thenReturn(records);
        adapter = new GetRecordsResultAdapter(mockResult);
    }

    @Test
    public void testGetNextShardIterator() {
        when(mockResult.getNextShardIterator()).thenReturn(TEST_STRING);
        String actual = adapter.getNextShardIterator();
        assertEquals(TEST_STRING, actual);
    }

    @Test(expected=UnsupportedOperationException.class)
    public void testSetNextShardIterator() {
        adapter.setNextShardIterator(TEST_STRING);
    }

    @Test(expected=UnsupportedOperationException.class)
    public void testWithNextShardIterator() {
        adapter.withNextShardIterator(TEST_STRING);
    }

    @Test
    public void testGetRecordsWithItem() {
        java.util.List<com.amazonaws.services.kinesis.model.Record> recordList = adapter.getRecords();
        assertEquals(1, recordList.size());
        assertTrue(recordList.get(0) instanceof RecordAdapter);
    }

    @Test
    public void testGetRecordsWithNoItems() {
        when(mockResult.getRecords()).thenReturn(new java.util.ArrayList<Record>());
        GetRecordsResultAdapter localAdapter = new GetRecordsResultAdapter(mockResult);
        java.util.List<com.amazonaws.services.kinesis.model.Record> recordList = localAdapter.getRecords();
        assertEquals(0, recordList.size());
    }

    @Test
    public void testGetRecordsWithNull() {
        when(mockResult.getRecords()).thenReturn(null);
        GetRecordsResultAdapter localAdapter = new GetRecordsResultAdapter(mockResult);
        java.util.List<com.amazonaws.services.kinesis.model.Record> recordList = localAdapter.getRecords();
        assertEquals(0, recordList.size());
    }

    @Test(expected=UnsupportedOperationException.class)
    public void testSetRecords() {
        adapter.setRecords(null);
    }

    @Test(expected=UnsupportedOperationException.class)
    public void testWithRecords() {
        adapter.withRecords(null, null);
    }

    @Test
    public void testRealDataNoRecords() {
        GetRecordsResult result = createResult(false);
        GetRecordsResultAdapter resultAdapter = new GetRecordsResultAdapter(result);
        assertEquals(result.getNextShardIterator(), resultAdapter.getNextShardIterator());
        assertEquals(result.getRecords().size(), resultAdapter.getRecords().size());
    }

    @Test
    public void testRealDataWithRecords() {
        GetRecordsResult result = createResult(true);
        GetRecordsResultAdapter resultAdapter = new GetRecordsResultAdapter(result);
        assertEquals(result.getNextShardIterator(), resultAdapter.getNextShardIterator());
        assertEquals(result.getRecords().size(), resultAdapter.getRecords().size());
    }

    private GetRecordsResult createResult(Boolean withRecord) {
        java.util.List<Record> records = new java.util.ArrayList<Record>();
        if(withRecord) {
            records.add(new Record());
        }
        return new GetRecordsResult()
            .withRecords(records)
            .withNextShardIterator(TEST_STRING);
    }

}
