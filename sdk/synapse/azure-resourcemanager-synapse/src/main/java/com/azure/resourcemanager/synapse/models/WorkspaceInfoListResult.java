// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.WorkspaceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of workspaces. */
@Fluent
public final class WorkspaceInfoListResult {
    /*
     * Link to the next page of results
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * List of workspaces
     */
    @JsonProperty(value = "value")
    private List<WorkspaceInner> value;

    /**
     * Get the nextLink property: Link to the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the WorkspaceInfoListResult object itself.
     */
    public WorkspaceInfoListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: List of workspaces.
     *
     * @return the value value.
     */
    public List<WorkspaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of workspaces.
     *
     * @param value the value value to set.
     * @return the WorkspaceInfoListResult object itself.
     */
    public WorkspaceInfoListResult withValue(List<WorkspaceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
