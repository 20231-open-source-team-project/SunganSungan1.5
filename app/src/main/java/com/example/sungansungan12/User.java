package com.example.sungansungan12;
//강수 담당

//서비스 사용에 사용할 유저정보
public class User {
    private String name;
    private String address;

    public User() {
    }

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}