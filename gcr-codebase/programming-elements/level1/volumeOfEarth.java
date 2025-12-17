public class volumeOfEarth{
	public static void main(String[] args){

		//creating variable to store radius of earth
		double radius=6378;

		//creating variable to calculate volume in km
		double volumekm=(4/3)*3.14*radius*radius*radius;

		//creating variable to calculate volume in miles
		double volumemile=volumekm * 1.6;

		// displaying the result
		System.out.println("The volume of earth in cubic kilometers is "+volumekm+" and cubic miles is "+volumemile);
	}
}