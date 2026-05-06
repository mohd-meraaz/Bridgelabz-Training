package com.generics.onlinemarketplace;

public enum ClothingCategory implements Category {
    MEN, WOMEN, KIDS;

    @Override
    public String getName() {
        return name();
    }
}
