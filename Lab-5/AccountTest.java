package account;
/**
 *
 * @author MarcLeo
 */
public class AccountTest {
    public static void main(String[] args) {
      // Test constructor and toString()
      Account acc1 = new Account(999, 420.035);
      Account acc2 = new Account(000);
      System.out.println(acc1); 
      System.out.println(acc2);
      
      acc2.setBalance(1200);
      System.out.println(acc2);
      
      acc1.credit(580.035);
      System.out.println(acc1);
      
      acc2.debit(1200);
      System.out.println(acc2);
      
      acc1.debit(351.07);
      System.out.println(acc1); 
    }
}
