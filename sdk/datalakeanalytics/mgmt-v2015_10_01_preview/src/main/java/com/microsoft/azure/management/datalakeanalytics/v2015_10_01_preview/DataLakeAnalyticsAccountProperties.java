/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import java.util.List;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.DataLakeStoreAccountInfoInner;
import com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.implementation.StorageAccountInfoInner;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The account specific properties that are associated with an underlying Data
 * Lake Analytics account.
 */
public class DataLakeAnalyticsAccountProperties {
    /**
     * the provisioning status of the Data Lake Analytics account. Possible
     * values include: 'Failed', 'Creating', 'Running', 'Succeeded',
     * 'Patching', 'Suspending', 'Resuming', 'Deleting', 'Deleted'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeAnalyticsAccountStatus provisioningState;

    /**
     * the state of the Data Lake Analytics account. Possible values include:
     * 'active', 'suspended'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeAnalyticsAccountState state;

    /**
     * the default data lake storage account associated with this Data Lake
     * Analytics account.
     */
    @JsonProperty(value = "defaultDataLakeStoreAccount")
    private String defaultDataLakeStoreAccount;

    /**
     * the maximum supported degree of parallelism for this account.
     */
    @JsonProperty(value = "maxDegreeOfParallelism")
    private Integer maxDegreeOfParallelism;

    /**
     * the maximum supported jobs running under the account at the same time.
     */
    @JsonProperty(value = "maxJobCount")
    private Integer maxJobCount;

    /**
     * the list of Data Lake storage accounts associated with this account.
     */
    @JsonProperty(value = "dataLakeStoreAccounts")
    private List<DataLakeStoreAccountInfoInner> dataLakeStoreAccounts;

    /**
     * the list of Azure Blob storage accounts associated with this account.
     */
    @JsonProperty(value = "storageAccounts")
    private List<StorageAccountInfoInner> storageAccounts;

    /**
     * the account creation time.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * the account last modified time.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * the full CName endpoint for this account.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * Get the provisioning status of the Data Lake Analytics account. Possible values include: 'Failed', 'Creating', 'Running', 'Succeeded', 'Patching', 'Suspending', 'Resuming', 'Deleting', 'Deleted'.
     *
     * @return the provisioningState value
     */
    public DataLakeAnalyticsAccountStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the state of the Data Lake Analytics account. Possible values include: 'active', 'suspended'.
     *
     * @return the state value
     */
    public DataLakeAnalyticsAccountState state() {
        return this.state;
    }

    /**
     * Get the default data lake storage account associated with this Data Lake Analytics account.
     *
     * @return the defaultDataLakeStoreAccount value
     */
    public String defaultDataLakeStoreAccount() {
        return this.defaultDataLakeStoreAccount;
    }

    /**
     * Set the default data lake storage account associated with this Data Lake Analytics account.
     *
     * @param defaultDataLakeStoreAccount the defaultDataLakeStoreAccount value to set
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withDefaultDataLakeStoreAccount(String defaultDataLakeStoreAccount) {
        this.defaultDataLakeStoreAccount = defaultDataLakeStoreAccount;
        return this;
    }

    /**
     * Get the maximum supported degree of parallelism for this account.
     *
     * @return the maxDegreeOfParallelism value
     */
    public Integer maxDegreeOfParallelism() {
        return this.maxDegreeOfParallelism;
    }

    /**
     * Set the maximum supported degree of parallelism for this account.
     *
     * @param maxDegreeOfParallelism the maxDegreeOfParallelism value to set
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withMaxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
        this.maxDegreeOfParallelism = maxDegreeOfParallelism;
        return this;
    }

    /**
     * Get the maximum supported jobs running under the account at the same time.
     *
     * @return the maxJobCount value
     */
    public Integer maxJobCount() {
        return this.maxJobCount;
    }

    /**
     * Set the maximum supported jobs running under the account at the same time.
     *
     * @param maxJobCount the maxJobCount value to set
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withMaxJobCount(Integer maxJobCount) {
        this.maxJobCount = maxJobCount;
        return this;
    }

    /**
     * Get the list of Data Lake storage accounts associated with this account.
     *
     * @return the dataLakeStoreAccounts value
     */
    public List<DataLakeStoreAccountInfoInner> dataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }

    /**
     * Set the list of Data Lake storage accounts associated with this account.
     *
     * @param dataLakeStoreAccounts the dataLakeStoreAccounts value to set
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withDataLakeStoreAccounts(List<DataLakeStoreAccountInfoInner> dataLakeStoreAccounts) {
        this.dataLakeStoreAccounts = dataLakeStoreAccounts;
        return this;
    }

    /**
     * Get the list of Azure Blob storage accounts associated with this account.
     *
     * @return the storageAccounts value
     */
    public List<StorageAccountInfoInner> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Set the list of Azure Blob storage accounts associated with this account.
     *
     * @param storageAccounts the storageAccounts value to set
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withStorageAccounts(List<StorageAccountInfoInner> storageAccounts) {
        this.storageAccounts = storageAccounts;
        return this;
    }

    /**
     * Get the account creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the account last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the full CName endpoint for this account.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

}
