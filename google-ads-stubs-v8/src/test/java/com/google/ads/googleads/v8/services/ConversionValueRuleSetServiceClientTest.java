/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.enums.ValueRuleSetDimensionEnum;
import com.google.ads.googleads.v8.resources.CampaignName;
import com.google.ads.googleads.v8.resources.ConversionValueRuleSet;
import com.google.ads.googleads.v8.resources.ConversionValueRuleSetName;
import com.google.ads.googleads.v8.resources.CustomerName;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.rpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class ConversionValueRuleSetServiceClientTest {
  private static MockConversionValueRuleSetService mockConversionValueRuleSetService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ConversionValueRuleSetServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockConversionValueRuleSetService = new MockConversionValueRuleSetService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockConversionValueRuleSetService));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    ConversionValueRuleSetServiceSettings settings =
        ConversionValueRuleSetServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ConversionValueRuleSetServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getConversionValueRuleSetTest() throws Exception {
    ConversionValueRuleSet expectedResponse =
        ConversionValueRuleSet.newBuilder()
            .setResourceName(
                ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]")
                    .toString())
            .setId(3355)
            .addAllConversionValueRules(new ArrayList<String>())
            .addAllDimensions(new ArrayList<ValueRuleSetDimensionEnum.ValueRuleSetDimension>())
            .setOwnerCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .build();
    mockConversionValueRuleSetService.addResponse(expectedResponse);

    ConversionValueRuleSetName resourceName =
        ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]");

    ConversionValueRuleSet actualResponse = client.getConversionValueRuleSet(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionValueRuleSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversionValueRuleSetRequest actualRequest =
        ((GetConversionValueRuleSetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName.toString(), actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversionValueRuleSetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionValueRuleSetService.addException(exception);

    try {
      ConversionValueRuleSetName resourceName =
          ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]");
      client.getConversionValueRuleSet(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConversionValueRuleSetTest2() throws Exception {
    ConversionValueRuleSet expectedResponse =
        ConversionValueRuleSet.newBuilder()
            .setResourceName(
                ConversionValueRuleSetName.of("[CUSTOMER_ID]", "[CONVERSION_VALUE_RULE_SET_ID]")
                    .toString())
            .setId(3355)
            .addAllConversionValueRules(new ArrayList<String>())
            .addAllDimensions(new ArrayList<ValueRuleSetDimensionEnum.ValueRuleSetDimension>())
            .setOwnerCustomer(CustomerName.of("[CUSTOMER_ID]").toString())
            .setCampaign(CampaignName.of("[CUSTOMER_ID]", "[CAMPAIGN_ID]").toString())
            .build();
    mockConversionValueRuleSetService.addResponse(expectedResponse);

    String resourceName = "resourceName-384566343";

    ConversionValueRuleSet actualResponse = client.getConversionValueRuleSet(resourceName);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionValueRuleSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetConversionValueRuleSetRequest actualRequest =
        ((GetConversionValueRuleSetRequest) actualRequests.get(0));

    Assert.assertEquals(resourceName, actualRequest.getResourceName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getConversionValueRuleSetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionValueRuleSetService.addException(exception);

    try {
      String resourceName = "resourceName-384566343";
      client.getConversionValueRuleSet(resourceName);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void mutateConversionValueRuleSetsTest() throws Exception {
    MutateConversionValueRuleSetsResponse expectedResponse =
        MutateConversionValueRuleSetsResponse.newBuilder()
            .addAllResults(new ArrayList<MutateConversionValueRuleSetResult>())
            .setPartialFailureError(Status.newBuilder().build())
            .build();
    mockConversionValueRuleSetService.addResponse(expectedResponse);

    String customerId = "customerId-1581184615";
    List<ConversionValueRuleSetOperation> operations = new ArrayList<>();

    MutateConversionValueRuleSetsResponse actualResponse =
        client.mutateConversionValueRuleSets(customerId, operations);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockConversionValueRuleSetService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    MutateConversionValueRuleSetsRequest actualRequest =
        ((MutateConversionValueRuleSetsRequest) actualRequests.get(0));

    Assert.assertEquals(customerId, actualRequest.getCustomerId());
    Assert.assertEquals(operations, actualRequest.getOperationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void mutateConversionValueRuleSetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockConversionValueRuleSetService.addException(exception);

    try {
      String customerId = "customerId-1581184615";
      List<ConversionValueRuleSetOperation> operations = new ArrayList<>();
      client.mutateConversionValueRuleSets(customerId, operations);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
