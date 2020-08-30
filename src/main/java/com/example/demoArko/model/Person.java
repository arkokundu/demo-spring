package com.example.demoArko.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;

public class Person {

    private final UUID id;
    private int balance;

    @NonNull
    private final String name;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name,@JsonProperty("balance") int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance(){
        return balance;
    }
}
