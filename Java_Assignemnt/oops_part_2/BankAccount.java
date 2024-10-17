public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(600);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
