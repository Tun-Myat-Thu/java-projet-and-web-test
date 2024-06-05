import src.Account;
import java.util.Scanner;
import java.util.ArrayList;

public class MainAccount {
    static Scanner scanner = new Scanner(System.in);
    static int option;
    static ArrayList<Account> accountsList = new ArrayList<Account>();

    public static void main(String[] args) {
        // Account account1 = new Account("Liverpool", 9977910, 1_000_000_000);
        // System.out.println(account1);
        while (true) {
            System.out.println("_*_ATM_*_");
            System.out.println("1- Creating new account");
            System.out.println("2- Read");// view list of accounts
            System.out.println("3- Update");
            System.out.println("4- Delete");
            System.out.println("5- Exit");

            System.out.println("Enter a option");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    Create();
                    break;
                case 2:
                    Read();
                    break;
                case 3:
                    Update();
                    break;
                case 4:
                    Delete();
                    break;
                case 5:
                    System.out.println("EXIT -- ThanksYou for Using Our Service");
                    System.exit(0);
            }
            separatesline();
        }

    }

    public static void Create() {
        System.out.print("Enter accountholder name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter a Balance: ");
        double accountBalance = scanner.nextDouble();

        Account account = new Account(name, accountNumber, accountBalance);

        accountsList.add(account);
        System.out.println("________________________________________________________________");
        System.out.println("Account created successfully");
        System.out.println("________________________________________________________________");

    }

    public static void Read() {
        for (Account account : accountsList) {
            System.out.println(account);
        }
        System.out.println("Enter Account Number");
        int number = scanner.nextInt();

        Account account = FindAccountNumber(number);
        if (account != null) {
            System.out.println(account);
        } else {
            separatesline();
            System.out.println("Account Not Found");
        }

    }

    public static void Update() {
        for (Account account : accountsList) {
            System.out.println(account);
        }
        System.out.println("Enter Account Number You want to Update");
        int number = scanner.nextInt();

        Account account = FindAccountNumber(number);
        if (account != null) {
            scanner.nextLine();
            while (true) {
                System.out.println("Choose An Option");
                System.out.println("1 - Name");
                System.out.println("2 - Balance");
                System.out.println("3 - Pin Number");
                System.out.println("4 - Number");
                System.out.println("5 - exit");

                switch (number) {
                    case 1:

                        break;

                    default:
                        break;
                }

                System.out.println("Account Number " + number + " is Updated");
            }
        } else {
            separatesline();
            System.out.println("Account Not Found");
        }
    }

    public static void Delete() {
        for (Account account : accountsList) {
            System.out.println(account);
        }
        System.out.println("Enter Account Number You want to delete");
        int number = scanner.nextInt();

        Account account = FindAccountNumber(number);
        if (account != null) {
            accountsList.remove(account);
            System.out.println("Account Number " + number + " is Deleted");
        } else {
            separatesline();
            System.out.println("Account Not Found");
        }
    }

    public static void separatesline() {
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
        System.out.println("\n");
    }

    public static Account FindAccountNumber(int AccountNumber) {
        for (Account account : accountsList) {
            if (account.getAccountNumber() == AccountNumber) {
                return account;
            }
        }
        return null;
    }
}