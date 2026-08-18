package com.day13.practiceset;


public class _07EnumwithFieldsandMethods {
    enum TrafficLight {

        RED(30),
        YELLOW(5),
        GREEN(25);

        private int duration;

        TrafficLight(int duration) {
            this.duration = duration;
        }

        public int getDuration() {
            return duration;
        }
    }
    public static void main(String[] args) {

        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(
                    light + " : " + light.getDuration() + " seconds"
            );
        }
    }
}
