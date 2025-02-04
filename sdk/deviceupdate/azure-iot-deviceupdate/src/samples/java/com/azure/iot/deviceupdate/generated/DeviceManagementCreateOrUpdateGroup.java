// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceManagementClient;
import com.azure.iot.deviceupdate.DeviceManagementClientBuilder;

public class DeviceManagementCreateOrUpdateGroup {
    public static void main(String[] args) {
        // BEGIN:
        // com.azure.iot.deviceupdate.generated.devicemanagementcreateorupdategroup.devicemanagementcreateorupdategroup
        DeviceManagementClient deviceManagementClient =
                new DeviceManagementClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildClient();
        BinaryData group =
                BinaryData.fromString(
                        "{\"createdDateTime\":\"2020-07-01T12:13:14.0000000Z\",\"deviceClassId\":\"9fd33c505d62e4c585b529ae0d643478d8da42c9\",\"groupId\":\"MyGroup\",\"groupType\":\"DeviceClassIdAndIoTHubTag\",\"tags\":[\"MyGroup\"]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                deviceManagementClient.createOrUpdateGroupWithResponse("MyGroup", group, requestOptions);
        // END:
        // com.azure.iot.deviceupdate.generated.devicemanagementcreateorupdategroup.devicemanagementcreateorupdategroup
    }
}
