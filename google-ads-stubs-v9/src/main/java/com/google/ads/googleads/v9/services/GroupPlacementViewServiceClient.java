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

import com.google.ads.googleads.v9.resources.GroupPlacementView;
import com.google.ads.googleads.v9.resources.GroupPlacementViewName;
import com.google.ads.googleads.v9.services.stub.GroupPlacementViewServiceStub;
import com.google.ads.googleads.v9.services.stub.GroupPlacementViewServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch Group Placement views.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (GroupPlacementViewServiceClient groupPlacementViewServiceClient =
 *     GroupPlacementViewServiceClient.create()) {
 *   GroupPlacementViewName resourceName =
 *       GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]");
 *   GroupPlacementView response =
 *       groupPlacementViewServiceClient.getGroupPlacementView(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the GroupPlacementViewServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
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
 * GroupPlacementViewServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * GroupPlacementViewServiceSettings groupPlacementViewServiceSettings =
 *     GroupPlacementViewServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * GroupPlacementViewServiceClient groupPlacementViewServiceClient =
 *     GroupPlacementViewServiceClient.create(groupPlacementViewServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * GroupPlacementViewServiceSettings groupPlacementViewServiceSettings =
 *     GroupPlacementViewServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * GroupPlacementViewServiceClient groupPlacementViewServiceClient =
 *     GroupPlacementViewServiceClient.create(groupPlacementViewServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class GroupPlacementViewServiceClient implements BackgroundResource {
  private final GroupPlacementViewServiceSettings settings;
  private final GroupPlacementViewServiceStub stub;

  /** Constructs an instance of GroupPlacementViewServiceClient with default settings. */
  public static final GroupPlacementViewServiceClient create() throws IOException {
    return create(GroupPlacementViewServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of GroupPlacementViewServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final GroupPlacementViewServiceClient create(
      GroupPlacementViewServiceSettings settings) throws IOException {
    return new GroupPlacementViewServiceClient(settings);
  }

  /**
   * Constructs an instance of GroupPlacementViewServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(GroupPlacementViewServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final GroupPlacementViewServiceClient create(GroupPlacementViewServiceStub stub) {
    return new GroupPlacementViewServiceClient(stub);
  }

  /**
   * Constructs an instance of GroupPlacementViewServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GroupPlacementViewServiceClient(GroupPlacementViewServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((GroupPlacementViewServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected GroupPlacementViewServiceClient(GroupPlacementViewServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final GroupPlacementViewServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public GroupPlacementViewServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Group Placement view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GroupPlacementViewServiceClient groupPlacementViewServiceClient =
   *     GroupPlacementViewServiceClient.create()) {
   *   GroupPlacementViewName resourceName =
   *       GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]");
   *   GroupPlacementView response =
   *       groupPlacementViewServiceClient.getGroupPlacementView(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the Group Placement view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupPlacementView getGroupPlacementView(GroupPlacementViewName resourceName) {
    GetGroupPlacementViewRequest request =
        GetGroupPlacementViewRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getGroupPlacementView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Group Placement view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GroupPlacementViewServiceClient groupPlacementViewServiceClient =
   *     GroupPlacementViewServiceClient.create()) {
   *   String resourceName =
   *       GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]")
   *           .toString();
   *   GroupPlacementView response =
   *       groupPlacementViewServiceClient.getGroupPlacementView(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. The resource name of the Group Placement view to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupPlacementView getGroupPlacementView(String resourceName) {
    GetGroupPlacementViewRequest request =
        GetGroupPlacementViewRequest.newBuilder().setResourceName(resourceName).build();
    return getGroupPlacementView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Group Placement view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GroupPlacementViewServiceClient groupPlacementViewServiceClient =
   *     GroupPlacementViewServiceClient.create()) {
   *   GetGroupPlacementViewRequest request =
   *       GetGroupPlacementViewRequest.newBuilder()
   *           .setResourceName(
   *               GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]")
   *                   .toString())
   *           .build();
   *   GroupPlacementView response = groupPlacementViewServiceClient.getGroupPlacementView(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GroupPlacementView getGroupPlacementView(GetGroupPlacementViewRequest request) {
    return getGroupPlacementViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested Group Placement view in full detail.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (GroupPlacementViewServiceClient groupPlacementViewServiceClient =
   *     GroupPlacementViewServiceClient.create()) {
   *   GetGroupPlacementViewRequest request =
   *       GetGroupPlacementViewRequest.newBuilder()
   *           .setResourceName(
   *               GroupPlacementViewName.of("[CUSTOMER_ID]", "[AD_GROUP_ID]", "[BASE64_PLACEMENT]")
   *                   .toString())
   *           .build();
   *   ApiFuture<GroupPlacementView> future =
   *       groupPlacementViewServiceClient.getGroupPlacementViewCallable().futureCall(request);
   *   // Do something.
   *   GroupPlacementView response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetGroupPlacementViewRequest, GroupPlacementView>
      getGroupPlacementViewCallable() {
    return stub.getGroupPlacementViewCallable();
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
