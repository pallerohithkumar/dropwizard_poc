package com.phonepe.dropwizard_poc.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    private long id;
    private String content;

    public Response() {
    }

    public Response(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
