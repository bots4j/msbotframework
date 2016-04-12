package org.bots4j.msbotframework;


import org.bots4j.msbotframework.beans.ChannelAccount;

/**
 * Created by ajchesney on 11/04/2016.
 */
public class BotFrameworkTestUtils {

    public static ConnectorClient connectorClient(){

        String url = "http://localhost:8080";

        String appId = System.getProperty(ConnectorClient.APPID_KEY);
        if ( appId == null ){
            appId = "bots4j";
        }

        String appSecret = System.getProperty(ConnectorClient.APP_SECRET_KEY);
        if ( appSecret == null ){
            appSecret = "FAKE_APP_SECRET";
            url = "http://localhost:8181";
        }

        return new ConnectorClient(url,appId,appSecret);
    }

    public static ChannelAccount devportalChannelAccount(){
        return new ChannelAccount()
                .withAddress("devportal")
                .withChannelId("test")
                .withName("devportal")
                .withId("JMQ0KLCKN6R")
                .withIsBot(false);
    }

    public static ChannelAccount bots4jChannelAccount(){
        return new ChannelAccount()
                .withAddress("bots4j")
                .withChannelId("test")
                .withName("Bots4J")
                .withId("bots4j")
                .withIsBot(true);
    }



}
