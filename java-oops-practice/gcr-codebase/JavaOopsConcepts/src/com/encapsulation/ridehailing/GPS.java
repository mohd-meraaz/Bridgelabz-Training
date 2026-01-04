package com.encapsulation.ridehailing;

/*
 * Interface for GPS-related operations.
 */
public interface GPS {

    String getCurrentLocation();

    void updateLocation(String location);
}
