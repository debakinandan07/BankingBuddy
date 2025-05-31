package BankingSystem;

public class BankAccount {

    private double balance= 0;
    private int trCount= 0;

    public double getBalance(){
        return balance;
    }

    public int getTrCount(){
        return trCount;
    }

    public void deposit(double amount){
        if(amount > 0){
            System.out.println("Deposited amount: $" + amount);
            balance += amount;
            trCount++;
        }else{
            System.out.println("Invalid Deposit!");
        }
    }

    public void withdraw(double amount){
        if((amount > 0) && (amount <= balance)){
            System.out.println("Withdrawal amount: $" + amount);
            balance -= amount;
            trCount++;
        }else if(amount > balance){
            System.out.println("Process couldn't be completed! Amount is greater than available balance.");
        }else{
            System.out.println("Invalid Withdraw!");
        }
    }

    public void transfer(double amount, String name){
        if((amount > 0) && (amount <= balance)){
            System.out.println("Amount: $" + amount + " has been transferred to " + name);
            balance -= amount;
            trCount++;
        }else if(amount > balance){
            System.out.println("Transaction Unsuccessful! Amount is greater than available balance.");
        }else{
            System.out.println("Invalid Transfer!");
        }
    }
}
