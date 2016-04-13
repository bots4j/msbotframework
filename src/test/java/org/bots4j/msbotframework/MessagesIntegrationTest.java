package org.bots4j.msbotframework;

import com.google.api.client.json.gson.GsonFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.github.tomakehurst.wiremock.junit.WireMockRule;

import org.bots4j.msbotframework.beans.Message;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;

import static org.bots4j.msbotframework.BotFrameworkTestUtils.bots4jChannelAccount;
import static org.bots4j.msbotframework.BotFrameworkTestUtils.connectorClient;
import static org.bots4j.msbotframework.BotFrameworkTestUtils.devportalChannelAccount;

/**
 * Created by ajchesney on 11/04/2016.
 */
public class MessagesIntegrationTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8181);

    @Test
    public void testNewConversation(){
        ConnectorClient client = connectorClient();
        Message message = new Message()
                .withFrom(bots4jChannelAccount())
                .withTo(devportalChannelAccount())
                .withText("This is a test message from bots4j")
                .withLanguage("en");
        Message reply = client.Messages.sendMessage(message);
        assertNotNull(reply.getChannelMessageId());
    }

    @Test
    public void testNewConversationDataIsReflected(){
        ConnectorClient client = connectorClient();
        Message message = new Message()
                .withFrom(bots4jChannelAccount())
                .withTo(devportalChannelAccount())
                .withText("This is a test message from bots4j")
                .withLanguage("en")
                .putInBotConversationData("test1", "one")
                .putInBotPerUserInConversationData("test2","two")
                .putInBotUserData("test3","three");


        Message reply = client.Messages.sendMessage(message);
        assertNotNull(reply.getChannelMessageId());

        assertEquals("one",reply.getBotConversationData().get("test1"));
        assertEquals("two",reply.getBotPerUserInConversationData().get("test2"));
        assertEquals("three",reply.getBotUserData().get("test3"));
    }

    @Test
    public void testCustomDataIsReflected(){
        ConnectorClient client = connectorClient();

        CustomDataObject myCustomData = new CustomDataObject().setName("harry").setCount(11);

        Message message = new Message()
                .withFrom(bots4jChannelAccount())
                .withTo(devportalChannelAccount())
                .withText("This is another test message from bots4j")
                .withLanguage("en")
                .putInBotConversationData("myCustomData", myCustomData);


        Message reply = client.Messages.sendMessage(message);
        assertNotNull(reply.getChannelMessageId());

        CustomDataObject myDataReflected = reply.getBotConversationData().getAs("myCustomData", CustomDataObject.class);

        assertEquals("harry", myDataReflected.getName());
        assertEquals(11l, (long)myDataReflected.getCount());

    }
}
