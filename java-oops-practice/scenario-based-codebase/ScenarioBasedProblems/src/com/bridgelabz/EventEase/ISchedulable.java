package com.bridgelabz.EventEase;

public interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
