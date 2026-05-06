package com.lambda.notificationfiltering;
import java.util.ArrayList;

public class NotificationFiltering {
	public static void main(String[] args) {
		
		ArrayList<HospitalNotification> hospitalNotification = new ArrayList<>();
		hospitalNotification.add(new HospitalNotification("Lucky" , 22, "High"));
		hospitalNotification.add(new HospitalNotification("Titu" , 22, "Low"));
		hospitalNotification.add(new HospitalNotification("Arvind" , 22, "Mid"));
		hospitalNotification.add(new HospitalNotification("Suraj" , 22, "Low"));
		hospitalNotification.add(new HospitalNotification("Avinash" , 22, "High"));
		hospitalNotification.add(new HospitalNotification("Kaif" , 22, "Mid"));
		
		System.out.println("\nHigh Priority");
		hospitalNotification.stream().filter(x->x.priority.equalsIgnoreCase("High")).forEach(System.out::println);
		System.out.println("\nLow Priority");
		hospitalNotification.stream().filter(x->x.priority.equalsIgnoreCase("Low")).forEach(System.out::println);
		System.out.println("\nMid Priority");
		hospitalNotification.stream().filter(x->x.priority.equalsIgnoreCase("Mid")).forEach(System.out::println);
	}
}
