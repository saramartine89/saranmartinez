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

package com.google.ads.googleads.v9.services;

import com.google.ads.googleads.v9.resources.CampaignCriterionSimulation;
import com.google.ads.googleads.v9.resources.CampaignCriterionSimulationName;
import com.google.ads.googleads.v9.services.stub.CampaignCriterionSimulationServiceStub;
import com.google.ads.googleads.v9.services.stub.CampaignCriterionSimulationServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch campaign criterion simulations.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (CampaignCriterionSimulationServiceClient campaignCriterionSimulationServiceClient =
 *     CampaignCriterionSimulationServiceClient.create()) {
 *   CampaignCriterionSimulationName resourceName =
 *       CampaignCriterionSimulationName.of(
 *           "[CUSTOMER_ID]",
 *           "[CAMPAIGN_ID]",
 *           "[CRITERION_ID]",
 *           "[TYPE]",
 *           "[MODIFICATION_METHOD]",
 *           "[START_DATE]",
 *           "[END_DATE]");
 *   CampaignCriterionSimulation response =
 *       campaignCriterionSimulationServiceClient.getCampaignCriterionSimulation(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CampaignCriterionSimulationServiceClient object to
 * clean up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * CampaignCriterionSimulationServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * CampaignCriterionSimulationServiceSettings campaignCriterionSimulationServiceSettings =
 *     CampaignCriterionSimulationServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CampaignCriterionSimulationServiceClient campaignCriterionSimulationServiceClient =
 *     CampaignCriterionSimulationServiceClient.create(campaignCriterionSimulationServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * CampaignCriterionSimulationServiceSettings campaignCriterionSimulationServiceSettings =
 *     CampaignCriterionSimulationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CampaignCriterionSimulationServiceClient campaignCriterionSimulationServiceClient =
 *     CampaignCriterionSimulationServiceClient.create(campaignCriterionSimulationServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CampaignCriterionSimulationServiceClient implements BackgroundResource {
  private final CampaignCriterionSimulationServiceSettings settings;
  private final CampaignCriterionSimulationServiceStub stub;

  /** Constructs an instance of CampaignCriterionSimulationServiceClient with default settings. */
  public static final CampaignCriterionSimulationServiceClient create() throws IOException {
    return create(CampaignCriterionSimulationServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CampaignCriterionSimulationServiceClient, using the given settings.
   * The channels are created based on the settings passed in, or defaults for any settings that are
   * not set.
   */
  public static final CampaignCriterionSimulationServiceClient create(
      CampaignCriterionSimulationServiceSettings settings) throws IOException {
    return new CampaignCriterionSimulationServiceClient(settings);
  }

  /**
   * Constructs an instance of CampaignCriterionSimulationServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(CampaignCriterionSimulationServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final CampaignCriterionSimulationServiceClient create(
      CampaignCriterionSimulationServiceStub stub) {
    return new CampaignCriterionSimulationServiceClient(stub);
  }

  /**
   * Constructs an instance of CampaignCriterionSimulationServiceClient, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected CampaignCriterionSimulationServiceClient(
      CampaignCriterionSimulationServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((CampaignCriterionSimulationServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected CampaignCriterionSimulationServiceClient(CampaignCriterionSimulationServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CampaignCriterionSimulationServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public CampaignCriterionSimulationServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign criterion simulation in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignCriterionSimulationServiceClient campaignCriterionSimulationServiceClient =
   *     CampaignCriterionSimulationServiceClient.create()) {
   *   CampaignCriterionSimulationName resourceName =
   *       CampaignCriterionSimulationName.of(
   *           "[CUSTOMER_ID]",
   *           "[CAMPAIGN_ID]",
   *           "[CRITERION_ID]",
   *           "[TYPE]",
   *           "[MODIFICATION_METHOD]",
   *           "[START_DATE]",
   *           "[END_DATE]");
   *   CampaignCriterionSimulation response =
   *       campaignCriterionSimulationServiceClient.getCampaignCriterionSimulation(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the campaign criterion simulation to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignCriterionSimulation getCampaignCriterionSimulation(
      CampaignCriterionSimulationName resourceName) {
    GetCampaignCriterionSimulationRequest request =
        GetCampaignCriterionSimulationRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getCampaignCriterionSimulation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign criterion simulation in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignCriterionSimulationServiceClient campaignCriterionSimulationServiceClient =
   *     CampaignCriterionSimulationServiceClient.create()) {
   *   String resourceName =
   *       CampaignCriterionSimulationName.of(
   *               "[CUSTOMER_ID]",
   *               "[CAMPAIGN_ID]",
   *               "[CRITERION_ID]",
   *               "[TYPE]",
   *               "[MODIFICATION_METHOD]",
   *               "[START_DATE]",
   *               "[END_DATE]")
   *           .toString();
   *   CampaignCriterionSimulation response =
   *       campaignCriterionSimulationServiceClient.getCampaignCriterionSimulation(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the campaign criterion simulation to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignCriterionSimulation getCampaignCriterionSimulation(String resourceName) {
    GetCampaignCriterionSimulationRequest request =
        GetCampaignCriterionSimulationRequest.newBuilder().setResourceName(resourceName).build();
    return getCampaignCriterionSimulation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign criterion simulation in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignCriterionSimulationServiceClient campaignCriterionSimulationServiceClient =
   *     CampaignCriterionSimulationServiceClient.create()) {
   *   GetCampaignCriterionSimulationRequest request =
   *       GetCampaignCriterionSimulationRequest.newBuilder()
   *           .setResourceName(
   *               CampaignCriterionSimulationName.of(
   *                       "[CUSTOMER_ID]",
   *                       "[CAMPAIGN_ID]",
   *                       "[CRITERION_ID]",
   *                       "[TYPE]",
   *                       "[MODIFICATION_METHOD]",
   *                       "[START_DATE]",
   *                       "[END_DATE]")
   *                   .toString())
   *           .build();
   *   CampaignCriterionSimulation response =
   *       campaignCriterionSimulationServiceClient.getCampaignCriterionSimulation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CampaignCriterionSimulation getCampaignCriterionSimulation(
      GetCampaignCriterionSimulationRequest request) {
    return getCampaignCriterionSimulationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested campaign criterion simulation in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (CampaignCriterionSimulationServiceClient campaignCriterionSimulationServiceClient =
   *     CampaignCriterionSimulationServiceClient.create()) {
   *   GetCampaignCriterionSimulationRequest request =
   *       GetCampaignCriterionSimulationRequest.newBuilder()
   *           .setResourceName(
   *               CampaignCriterionSimulationName.of(
   *                       "[CUSTOMER_ID]",
   *                       "[CAMPAIGN_ID]",
   *                       "[CRITERION_ID]",
   *                       "[TYPE]",
   *                       "[MODIFICATION_METHOD]",
   *                       "[START_DATE]",
   *                       "[END_DATE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<CampaignCriterionSimulation> future =
   *       campaignCriterionSimulationServiceClient
   *           .getCampaignCriterionSimulationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   CampaignCriterionSimulation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetCampaignCriterionSimulationRequest, CampaignCriterionSimulation>
      getCampaignCriterionSimulationCallable() {
    return stub.getCampaignCriterionSimulationCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
