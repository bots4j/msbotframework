
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

import java.util.Map;

public class Attachment {

    @Key
    private String contentType;
    @Key
    private String contentUrl;
    @Key
    private Map<String,Object> content;
    @Key
    private String fallbackText;
    @Key
    private String title;
    @Key
    private String titleLink;
    @Key
    private String text;
    @Key
    private String thumbnailUrl;

    /**
     * 
     * @return
     *     The contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * 
     * @param contentType
     *     The contentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Attachment withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 
     * @return
     *     The contentUrl
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * 
     * @param contentUrl
     *     The contentUrl
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Attachment withContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    /**
     * 
     * @return
     *     The content
     */
    public Map<String,Object> getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(Map<String,Object> content) {
        this.content = content;
    }

    public Attachment withContent(Map<String,Object> content) {
        this.content = content;
        return this;
    }

    /**
     * 
     * @return
     *     The fallbackText
     */
    public String getFallbackText() {
        return fallbackText;
    }

    /**
     * 
     * @param fallbackText
     *     The fallbackText
     */
    public void setFallbackText(String fallbackText) {
        this.fallbackText = fallbackText;
    }

    public Attachment withFallbackText(String fallbackText) {
        this.fallbackText = fallbackText;
        return this;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Attachment withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 
     * @return
     *     The titleLink
     */
    public String getTitleLink() {
        return titleLink;
    }

    /**
     * 
     * @param titleLink
     *     The titleLink
     */
    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    public Attachment withTitleLink(String titleLink) {
        this.titleLink = titleLink;
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

    public Attachment withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 
     * @return
     *     The thumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * 
     * @param thumbnailUrl
     *     The thumbnailUrl
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Attachment withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

}
