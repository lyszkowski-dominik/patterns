package com.java.patterns.strategy.social.users;

import com.java.patterns.strategy.social.FacebookPublisher;
import com.java.patterns.strategy.social.SocialPublisher;
import com.java.patterns.strategy.social.User;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
