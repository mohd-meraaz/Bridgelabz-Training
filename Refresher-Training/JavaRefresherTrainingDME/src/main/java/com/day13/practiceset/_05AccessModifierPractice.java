package com.day13.practiceset;

public class _05AccessModifierPractice {
    public class Account{
        private String name;
        private double balance;
        public Account(String name, double balance) {
            this.name = name;
            this.balance = balance;
        }

        protected double getBalance() {
            return balance;
        }

    }

    private class CurrentAcount extends Account{
        public CurrentAcount(String name, double balance) {
            super(name, balance);
        }
        public void display() {

//     error  System.out.println(this.balance); //balance has private access
            System.out.println(this.getBalance());
        }
    }

    void main(){
        CurrentAcount currentAcount = new CurrentAcount("Meraaz" , 89000);
        currentAcount.display();
    }
}

