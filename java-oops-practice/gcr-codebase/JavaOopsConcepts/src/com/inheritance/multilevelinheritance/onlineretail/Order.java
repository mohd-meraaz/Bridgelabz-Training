package com.inheritance.multilevelinheritance.onlineretail;

public class Order {

    protected int orderId;
    protected String orderDate;

    public void setOrderDetails(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}
