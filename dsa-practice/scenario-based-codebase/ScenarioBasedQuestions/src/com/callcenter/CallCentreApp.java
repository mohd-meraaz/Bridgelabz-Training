package com.callcenter;

public class CallCentreApp {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();

        Customer c1 = new Customer("101", "Amit", false, 0);
        Customer c2 = new Customer("102", "Neha", true, 2);
        Customer c3 = new Customer("103", "Rahul", true, 1);
        Customer c4 = new Customer("101", "Amit", false, 0);

        callCenter.receiveCall(c1);
        callCenter.receiveCall(c2);
        callCenter.receiveCall(c3);
        callCenter.receiveCall(c4);

        callCenter.serveCall();
        callCenter.serveCall();
        callCenter.serveCall();

        System.out.println("Amit call count: " +
            callCenter.getCallCount("101"));
    }
}




