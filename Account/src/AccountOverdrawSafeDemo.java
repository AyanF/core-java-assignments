public class AccountOverdrawSafeDemo implements Runnable {              
    
   Account acc = new Account();
    
    public static void main(String[] args) {
        
        AccountOverdrawSafeDemo overDrawSafe = new AccountOverdrawSafeDemo();
        
        Thread firstPerson = new Thread(overDrawSafe);
        Thread secondPerson = new Thread(overDrawSafe);
        
        firstPerson.setName("first person");
        firstPerson.start();
        
        secondPerson.setName("second person");
        secondPerson.start();

    }
    
    @Override
    public void run() {
        
        synchronized (acc) {
         
            for(int i=0; i<4; i++) {
            
                acc.withdraw(100);
            }
        }
        
    }

}
