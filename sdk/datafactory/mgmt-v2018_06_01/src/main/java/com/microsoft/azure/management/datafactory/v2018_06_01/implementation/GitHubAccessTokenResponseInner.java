/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Get GitHub access token response definition.
 */
public class GitHubAccessTokenResponseInner {
    /**
     * GitHub access token.
     */
    @JsonProperty(value = "gitHubAccessToken")
    private String gitHubAccessToken;

    /**
     * Get gitHub access token.
     *
     * @return the gitHubAccessToken value
     */
    public String gitHubAccessToken() {
        return this.gitHubAccessToken;
    }

    /**
     * Set gitHub access token.
     *
     * @param gitHubAccessToken the gitHubAccessToken value to set
     * @return the GitHubAccessTokenResponseInner object itself.
     */
    public GitHubAccessTokenResponseInner withGitHubAccessToken(String gitHubAccessToken) {
        this.gitHubAccessToken = gitHubAccessToken;
        return this;
    }

}
