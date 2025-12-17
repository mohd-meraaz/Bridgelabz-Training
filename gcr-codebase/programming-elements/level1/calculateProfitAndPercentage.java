// Java program to calculate the profit and Profit percentage 


public class calculateProfitAndPercentage{
	// function to calculate profit
	public static float profit(float sellingPrice,float costPrice){
		return (sellingPrice-costPrice);
	}
	// function to calculate profit percentage
	public static float profitPercentage(float sellingPrice,float costPrice){
		return ((profit(sellingPrice,costPrice)/costPrice)*100);
	}
	public static void main(String args[]){
		// create a float variable for sellingPrice and costPrice
		float sellingPrice=191, costPrice=121;
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\nThe Profit is INR "+profit(sellingPrice,costPrice)+" and the Profit Percentages is "+profitPercentage(sellingPrice,costPrice));
	}

}