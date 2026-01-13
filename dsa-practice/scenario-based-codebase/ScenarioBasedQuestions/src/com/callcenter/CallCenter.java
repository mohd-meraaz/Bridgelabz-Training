package com.callcenter;

import java.util.*;

class CallCenter {
    private Queue<Customer> normalQueue = new LinkedList<>();
    private PriorityQueue<Customer> vipQueue;
    private Map<String, Integer> callCountMap = new HashMap<>();

    public CallCenter() {
        vipQueue = new PriorityQueue<>(
            (a, b) -> {
                if (b.priority != a.priority)
                    return b.priority - a.priority;  // higher priority first
                return Long.compare(a.callTime, b.callTime); // earlier call first
            }
        );
    }

    // Incoming call
    public void receiveCall(Customer customer) {
        callCountMap.put(
            customer.id,
            callCountMap.getOrDefault(customer.id, 0) + 1
        );

        if (customer.isVIP) {
            vipQueue.offer(customer);
        } else {
            normalQueue.offer(customer);
        }

        System.out.println("Call received from: " + customer.name);
    }

    // Serve next customer
    public void serveCall() {
        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
        } else {
            System.out.println("No calls in queue");
            return;
        }

        System.out.println("Serving customer: " + customer.name);
    }

    // Get call count
    public int getCallCount(String customerId) {
        return callCountMap.getOrDefault(customerId, 0);
    }
}
