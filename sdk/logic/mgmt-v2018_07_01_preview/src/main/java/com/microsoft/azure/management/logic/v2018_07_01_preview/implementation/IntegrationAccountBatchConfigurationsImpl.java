/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2018_07_01_preview.IntegrationAccountBatchConfigurations;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.logic.v2018_07_01_preview.BatchConfiguration;

class IntegrationAccountBatchConfigurationsImpl extends WrapperImpl<IntegrationAccountBatchConfigurationsInner> implements IntegrationAccountBatchConfigurations {
    private final LogicManager manager;

    IntegrationAccountBatchConfigurationsImpl(LogicManager manager) {
        super(manager.inner().integrationAccountBatchConfigurations());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public BatchConfigurationImpl define(String name) {
        return wrapModel(name);
    }

    private BatchConfigurationImpl wrapModel(BatchConfigurationInner inner) {
        return  new BatchConfigurationImpl(inner, manager());
    }

    private BatchConfigurationImpl wrapModel(String name) {
        return new BatchConfigurationImpl(name, this.manager());
    }

    @Override
    public Observable<BatchConfiguration> listAsync(String resourceGroupName, String integrationAccountName) {
        IntegrationAccountBatchConfigurationsInner client = this.inner();
        return client.listAsync(resourceGroupName, integrationAccountName)
        .flatMap(new Func1<List<BatchConfigurationInner>, Observable<BatchConfigurationInner>>() {
            @Override
            public Observable<BatchConfigurationInner> call(List<BatchConfigurationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<BatchConfigurationInner, BatchConfiguration>() {
            @Override
            public BatchConfiguration call(BatchConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BatchConfiguration> getAsync(String resourceGroupName, String integrationAccountName, String batchConfigurationName) {
        IntegrationAccountBatchConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, batchConfigurationName)
        .map(new Func1<BatchConfigurationInner, BatchConfiguration>() {
            @Override
            public BatchConfiguration call(BatchConfigurationInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String batchConfigurationName) {
        IntegrationAccountBatchConfigurationsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, batchConfigurationName).toCompletable();
    }

}
