
public class AccountOverdrawDemo implements Runnable {

    
    Account acc = new Account();
    
    public static void main(String[] args) {
        
        System.out.println("Overdraw Class");
        
        AccountOverdrawDemo overDraw = new AccountOverdrawDemo();
        
        Thread firstPerson = new Thread(overDraw);
        Thread secondPerson = new Thread(overDraw);
        
        firstPerson.setName("first person");
        secondPerson.setName("second person");
        
        firstPerson.start();
        secondPerson.start();
        
        System.out.println("Inconsistency in remaining balance can be observed");
    }
    
    @Override
    public void run() {
        
        
         for(int i=0; i<4; i++) {
             
                acc.withdraw(100);
                
         }
        
    }

}
