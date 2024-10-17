// Custom Exception Class
public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + withdrawalAmount);
    }
}
