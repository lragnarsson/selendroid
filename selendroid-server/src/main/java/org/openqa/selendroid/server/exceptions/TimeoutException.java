/*
 * Copyright 2012 selendroid committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.openqa.selendroid.server.exceptions;

public class TimeoutException extends RuntimeException {
  private static final long serialVersionUID = 3664415994190267167L;

  public TimeoutException(String message) {
    super(message);
  }

  public TimeoutException(Throwable t) {
    super(t);
  }

  public TimeoutException(String message, Throwable t) {
    super(message, t);
  }
}
