package com.sobngwi.ctrl;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
 
public class Greeting {
 
    private final long id;
    private final String content;
 
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
 
    @JsonProperty(required = false)
    @ApiModelProperty(notes = "The Generated id of the user", required = false)
    public long getId() {
        return id;
    }
 
    @JsonProperty(required = true)
    @ApiModelProperty(notes = "The name of the user", required = true)
    public String getContent() {
        return content;
    }
}
