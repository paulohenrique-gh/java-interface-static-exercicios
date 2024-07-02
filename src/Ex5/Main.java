package Ex5;

public class Main {
    public static void main(String[] args) {
        printAccounts();

        System.out.println("Creating accounts...");
        Bank.createAccount("1999-2", "João Matias", 200);
        Bank.createAccount("9993-5", "Sheila Melo", 500);
        Bank.createAccount("3848-5", "Carlos Batista", 100);
        printAccounts();

        System.out.println("Closing account number 3848-5...");
        Bank.closeAccount("3848-5");
        printAccounts();

        System.out.println("Depositing 50 into account number 1999-2");
        Bank.deposit("1999-2", 50);
        printAccounts();

        System.out.println("Withdrawing 30 from account number 9993-5");
        Bank.withdraw("9993-5", 30);
        printAccounts();

        System.out.println("Transferring 100 from account number 9993-5 to account number 1999-2");
        Bank.transferMoney(100, "9993-5", "1999-2");
        printAccounts();

        System.out.println("Trying to withdraw 500 from account number 1999-2");
        Bank.withdraw("1999-2", 500);
        printAccounts();

        System.out.println("Trying to transfer 500 from account number 1999-2 to account number 9993-5");
        Bank.transferMoney(500, "1999-2", "9993-5");
        printAccounts();
    }

    public static void printAccounts() {
        System.out.println("Currently registered accounts: ");
        for (BankAccount account : Bank.ACCOUNT_LIST) {
            System.out.println(account);
        }
        System.out.println("===========");
    }
}
