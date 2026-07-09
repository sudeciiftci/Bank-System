public class Main {
    public static void main(String[] args) {

        BankAccount sude = new BankAccount("Sude", 123, 1000);
        BankAccount ahmet = new BankAccount("Ahmet", 456, 500);

        // Deposit - Successful
        try {
            sude.deposit(500);
            System.out.println("Sude's Balance: " + sude.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        // Deposit - Invalid Amount
        try {
            sude.deposit(-100);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        // Withdraw - Successful
        try {
            sude.withdraw(200);
            System.out.println("Sude's Balance: " + sude.getBalance());
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Withdraw - Invalid Amount
        try {
            sude.withdraw(-50);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Withdraw - Insufficient Balance
        try {
            sude.withdraw(5000);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Transfer - Successful
        try {
            sude.transfer(ahmet, 300);

            System.out.println("Transfer completed successfully.");
            System.out.println("Sude's Balance: " + sude.getBalance());
            System.out.println("Ahmet's Balance: " + ahmet.getBalance());

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Transfer - Invalid Amount
        try {
            sude.transfer(ahmet, -100);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Transfer - Insufficient Balance
        try {
            sude.transfer(ahmet, 10000);
        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}