/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.implementation;

import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementConfiguration;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.operationsmanagement.v2015_11_01_preview.ManagementConfigurationProperties;

class ManagementConfigurationImpl extends CreatableUpdatableImpl<ManagementConfiguration, ManagementConfigurationInner, ManagementConfigurationImpl> implements ManagementConfiguration, ManagementConfiguration.Definition, ManagementConfiguration.Update {
    private String resourceGroupName;
    private String managementConfigurationName;
    private final OperationsManagementManager manager;

    ManagementConfigurationImpl(String name, OperationsManagementManager manager) {
        super(name, new ManagementConfigurationInner());
        this.manager = manager;
        // Set resource name
        this.managementConfigurationName = name;
        //
    }

    ManagementConfigurationImpl(ManagementConfigurationInner inner, OperationsManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.managementConfigurationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.managementConfigurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "ManagementConfigurations");
        // set other parameters for create and update
    }

    @Override
    public OperationsManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagementConfiguration> createResourceAsync() {
        ManagementConfigurationsInner client = this.manager().inner().managementConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managementConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagementConfiguration> updateResourceAsync() {
        ManagementConfigurationsInner client = this.manager().inner().managementConfigurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managementConfigurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagementConfigurationInner> getInnerAsync() {
        ManagementConfigurationsInner client = this.manager().inner().managementConfigurations();
        return client.getByResourceGroupAsync(this.resourceGroupName, this.managementConfigurationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ManagementConfigurationProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ManagementConfigurationImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public ManagementConfigurationImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ManagementConfigurationImpl withProperties(ManagementConfigurationProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}