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
 * Describe Stream Result
 */
public class DescribeStreamResult implements Serializable {

    private StreamDescription streamDescription;

    /**
     * Returns the value of the StreamDescription property for this object.
     *
     * @return The value of the StreamDescription property for this object.
     */
    public StreamDescription getStreamDescription() {
        return streamDescription;
    }
    
    /**
     * Sets the value of the StreamDescription property for this object.
     *
     * @param streamDescription The new value for the StreamDescription property for this object.
     */
    public void setStreamDescription(StreamDescription streamDescription) {
        this.streamDescription = streamDescription;
    }
    
    /**
     * Sets the value of the StreamDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param streamDescription The new value for the StreamDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeStreamResult withStreamDescription(StreamDescription streamDescription) {
        this.streamDescription = streamDescription;
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
        if (getStreamDescription() != null) sb.append("StreamDescription: " + getStreamDescription() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStreamDescription() == null) ? 0 : getStreamDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStreamResult == false) return false;
        DescribeStreamResult other = (DescribeStreamResult)obj;
        
        if (other.getStreamDescription() == null ^ this.getStreamDescription() == null) return false;
        if (other.getStreamDescription() != null && other.getStreamDescription().equals(this.getStreamDescription()) == false) return false; 
        return true;
    }
    
}
    