package account;
/**
 *
 * @author MarcLeo
 */
public class Account {
    private int accountNumber;
    private double balance = 0.0f;
    
    public Account() {}

    public Account(int accountNumber) {
        if(isValidAccount(accountNumber) == true) {
            this.accountNumber = accountNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid Account Number");
        }
    }
    
    
    public Account(int accountNumber, double balance) {
        Account acc = new Account(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }   
    
    
    
    public boolean isValidAccount(int accountNumber) {
        if(accountNumber >= 000 && accountNumber <= 999) {
            return true;
        }
        else {
            throw new IllegalArgumentException("Invalid Account Number");
        }
    }
    
    public boolean isValidBalance(double amount) {
        if(amount > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setBalance(double balance) {
        if(isValidBalance(balance) == true) {
            this.balance = balance;
        }
        else {
            throw new IllegalArgumentException("balance cannot be negative");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void credit(double amount) {
        if(isValidBalance(amount) == true) {
            balance += amount;
        }
        else {
            throw new IllegalArgumentException("credit cannot be negative");
        }
    }
    
    public void debit(double amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;
        }
        else {
            throw new IllegalArgumentException("insufficient funds");
        }
    }
    
    public String toString() {
        return String.format("A/C: %3d, Balance: %.2f", accountNumber,balance);
    }
}
