// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** API base contract details. */
@Fluent
public class ApiEntityBaseContract {
    /*
     * Description of the API. May include HTML formatting tags.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Collection of authentication settings included into this API.
     */
    @JsonProperty(value = "authenticationSettings")
    private AuthenticationSettingsContract authenticationSettings;

    /*
     * Protocols over which API is made available.
     */
    @JsonProperty(value = "subscriptionKeyParameterNames")
    private SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames;

    /*
     * Type of API.
     */
    @JsonProperty(value = "type")
    private ApiType apiType;

    /*
     * Describes the revision of the API. If no value is provided, default
     * revision 1 is created
     */
    @JsonProperty(value = "apiRevision")
    private String apiRevision;

    /*
     * Indicates the version identifier of the API if the API is versioned
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /*
     * Indicates if API revision is current api revision.
     */
    @JsonProperty(value = "isCurrent")
    private Boolean isCurrent;

    /*
     * Indicates if API revision is accessible via the gateway.
     */
    @JsonProperty(value = "isOnline", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isOnline;

    /*
     * Description of the API Revision.
     */
    @JsonProperty(value = "apiRevisionDescription")
    private String apiRevisionDescription;

    /*
     * Description of the API Version.
     */
    @JsonProperty(value = "apiVersionDescription")
    private String apiVersionDescription;

    /*
     * A resource identifier for the related ApiVersionSet.
     */
    @JsonProperty(value = "apiVersionSetId")
    private String apiVersionSetId;

    /*
     * Specifies whether an API or Product subscription is required for
     * accessing the API.
     */
    @JsonProperty(value = "subscriptionRequired")
    private Boolean subscriptionRequired;

    /*
     * A URL to the Terms of Service for the API. MUST be in the format of a
     * URL.
     */
    @JsonProperty(value = "termsOfServiceUrl")
    private String termsOfServiceUrl;

    /*
     * Contact information for the API.
     */
    @JsonProperty(value = "contact")
    private ApiContactInformation contact;

    /*
     * License information for the API.
     */
    @JsonProperty(value = "license")
    private ApiLicenseInformation license;

    /**
     * Get the description property: Description of the API. May include HTML formatting tags.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the API. May include HTML formatting tags.
     *
     * @param description the description value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the authenticationSettings property: Collection of authentication settings included into this API.
     *
     * @return the authenticationSettings value.
     */
    public AuthenticationSettingsContract authenticationSettings() {
        return this.authenticationSettings;
    }

    /**
     * Set the authenticationSettings property: Collection of authentication settings included into this API.
     *
     * @param authenticationSettings the authenticationSettings value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withAuthenticationSettings(AuthenticationSettingsContract authenticationSettings) {
        this.authenticationSettings = authenticationSettings;
        return this;
    }

    /**
     * Get the subscriptionKeyParameterNames property: Protocols over which API is made available.
     *
     * @return the subscriptionKeyParameterNames value.
     */
    public SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames() {
        return this.subscriptionKeyParameterNames;
    }

    /**
     * Set the subscriptionKeyParameterNames property: Protocols over which API is made available.
     *
     * @param subscriptionKeyParameterNames the subscriptionKeyParameterNames value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withSubscriptionKeyParameterNames(
        SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        this.subscriptionKeyParameterNames = subscriptionKeyParameterNames;
        return this;
    }

    /**
     * Get the apiType property: Type of API.
     *
     * @return the apiType value.
     */
    public ApiType apiType() {
        return this.apiType;
    }

    /**
     * Set the apiType property: Type of API.
     *
     * @param apiType the apiType value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withApiType(ApiType apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * Get the apiRevision property: Describes the revision of the API. If no value is provided, default revision 1 is
     * created.
     *
     * @return the apiRevision value.
     */
    public String apiRevision() {
        return this.apiRevision;
    }

    /**
     * Set the apiRevision property: Describes the revision of the API. If no value is provided, default revision 1 is
     * created.
     *
     * @param apiRevision the apiRevision value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }

    /**
     * Get the apiVersion property: Indicates the version identifier of the API if the API is versioned.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: Indicates the version identifier of the API if the API is versioned.
     *
     * @param apiVersion the apiVersion value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the isCurrent property: Indicates if API revision is current api revision.
     *
     * @return the isCurrent value.
     */
    public Boolean isCurrent() {
        return this.isCurrent;
    }

    /**
     * Set the isCurrent property: Indicates if API revision is current api revision.
     *
     * @param isCurrent the isCurrent value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withIsCurrent(Boolean isCurrent) {
        this.isCurrent = isCurrent;
        return this;
    }

    /**
     * Get the isOnline property: Indicates if API revision is accessible via the gateway.
     *
     * @return the isOnline value.
     */
    public Boolean isOnline() {
        return this.isOnline;
    }

    /**
     * Get the apiRevisionDescription property: Description of the API Revision.
     *
     * @return the apiRevisionDescription value.
     */
    public String apiRevisionDescription() {
        return this.apiRevisionDescription;
    }

    /**
     * Set the apiRevisionDescription property: Description of the API Revision.
     *
     * @param apiRevisionDescription the apiRevisionDescription value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withApiRevisionDescription(String apiRevisionDescription) {
        this.apiRevisionDescription = apiRevisionDescription;
        return this;
    }

    /**
     * Get the apiVersionDescription property: Description of the API Version.
     *
     * @return the apiVersionDescription value.
     */
    public String apiVersionDescription() {
        return this.apiVersionDescription;
    }

    /**
     * Set the apiVersionDescription property: Description of the API Version.
     *
     * @param apiVersionDescription the apiVersionDescription value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withApiVersionDescription(String apiVersionDescription) {
        this.apiVersionDescription = apiVersionDescription;
        return this;
    }

    /**
     * Get the apiVersionSetId property: A resource identifier for the related ApiVersionSet.
     *
     * @return the apiVersionSetId value.
     */
    public String apiVersionSetId() {
        return this.apiVersionSetId;
    }

    /**
     * Set the apiVersionSetId property: A resource identifier for the related ApiVersionSet.
     *
     * @param apiVersionSetId the apiVersionSetId value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withApiVersionSetId(String apiVersionSetId) {
        this.apiVersionSetId = apiVersionSetId;
        return this;
    }

    /**
     * Get the subscriptionRequired property: Specifies whether an API or Product subscription is required for accessing
     * the API.
     *
     * @return the subscriptionRequired value.
     */
    public Boolean subscriptionRequired() {
        return this.subscriptionRequired;
    }

    /**
     * Set the subscriptionRequired property: Specifies whether an API or Product subscription is required for accessing
     * the API.
     *
     * @param subscriptionRequired the subscriptionRequired value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withSubscriptionRequired(Boolean subscriptionRequired) {
        this.subscriptionRequired = subscriptionRequired;
        return this;
    }

    /**
     * Get the termsOfServiceUrl property: A URL to the Terms of Service for the API. MUST be in the format of a URL.
     *
     * @return the termsOfServiceUrl value.
     */
    public String termsOfServiceUrl() {
        return this.termsOfServiceUrl;
    }

    /**
     * Set the termsOfServiceUrl property: A URL to the Terms of Service for the API. MUST be in the format of a URL.
     *
     * @param termsOfServiceUrl the termsOfServiceUrl value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
        return this;
    }

    /**
     * Get the contact property: Contact information for the API.
     *
     * @return the contact value.
     */
    public ApiContactInformation contact() {
        return this.contact;
    }

    /**
     * Set the contact property: Contact information for the API.
     *
     * @param contact the contact value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withContact(ApiContactInformation contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Get the license property: License information for the API.
     *
     * @return the license value.
     */
    public ApiLicenseInformation license() {
        return this.license;
    }

    /**
     * Set the license property: License information for the API.
     *
     * @param license the license value to set.
     * @return the ApiEntityBaseContract object itself.
     */
    public ApiEntityBaseContract withLicense(ApiLicenseInformation license) {
        this.license = license;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (authenticationSettings() != null) {
            authenticationSettings().validate();
        }
        if (subscriptionKeyParameterNames() != null) {
            subscriptionKeyParameterNames().validate();
        }
        if (contact() != null) {
            contact().validate();
        }
        if (license() != null) {
            license().validate();
        }
    }
}
