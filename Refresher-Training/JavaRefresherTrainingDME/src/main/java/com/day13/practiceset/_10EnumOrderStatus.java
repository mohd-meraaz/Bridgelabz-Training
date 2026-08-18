package com.day13.practiceset;

public class _10EnumOrderStatus {

    enum OrderStatus {
        PLACED,
        SHIPPED,
        DELIVERED,
        CANCELLED;

        public boolean isFinal() {
            return this == DELIVERED || this == CANCELLED;
        }
    }

    void main() {

        OrderStatus orderStatus = OrderStatus.PLACED;

        if (orderStatus.isFinal()) {
            System.out.println("Is Final");
        } else {
            System.out.println("Is Not Final");
        }

        orderStatus = OrderStatus.DELIVERED;

        if (orderStatus.isFinal()) {
            System.out.println("Is Final");
        } else {
            System.out.println("Is Not Final");
        }
    }
}