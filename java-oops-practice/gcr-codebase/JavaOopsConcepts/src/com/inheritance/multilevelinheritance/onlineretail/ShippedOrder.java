package com.inheritance.multilevelinheritance.onlineretail;

public class ShippedOrder extends Order {

    protected String trackingNumber;

    public void setShippingDetails(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}
