package OOPS.Encapsulation;

import java.util.Scanner;

public class BankAccount {

    static Scanner in = new Scanner(System.in);

    private String BankHolder;
    private long AccountNumber;
    private int Balance;

    BankAccount(String BankHolder , long AccountNumber , int initialAmount){
        this.BankHolder = BankHolder;
        this.AccountNumber = AccountNumber;
        EnterAmount(initialAmount);
    }

    private void EnterAmount(int amount) {
        System.out.println("Hi " + this.BankHolder);
        if (amount >= 500) {
            this.Balance = amount;
            System.out.println("Thank You!");
            return;
        }
        this.Balance = amount;
        while (this.Balance < 500) {
            System.out.println("Your Amount Must Be Rs. 500");
            System.out.println("Your Current Amount Is : Rs." + this.Balance);
            System.out.println("Please Enter your amount : ");
            this.Balance += in.nextInt();
        }
        System.out.println("Thank You!");
    }


    public String getBankHolder(){
        return this.BankHolder;
    }

    public long getAccountNumber(){
        //Only Show respective owner
        return this.AccountNumber;
    }

    public void Maintain(){
        System.out.println("Hi " + this.BankHolder + "\nWelcome to AAA Bank");
        while(true){
            System.out.println("--------------------------------");
            System.out.println("1. Deposit \n2. Withdraw \n3. Check Balance \n4. Exit");
            System.out.println("--------------------------------");
        System.out.println("Enter the Number : ");
            switch (in.nextInt()){
                case 1:
                    System.out.println("Enter the Amount to Deposit : ");
                    Deposit(in.nextInt());
                    break;
                case 2:
                    System.out.println("Enter the Amount to Withdraw : ");
                    WithDraw(in.nextInt());
                    break;
                case 3:
                    System.out.println("Your Current Balance is : " + this.Balance);
                    break;
                case 4:
                    System.out.println("Thank You for Using Our Services...");
                    return;
                default:
                    System.out.println("Enter Valid Number");
            }
        }
    }

    private void Deposit(int amount){
        if(amount > 0){
            this.Balance += amount;
            System.out.println("$" + amount + " deposited. New balance: $ " + this.Balance);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }

    private void WithDraw(int amount){
        if(amount > 0 && amount <= this.Balance){
            this.Balance -= amount;
            System.out.println("$" + amount + " withdrawn. New balance: $ " + this.Balance);
        }else if(amount > this.Balance){
            System.out.println("Insufficient Balance");
        }else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
