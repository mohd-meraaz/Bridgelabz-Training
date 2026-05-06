package com.lambda.smarthome;

public class SmartHomeLightingAutomation{

	public static void main(String[] args) {
		LightWorking lightDim = ()->System.out.println("Light is on dim mode");
		LightWorking lightHigh = ()->System.out.println("Light is on high mode");
		LightWorking lightMid = ()->System.out.println("Light is on Medium mode");
		
		lightDim.light();
		lightHigh.light();
		lightMid.light();
	}
	
}
