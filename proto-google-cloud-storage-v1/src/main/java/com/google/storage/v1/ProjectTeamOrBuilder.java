/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v1/storage_resources.proto

package com.google.storage.v1;

public interface ProjectTeamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.storage.v1.ProjectTeam)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project number.
   * </pre>
   *
   * <code>string project_number = 1;</code>
   *
   * @return The projectNumber.
   */
  java.lang.String getProjectNumber();
  /**
   *
   *
   * <pre>
   * The project number.
   * </pre>
   *
   * <code>string project_number = 1;</code>
   *
   * @return The bytes for projectNumber.
   */
  com.google.protobuf.ByteString getProjectNumberBytes();

  /**
   *
   *
   * <pre>
   * The team.
   * </pre>
   *
   * <code>string team = 2;</code>
   *
   * @return The team.
   */
  java.lang.String getTeam();
  /**
   *
   *
   * <pre>
   * The team.
   * </pre>
   *
   * <code>string team = 2;</code>
   *
   * @return The bytes for team.
   */
  com.google.protobuf.ByteString getTeamBytes();
}
