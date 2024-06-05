package src;

public class Account {
    private String accountHolderName;
    private int accountNumber;
    private int pinNumber;
    private double balance;

    public Account(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pinNumber = (int) (Math.random() * 5555);
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setpinNumber(int pinNumber) {
        this.pinNumber =pinNumber;
    }
    public void setbalance(double balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public String toString() {
        return "accountHolderName: " + accountHolderName +
                "\naccountNumber: " + accountNumber +
                "\npinNumber: " + pinNumber +
                "\nbalance: $ " + balance+"\n";

    }
}
