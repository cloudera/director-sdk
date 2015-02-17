/*
 * Copyright (c) 2015 Cloudera, Inc. All rights reserved.
 */

package com.cloudera.director.samples;

public interface Command {

  /**
   * Implement this command for your logic
   *
   * @param commonParameters common parameters
   */
  void run(CommonParameters commonParameters) throws Exception;

}
