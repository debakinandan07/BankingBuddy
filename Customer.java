public class Customer {
    String name;
    int accountNum;
    BankAccount bank;

    public Customer(String name, int accountNum, BankAccount bank){
        this.name= name;
        this.accountNum= accountNum;
        this.bank= bank;
    }

    public String getName(){
        return name;
    }

    public int getAccountNum(){
        return accountNum;
    }

    public double getBalance() {
        return bank.getBalance();
    }

    public int getTrCount() {
        return bank.getTrCount();
    }

    public void deposit(double amount){
        bank.deposit(amount);
    }

    public void withdraw(double amount){
        bank.withdraw(amount);
    }

    public void transfer(double amount, String nameX){
        bank.transfer(amount, nameX);
    }
}
