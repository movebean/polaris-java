/*
 * Tencent is pleased to support the open source community by making Polaris available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.tencent.polaris.circuitbreak.api.pojo;

import com.tencent.polaris.api.pojo.ServiceKey;

public class FunctionalDecoratorRequest {

    private ServiceKey sourceService;

    private ServiceKey service;

    private String method;

    private ResultToErrorCode resultToErrorCode;

    public ServiceKey getService() {
        return service;
    }

    public void setService(ServiceKey service) {
        this.service = service;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ResultToErrorCode getResultToErrorCode() {
        return resultToErrorCode;
    }

    public void setResultToErrorCode(ResultToErrorCode resultToErrorCode) {
        this.resultToErrorCode = resultToErrorCode;
    }

    public ServiceKey getSourceService() {
        return sourceService;
    }

    public void setSourceService(ServiceKey sourceService) {
        this.sourceService = sourceService;
    }

    @Override
    public String toString() {
        return "FunctionalDecoratorRequest{" +
                "sourceService=" + sourceService +
                ", service=" + service +
                ", method='" + method + '\'' +
                ", resultToErrorCode=" + resultToErrorCode +
                '}';
    }

}
