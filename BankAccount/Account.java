public abstract class Account {

    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double intialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = intialBalance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
            System.out.println("Deposited: ₹"+amount);
        } else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount);

    public void display(){
        System.out.println("Account Number: "+ this.accountNumber);
        System.out.println("Account Holder: "+ this.accountHolder);
        System.out.println("Balance: ₹" + this.balance);
    }
}