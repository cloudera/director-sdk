// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Note: This file is auto generated. Do not edit manually.

package com.cloudera.director.client.common;

/**
 * Provides methods to check preconditions.
 */
public final class Preconditions {

  /**
   * Private constructor to prevent instantiation.
   */
  private Preconditions() {
  }

  /**
   * Ensures that an object reference passed as a parameter to the calling
   * method is not null.
   *
   * @param instance an object
   * @param message the exception message to use if the check fails; will
   *     be converted to a string using {@link String#valueOf(Object)}
   * @return the non-null reference that was validated
   * @throws NullPointerException if {@code reference} is null
   */
  public static <T> T checkNotNull(T instance, String message) {
    if (instance == null) {
      throw new NullPointerException(message);
    }
    return instance;
  }

  /**
   * Ensures the truth of an expression involving one or more parameters to the
   * calling method.
   *
   * @param expression a boolean expression
   * @param message the exception message to use if the check fails; will
   *     be converted to a string using {@link String#valueOf(Object)}
   * @throws IllegalArgumentException if {@code expression} is false
   */
  public static void checkArgument(
      boolean expression, Object message) {
    if (!expression) {
      throw new IllegalArgumentException(String.valueOf(message));
    }
  }
}



