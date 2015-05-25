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
 * Stream Description
 */
public class StreamDescription implements Serializable {

    private String streamId;

    private String streamStatus;

    private String streamViewType;

    private java.util.Date creationRequestDateTime;

    private String tableName;

    private String streamARN;

    private com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchema;

    private com.amazonaws.internal.ListWithAutoConstructFlag<Shard> shards;

    private String lastEvaluatedShardId;

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
    public StreamDescription withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * Returns the value of the StreamStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED
     *
     * @return The value of the StreamStatus property for this object.
     *
     * @see StreamStatus
     */
    public String getStreamStatus() {
        return streamStatus;
    }
    
    /**
     * Sets the value of the StreamStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED
     *
     * @param streamStatus The new value for the StreamStatus property for this object.
     *
     * @see StreamStatus
     */
    public void setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
    }
    
    /**
     * Sets the value of the StreamStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED
     *
     * @param streamStatus The new value for the StreamStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StreamStatus
     */
    public StreamDescription withStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
        return this;
    }

    /**
     * Sets the value of the StreamStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED
     *
     * @param streamStatus The new value for the StreamStatus property for this object.
     *
     * @see StreamStatus
     */
    public void setStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
    }
    
    /**
     * Sets the value of the StreamStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLING, ENABLED, DISABLING, DISABLED
     *
     * @param streamStatus The new value for the StreamStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StreamStatus
     */
    public StreamDescription withStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
        return this;
    }

    /**
     * Returns the value of the StreamViewType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY
     *
     * @return The value of the StreamViewType property for this object.
     *
     * @see StreamViewType
     */
    public String getStreamViewType() {
        return streamViewType;
    }
    
    /**
     * Sets the value of the StreamViewType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY
     *
     * @param streamViewType The new value for the StreamViewType property for this object.
     *
     * @see StreamViewType
     */
    public void setStreamViewType(String streamViewType) {
        this.streamViewType = streamViewType;
    }
    
    /**
     * Sets the value of the StreamViewType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY
     *
     * @param streamViewType The new value for the StreamViewType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StreamViewType
     */
    public StreamDescription withStreamViewType(String streamViewType) {
        this.streamViewType = streamViewType;
        return this;
    }

    /**
     * Sets the value of the StreamViewType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY
     *
     * @param streamViewType The new value for the StreamViewType property for this object.
     *
     * @see StreamViewType
     */
    public void setStreamViewType(StreamViewType streamViewType) {
        this.streamViewType = streamViewType.toString();
    }
    
    /**
     * Sets the value of the StreamViewType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NEW_IMAGE, OLD_IMAGE, NEW_AND_OLD_IMAGES, KEYS_ONLY
     *
     * @param streamViewType The new value for the StreamViewType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StreamViewType
     */
    public StreamDescription withStreamViewType(StreamViewType streamViewType) {
        this.streamViewType = streamViewType.toString();
        return this;
    }

    /**
     * Returns the value of the CreationRequestDateTime property for this
     * object.
     *
     * @return The value of the CreationRequestDateTime property for this object.
     */
    public java.util.Date getCreationRequestDateTime() {
        return creationRequestDateTime;
    }
    
    /**
     * Sets the value of the CreationRequestDateTime property for this
     * object.
     *
     * @param creationRequestDateTime The new value for the CreationRequestDateTime property for this
     *         object.
     */
    public void setCreationRequestDateTime(java.util.Date creationRequestDateTime) {
        this.creationRequestDateTime = creationRequestDateTime;
    }
    
    /**
     * Sets the value of the CreationRequestDateTime property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationRequestDateTime The new value for the CreationRequestDateTime property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamDescription withCreationRequestDateTime(java.util.Date creationRequestDateTime) {
        this.creationRequestDateTime = creationRequestDateTime;
        return this;
    }

    /**
     * Returns the value of the TableName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the TableName property for this object.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * Sets the value of the TableName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The new value for the TableName property for this object.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * Sets the value of the TableName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The new value for the TableName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamDescription withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Returns the value of the StreamARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return The value of the StreamARN property for this object.
     */
    public String getStreamARN() {
        return streamARN;
    }
    
    /**
     * Sets the value of the StreamARN property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param streamARN The new value for the StreamARN property for this object.
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }
    
    /**
     * Sets the value of the StreamARN property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param streamARN The new value for the StreamARN property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamDescription withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * Returns the value of the KeySchema property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return The value of the KeySchema property for this object.
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }
    
    /**
     * Sets the value of the KeySchema property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The new value for the KeySchema property for this object.
     */
    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
        keySchemaCopy.addAll(keySchema);
        this.keySchema = keySchemaCopy;
    }
    
    /**
     * Sets the value of the KeySchema property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The new value for the KeySchema property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamDescription withKeySchema(KeySchemaElement... keySchema) {
        if (getKeySchema() == null) setKeySchema(new java.util.ArrayList<KeySchemaElement>(keySchema.length));
        for (KeySchemaElement value : keySchema) {
            getKeySchema().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the KeySchema property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The new value for the KeySchema property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamDescription withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
            keySchemaCopy.addAll(keySchema);
            this.keySchema = keySchemaCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Shards property for this object.
     *
     * @return The value of the Shards property for this object.
     */
    public java.util.List<Shard> getShards() {
        return shards;
    }
    
    /**
     * Sets the value of the Shards property for this object.
     *
     * @param shards The new value for the Shards property for this object.
     */
    public void setShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Shard> shardsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Shard>(shards.size());
        shardsCopy.addAll(shards);
        this.shards = shardsCopy;
    }
    
    /**
     * Sets the value of the Shards property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shards The new value for the Shards property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamDescription withShards(Shard... shards) {
        if (getShards() == null) setShards(new java.util.ArrayList<Shard>(shards.length));
        for (Shard value : shards) {
            getShards().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Shards property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shards The new value for the Shards property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamDescription withShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Shard> shardsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Shard>(shards.size());
            shardsCopy.addAll(shards);
            this.shards = shardsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the LastEvaluatedShardId property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @return The value of the LastEvaluatedShardId property for this object.
     */
    public String getLastEvaluatedShardId() {
        return lastEvaluatedShardId;
    }
    
    /**
     * Sets the value of the LastEvaluatedShardId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @param lastEvaluatedShardId The new value for the LastEvaluatedShardId property for this object.
     */
    public void setLastEvaluatedShardId(String lastEvaluatedShardId) {
        this.lastEvaluatedShardId = lastEvaluatedShardId;
    }
    
    /**
     * Sets the value of the LastEvaluatedShardId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>28 - 65<br/>
     *
     * @param lastEvaluatedShardId The new value for the LastEvaluatedShardId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamDescription withLastEvaluatedShardId(String lastEvaluatedShardId) {
        this.lastEvaluatedShardId = lastEvaluatedShardId;
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
        if (getStreamStatus() != null) sb.append("StreamStatus: " + getStreamStatus() + ",");
        if (getStreamViewType() != null) sb.append("StreamViewType: " + getStreamViewType() + ",");
        if (getCreationRequestDateTime() != null) sb.append("CreationRequestDateTime: " + getCreationRequestDateTime() + ",");
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");
        if (getStreamARN() != null) sb.append("StreamARN: " + getStreamARN() + ",");
        if (getKeySchema() != null) sb.append("KeySchema: " + getKeySchema() + ",");
        if (getShards() != null) sb.append("Shards: " + getShards() + ",");
        if (getLastEvaluatedShardId() != null) sb.append("LastEvaluatedShardId: " + getLastEvaluatedShardId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode()); 
        hashCode = prime * hashCode + ((getStreamStatus() == null) ? 0 : getStreamStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStreamViewType() == null) ? 0 : getStreamViewType().hashCode()); 
        hashCode = prime * hashCode + ((getCreationRequestDateTime() == null) ? 0 : getCreationRequestDateTime().hashCode()); 
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode()); 
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode()); 
        hashCode = prime * hashCode + ((getShards() == null) ? 0 : getShards().hashCode()); 
        hashCode = prime * hashCode + ((getLastEvaluatedShardId() == null) ? 0 : getLastEvaluatedShardId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StreamDescription == false) return false;
        StreamDescription other = (StreamDescription)obj;
        
        if (other.getStreamId() == null ^ this.getStreamId() == null) return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false) return false; 
        if (other.getStreamStatus() == null ^ this.getStreamStatus() == null) return false;
        if (other.getStreamStatus() != null && other.getStreamStatus().equals(this.getStreamStatus()) == false) return false; 
        if (other.getStreamViewType() == null ^ this.getStreamViewType() == null) return false;
        if (other.getStreamViewType() != null && other.getStreamViewType().equals(this.getStreamViewType()) == false) return false; 
        if (other.getCreationRequestDateTime() == null ^ this.getCreationRequestDateTime() == null) return false;
        if (other.getCreationRequestDateTime() != null && other.getCreationRequestDateTime().equals(this.getCreationRequestDateTime()) == false) return false; 
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getStreamARN() == null ^ this.getStreamARN() == null) return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false) return false; 
        if (other.getKeySchema() == null ^ this.getKeySchema() == null) return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false) return false; 
        if (other.getShards() == null ^ this.getShards() == null) return false;
        if (other.getShards() != null && other.getShards().equals(this.getShards()) == false) return false; 
        if (other.getLastEvaluatedShardId() == null ^ this.getLastEvaluatedShardId() == null) return false;
        if (other.getLastEvaluatedShardId() != null && other.getLastEvaluatedShardId().equals(this.getLastEvaluatedShardId()) == false) return false; 
        return true;
    }
    
}
    