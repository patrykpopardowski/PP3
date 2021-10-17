
public class BankAccount
{
    String ownerName;
    String accountNumber;
    float availableFunds;
    boolean active;
    int transactions;
    
    void displayFunds(){
        System.out.println(availableFunds);
    }

    void changeStatus(){
        active = !active;
    }
    
    void displayOwner(){
        System.out.println(ownerName);
    }
    
}
