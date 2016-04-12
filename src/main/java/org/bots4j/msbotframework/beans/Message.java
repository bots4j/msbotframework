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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Message {

    @Key
    private String type;
    @Key
    private String id;
    @Key
    private String conversationId;
    @Key
    private String created;
    @Key
    private String sourceText;
    @Key
    private String sourceLanguage;
    @Key
    private String language;
    @Key
    private String text;
    @Key
    private List<Attachment> attachments = new ArrayList<Attachment>();
    @Key
    private ChannelAccount from;
    @Key
    private ChannelAccount to;
    @Key
    private String replyToMessageId;
    @Key
    private List<Participant> participants = new ArrayList<Participant>();
    @Key
    private Integer totalParticipants;
    @Key
    private List<Mention> mentions = new ArrayList<Mention>();
    @Key
    private String place;
    @Key
    private String channelMessageId;
    @Key
    private String channelConversationId;
    @Key
    private Map<String,Object> channelData;
    @Key
    private Map<String,Object> botUserData;
    @Key
    private Map<String,Object> botConversationData;
    @Key
    private Map<String,Object> botPerUserInConversationData;
    @Key
    private Location location;
    @Key
    private List<String> hashtags = new ArrayList<String>();
    @Key
    private String eTag;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public Message withType(String type) {
        this.type = type;
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

    public Message withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The conversationId
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * 
     * @param conversationId
     *     The conversationId
     */
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Message withConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * 
     * @return
     *     The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    public Message withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceText
     */
    public String getSourceText() {
        return sourceText;
    }

    /**
     * 
     * @param sourceText
     *     The sourceText
     */
    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public Message withSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceLanguage
     */
    public String getSourceLanguage() {
        return sourceLanguage;
    }

    /**
     * 
     * @param sourceLanguage
     *     The sourceLanguage
     */
    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public Message withSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }

    /**
     * 
     * @return
     *     The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 
     * @param language
     *     The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    public Message withLanguage(String language) {
        this.language = language;
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

    public Message withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 
     * @return
     *     The attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * 
     * @param attachments
     *     The attachments
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Message withAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * 
     * @return
     *     The from
     */
    public ChannelAccount getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    public void setFrom(ChannelAccount from) {
        this.from = from;
    }

    public Message withFrom(ChannelAccount from) {
        this.from = from;
        return this;
    }

    /**
     * 
     * @return
     *     The to
     */
    public ChannelAccount getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    public void setTo(ChannelAccount to) {
        this.to = to;
    }

    public Message withTo(ChannelAccount to) {
        this.to = to;
        return this;
    }

    /**
     * 
     * @return
     *     The replyToMessageId
     */
    public String getReplyToMessageId() {
        return replyToMessageId;
    }

    /**
     * 
     * @param replyToMessageId
     *     The replyToMessageId
     */
    public void setReplyToMessageId(String replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    public Message withReplyToMessageId(String replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
        return this;
    }

    /**
     * 
     * @return
     *     The participants
     */
    public List<Participant> getParticipants() {
        return participants;
    }

    /**
     * 
     * @param participants
     *     The participants
     */
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Message withParticipants(List<Participant> participants) {
        this.participants = participants;
        return this;
    }

    /**
     * 
     * @return
     *     The totalParticipants
     */
    public Integer getTotalParticipants() {
        return totalParticipants;
    }

    /**
     * 
     * @param totalParticipants
     *     The totalParticipants
     */
    public void setTotalParticipants(Integer totalParticipants) {
        this.totalParticipants = totalParticipants;
    }

    public Message withTotalParticipants(Integer totalParticipants) {
        this.totalParticipants = totalParticipants;
        return this;
    }

    /**
     * 
     * @return
     *     The mentions
     */
    public List<Mention> getMentions() {
        return mentions;
    }

    /**
     * 
     * @param mentions
     *     The mentions
     */
    public void setMentions(List<Mention> mentions) {
        this.mentions = mentions;
    }

    public Message withMentions(List<Mention> mentions) {
        this.mentions = mentions;
        return this;
    }

    /**
     * 
     * @return
     *     The place
     */
    public String getPlace() {
        return place;
    }

    /**
     * 
     * @param place
     *     The place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    public Message withPlace(String place) {
        this.place = place;
        return this;
    }

    /**
     * 
     * @return
     *     The channelMessageId
     */
    public String getChannelMessageId() {
        return channelMessageId;
    }

    /**
     * 
     * @param channelMessageId
     *     The channelMessageId
     */
    public void setChannelMessageId(String channelMessageId) {
        this.channelMessageId = channelMessageId;
    }

    public Message withChannelMessageId(String channelMessageId) {
        this.channelMessageId = channelMessageId;
        return this;
    }

    /**
     * 
     * @return
     *     The channelConversationId
     */
    public String getChannelConversationId() {
        return channelConversationId;
    }

    /**
     * 
     * @param channelConversationId
     *     The channelConversationId
     */
    public void setChannelConversationId(String channelConversationId) {
        this.channelConversationId = channelConversationId;
    }

    public Message withChannelConversationId(String channelConversationId) {
        this.channelConversationId = channelConversationId;
        return this;
    }

    /**
     * 
     * @return
     *     The channelData
     */
    public Map<String,Object> getChannelData() {
        return channelData;
    }

    /**
     * 
     * @param channelData
     *     The channelData
     */
    public void setChannelData(Map<String,Object> channelData) {
        this.channelData = channelData;
    }

    public Message withChannelData(Map<String,Object> channelData) {
        this.channelData = channelData;
        return this;
    }

    /**
     * 
     * @return
     *     The botUserData
     */
    public Map<String,Object> getBotUserData() {
        return botUserData;
    }

    /**
     * 
     * @param botUserData
     *     The botUserData
     */
    public void setBotUserData(Map<String,Object> botUserData) {
        this.botUserData = botUserData;
    }

    public Message withBotUserData(Map<String,Object> botUserData) {
        this.botUserData = botUserData;
        return this;
    }

    public Message putInBotUserData(String key, Object value){
        ensureBotUserData().put(key,value);
        return this;
    }

    public Map<String,Object> ensureBotUserData() {
        if (botUserData==null){
            botUserData = new LinkedHashMap<>();
        }
        return botUserData;
    }

    /**
     * 
     * @return
     *     The botConversationData
     */
    public Map<String,Object> getBotConversationData() {
        return botConversationData;
    }

    /**
     * 
     * @param botConversationData
     *     The botConversationData
     */
    public void setBotConversationData(Map<String,Object> botConversationData) {
        this.botConversationData = botConversationData;
    }

    public Message withBotConversationData(Map<String,Object> botConversationData) {
        this.botConversationData = botConversationData;
        return this;
    }

    public Message putInBotConversationData(String key, Object value){
        ensureBotConversationData().put(key,value);
        return this;
    }

    public Map<String,Object> ensureBotConversationData() {
        if (botConversationData==null){
            botConversationData = new LinkedHashMap<>();
        }
        return botConversationData;
    }

    /**
     * 
     * @return
     *     The botPerUserInConversationData
     */
    public Map<String,Object> getBotPerUserInConversationData() {
        return botPerUserInConversationData;
    }

    /**
     * 
     * @param botPerUserInConversationData
     *     The botPerUserInConversationData
     */
    public void setBotPerUserInConversationData(Map<String,Object> botPerUserInConversationData) {
        this.botPerUserInConversationData = botPerUserInConversationData;
    }

    public Message withBotPerUserInConversationData(Map<String,Object> botPerUserInConversationData) {
        this.botPerUserInConversationData = botPerUserInConversationData;
        return this;
    }

    public Message putInBotPerUserInConversationData(String key, Object value){
        ensureBotPerUserInConversationData().put(key,value);
        return this;
    }

    public Map<String,Object> ensureBotPerUserInConversationData() {
        if (botPerUserInConversationData==null){
            botPerUserInConversationData = new LinkedHashMap<>();
        }
        return botPerUserInConversationData;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    public Message withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * 
     * @return
     *     The hashtags
     */
    public List<String> getHashtags() {
        return hashtags;
    }

    /**
     * 
     * @param hashtags
     *     The hashtags
     */
    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public Message withHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    /**
     * 
     * @return
     *     The eTag
     */
    public String getETag() {
        return eTag;
    }

    /**
     * 
     * @param eTag
     *     The eTag
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    public Message withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    public Message createReplyMessage(String text, String language){
        return new Message()
                .withTo(getFrom())
                .withFrom(getTo())
                .withConversationId(getConversationId())
                .withLanguage(language)
                .withText(text)
                .withType(getType());
    }

}
