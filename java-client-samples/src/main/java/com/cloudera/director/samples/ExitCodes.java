/*
 * Copyright (c) 2017 Cloudera, Inc. All rights reserved.
 */

package com.cloudera.director.samples;

public interface ExitCodes {
  int OK = 0;

  /**
   * Error parsing input parameters.
   */
  int PARAMETER_EXCEPTION = -1;

  /**
   * Couldn't find the specified instance.
   */
  int INSTANCE_NOT_FOUND = -2;

  /**
   * Exception when submitting api request.
   */
  int API_EXCEPTION = -3;

  /**
   * Couldn't find the specified instance group.
   */
  int INSTANCE_GROUP_NOT_FOUND = -4;

  /**
   * Couldn't find specified instance within the cluster.
   */
  int MISSING_CLUSTER_INSTANCES = -5;

  /**
   * Problem reading cluster configuration file.
   */
  int CONFIG_FILE_ERROR = -6;

  /**
   * The entity went into an unexpected stage.
   */
  int UNEXPECTED_STAGE = -7;
}
