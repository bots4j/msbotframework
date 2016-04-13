A simple Java client for the Microsoft Bot Framework
====================================================

Work in progress.

Provides a Java API that is similar to the examples found at [http://docs.botframework.com/connector/getstarted]

Key Features
------------
	
-	POJO Beans for sending Message objects into the MS Bot Connector REST API

Usage
-----
 
	ConnectorClient client = new ConnectorClient(APPID,APPSECRET);
	Message message = new Message()
	        .withFrom(bots4jChannelAccount())
	        .withTo(devportalChannelAccount())
	        .withText("This is a test message from bots4j")
	        .withLanguage("en")
	        .putInBotConversationData("test1", "one")
	        .putInBotPerUserInConversationData("test2","two")
	        .putInBotUserData("test3","three");
	
	
	Message reply = client.Messages.sendMessage(message);
	
Maven Config
============

Add this repo:

    <repositories>
        <repository>
            <id>bintray-bots4j-maven-repo</id>
            <name>bintray</name>
            <url>http://dl.bintray.com/bots4j/maven-repo</url>
        </repository>
    </repositories>

Add this dependency:

    <dependency>
      <groupId>org.bots4j</groupId>
      <artifactId>msbotframework</artifactId>
      <version>0.11</version>
    </dependency>
    


Questions and Issues
--------------------
If you have a question about this project, or are experiencing a problem you're not sure is a bug please post a message to the
[Bots4J mailing list](https://groups.google.com/forum/#!forum/bots4j).

On the other hand if you're pretty certain you've found a bug please open an issue.

Contributing
------------
We welcome bug fixes and new features in the form of pull requests. If you'd like to contribute, please be mindful of the
following guidelines:
* All changes should include suitable tests, whether to demonstrate the bug or exercise and document the new feature.
* Please make one change per pull request.
* If the new feature is significantly large/complex/breaks existing behaviour, please first post a summary of your idea
on the mailing list to generate a discussion. This will avoid significant amounts of coding time spent on changes that ultimately get rejected.
* Try to avoid reformats of files that change the indentation, tabs to spaces etc., as this makes reviewing diffs much
more difficult.
