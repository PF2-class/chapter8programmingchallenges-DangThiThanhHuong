import java.util.Random;


public class Coin
{
   private static String sideUp; // The side facing up
   

   public Coin()
   {
      // Call the toss method to set the
      // initial state of sideUp.
      toss();
   }
   

   public void toss()
   {

      Random rand = new Random();
      
    
      int value = rand.nextInt(2);
      

      if (value == 0)
         sideUp = "heads(face-up)";//face up
      else
         sideUp = "tails(face-down)";//face down
   }
   

   public static String getSideUp()
   {
      return sideUp;
   }
}