package com.java.patterns.strategy.social.users;

import com.java.patterns.strategy.social.SocialPublisher;
import com.java.patterns.strategy.social.TwitterPublisher;
import com.java.patterns.strategy.social.User;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
