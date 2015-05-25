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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams#getShardIterator(GetShardIteratorRequest) GetShardIterator operation}.
 * 
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams#getShardIterator(GetShardIteratorRequest)
 */
public class GetShardIteratorRequest extends AmazonWebServiceRequest implements Serializable {

    private String streamId;

    private String shardId;

    private String shardIteratorType;

    private String sequenceNumber;

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
    public GetShardIteratorRequest withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * Returns the value of the ShardId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @return The value of the ShardId property for this object.
     */
    public String getShardId() {
        return shardId;
    }
    
    /**
     * Sets the value of the ShardId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @param shardId The new value for the ShardId property for this object.
     */
    public void setShardId(String shardId) {
        this.shardId = shardId;
    }
    
    /**
     * Sets the value of the ShardId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @param shardId The new value for the ShardId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetShardIteratorRequest withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * Returns the value of the ShardIteratorType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER
     *
     * @return The value of the ShardIteratorType property for this object.
     *
     * @see ShardIteratorType
     */
    public String getShardIteratorType() {
        return shardIteratorType;
    }
    
    /**
     * Sets the value of the ShardIteratorType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER
     *
     * @param shardIteratorType The new value for the ShardIteratorType property for this object.
     *
     * @see ShardIteratorType
     */
    public void setShardIteratorType(String shardIteratorType) {
        this.shardIteratorType = shardIteratorType;
    }
    
    /**
     * Sets the value of the ShardIteratorType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER
     *
     * @param shardIteratorType The new value for the ShardIteratorType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ShardIteratorType
     */
    public GetShardIteratorRequest withShardIteratorType(String shardIteratorType) {
        this.shardIteratorType = shardIteratorType;
        return this;
    }

    /**
     * Sets the value of the ShardIteratorType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER
     *
     * @param shardIteratorType The new value for the ShardIteratorType property for this object.
     *
     * @see ShardIteratorType
     */
    public void setShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
    }
    
    /**
     * Sets the value of the ShardIteratorType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRIM_HORIZON, LATEST, AT_SEQUENCE_NUMBER, AFTER_SEQUENCE_NUMBER
     *
     * @param shardIteratorType The new value for the ShardIteratorType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ShardIteratorType
     */
    public GetShardIteratorRequest withShardIteratorType(ShardIteratorType shardIteratorType) {
        this.shardIteratorType = shardIteratorType.toString();
        return this;
    }

    /**
     * Returns the value of the SequenceNumber property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 40<br/>
     *
     * @return The value of the SequenceNumber property for this object.
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }
    
    /**
     * Sets the value of the SequenceNumber property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 40<br/>
     *
     * @param sequenceNumber The new value for the SequenceNumber property for this object.
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
    
    /**
     * Sets the value of the SequenceNumber property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>21 - 40<br/>
     *
     * @param sequenceNumber The new value for the SequenceNumber property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetShardIteratorRequest withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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
        if (getShardId() != null) sb.append("ShardId: " + getShardId() + ",");
        if (getShardIteratorType() != null) sb.append("ShardIteratorType: " + getShardIteratorType() + ",");
        if (getSequenceNumber() != null) sb.append("SequenceNumber: " + getSequenceNumber() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode()); 
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode()); 
        hashCode = prime * hashCode + ((getShardIteratorType() == null) ? 0 : getShardIteratorType().hashCode()); 
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetShardIteratorRequest == false) return false;
        GetShardIteratorRequest other = (GetShardIteratorRequest)obj;
        
        if (other.getStreamId() == null ^ this.getStreamId() == null) return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false) return false; 
        if (other.getShardId() == null ^ this.getShardId() == null) return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false) return false; 
        if (other.getShardIteratorType() == null ^ this.getShardIteratorType() == null) return false;
        if (other.getShardIteratorType() != null && other.getShardIteratorType().equals(this.getShardIteratorType()) == false) return false; 
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null) return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false) return false; 
        return true;
    }
    
}
    