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
 * Stream Record
 */
public class StreamRecord implements Serializable {

    private java.util.Map<String,AttributeValue> keys;

    private java.util.Map<String,AttributeValue> newImage;

    private java.util.Map<String,AttributeValue> oldImage;

    private String sequenceNumber;

    private Long sizeBytes;

    private String streamViewType;

    /**
     * Returns the value of the Keys property for this object.
     *
     * @return The value of the Keys property for this object.
     */
    public java.util.Map<String,AttributeValue> getKeys() {
        
        return keys;
    }
    
    /**
     * Sets the value of the Keys property for this object.
     *
     * @param keys The new value for the Keys property for this object.
     */
    public void setKeys(java.util.Map<String,AttributeValue> keys) {
        this.keys = keys;
    }
    
    /**
     * Sets the value of the Keys property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keys The new value for the Keys property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamRecord withKeys(java.util.Map<String,AttributeValue> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * Sets the value of the Keys property for this object.
     * <p>
     * The method adds a new key-value pair into Keys parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Keys.
     * @param value The corresponding value of the entry to be added into Keys.
     */
    public StreamRecord addKeysEntry(String key, AttributeValue value) {
        if (null == this.keys) {
            this.keys = new java.util.HashMap<String,AttributeValue>();
        }
        if (this.keys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Keys.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public StreamRecord clearKeysEntries() {
        this.keys = null;
        return this;
    }
    
    /**
     * Returns the value of the NewImage property for this object.
     *
     * @return The value of the NewImage property for this object.
     */
    public java.util.Map<String,AttributeValue> getNewImage() {
        
        return newImage;
    }
    
    /**
     * Sets the value of the NewImage property for this object.
     *
     * @param newImage The new value for the NewImage property for this object.
     */
    public void setNewImage(java.util.Map<String,AttributeValue> newImage) {
        this.newImage = newImage;
    }
    
    /**
     * Sets the value of the NewImage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newImage The new value for the NewImage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamRecord withNewImage(java.util.Map<String,AttributeValue> newImage) {
        setNewImage(newImage);
        return this;
    }

    /**
     * Sets the value of the NewImage property for this object.
     * <p>
     * The method adds a new key-value pair into NewImage parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into NewImage.
     * @param value The corresponding value of the entry to be added into NewImage.
     */
    public StreamRecord addNewImageEntry(String key, AttributeValue value) {
        if (null == this.newImage) {
            this.newImage = new java.util.HashMap<String,AttributeValue>();
        }
        if (this.newImage.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.newImage.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NewImage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public StreamRecord clearNewImageEntries() {
        this.newImage = null;
        return this;
    }
    
    /**
     * Returns the value of the OldImage property for this object.
     *
     * @return The value of the OldImage property for this object.
     */
    public java.util.Map<String,AttributeValue> getOldImage() {
        
        return oldImage;
    }
    
    /**
     * Sets the value of the OldImage property for this object.
     *
     * @param oldImage The new value for the OldImage property for this object.
     */
    public void setOldImage(java.util.Map<String,AttributeValue> oldImage) {
        this.oldImage = oldImage;
    }
    
    /**
     * Sets the value of the OldImage property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param oldImage The new value for the OldImage property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamRecord withOldImage(java.util.Map<String,AttributeValue> oldImage) {
        setOldImage(oldImage);
        return this;
    }

    /**
     * Sets the value of the OldImage property for this object.
     * <p>
     * The method adds a new key-value pair into OldImage parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into OldImage.
     * @param value The corresponding value of the entry to be added into OldImage.
     */
    public StreamRecord addOldImageEntry(String key, AttributeValue value) {
        if (null == this.oldImage) {
            this.oldImage = new java.util.HashMap<String,AttributeValue>();
        }
        if (this.oldImage.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.oldImage.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OldImage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public StreamRecord clearOldImageEntries() {
        this.oldImage = null;
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
    public StreamRecord withSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     * Returns the value of the SizeBytes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the SizeBytes property for this object.
     */
    public Long getSizeBytes() {
        return sizeBytes;
    }
    
    /**
     * Sets the value of the SizeBytes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param sizeBytes The new value for the SizeBytes property for this object.
     */
    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }
    
    /**
     * Sets the value of the SizeBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param sizeBytes The new value for the SizeBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamRecord withSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
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
    public StreamRecord withStreamViewType(String streamViewType) {
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
    public StreamRecord withStreamViewType(StreamViewType streamViewType) {
        this.streamViewType = streamViewType.toString();
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
        if (getKeys() != null) sb.append("Keys: " + getKeys() + ",");
        if (getNewImage() != null) sb.append("NewImage: " + getNewImage() + ",");
        if (getOldImage() != null) sb.append("OldImage: " + getOldImage() + ",");
        if (getSequenceNumber() != null) sb.append("SequenceNumber: " + getSequenceNumber() + ",");
        if (getSizeBytes() != null) sb.append("SizeBytes: " + getSizeBytes() + ",");
        if (getStreamViewType() != null) sb.append("StreamViewType: " + getStreamViewType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode()); 
        hashCode = prime * hashCode + ((getNewImage() == null) ? 0 : getNewImage().hashCode()); 
        hashCode = prime * hashCode + ((getOldImage() == null) ? 0 : getOldImage().hashCode()); 
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode()); 
        hashCode = prime * hashCode + ((getSizeBytes() == null) ? 0 : getSizeBytes().hashCode()); 
        hashCode = prime * hashCode + ((getStreamViewType() == null) ? 0 : getStreamViewType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StreamRecord == false) return false;
        StreamRecord other = (StreamRecord)obj;
        
        if (other.getKeys() == null ^ this.getKeys() == null) return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false) return false; 
        if (other.getNewImage() == null ^ this.getNewImage() == null) return false;
        if (other.getNewImage() != null && other.getNewImage().equals(this.getNewImage()) == false) return false; 
        if (other.getOldImage() == null ^ this.getOldImage() == null) return false;
        if (other.getOldImage() != null && other.getOldImage().equals(this.getOldImage()) == false) return false; 
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null) return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false) return false; 
        if (other.getSizeBytes() == null ^ this.getSizeBytes() == null) return false;
        if (other.getSizeBytes() != null && other.getSizeBytes().equals(this.getSizeBytes()) == false) return false; 
        if (other.getStreamViewType() == null ^ this.getStreamViewType() == null) return false;
        if (other.getStreamViewType() != null && other.getStreamViewType().equals(this.getStreamViewType()) == false) return false; 
        return true;
    }
    
}
    