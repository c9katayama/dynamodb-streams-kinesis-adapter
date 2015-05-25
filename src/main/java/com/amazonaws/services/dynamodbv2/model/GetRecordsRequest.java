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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams#getRecords(GetRecordsRequest) GetRecords operation}.
 * 
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams#getRecords(GetRecordsRequest)
 */
public class GetRecordsRequest extends AmazonWebServiceRequest implements Serializable {

    private String shardIterator;

    private Integer limit;

    /**
     * Returns the value of the ShardIterator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return The value of the ShardIterator property for this object.
     */
    public String getShardIterator() {
        return shardIterator;
    }
    
    /**
     * Sets the value of the ShardIterator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param shardIterator The new value for the ShardIterator property for this object.
     */
    public void setShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
    }
    
    /**
     * Sets the value of the ShardIterator property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param shardIterator The new value for the ShardIterator property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetRecordsRequest withShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
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
    public GetRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getShardIterator() != null) sb.append("ShardIterator: " + getShardIterator() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getShardIterator() == null) ? 0 : getShardIterator().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetRecordsRequest == false) return false;
        GetRecordsRequest other = (GetRecordsRequest)obj;
        
        if (other.getShardIterator() == null ^ this.getShardIterator() == null) return false;
        if (other.getShardIterator() != null && other.getShardIterator().equals(this.getShardIterator()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    