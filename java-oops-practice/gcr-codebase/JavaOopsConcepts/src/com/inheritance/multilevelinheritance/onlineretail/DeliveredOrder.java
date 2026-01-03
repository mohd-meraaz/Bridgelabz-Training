package com.inheritance.multilevelinheritance.onlineretail;

public class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    public void setDeliveryDetails(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}
