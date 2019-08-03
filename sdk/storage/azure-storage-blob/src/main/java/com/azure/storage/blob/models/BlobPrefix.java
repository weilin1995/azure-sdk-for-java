// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The BlobPrefix model.
 */
@JacksonXmlRootElement(localName = "BlobPrefix")
@Fluent
public final class BlobPrefix {
    /*
     * The name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the BlobPrefix object itself.
     */
    public BlobPrefix name(String name) {
        this.name = name;
        return this;
    }
}