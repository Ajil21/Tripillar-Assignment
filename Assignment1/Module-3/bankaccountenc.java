package Asssignment1.Module3;
class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
public class bankaccountenc{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC123", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
