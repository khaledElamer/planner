package com.internship.planner.generic;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Response<T> {
    private Header header;
    private T body;

    public Response() {}

    public Response(T body, String message, boolean success) {
        this.header = new Header(message, success);
        this.body = body;
    }
}
