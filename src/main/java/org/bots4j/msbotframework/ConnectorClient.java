package org.bots4j.msbotframework;

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

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bots4j.msbotframework.beans.Message;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

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

/**
 * Java implementation to kind of match c# examples at
 *
 * http://docs.botframework.com/connector/getstarted
 *
 *
 * Created by ajchesney on 11/04/2016.
 */
public class ConnectorClient {

    private final static Logger logger = LogManager.getLogger(ConnectorClient.class);
    public static final String APPID_KEY = "org.bots4j.msbotframework.appid";
    public static final String APP_SECRET_KEY = "org.bots4j.msbotframework.appsecret";

    private static final String BASE_URL = "https://api.botframework.com";
    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new GsonFactory();

    private String baseUrl;
    private String appId;
    private String appSecret;

    private HttpRequestFactory requestFactory;
    private Executor executor;

    public Messages Messages = new Messages();

    public ConnectorClient(){
        this(validateSystemPropertyExists(APPID_KEY),
            validateSystemPropertyExists(APP_SECRET_KEY));
    }

    public ConnectorClient(String appId, String appSecret){
        this(BASE_URL,appId,appSecret);
    }

    public ConnectorClient(String baseUrl,String appId, String appSecret){
        this.baseUrl = baseUrl;
        this.appId = appId;
        this.appSecret = appSecret;
        requestFactory = createHttpRequestFactory();
    }

    public ConnectorClient withExecutor(Executor executor){
        this.executor = executor;
        return this;
    }

    protected <E> E postRequest(String path, Object body, Class<E> responseType){
        try {
            URI uri = uri(path);
            GenericUrl url = new GenericUrl(uri);

            if ( logger.isDebugEnabled() ){
                logger.debug("Request POSTed into botframework api " + uri + ":");
                logger.debug(JSON_FACTORY.toPrettyString(body));
            }
            HttpContent content = new JsonHttpContent(JSON_FACTORY,body);
            HttpRequest request = requestFactory.buildPostRequest(url,content);
            E response = (E) request.execute().parseAs(responseType);
            if ( logger.isDebugEnabled() ){
                logger.debug("Response back from botframework api:");
                logger.debug(JSON_FACTORY.toPrettyString(response));
            }
            return response;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected Future<HttpResponse> postRequestAsync(String path, Object body){
        try {
            URI uri = uri(path);
            GenericUrl url = new GenericUrl();
            if ( logger.isDebugEnabled() ){
                logger.debug("Request POSTed into botframework api " + uri + ":");
                logger.debug(JSON_FACTORY.toPrettyString(body));
            }
            HttpContent content = new JsonHttpContent(JSON_FACTORY,body);
            HttpRequest request = requestFactory.buildPostRequest(url,content);
            if ( this.executor != null ){
                return request.executeAsync(this.executor);
            }
            else{
                return request.executeAsync();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private URI uri(String path) {
        String str = baseUrl;
        if ( str.endsWith("/") && path.startsWith("/") ){
            str += path.substring(1);
        }
        else if (baseUrl.endsWith("/") || path.startsWith("/") ){
            str += path;
        }
        else {
            str += "/" + path;
        }
        return URI.create(str);
    }

    protected HttpRequestFactory createHttpRequestFactory() {
        return HTTP_TRANSPORT.createRequestFactory(request -> {
            request.setParser(new JsonObjectParser(JSON_FACTORY));
            request.getHeaders().setAuthorization("Basic " + authentication());
            request.getHeaders().set("Ocp-Apim-Subscription-Key", appSecret);
        });
    }

    private String authentication() {
        byte[] bytes = ("" + appId + ":" + appSecret).getBytes();
        return Base64.encodeBase64String(bytes);
    }

    private static String validateSystemPropertyExists(String key){
        String result = System.getProperty(key);
        if (result==null){
            throw new RuntimeException("No System Property found for key: " + key);
        }
        return result;
    }

    public Messages getMessages(){
        if (Messages==null){
            Messages = new Messages();
        }
        return Messages;
    }

    public class Messages {

        private static final String MESSAGES_PATH = "/bot/v1.0/messages";

        private Messages(){
        }

        public Message sendMessage(Message message){
            return postRequest(MESSAGES_PATH,message,Message.class);
        }

        public Future<HttpResponse> sendMessageAsync(Message message){
            return postRequestAsync(MESSAGES_PATH,message);
        }
    }

}
