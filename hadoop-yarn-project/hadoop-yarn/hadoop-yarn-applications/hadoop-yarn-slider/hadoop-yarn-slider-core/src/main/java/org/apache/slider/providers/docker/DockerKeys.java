/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.slider.providers.docker;

public interface DockerKeys {
  String PROVIDER_DOCKER = "docker";
  String DOCKER_PREFIX = "docker.";
  String DOCKER_IMAGE = DOCKER_PREFIX + "image";
  String DOCKER_NETWORK = DOCKER_PREFIX + "network";
  String DOCKER_USE_PRIVILEGED = DOCKER_PREFIX + "usePrivileged";
  String DOCKER_START_COMMAND = DOCKER_PREFIX + "startCommand";

  String DEFAULT_DOCKER_NETWORK = "bridge";
  Boolean DEFAULT_DOCKER_USE_PRIVILEGED = false;

  String OUT_FILE = "stdout.txt";
  String ERR_FILE = "stderr.txt";
}
