package com.github.rafaelsilvestri.quarkus;

public class HelloResponse {
    String value;

    public HelloResponse() {
        // required by jax-rs
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
