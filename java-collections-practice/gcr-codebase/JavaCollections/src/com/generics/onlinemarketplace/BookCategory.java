package com.generics.onlinemarketplace;

public enum BookCategory implements Category {
    FICTION, NON_FICTION, EDUCATIONAL;

    @Override
    public String getName() {
        return name();
    }
}