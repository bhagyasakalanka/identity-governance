/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.password.expiry.exceptions;

/**
 * Password expired user identification related server exceptions.
 */
public class ExpiredPasswordIdentificationServerException extends ExpiredPasswordIdentificationException {

    /**
     * Constructor with error code and message.
     *
     * @param errorCode Error Code.
     * @param message   Message.
     */
    public ExpiredPasswordIdentificationServerException(String errorCode, String message) {

        super(errorCode, message);
    }

    /**
     * Constructor with error code, message and cause.
     *
     * @param errorCode Error Code.
     * @param message   Error message.
     * @param cause     If any error occurred when accessing the tenant.
     */
    public ExpiredPasswordIdentificationServerException(String errorCode, String message, Throwable cause) {

        super(errorCode, message, cause);
    }

    /**
     * Constructor with cause.
     *
     * @param cause If any error occurred when accessing the tenant.
     */
    public ExpiredPasswordIdentificationServerException(Throwable cause) {

        super(cause);
    }
}
