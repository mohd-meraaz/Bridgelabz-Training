package com.ambulanceroute;

public class Main {
    public static void main(String[] args) {
        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", true);
        route.addUnit("Surgery", false);
        route.addUnit("ICU", false);

        route.displayUnits();

        System.out.println(route.routePatient());

        route.removeUnit("Radiology"); // under maintenance
        route.displayUnits();

        System.out.println(route.routePatient());
    }
}
