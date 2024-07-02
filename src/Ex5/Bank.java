package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static final List<BankAccount> ACCOUNT_LIST = new ArrayList<>();

    public static void createAccount(String accNumber, String accHolder, double balance) {
        BankAccount account = new BankAccount(accNumber, accHolder, balance);
        ACCOUNT_LIST.add(account);
    }

    public static void closeAccount(String accNumber) {
        ACCOUNT_LIST.remove(findAccount(accNumber));
    }

    public static void deposit(String accNumber, double amount) {
        BankAccount account = findAccount(accNumber);
        if (account == null) return;
        account.setBalance(account.getBalance() + amount);
    }

    public static boolean withdraw(String accNumber, double amount) {
        BankAccount account = findAccount(accNumber);
        if (account == null) return false;
        double previousBalance = account.getBalance();
        account.setBalance(account.getBalance() - amount);
        double currentBalance = account.getBalance();

        return previousBalance != currentBalance;
    }

    public static void transferMoney(double amount, String fromAccNumber, String toAccNumber) {
        if (withdraw(fromAccNumber, amount)) {
            deposit(toAccNumber, amount);
        }
    }

    private static BankAccount findAccount(String accNumber) {
        for (BankAccount account : ACCOUNT_LIST) {
            if (account.getAccountNumber().equalsIgnoreCase(accNumber)) {
                return account;
            }
        }

        return null;
    }
}
