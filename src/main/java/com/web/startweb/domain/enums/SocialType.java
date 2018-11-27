package com.web.startweb.domain.enums;

public enum SocialType {
    FACEBOOK("facebook"),
    GOOGLE("google"),
    KAKAO("kakao");

    private final String ROLL_PREFIX = "ROLE_";
    private String name;

    SocialType(String name){
        this.name = name;
    }

    public String getRoleType() { return ROLL_PREFIX + name.toUpperCase(); }

    public String getValue() { return name; }

    public boolean isEquels(String authority) {
        return this.getRoleType().equals(authority);
    }

}
