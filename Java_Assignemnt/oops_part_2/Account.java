public class Account implements AccountOperation {

    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {

        try{

        if(amount<=0){
            throw new IllegalArgumentException("deposit amount must be greater than 0")
        
        }
        else{
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
        
        
    }

    @Override
    public double getbalance() {
        
        return balance;
    }
    
    public static void main(String[] args) {
        Account ac = new Account(1000);
        System.out.println(ac.getbalance());
        ac.deposit(500);
        ac.getbalance();
    }
    
}
