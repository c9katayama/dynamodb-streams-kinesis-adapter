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

/**
 * Shard
 */
public class Shard implements Serializable {

    private String shardId;

    private SequenceNumberRange sequenceNumberRange;

    private String parentShardId;

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
    public Shard withShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * Returns the value of the SequenceNumberRange property for this object.
     *
     * @return The value of the SequenceNumberRange property for this object.
     */
    public SequenceNumberRange getSequenceNumberRange() {
        return sequenceNumberRange;
    }
    
    /**
     * Sets the value of the SequenceNumberRange property for this object.
     *
     * @param sequenceNumberRange The new value for the SequenceNumberRange property for this object.
     */
    public void setSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
    }
    
    /**
     * Sets the value of the SequenceNumberRange property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sequenceNumberRange The new value for the SequenceNumberRange property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Shard withSequenceNumberRange(SequenceNumberRange sequenceNumberRange) {
        this.sequenceNumberRange = sequenceNumberRange;
        return this;
    }

    /**
     * Returns the value of the ParentShardId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @return The value of the ParentShardId property for this object.
     */
    public String getParentShardId() {
        return parentShardId;
    }
    
    /**
     * Sets the value of the ParentShardId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @param parentShardId The new value for the ParentShardId property for this object.
     */
    public void setParentShardId(String parentShardId) {
        this.parentShardId = parentShardId;
    }
    
    /**
     * Sets the value of the ParentShardId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @param parentShardId The new value for the ParentShardId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Shard withParentShardId(String parentShardId) {
        this.parentShardId = parentShardId;
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
        if (getShardId() != null) sb.append("ShardId: " + getShardId() + ",");
        if (getSequenceNumberRange() != null) sb.append("SequenceNumberRange: " + getSequenceNumberRange() + ",");
        if (getParentShardId() != null) sb.append("ParentShardId: " + getParentShardId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode()); 
        hashCode = prime * hashCode + ((getSequenceNumberRange() == null) ? 0 : getSequenceNumberRange().hashCode()); 
        hashCode = prime * hashCode + ((getParentShardId() == null) ? 0 : getParentShardId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Shard == false) return false;
        Shard other = (Shard)obj;
        
        if (other.getShardId() == null ^ this.getShardId() == null) return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false) return false; 
        if (other.getSequenceNumberRange() == null ^ this.getSequenceNumberRange() == null) return false;
        if (other.getSequenceNumberRange() != null && other.getSequenceNumberRange().equals(this.getSequenceNumberRange()) == false) return false; 
        if (other.getParentShardId() == null ^ this.getParentShardId() == null) return false;
        if (other.getParentShardId() != null && other.getParentShardId().equals(this.getParentShardId()) == false) return false; 
        return true;
    }
    
}
    