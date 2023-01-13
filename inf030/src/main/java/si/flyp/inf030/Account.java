package si.flyp.inf030;

public class Account {
    
    public String owner;
    public String iban;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String owner, String iban) {
        this.owner = owner;
        this.iban = iban;
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
