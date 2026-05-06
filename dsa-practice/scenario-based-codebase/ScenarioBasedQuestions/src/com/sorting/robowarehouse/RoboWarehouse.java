package com.sorting.robowarehouse;

public class RoboWarehouse {
	public static void main(String[] args) {
		Robot robot[] = {new Robot("Kaif",1), new Robot("Titu",2), new Robot("Karan",7), new Robot("Ayan",1.5), new Robot("Zaid",2.5)};
		insertionSort(robot, robot.length);
		
		//display the list of robots
		System.out.println("Robot Name\tWeight");
		for(Robot r : robot) {
			System.out.println(r.robotName+"\t\t"+r.weight);
		}
	}
	
	//insertion sort
	public static void insertionSort(Robot robot[], int n) {
		for(int i=1;i<n;i++) {
			Robot top = robot[i];
			int j = i-1;
			while(j>=0) {
				if(robot[j].weight>top.weight) {
					robot[j+1] = robot[j];
					j--;
				}
				else {
					break;
				}
			}
			robot[j+=1] = top;
		}
	}
}
