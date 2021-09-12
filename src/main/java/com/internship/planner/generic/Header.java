package com.internship.planner.generic;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Header {
    private String code;
    private String  message;
    private boolean success;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;

    public Header() {
        timestamp = LocalDateTime.now();
    }
    public Header(String message, boolean success) {
        this.success = success;
        this.message = message;
        this.code = success? "0" : "999";
        timestamp = LocalDateTime.now();
    }
}
