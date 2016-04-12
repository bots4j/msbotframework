
package org.bots4j.msbotframework.beans;

/*
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

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ChannelAccount {

    @Key
    private String name;
    @Key
    private String channelId;
    @Key
    private String address;
    @Key
    private String id;
    @Key
    private Boolean isBot;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public ChannelAccount withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The channelId
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 
     * @param channelId
     *     The channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public ChannelAccount withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public ChannelAccount withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public ChannelAccount withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The isBot
     */
    public Boolean getIsBot() {
        return isBot;
    }

    /**
     * 
     * @param isBot
     *     The isBot
     */
    public void setIsBot(Boolean isBot) {
        this.isBot = isBot;
    }

    public ChannelAccount withIsBot(Boolean isBot) {
        this.isBot = isBot;
        return this;
    }

}
