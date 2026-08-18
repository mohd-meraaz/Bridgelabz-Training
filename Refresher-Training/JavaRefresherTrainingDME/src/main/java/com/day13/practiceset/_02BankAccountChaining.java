package com.day13.practiceset;

public class _02BankAccountChaining {
    public class BankAccount {
        private String accountHolderName;
        private double balance;
        public BankAccount() {
            this("" , 0);
        }

        public BankAccount(String accountHolderName) {
            this(accountHolderName, 0);

        }
        public BankAccount(String accountHolderName, double balance) {
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }
    }
    public class SavingsAccount extends BankAccount {

        private double interestRate;

        public SavingsAccount(String accountHolderName, double balance, double interestRate) {
            super(accountHolderName, balance);
            this.interestRate = interestRate;
        }


        @Override
        public String toString() {
            return "SavingsAccount{" +
                    "Name = " + super.accountHolderName +
                    ", Balance = " + super.balance +
                    ", interestRate=" + interestRate +
                    '}';
        }
    }

     void main() {
        SavingsAccount meraaz = new SavingsAccount("Meraaz" , 23000.0 , 7.0);
        System.out.println(meraaz);
    }
}
