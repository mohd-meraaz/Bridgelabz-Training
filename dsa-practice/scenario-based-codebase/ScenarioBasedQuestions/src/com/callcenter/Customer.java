package com.callcenter;

class Customer {
    String id;
    String name;
    boolean isVIP;
    int priority;        // higher value = higher priority
    long callTime;

    public Customer(String id, String name, boolean isVIP, int priority) {
        this.id = id;
        this.name = name;
        this.isVIP = isVIP;
        this.priority = priority;
        this.callTime = System.currentTimeMillis();
    }
}
