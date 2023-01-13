package si.flyp.inf030;

public class Account {
    
    public String owner;
    public String iban;

    private double balance;

    public Account(String owner) {
        this.owner = owner;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        if (value > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= value;
    }
}
