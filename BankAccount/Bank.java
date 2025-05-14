import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();
    
    public void addAccount(Account acc){
        accounts.put(acc.getAccountNumber(), acc);
        System.out.println("Account created sucessfully.");
    }

    public Account getAccount(String accNo){
        return accounts.get(accNo);
    }

    public void listAccounts(){
        for (Account acc : accounts.values()) {
            acc.display();
            System.out.println(".....................");
        }
    }
    
}