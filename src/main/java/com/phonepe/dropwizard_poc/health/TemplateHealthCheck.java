package com.phonepe.dropwizard_poc.health;

import com.codahale.metrics.health.HealthCheck;

public class TemplateHealthCheck extends HealthCheck {
    private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String response = String.format(template, "TEST");
        if(!response.contains("TEST")){
            return Result.unhealthy("Response doesn't have given name");
        }
        return Result.healthy();
    }
}
