/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.visualsearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The ImageEntityAction model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type", defaultImpl = ImageEntityAction.class)
@JsonTypeName("ImageEntityAction")
public class ImageEntityAction extends ImageAction {
    /**
     * Information about the entity.
     */
    @JsonProperty(value = "data", access = JsonProperty.Access.WRITE_ONLY)
    private Thing data;

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public Thing data() {
        return this.data;
    }

}
