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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams#describeStream(DescribeStreamRequest) DescribeStream operation}.
 * 
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams#describeStream(DescribeStreamRequest)
 */
public class DescribeStreamRequest extends AmazonWebServiceRequest implements Serializable {

    private String streamId;

    private Integer limit;

    private String exclusiveStartShardId;

    /**
     * Returns the value of the StreamId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>56 - 128<br/>
     * <b>Pattern: </b>[a-z0-9-]+<br/>
     *
     * @return The value of the StreamId property for this object.
     */
    public String getStreamId() {
        return streamId;
    }
    
    /**
     * Sets the value of the StreamId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>56 - 128<br/>
     * <b>Pattern: </b>[a-z0-9-]+<br/>
     *
     * @param streamId The new value for the StreamId property for this object.
     */
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }
    
    /**
     * Sets the value of the StreamId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>56 - 128<br/>
     * <b>Pattern: </b>[a-z0-9-]+<br/>
     *
     * @param streamId The new value for the StreamId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStreamRequest withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * Returns the value of the Limit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the Limit property for this object.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * Sets the value of the Limit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The new value for the Limit property for this object.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * Sets the value of the Limit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The new value for the Limit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStreamRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns the value of the ExclusiveStartShardId property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @return The value of the ExclusiveStartShardId property for this object.
     */
    public String getExclusiveStartShardId() {
        return exclusiveStartShardId;
    }
    
    /**
     * Sets the value of the ExclusiveStartShardId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @param exclusiveStartShardId The new value for the ExclusiveStartShardId property for this object.
     */
    public void setExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
    }
    
    /**
     * Sets the value of the ExclusiveStartShardId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @param exclusiveStartShardId The new value for the ExclusiveStartShardId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStreamRequest withExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStreamId() != null) sb.append("StreamId: " + getStreamId() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (getExclusiveStartShardId() != null) sb.append("ExclusiveStartShardId: " + getExclusiveStartShardId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartShardId() == null) ? 0 : getExclusiveStartShardId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStreamRequest == false) return false;
        DescribeStreamRequest other = (DescribeStreamRequest)obj;
        
        if (other.getStreamId() == null ^ this.getStreamId() == null) return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getExclusiveStartShardId() == null ^ this.getExclusiveStartShardId() == null) return false;
        if (other.getExclusiveStartShardId() != null && other.getExclusiveStartShardId().equals(this.getExclusiveStartShardId()) == false) return false; 
        return true;
    }
    
}
    