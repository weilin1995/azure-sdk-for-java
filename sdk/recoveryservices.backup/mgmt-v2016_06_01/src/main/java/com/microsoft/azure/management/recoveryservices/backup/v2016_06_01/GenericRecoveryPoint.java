/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.RecoveryPointInner;

/**
 * Generic backup copy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("GenericRecoveryPoint")
public class GenericRecoveryPoint extends RecoveryPointInner {
    /**
     * Friendly name of the backup copy.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Type of the backup copy.
     */
    @JsonProperty(value = "recoveryPointType")
    private String recoveryPointType;

    /**
     * The time when this backup copy was created.
     */
    @JsonProperty(value = "recoveryPointTime")
    private DateTime recoveryPointTime;

    /**
     * Additional information associated with this backup copy.
     */
    @JsonProperty(value = "recoveryPointAdditionalInfo")
    private String recoveryPointAdditionalInfo;

    /**
     * Get friendly name of the backup copy.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the backup copy.
     *
     * @param friendlyName the friendlyName value to set
     * @return the GenericRecoveryPoint object itself.
     */
    public GenericRecoveryPoint withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get type of the backup copy.
     *
     * @return the recoveryPointType value
     */
    public String recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set type of the backup copy.
     *
     * @param recoveryPointType the recoveryPointType value to set
     * @return the GenericRecoveryPoint object itself.
     */
    public GenericRecoveryPoint withRecoveryPointType(String recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the time when this backup copy was created.
     *
     * @return the recoveryPointTime value
     */
    public DateTime recoveryPointTime() {
        return this.recoveryPointTime;
    }

    /**
     * Set the time when this backup copy was created.
     *
     * @param recoveryPointTime the recoveryPointTime value to set
     * @return the GenericRecoveryPoint object itself.
     */
    public GenericRecoveryPoint withRecoveryPointTime(DateTime recoveryPointTime) {
        this.recoveryPointTime = recoveryPointTime;
        return this;
    }

    /**
     * Get additional information associated with this backup copy.
     *
     * @return the recoveryPointAdditionalInfo value
     */
    public String recoveryPointAdditionalInfo() {
        return this.recoveryPointAdditionalInfo;
    }

    /**
     * Set additional information associated with this backup copy.
     *
     * @param recoveryPointAdditionalInfo the recoveryPointAdditionalInfo value to set
     * @return the GenericRecoveryPoint object itself.
     */
    public GenericRecoveryPoint withRecoveryPointAdditionalInfo(String recoveryPointAdditionalInfo) {
        this.recoveryPointAdditionalInfo = recoveryPointAdditionalInfo;
        return this;
    }

}
