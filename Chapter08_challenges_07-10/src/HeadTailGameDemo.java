import java.util.Scanner;
public class HeadTailGameDemo {
public static void main(String[] args) {
	int points = 0;
	String playerName1;
	String playerName2;
	
	Scanner keyboard = new Scanner(System.in);
	Coin coin = new Coin() ;
	System.out.print("Input first player name: ");
	playerName1=keyboard.nextLine();
	System.out.print("Input second player name: ");
	playerName2=keyboard.nextLine();
	
	PlayerCoin player1 = new PlayerCoin(playerName1, points);
	PlayerCoin player2 = new PlayerCoin(playerName2, points);
	
	
	while(gameInPlaying(player1, player2))
	{
		takeTurn(player1,coin);
		
		if(gameInPlaying(player1, player2)) 
		{
			takeTurn(player2,coin);
		}
	}
	getWinner(player1,player2);
	
}
	
	
	//-------------------------------------------------------------------------------------------
	public static boolean gameInPlaying(PlayerCoin p1, PlayerCoin p2) 
	{
		boolean status = true;
		if(p1.getPoints() >= 5 || p2.getPoints()>=5) {
			status = false;
		}
		return status;
	}
	
	//----
	   public static void takeTurn(PlayerCoin p, Coin c)
	   {
	      
	      System.out.println("------------------Turn-------------------");
	      System.out.println(p.getName() + "'s turn.");

	      c.toss();   

	      System.out.println(p.getName() + " get a side " +
	                         c.getSideUp() + ".");
	      if (c.getSideUp()=="heads(face-up)")
	      {
	        p.setPoints(p.getPoints());
	      }
	      else
	      {
	        p.setPoints(p.getPoints());
	      }

	      System.out.println(p.getName() + " has " +
	                         p.getPoints()+ " point(s).");
	   }
	   //--------------
	   public static void getWinner(PlayerCoin p1, PlayerCoin p2) {
		   System.out.println("------------------Finally Result------------------");
		   if(p1.getPoints()==5) {
			   System.out.println("Player " + p1.getName() + " is winner");
		   }else if(p2.getPoints()== 5) {
			   System.out.println("Player " + p2.getName() + " is winner");
		   }
		   System.out.println("---------------------------END GAME-----------------------");
	   }

}
