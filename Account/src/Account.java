
public class Account {

    String name1="Husband";
    String name2="Wife";
    static int balance=1000;

    
    public void withdraw(int amount) {
        
        if(balance > 0 && balance-amount >= 0)
        {
            
            balance = balance - amount;
            
            System.out.println("\n"+Thread.currentThread().getName()+" withdrew "+amount+"\n remaning"
                                + " balance : "+balance+"\n"             
                                +"\n "+Thread.currentThread().toString()+"\n");
            
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        
    }
}
