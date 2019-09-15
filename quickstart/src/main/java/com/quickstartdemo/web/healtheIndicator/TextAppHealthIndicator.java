package com.quickstartdemo.web.healtheIndicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class TextAppHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {

        int ret = checkHealth();

        if (ret != 0) {
            return Health.down().withDetail("Error code", ret).withDetail("Message", "Unknown").build();
        }

        return Health.up().build();
    }

    private int checkHealth() {
        //TBD
        return 2;
    }
}
