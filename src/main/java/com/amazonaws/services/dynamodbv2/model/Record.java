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
 * Record
 */
public class Record implements Serializable {

    private String eventID;

    private String eventName;

    private String eventVersion;

    private String eventSource;

    private String awsRegion;

    private StreamRecord dynamodb;

    /**
     * Returns the value of the EventID property for this object.
     *
     * @return The value of the EventID property for this object.
     */
    public String getEventID() {
        return eventID;
    }
    
    /**
     * Sets the value of the EventID property for this object.
     *
     * @param eventID The new value for the EventID property for this object.
     */
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
    
    /**
     * Sets the value of the EventID property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventID The new value for the EventID property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withEventID(String eventID) {
        this.eventID = eventID;
        return this;
    }

    /**
     * Returns the value of the EventName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, MODIFY, REMOVE
     *
     * @return The value of the EventName property for this object.
     *
     * @see OperationType
     */
    public String getEventName() {
        return eventName;
    }
    
    /**
     * Sets the value of the EventName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, MODIFY, REMOVE
     *
     * @param eventName The new value for the EventName property for this object.
     *
     * @see OperationType
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    
    /**
     * Sets the value of the EventName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, MODIFY, REMOVE
     *
     * @param eventName The new value for the EventName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OperationType
     */
    public Record withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * Sets the value of the EventName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, MODIFY, REMOVE
     *
     * @param eventName The new value for the EventName property for this object.
     *
     * @see OperationType
     */
    public void setEventName(OperationType eventName) {
        this.eventName = eventName.toString();
    }
    
    /**
     * Sets the value of the EventName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, MODIFY, REMOVE
     *
     * @param eventName The new value for the EventName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OperationType
     */
    public Record withEventName(OperationType eventName) {
        this.eventName = eventName.toString();
        return this;
    }

    /**
     * Returns the value of the EventVersion property for this object.
     *
     * @return The value of the EventVersion property for this object.
     */
    public String getEventVersion() {
        return eventVersion;
    }
    
    /**
     * Sets the value of the EventVersion property for this object.
     *
     * @param eventVersion The new value for the EventVersion property for this object.
     */
    public void setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
    }
    
    /**
     * Sets the value of the EventVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventVersion The new value for the EventVersion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
        return this;
    }

    /**
     * Returns the value of the EventSource property for this object.
     *
     * @return The value of the EventSource property for this object.
     */
    public String getEventSource() {
        return eventSource;
    }
    
    /**
     * Sets the value of the EventSource property for this object.
     *
     * @param eventSource The new value for the EventSource property for this object.
     */
    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }
    
    /**
     * Sets the value of the EventSource property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSource The new value for the EventSource property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * Returns the value of the AwsRegion property for this object.
     *
     * @return The value of the AwsRegion property for this object.
     */
    public String getAwsRegion() {
        return awsRegion;
    }
    
    /**
     * Sets the value of the AwsRegion property for this object.
     *
     * @param awsRegion The new value for the AwsRegion property for this object.
     */
    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }
    
    /**
     * Sets the value of the AwsRegion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param awsRegion The new value for the AwsRegion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    /**
     * Returns the value of the Dynamodb property for this object.
     *
     * @return The value of the Dynamodb property for this object.
     */
    public StreamRecord getDynamodb() {
        return dynamodb;
    }
    
    /**
     * Sets the value of the Dynamodb property for this object.
     *
     * @param dynamodb The new value for the Dynamodb property for this object.
     */
    public void setDynamodb(StreamRecord dynamodb) {
        this.dynamodb = dynamodb;
    }
    
    /**
     * Sets the value of the Dynamodb property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dynamodb The new value for the Dynamodb property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Record withDynamodb(StreamRecord dynamodb) {
        this.dynamodb = dynamodb;
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
        if (getEventID() != null) sb.append("EventID: " + getEventID() + ",");
        if (getEventName() != null) sb.append("EventName: " + getEventName() + ",");
        if (getEventVersion() != null) sb.append("EventVersion: " + getEventVersion() + ",");
        if (getEventSource() != null) sb.append("EventSource: " + getEventSource() + ",");
        if (getAwsRegion() != null) sb.append("AwsRegion: " + getAwsRegion() + ",");
        if (getDynamodb() != null) sb.append("Dynamodb: " + getDynamodb() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEventID() == null) ? 0 : getEventID().hashCode()); 
        hashCode = prime * hashCode + ((getEventName() == null) ? 0 : getEventName().hashCode()); 
        hashCode = prime * hashCode + ((getEventVersion() == null) ? 0 : getEventVersion().hashCode()); 
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode()); 
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode()); 
        hashCode = prime * hashCode + ((getDynamodb() == null) ? 0 : getDynamodb().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Record == false) return false;
        Record other = (Record)obj;
        
        if (other.getEventID() == null ^ this.getEventID() == null) return false;
        if (other.getEventID() != null && other.getEventID().equals(this.getEventID()) == false) return false; 
        if (other.getEventName() == null ^ this.getEventName() == null) return false;
        if (other.getEventName() != null && other.getEventName().equals(this.getEventName()) == false) return false; 
        if (other.getEventVersion() == null ^ this.getEventVersion() == null) return false;
        if (other.getEventVersion() != null && other.getEventVersion().equals(this.getEventVersion()) == false) return false; 
        if (other.getEventSource() == null ^ this.getEventSource() == null) return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false) return false; 
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null) return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false) return false; 
        if (other.getDynamodb() == null ^ this.getDynamodb() == null) return false;
        if (other.getDynamodb() != null && other.getDynamodb().equals(this.getDynamodb()) == false) return false; 
        return true;
    }
    
}
    