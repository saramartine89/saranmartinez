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

import com.google.ads.googleads.v9.resources.LanguageConstant;
import com.google.ads.googleads.v9.resources.LanguageConstantName;
import com.google.ads.googleads.v9.services.stub.LanguageConstantServiceStub;
import com.google.ads.googleads.v9.services.stub.LanguageConstantServiceStubSettings;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to fetch language constants.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * try (LanguageConstantServiceClient languageConstantServiceClient =
 *     LanguageConstantServiceClient.create()) {
 *   LanguageConstantName resourceName = LanguageConstantName.of("[CRITERION_ID]");
 *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(resourceName);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the LanguageConstantServiceClient object to clean up
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
 * LanguageConstantServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * LanguageConstantServiceSettings languageConstantServiceSettings =
 *     LanguageConstantServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * LanguageConstantServiceClient languageConstantServiceClient =
 *     LanguageConstantServiceClient.create(languageConstantServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * LanguageConstantServiceSettings languageConstantServiceSettings =
 *     LanguageConstantServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * LanguageConstantServiceClient languageConstantServiceClient =
 *     LanguageConstantServiceClient.create(languageConstantServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class LanguageConstantServiceClient implements BackgroundResource {
  private final LanguageConstantServiceSettings settings;
  private final LanguageConstantServiceStub stub;

  /** Constructs an instance of LanguageConstantServiceClient with default settings. */
  public static final LanguageConstantServiceClient create() throws IOException {
    return create(LanguageConstantServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of LanguageConstantServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final LanguageConstantServiceClient create(LanguageConstantServiceSettings settings)
      throws IOException {
    return new LanguageConstantServiceClient(settings);
  }

  /**
   * Constructs an instance of LanguageConstantServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(LanguageConstantServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final LanguageConstantServiceClient create(LanguageConstantServiceStub stub) {
    return new LanguageConstantServiceClient(stub);
  }

  /**
   * Constructs an instance of LanguageConstantServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected LanguageConstantServiceClient(LanguageConstantServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((LanguageConstantServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected LanguageConstantServiceClient(LanguageConstantServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final LanguageConstantServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public LanguageConstantServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested language constant.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (LanguageConstantServiceClient languageConstantServiceClient =
   *     LanguageConstantServiceClient.create()) {
   *   LanguageConstantName resourceName = LanguageConstantName.of("[CRITERION_ID]");
   *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. Resource name of the language constant to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LanguageConstant getLanguageConstant(LanguageConstantName resourceName) {
    GetLanguageConstantRequest request =
        GetLanguageConstantRequest.newBuilder()
            .setResourceName(resourceName == null ? null : resourceName.toString())
            .build();
    return getLanguageConstant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested language constant.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (LanguageConstantServiceClient languageConstantServiceClient =
   *     LanguageConstantServiceClient.create()) {
   *   String resourceName = LanguageConstantName.of("[CRITERION_ID]").toString();
   *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(resourceName);
   * }
   * }</pre>
   *
   * @param resourceName Required. Resource name of the language constant to fetch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LanguageConstant getLanguageConstant(String resourceName) {
    GetLanguageConstantRequest request =
        GetLanguageConstantRequest.newBuilder().setResourceName(resourceName).build();
    return getLanguageConstant(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested language constant.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (LanguageConstantServiceClient languageConstantServiceClient =
   *     LanguageConstantServiceClient.create()) {
   *   GetLanguageConstantRequest request =
   *       GetLanguageConstantRequest.newBuilder()
   *           .setResourceName(LanguageConstantName.of("[CRITERION_ID]").toString())
   *           .build();
   *   LanguageConstant response = languageConstantServiceClient.getLanguageConstant(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LanguageConstant getLanguageConstant(GetLanguageConstantRequest request) {
    return getLanguageConstantCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the requested language constant.
   *
   * <p>List of thrown errors: [AuthenticationError]() [AuthorizationError]() [HeaderError]()
   * [InternalError]() [QuotaError]() [RequestError]()
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * try (LanguageConstantServiceClient languageConstantServiceClient =
   *     LanguageConstantServiceClient.create()) {
   *   GetLanguageConstantRequest request =
   *       GetLanguageConstantRequest.newBuilder()
   *           .setResourceName(LanguageConstantName.of("[CRITERION_ID]").toString())
   *           .build();
   *   ApiFuture<LanguageConstant> future =
   *       languageConstantServiceClient.getLanguageConstantCallable().futureCall(request);
   *   // Do something.
   *   LanguageConstant response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLanguageConstantRequest, LanguageConstant>
      getLanguageConstantCallable() {
    return stub.getLanguageConstantCallable();
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
