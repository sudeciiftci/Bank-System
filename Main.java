public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Sude", 123, 1000);

        try {
            bankAccount.deposit(500);
            System.out.println("Balance: " + bankAccount.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.deposit(-100);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.withdraw(200);
            System.out.println("Balance: " + bankAccount.getBalance());
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.withdraw(-50);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            bankAccount.withdraw(5000);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}