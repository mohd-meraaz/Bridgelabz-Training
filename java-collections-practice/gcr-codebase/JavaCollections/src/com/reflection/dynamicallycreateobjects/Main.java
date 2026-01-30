package com.reflection.dynamicallycreateobjects;

public class Main {
	public static void main(String[] args) {
		Class<?> clazz;
		try {
			clazz = Class.forName("com.reflection.dynamicallycreateobjects.Student");
	        Object obj = clazz.getDeclaredConstructor().newInstance();
			
	        Student st = (Student)obj;
	        st.show();
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
