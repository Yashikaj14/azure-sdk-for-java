// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cdn.models.ProfileResourceState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties required to create a profile. */
@Fluent
public final class ProfileProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProfileProperties.class);

    /*
     * Resource status of the profile.
     */
    @JsonProperty(value = "resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private ProfileResourceState resourceState;

    /*
     * Managed service identity.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Provisioning status of the profile.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The Id of the frontdoor.
     */
    @JsonProperty(value = "frontDoorId", access = JsonProperty.Access.WRITE_ONLY)
    private String frontDoorId;

    /*
     * Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     */
    @JsonProperty(value = "originResponseTimeoutSeconds")
    private Integer originResponseTimeoutSeconds;

    /**
     * Get the resourceState property: Resource status of the profile.
     *
     * @return the resourceState value.
     */
    public ProfileResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the identity property: Managed service identity.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity.
     *
     * @param identity the identity value to set.
     * @return the ProfileProperties object itself.
     */
    public ProfileProperties withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status of the profile.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the frontDoorId property: The Id of the frontdoor.
     *
     * @return the frontDoorId value.
     */
    public String frontDoorId() {
        return this.frontDoorId;
    }

    /**
     * Get the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     *
     * @return the originResponseTimeoutSeconds value.
     */
    public Integer originResponseTimeoutSeconds() {
        return this.originResponseTimeoutSeconds;
    }

    /**
     * Set the originResponseTimeoutSeconds property: Send and receive timeout on forwarding request to the origin. When
     * timeout is reached, the request fails and returns.
     *
     * @param originResponseTimeoutSeconds the originResponseTimeoutSeconds value to set.
     * @return the ProfileProperties object itself.
     */
    public ProfileProperties withOriginResponseTimeoutSeconds(Integer originResponseTimeoutSeconds) {
        this.originResponseTimeoutSeconds = originResponseTimeoutSeconds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}
