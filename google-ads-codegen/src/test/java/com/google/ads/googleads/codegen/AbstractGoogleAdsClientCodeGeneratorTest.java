// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.codegen;

import com.google.common.collect.ImmutableSet;
import com.squareup.javapoet.JavaFile;
import java.io.IOException;
import java.util.Set;
import org.junit.Test;

/** Test cases for {@link AbstractGoogleAdsClientCodeGenerator}. */
public class AbstractGoogleAdsClientCodeGeneratorTest extends AbstractGeneratorTest {

  private Set<Integer> versions = ImmutableSet.of(1, 2, 3);
  private int latestVersion = 3;
  private String catalogName = "";

  /** Ensures that the generated code for a base case works as expected. */
  @Test
  public void baseCaseCodeMatches() throws IOException {
    assertGeneratedCodeMatches(
        "/com/google/ads/googleads/codegen/AbstractGoogleAdsClient.java.expected");
  }

  @Override
  protected JavaFile invokeCodeGenClass() {
    return new AbstractGoogleAdsClientCodeGenerator(versions, latestVersion, temporaryFolder.getRoot())
        .generate();
  }
}
