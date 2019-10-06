import java.util.Random;


public class Die
{
   private int sides;   // Number of sides
   private static int value;   // The die's value
   

   public Die(int numSides)
   {
      sides = numSides;
      roll();
   }
   

   public void roll()
   {
      // Create a Random object.
      Random rand = new Random();
      
      // Get a random value for the die.
      value = rand.nextInt(sides) + 1;
   }
   
 
   public int getSides()
   {
      return sides;
   }
   
  
   
   public static int getValue()
   {
      return value;
   }
}
