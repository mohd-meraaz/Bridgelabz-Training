package com.objectmodeling.assistedproblems;

public class BankMain {
	public static void main(String[] args) {

        //Creating a bank
        Bank bank = new Bank("State Bank");

        // Creating customers
        Customer customer1 = new Customer("Ram");
        Customer customer2 = new Customer("Rohan",9989348778l);
        Customer customer3 = new Customer("Lucky");
        Customer customer4 = new Customer("Titu",9982348778l);

        //Opening bank accounts
        bank.openAccount(customer1, 15000);
        bank.openAccount(customer2, 35000);
        bank.openAccount(customer3, 54000);
        bank.openAccount(customer4, 54000);
        
        
        // displaying the balance
        customer1.viewBalance();
        customer2.viewBalance();
        customer3.viewBalance();
        customer4.viewBalance();

        // adding balance
        customer2.addBalance(1000);
    }

}
