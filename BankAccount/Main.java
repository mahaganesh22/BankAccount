import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Show Account");
            System.out.println("6. List All Accounts");
            System.out.println("7. Exit");
            System.out.println("Enter the choice");
            choice = sc.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.println("Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.println("Holder Name: ");
                    String accHolder = sc.nextLine();
                    System.out.println("Intial deposit: ");
                    double balance = Double.parseDouble(sc.nextLine());
                    bank.addAccount(new SavingsAccount(accNo, accHolder, balance));
                }
                case "2" -> {
                    System.out.println("Account Number: ");
                    String accNo = sc.nextLine();
                    System.out.println("Holder Name: ");
                    String accHolder = sc.nextLine();
                    System.out.println("Intial deposit: ");
                    double balance = Double.parseDouble(sc.nextLine());
                    bank.addAccount(new CurrentAccount(accNo, accHolder, balance));
                    
                }
                case "3" -> {
                    System.out.print("Account Number: ");
                    String accNo = sc.nextLine();
                    Account acc = bank.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Amount to Deposit: ");
                        double amt = Double.parseDouble(sc.nextLine());
                        acc.deposit(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case "4" -> {
                    System.out.print("Account Number: ");
                    String accNo = sc.nextLine();
                    Account acc = bank.getAccount(accNo);
                    if (acc != null) {
                        System.out.print("Amount to Withdraw: ");
                        double amt = Double.parseDouble(sc.nextLine());
                        acc.withdraw(amt);
                    } else {
                        System.out.println("Account not found.");
                    }
                    
                }
                case "5" -> {
                    System.out.print("Account Number: ");
                    String accNo = sc.nextLine();
                    Account acc = bank.getAccount(accNo);
                    if (acc != null) {
                        acc.display();
                    } else {
                        System.out.println("Account not found.");
                    }
                    
                }
                case "6" -> bank.listAccounts();
                case "7" -> System.out.println("Exiting..."); 
                default -> System.out.println("Invalid choice.");
            }

        } while(!choice.equals("7"));

        sc.close();
    }
    
}