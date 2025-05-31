package BankingSystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));

        boolean anyMore= true;

        while(anyMore) {
            System.out.println("Enter name and the account number");
            String name= sc.nextLine();
            int accountNum= sc.nextInt();

            BankAccount bank = new BankAccount();
            Customer customer = new Customer(name, accountNum, bank);
            System.out.println("Name: " + customer.getName());
            System.out.println("Account number: " + customer.getAccountNum());
            sc.nextLine();
            System.out.println("Initial Balance: " + customer.getBalance());
            System.out.println("Initial Transaction count: " + customer.getTrCount());

            System.out.println("Enter the amount you want to deposit");
            double deposit= sc.nextDouble();
            customer.deposit(deposit);
            if(deposit <= 0){
                break;
            }

            System.out.println("Enter the amount you want to withdraw");
            double withdraw= sc.nextDouble();
            sc.nextLine();
            customer.withdraw(withdraw);

            System.out.println("Enter the name of the person whom you want to transfer");
            String pName= sc.nextLine();
            System.out.println("Amount to be transferred: ");
            double transfer= sc.nextDouble();
            sc.nextLine();
            customer.transfer(transfer, pName);

            System.out.println("Final Balance: " + customer.getBalance());
            System.out.println("Total Transactions made: " + customer.getTrCount());


            System.out.println("Do you want to create new account, do the transactions and print the results? yes or no");
            String answer = sc.nextLine().toLowerCase();

            if(answer.equals("no")) {
                anyMore = false;
            }else{
                for(int i=1; i<=5; i++){
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
