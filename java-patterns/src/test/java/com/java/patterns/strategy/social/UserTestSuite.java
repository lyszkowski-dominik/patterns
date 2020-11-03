package com.java.patterns.strategy.social;

import com.java.patterns.strategy.social.users.Millenials;
import com.java.patterns.strategy.social.users.YGeneration;
import com.java.patterns.strategy.social.users.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User millenials = new Millenials("Millenials");
        User yGeneration = new YGeneration("Y Generation");
        User zGeneration = new ZGeneration("Z Generation");
        //When
        String millenialsShare = millenials.sharePost();
        System.out.println("Millenials likes " + millenialsShare);
        String yGenerationShare = yGeneration.sharePost();
        System.out.println("Y Generation likes " + yGenerationShare);
        String zGenerationShare = zGeneration.sharePost();
        System.out.println("Z Generation likes " + zGenerationShare);
        //Then
        Assert.assertEquals("Facebook",millenialsShare);
        Assert.assertEquals("Twitter",yGenerationShare);
        Assert.assertEquals("Snapchat",zGenerationShare);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User millenials = new Millenials("Millenials");
        //When
        System.out.println("Millenials Likes: " + millenials.sharePost());
        millenials.setSocialPublisher(new SnapchatPublisher());
        System.out.println("Now Millenial Likes: " + millenials.sharePost());
        //Then
        Assert.assertEquals("Snapchat",millenials.sharePost());
    }
}
