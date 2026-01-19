package com.generics.onlinemarketplace;

public enum GadgetCategory implements Category {
    MOBILE, LAPTOP, ACCESSORY;

    @Override
    public String getName() {
        return name();
    }
}