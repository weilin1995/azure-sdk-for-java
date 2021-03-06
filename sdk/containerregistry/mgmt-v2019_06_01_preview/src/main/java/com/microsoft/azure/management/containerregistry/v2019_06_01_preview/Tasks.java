/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_06_01_preview.implementation.TasksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Tasks.
 */
public interface Tasks extends SupportsCreating<Task.DefinitionStages.Blank>, HasInner<TasksInner> {
    /**
     * Returns a task with extended information that includes all secrets.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskName The name of the container registry task.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Task> getDetailsAsync(String resourceGroupName, String registryName, String taskName);

    /**
     * Get the properties of a specified task.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskName The name of the container registry task.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Task> getAsync(String resourceGroupName, String registryName, String taskName);

    /**
     * Lists all the tasks for a specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Task> listAsync(final String resourceGroupName, final String registryName);

    /**
     * Deletes a specified task.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param taskName The name of the container registry task.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String registryName, String taskName);

}
