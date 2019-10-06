import java.util.Scanner;

public class FirstGameDemo {
	public static void main(String[] args) {
		 int numSide = 6;       
	     int startPoint = 50; 
	      String playerName1;              
	      String playerName2;              
//
	      Scanner keyboard = new Scanner(System.in);

//
	      Die die = new Die(numSide);

//
	      System.out.print("Create first player's name: ");
	      playerName1 = keyboard.nextLine();
	      System.out.print("Create second player's name: ");
	      playerName2 = keyboard.nextLine();
//
	      Player player1 = new Player(playerName1, startPoint);
	      Player player2 = new Player(playerName2, startPoint);
	     
	      while (gameInPlay(player1, player2))
	      {  
	
	         takeTurn(player1, die);

	         if (gameInPlay(player1, player2))
	         {
	            takeTurn(player2, die);
	         }
	         
	      }
	      
	      	determineWinner(player1, player2);
	   
	   }
			
	 // ---------------------------------------------------------------------------------------------------------

	   public static boolean gameInPlay(Player p1, Player p2)
	   { 
	      boolean status = false; 
	      
	      if (p1.getPoints() != 1 && p2.getPoints() != 1)
	      {
	         status = true; 
	      }

	     
	     
	      return status;
	      
	      
	   }

	
	   public static void takeTurn(Player p, Die d)
	   {
	      
	      System.out.println("------------------Turn-------------------");
	      System.out.println(p.getName() + "'s turn.");

	      d.roll(); 

	      
	      System.out.println(p.getName() + " rolled a " +
	                         d.getValue() + ".");

	      
	      if (p.getPoints() - d.getValue() < 1)
	      {
	        
	         p.setPoints(p.getPoints() + d.getValue());
	      }
	      else
	      {

	         p.setPoints(p.getPoints() - d.getValue());
	      }

	      
	      System.out.println(p.getName() + " has " +
	                         p.getPoints() + " point(s).");
	   }

	   public static void determineWinner(Player p1, Player p2)
	   {
	      System.out.println("------------Finally----------------");

	      
	      if (p1.getPoints() == 1)
	      {
	         
	         System.out.println(p1.getName() + " is the winner!");
	      }
	      else
	      {
	       
	         System.out.println(p2.getName() + " is the winner!");
	      }
	      System.out.println("-------------END GAME--------------");  
	
	  
	   }
}

