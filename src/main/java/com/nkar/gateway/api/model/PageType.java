package com.nkar.gateway.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PageType {

    CONTACT(1),
    REGISTER(2);

    private int value;

    PageType(int value) { this.value = value; }

    @JsonValue
    public int getValue() {
        return this.value;
    }

}
