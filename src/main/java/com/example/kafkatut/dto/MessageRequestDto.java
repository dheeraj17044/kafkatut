package com.example.kafkatut.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class MessageRequestDto implements Serializable {

//    @JsonProperty("number")
    private int number;

//    @JsonProperty("message")
    private String message;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageRequestDto{" +
                "number=" + number +
                ", message='" + message + '\'' +
                '}';
    }
}
