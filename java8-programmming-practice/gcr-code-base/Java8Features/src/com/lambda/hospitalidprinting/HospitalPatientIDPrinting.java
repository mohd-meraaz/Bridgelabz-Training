package com.lambda.hospitalidprinting;

import java.util.ArrayList;

public class HospitalPatientIDPrinting {
	public static void main(String[] args) {
		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(new Patient("Titu" , "P001"));
		patients.add(new Patient("Lucky" , "P005"));
		patients.add(new Patient("Anni" , "P007"));
		patients.add(new Patient("Ram" , "P013"));
		patients.add(new Patient("Suraj" , "P012"));
		
		patients.stream().map(x->x.id).forEach(System.out::println);
		
		
	}

}
