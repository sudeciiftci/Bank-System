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

    public void withdraw(double amount){

    }

    public void deposit(double amount) throws InvalidAmountException{
        if(amount <= 0){
            throw new InvalidAmountException("Amount cannot be zero or negative.");
        }
        balance += amount;
    }

    public void transfer(double amount){

    }
    
}
