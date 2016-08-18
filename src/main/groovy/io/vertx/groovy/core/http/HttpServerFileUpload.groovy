/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.groovy.core.http;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
import io.vertx.groovy.core.buffer.Buffer
import io.vertx.groovy.core.streams.ReadStream
import io.vertx.core.Handler
/**
 * Represents an file upload from an HTML FORM.
*/
@CompileStatic
public class HttpServerFileUpload implements ReadStream<Buffer> {
  private final def io.vertx.core.http.HttpServerFileUpload delegate;
  public HttpServerFileUpload(Object delegate) {
    this.delegate = (io.vertx.core.http.HttpServerFileUpload) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  public HttpServerFileUpload exceptionHandler(Handler<Throwable> handler) {
    ((io.vertx.core.http.HttpServerFileUpload) delegate).exceptionHandler(handler);
    return this;
  }
  public HttpServerFileUpload handler(Handler<Buffer> handler) {
    ((io.vertx.core.http.HttpServerFileUpload) delegate).handler(handler != null ? new Handler<io.vertx.core.buffer.Buffer>(){
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.handle(InternalHelper.safeCreate(event, io.vertx.groovy.core.buffer.Buffer.class));
      }
    } : null);
    return this;
  }
  public HttpServerFileUpload endHandler(Handler<Void> endHandler) {
    ((io.vertx.core.http.HttpServerFileUpload) delegate).endHandler(endHandler);
    return this;
  }
  public HttpServerFileUpload pause() {
    ((io.vertx.core.http.HttpServerFileUpload) delegate).pause();
    return this;
  }
  public HttpServerFileUpload resume() {
    ((io.vertx.core.http.HttpServerFileUpload) delegate).resume();
    return this;
  }
  /**
   * Stream the content of this upload to the given file on storage.
   * @param filename the name of the file
   * @return 
   */
  public HttpServerFileUpload streamToFileSystem(String filename) {
    delegate.streamToFileSystem(filename);
    return this;
  }
  /**
   * @return the filename which was used when upload the file.
   */
  public String filename() {
    def ret = delegate.filename();
    return ret;
  }
  /**
   * @return the name of the attribute
   */
  public String name() {
    def ret = delegate.name();
    return ret;
  }
  /**
   * @return the content type for the upload
   */
  public String contentType() {
    def ret = delegate.contentType();
    return ret;
  }
  /**
   * @return the contentTransferEncoding for the upload
   */
  public String contentTransferEncoding() {
    def ret = delegate.contentTransferEncoding();
    return ret;
  }
  /**
   * @return the charset for the upload
   */
  public String charset() {
    def ret = delegate.charset();
    return ret;
  }
  /**
   * The size of the upload may not be available until it is all read.
   * Check {@link io.vertx.groovy.core.http.HttpServerFileUpload#isSizeAvailable} to determine this
   * @return the size of the upload (in bytes)
   */
  public long size() {
    def ret = delegate.size();
    return ret;
  }
  /**
   * @return true if the size of the upload can be retrieved via {@link io.vertx.groovy.core.http.HttpServerFileUpload#size}.
   */
  public boolean isSizeAvailable() {
    def ret = delegate.isSizeAvailable();
    return ret;
  }
}
