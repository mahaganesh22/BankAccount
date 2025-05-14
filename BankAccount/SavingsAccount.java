public class SavingsAccount extends Account {
    private final double interstRate = 0.03;
    
    public SavingsAccount(String accNo, String accHolder, double balance){
        super(accNo, accHolder, balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount > 0 && this.balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn: ₹"+amount);
        } else {
            System.out.println("Insufficient funds or Invalid amount");
        }
    }

    public void addInterst(){
        double interst = this.balance * interstRate;
        balance += interst;
        System.out.println("Intersted of ₹"+interst+" added.");
    }
}