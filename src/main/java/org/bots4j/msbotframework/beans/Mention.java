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

public class Mention {

    @Key
    private Mentioned mentioned;
    @Key
    private String text;

    /**
     * 
     * @return
     *     The mentioned
     */
    public Mentioned getMentioned() {
        return mentioned;
    }

    /**
     * 
     * @param mentioned
     *     The mentioned
     */
    public void setMentioned(Mentioned mentioned) {
        this.mentioned = mentioned;
    }

    public Mention withMentioned(Mentioned mentioned) {
        this.mentioned = mentioned;
        return this;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    public Mention withText(String text) {
        this.text = text;
        return this;
    }

}
