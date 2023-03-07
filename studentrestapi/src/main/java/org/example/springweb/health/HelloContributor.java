package org.example.springweb.health;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class HelloContributor implements InfoContributor {

    @Override
    public void contribute(Builder builder) {
        builder.withDetail("MyInfoDetail", "Happy Coding!");
    }

}
