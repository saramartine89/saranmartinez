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

import com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermView;
import com.google.ads.googleads.v9.resources.DynamicSearchAdsSearchTermViewName;
import com.google.ads.googleads.v9.services.stub.DynamicSearchAdsSearchTermViewServiceStub;
import com.google.ads.googleads.v9.services.stub.DynamicSearchAdsSearchTermViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch dynamic search ads views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (DynamicSearchAdsSearchTermViewServiceClient dynamicSearchAdsSearchTermViewServiceClient =
 *     DynamicSearchAdsSearchTermViewServiceClient.create()) {
 *   DynamicSearchAdsSearchTermViewName resourceName =
 *       DynamicSearchAdsSearchTermViewName.of(
 *           "[CUSTOMER_ID]",
 *           "[AD_GROUP_ID]",
 *           "[SEARCH_TERM_FINGERPRINT]",
 *           "[HEADLINE_FINGERPRINT]",
 *           "[LANDING_PAGE_FINGERPRINT]",
 *           "[PAGE_URL_FINGERPRINT]");
 *   DynamicSearchAdsSearchTermView response =
 *       dynamicSearchAdsSearchTermViewServiceClient.getDynamicSearchAdsSearchTermView(
 *           resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the DynamicSearchAdsSearchTermViewServiceClient object to
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
 * DynamicSearchAdsSearchTermViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * DynamicSearchAdsSearchTermViewServiceSettings dynamicSearchAdsSearchTermViewServiceSettings =
 *     DynamicSearchAdsSearchTermViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DynamicSearchAdsSearchTermViewServiceClient dynamicSearchAdsSearchTermViewServiceClient =
 *     DynamicSearchAdsSearchTermViewServiceClient.create(
 *         dynamicSearchAdsSearchTermViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * DynamicSearchAdsSearchTermViewServiceSettings dynamicSearchAdsSearchTermViewServiceSettings =
 *     DynamicSearchAdsSearchTermViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DynamicSearchAdsSearchTermViewServiceClient dynamicSearchAdsSearchTermViewServiceClient =
 *     DynamicSearchAdsSearchTermViewServiceClient.create(
 *         dynamicSearchAdsSearchTermViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class DynamicSearchAdsSearchTermViewServiceClient implements BackgroundResource {
  private final DynamicSearchAdsSearchTermViewServiceSettings settings;
  private final DynamicSearchAdsSearchTermViewServiceStub stub;

  /**
   * Constructs an instance of DynamicSearchAdsSearchTermViewServiceClient with default settings.
   */
  public static final DynamicSearchAdsSearchTermViewServiceClient create() throws IOException {
    return create(DynamicSearchAdsSearchTermViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DynamicSearchAdsSearchTermViewServiceClient, using the given
   * settings. The channels are created based on the settings passed in, or defaults for any
   * settings that are not set.
   */
  public static final DynamicSearchAdsSearchTermViewServiceClient create(
      DynamicSearchAdsSearchTermViewServiceSettings settings) throws IOException {
    return new DynamicSearchAdsSearchTermViewServiceClient(settings);
  }

  /**
   * Constructs an instance of DynamicSearchAdsSearchTermViewServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(DynamicSearchAdsSearchTermViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final DynamicSearchAdsSearchTermViewServiceClient create(
      DynamicSearchAdsSearchTermViewServiceStub stub) {
    return new DynamicSearchAdsSearchTermViewServiceClient(stub);
  }

  /**
   * Constructs an instance of DynamicSearchAdsSearchTermViewServiceClient, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected DynamicSearchAdsSearchTermViewServiceClient(
      DynamicSearchAdsSearchTermViewServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub =
        ((DynamicSearchAdsSearchTermViewServiceStubSettings) settings.getStubSettings())
            .createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected DynamicSearchAdsSearchTermViewServiceClient(
      DynamicSearchAdsSearchTermViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DynamicSearchAdsSearchTermViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public DynamicSearchAdsSearchTermViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested dynamic search ads search term view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DynamicSearchAdsSearchTermViewServiceClient dynamicSearchAdsSearchTermViewServiceClient =
   *     DynamicSearchAdsSearchTermViewServiceClient.create()) {
   *   DynamicSearchAdsSearchTermViewName resourceName =
   *       DynamicSearchAdsSearchTermViewName.of(
   *           "[CUSTOMER_ID]",
   *           "[AD_GROUP_ID]",
   *           "[SEARCH_TERM_FINGERPRINT]",
   *           "[HEADLINE_FINGERPRINT]",
   *           "[LANDING_PAGE_FINGERPRINT]",
   *           "[PAGE_URL_FINGERPRINT]");
   *   DynamicSearchAdsSearchTermView response =
   *       dynamicSearchAdsSearchTermViewServiceClient.getDynamicSearchAdsSearchTermView(
   *           resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the dynamic search ads search term view to
   *     fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DynamicSearchAdsSearchTermView getDynamicSearchAdsSearchTermView(
      DynamicSearchAdsSearchTermViewName resourceName) {
    GetDynamicSearchAdsSearchTermViewRequest request =
        GetDynamicSearchAdsSearchTermViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getDynamicSearchAdsSearchTermView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested dynamic search ads search term view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DynamicSearchAdsSearchTermViewServiceClient dynamicSearchAdsSearchTermViewServiceClient =
   *     DynamicSearchAdsSearchTermViewServiceClient.create()) {
   *   String resourceName =
   *       DynamicSearchAdsSearchTermViewName.of(
   *               "[CUSTOMER_ID]",
   *               "[AD_GROUP_ID]",
   *               "[SEARCH_TERM_FINGERPRINT]",
   *               "[HEADLINE_FINGERPRINT]",
   *               "[LANDING_PAGE_FINGERPRINT]",
   *               "[PAGE_URL_FINGERPRINT]")
   *           .toString();
   *   DynamicSearchAdsSearchTermView response =
   *       dynamicSearchAdsSearchTermViewServiceClient.getDynamicSearchAdsSearchTermView(
   *           resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the dynamic search ads search term view to
   *     fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DynamicSearchAdsSearchTermView getDynamicSearchAdsSearchTermView(
      String resourceName) {
    GetDynamicSearchAdsSearchTermViewRequest request =
        GetDynamicSearchAdsSearchTermViewRequest.newBuilder().setResourceName(resourceName).build();
    return getDynamicSearchAdsSearchTermView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested dynamic search ads search term view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DynamicSearchAdsSearchTermViewServiceClient dynamicSearchAdsSearchTermViewServiceClient =
   *     DynamicSearchAdsSearchTermViewServiceClient.create()) {
   *   GetDynamicSearchAdsSearchTermViewRequest request =
   *       GetDynamicSearchAdsSearchTermViewRequest.newBuilder()
   *           .setResourceName(
   *               DynamicSearchAdsSearchTermViewName.of(
   *                       "[CUSTOMER_ID]",
   *                       "[AD_GROUP_ID]",
   *                       "[SEARCH_TERM_FINGERPRINT]",
   *                       "[HEADLINE_FINGERPRINT]",
   *                       "[LANDING_PAGE_FINGERPRINT]",
   *                       "[PAGE_URL_FINGERPRINT]")
   *                   .toString())
   *           .build();
   *   DynamicSearchAdsSearchTermView response =
   *       dynamicSearchAdsSearchTermViewServiceClient.getDynamicSearchAdsSearchTermView(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DynamicSearchAdsSearchTermView getDynamicSearchAdsSearchTermView(
      GetDynamicSearchAdsSearchTermViewRequest request) {
    return getDynamicSearchAdsSearchTermViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested dynamic search ads search term view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (DynamicSearchAdsSearchTermViewServiceClient dynamicSearchAdsSearchTermViewServiceClient =
   *     DynamicSearchAdsSearchTermViewServiceClient.create()) {
   *   GetDynamicSearchAdsSearchTermViewRequest request =
   *       GetDynamicSearchAdsSearchTermViewRequest.newBuilder()
   *           .setResourceName(
   *               DynamicSearchAdsSearchTermViewName.of(
   *                       "[CUSTOMER_ID]",
   *                       "[AD_GROUP_ID]",
   *                       "[SEARCH_TERM_FINGERPRINT]",
   *                       "[HEADLINE_FINGERPRINT]",
   *                       "[LANDING_PAGE_FINGERPRINT]",
   *                       "[PAGE_URL_FINGERPRINT]")
   *                   .toString())
   *           .build();
   *   ApiFuture<DynamicSearchAdsSearchTermView> future =
   *       dynamicSearchAdsSearchTermViewServiceClient
   *           .getDynamicSearchAdsSearchTermViewCallable()
   *           .futureCall(request);
   *   // Do something.
   *   DynamicSearchAdsSearchTermView response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          GetDynamicSearchAdsSearchTermViewRequest, DynamicSearchAdsSearchTermView>
      getDynamicSearchAdsSearchTermViewCallable() {
    return stub.getDynamicSearchAdsSearchTermViewCallable();
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
