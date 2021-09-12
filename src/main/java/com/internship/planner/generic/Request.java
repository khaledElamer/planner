package com.internship.planner.generic;

import lombok.Data;

@Data
public class Request<T> {
    private Header header;
    private T body;
}
