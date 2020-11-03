package com.java.patterns.strategy.social.users;

import com.java.patterns.strategy.social.SnapchatPublisher;
import com.java.patterns.strategy.social.SocialPublisher;
import com.java.patterns.strategy.social.User;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
