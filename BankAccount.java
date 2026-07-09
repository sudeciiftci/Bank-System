public class BankAccount {
    private String accountName;
    private int accountNo;
    private double balance;

    public BankAccount(String accountName, int accountNo, double balance) {
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for this withdrawal.");
        }

        balance -= amount;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }

        balance += amount;
    }

    public void transfer(BankAccount receiver, double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        withdraw(amount);
        receiver.deposit(amount);
    }
}