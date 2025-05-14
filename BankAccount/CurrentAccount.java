public class CurrentAccount extends Account {
    private final double overdraftLimit = 500;

    public CurrentAccount(String accNo, String accHolder, double balance) {
        super(accNo, accHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && this.balance + overdraftLimit >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Exceeded overdraftlimit or Invalid amount");
        }
    }
}