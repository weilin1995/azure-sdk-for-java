/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_06_01.implementation;

import com.microsoft.azure.management.containerservice.v2019_06_01.ContainerServiceOrchestratorProfile;
import com.microsoft.azure.management.containerservice.v2019_06_01.ContainerServiceCustomProfile;
import com.microsoft.azure.management.containerservice.v2019_06_01.ContainerServiceServicePrincipalProfile;
import com.microsoft.azure.management.containerservice.v2019_06_01.ContainerServiceMasterProfile;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2019_06_01.ContainerServiceAgentPoolProfile;
import com.microsoft.azure.management.containerservice.v2019_06_01.ContainerServiceWindowsProfile;
import com.microsoft.azure.management.containerservice.v2019_06_01.ContainerServiceLinuxProfile;
import com.microsoft.azure.management.containerservice.v2019_06_01.ContainerServiceDiagnosticsProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Container service.
 */
@JsonFlatten
public class ContainerServiceInner extends Resource {
    /**
     * The current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Profile for the container service orchestrator.
     */
    @JsonProperty(value = "properties.orchestratorProfile", required = true)
    private ContainerServiceOrchestratorProfile orchestratorProfile;

    /**
     * Properties to configure a custom container service cluster.
     */
    @JsonProperty(value = "properties.customProfile")
    private ContainerServiceCustomProfile customProfile;

    /**
     * Information about a service principal identity for the cluster to use
     * for manipulating Azure APIs. Exact one of secret or keyVaultSecretRef
     * need to be specified.
     */
    @JsonProperty(value = "properties.servicePrincipalProfile")
    private ContainerServiceServicePrincipalProfile servicePrincipalProfile;

    /**
     * Profile for the container service master.
     */
    @JsonProperty(value = "properties.masterProfile", required = true)
    private ContainerServiceMasterProfile masterProfile;

    /**
     * Properties of the agent pool.
     */
    @JsonProperty(value = "properties.agentPoolProfiles")
    private List<ContainerServiceAgentPoolProfile> agentPoolProfiles;

    /**
     * Profile for Windows VMs in the container service cluster.
     */
    @JsonProperty(value = "properties.windowsProfile")
    private ContainerServiceWindowsProfile windowsProfile;

    /**
     * Profile for Linux VMs in the container service cluster.
     */
    @JsonProperty(value = "properties.linuxProfile", required = true)
    private ContainerServiceLinuxProfile linuxProfile;

    /**
     * Profile for diagnostics in the container service cluster.
     */
    @JsonProperty(value = "properties.diagnosticsProfile")
    private ContainerServiceDiagnosticsProfile diagnosticsProfile;

    /**
     * Get the current deployment or provisioning state, which only appears in the response.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get profile for the container service orchestrator.
     *
     * @return the orchestratorProfile value
     */
    public ContainerServiceOrchestratorProfile orchestratorProfile() {
        return this.orchestratorProfile;
    }

    /**
     * Set profile for the container service orchestrator.
     *
     * @param orchestratorProfile the orchestratorProfile value to set
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withOrchestratorProfile(ContainerServiceOrchestratorProfile orchestratorProfile) {
        this.orchestratorProfile = orchestratorProfile;
        return this;
    }

    /**
     * Get properties to configure a custom container service cluster.
     *
     * @return the customProfile value
     */
    public ContainerServiceCustomProfile customProfile() {
        return this.customProfile;
    }

    /**
     * Set properties to configure a custom container service cluster.
     *
     * @param customProfile the customProfile value to set
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withCustomProfile(ContainerServiceCustomProfile customProfile) {
        this.customProfile = customProfile;
        return this;
    }

    /**
     * Get information about a service principal identity for the cluster to use for manipulating Azure APIs. Exact one of secret or keyVaultSecretRef need to be specified.
     *
     * @return the servicePrincipalProfile value
     */
    public ContainerServiceServicePrincipalProfile servicePrincipalProfile() {
        return this.servicePrincipalProfile;
    }

    /**
     * Set information about a service principal identity for the cluster to use for manipulating Azure APIs. Exact one of secret or keyVaultSecretRef need to be specified.
     *
     * @param servicePrincipalProfile the servicePrincipalProfile value to set
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withServicePrincipalProfile(ContainerServiceServicePrincipalProfile servicePrincipalProfile) {
        this.servicePrincipalProfile = servicePrincipalProfile;
        return this;
    }

    /**
     * Get profile for the container service master.
     *
     * @return the masterProfile value
     */
    public ContainerServiceMasterProfile masterProfile() {
        return this.masterProfile;
    }

    /**
     * Set profile for the container service master.
     *
     * @param masterProfile the masterProfile value to set
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withMasterProfile(ContainerServiceMasterProfile masterProfile) {
        this.masterProfile = masterProfile;
        return this;
    }

    /**
     * Get properties of the agent pool.
     *
     * @return the agentPoolProfiles value
     */
    public List<ContainerServiceAgentPoolProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }

    /**
     * Set properties of the agent pool.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withAgentPoolProfiles(List<ContainerServiceAgentPoolProfile> agentPoolProfiles) {
        this.agentPoolProfiles = agentPoolProfiles;
        return this;
    }

    /**
     * Get profile for Windows VMs in the container service cluster.
     *
     * @return the windowsProfile value
     */
    public ContainerServiceWindowsProfile windowsProfile() {
        return this.windowsProfile;
    }

    /**
     * Set profile for Windows VMs in the container service cluster.
     *
     * @param windowsProfile the windowsProfile value to set
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withWindowsProfile(ContainerServiceWindowsProfile windowsProfile) {
        this.windowsProfile = windowsProfile;
        return this;
    }

    /**
     * Get profile for Linux VMs in the container service cluster.
     *
     * @return the linuxProfile value
     */
    public ContainerServiceLinuxProfile linuxProfile() {
        return this.linuxProfile;
    }

    /**
     * Set profile for Linux VMs in the container service cluster.
     *
     * @param linuxProfile the linuxProfile value to set
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        this.linuxProfile = linuxProfile;
        return this;
    }

    /**
     * Get profile for diagnostics in the container service cluster.
     *
     * @return the diagnosticsProfile value
     */
    public ContainerServiceDiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set profile for diagnostics in the container service cluster.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set
     * @return the ContainerServiceInner object itself.
     */
    public ContainerServiceInner withDiagnosticsProfile(ContainerServiceDiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

}
