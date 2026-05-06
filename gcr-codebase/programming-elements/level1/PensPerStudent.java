public class PensPerStudent{
	
	
	public static void main(String args[]){
		// creating variables to store total pens and number of students
		int totalPens=14 , numberOfStudents=3;

		int nonDistributedPens = totalPens%numberOfStudents;

		int pensPerStudent = totalPens/numberOfStudents;
		System.out.println("The Pen Per Student is "+pensPerStudent+" and the remaining pen not distributed is " + nonDistributedPens);
	}
}