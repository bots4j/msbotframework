package org.bots4j.msbotframework;/*
 * Copyright (C) 2016 Adam J Chesney
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.google.api.client.util.Key;

/**
 * Created by ajchesney on 13/04/2016.
 */
public class CustomDataObject {

    @Key
    private String name;

    @Key
    private Integer count;

    public String getName() {
        return name;
    }

    public CustomDataObject setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public CustomDataObject setCount(Integer count) {
        this.count = count;
        return this;
    }
}
