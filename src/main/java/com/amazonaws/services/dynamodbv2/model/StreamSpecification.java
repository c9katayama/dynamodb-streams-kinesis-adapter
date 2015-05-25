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
 * Stream Specification
 */
public class StreamSpecification implements Serializable {

    private Boolean streamEnabled;

    private String streamViewType;

    /**
     * Returns the value of the StreamEnabled property for this object.
     *
     * @return The value of the StreamEnabled property for this object.
     */
    public Boolean isStreamEnabled() {
        return streamEnabled;
    }
    
    /**
     * Sets the value of the StreamEnabled property for this object.
     *
     * @param streamEnabled The new value for the StreamEnabled property for this object.
     */
    public void setStreamEnabled(Boolean streamEnabled) {
        this.streamEnabled = streamEnabled;
    }
    
    /**
     * Sets the value of the StreamEnabled property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamEnabled The new value for the StreamEnabled property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StreamSpecification withStreamEnabled(Boolean streamEnabled) {
        this.streamEnabled = streamEnabled;
        return this;
    }

    /**
     * Returns the value of the StreamEnabled property for this object.
     *
     * @return The value of the StreamEnabled property for this object.
     */
    public Boolean getStreamEnabled() {
        return streamEnabled;
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
    public StreamSpecification withStreamViewType(String streamViewType) {
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
    public StreamSpecification withStreamViewType(StreamViewType streamViewType) {
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
        if (isStreamEnabled() != null) sb.append("StreamEnabled: " + isStreamEnabled() + ",");
        if (getStreamViewType() != null) sb.append("StreamViewType: " + getStreamViewType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isStreamEnabled() == null) ? 0 : isStreamEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getStreamViewType() == null) ? 0 : getStreamViewType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StreamSpecification == false) return false;
        StreamSpecification other = (StreamSpecification)obj;
        
        if (other.isStreamEnabled() == null ^ this.isStreamEnabled() == null) return false;
        if (other.isStreamEnabled() != null && other.isStreamEnabled().equals(this.isStreamEnabled()) == false) return false; 
        if (other.getStreamViewType() == null ^ this.getStreamViewType() == null) return false;
        if (other.getStreamViewType() != null && other.getStreamViewType().equals(this.getStreamViewType()) == false) return false; 
        return true;
    }
    
}
    