/*
 * Copyright 2013 Unicorn Team.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.metaframe.unicorn.pojo;

import java.util.List;

/**
 * @author Jerry Lee(oldratlee<at>gmail<dot>com)
 */
public class ReferenceConfig {

    // Config properties

    private String group;
    private String interfaceName;
    private String version;

    // 方法配置
    private List<MethodConfig> methods;

    // 缺省配置
    private ConsumerConfig consumer;

    // 注册中心
    protected List<RegistryConfig> registries;


}