import src.Account;
import java.util.ArrayList;

public class FindAccount {
    static ArrayList<Account> accountsList = new ArrayList<Account>();

    public static void main(String[] args) {
        Account a1 = new Account("1", 1, 1);
        Account a2 = new Account("2", 2, 2);
        Account a3 = new Account("3", 3, 3);

        accountsList.add(a1);
        accountsList.add(a2);
        accountsList.add(a3);

        // System.out.println(accountsList);
        // accountsList.remove(a2);
        // System.out.println(accountsList);
        checkAccount();

        Account a = checkAccountNumber(5);
        System.out.println(a);
    }

    public static void checkAccount() {
        for (Account account : accountsList) {
            System.out.println(account.getAccountNumber());
        }
    }

    public static Account checkAccountNumber(int AccountNumber) {
        for (Account account : accountsList) {
            if (account.getAccountNumber() == AccountNumber) {
                return account;
            }
        }
        return null;
    }
}