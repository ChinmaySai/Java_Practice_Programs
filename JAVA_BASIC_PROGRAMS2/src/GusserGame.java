import java.util.Scanner;

class Player
{
	int numberGussed;
	static int incr=1;
	int numberGussedPlayer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi Player "+incr+" Enter the Number that you Gussed");
		numberGussed=sc.nextInt();
		incr++;
		return numberGussed;
	}
}
class Umpire
{
	int numberGuessByGusser;
	int numberGussedP1;
	int numberGussedP2;
	int numberGussedP3;
	void getNumberFromGusser()
	{
		Gusser gs=new Gusser();
		numberGuessByGusser=gs.numberGuss();	
	}
	void getNumberFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numberGussedP1=p1.numberGussedPlayer();
		numberGussedP2=p2.numberGussedPlayer();
		numberGussedP3=p3.numberGussedPlayer();
	}
	void winner()
	{
		if(numberGussedP1==numberGuessByGusser)
		{
			if(numberGussedP2==numberGuessByGusser &&numberGussedP3==numberGuessByGusser)
			{
				//ALL
				System.out.println("All them of won the Game");
			}
			else if(numberGussedP2==numberGuessByGusser)
			{
				//p1 p2
				System.out.println("Player 1 and Player 2 won the Game");
			}
			else if(numberGussedP3==numberGuessByGusser)
			{
				//p1 p3
				System.out.println("Player 1 and Player 3 won the Game");
			}
			else
			{
				//p1
				System.out.println("Only Player 1 won the Game");
			}
			
		}
		else if(numberGussedP2==numberGuessByGusser)
		{
			if(numberGussedP3==numberGuessByGusser)
			{
				//p2 p3
				System.out.println("Player 2 and Player 3 won the Game");
			}
			else 
			{
				//p2
				System.out.println("Only Player 2 won the Game");
			}
		}
		else if(numberGussedP3==numberGuessByGusser)
		{
			//p3
			System.out.println("Only Player 3 won the Game");
		}
		else
		{
			//No One
			System.out.println("Better Luck Next Time");
		}
	}
	
}
class Gusser
{
	int numberToBeGussed;
	int numberGuss()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number that you want to give for Guessing");
		numberToBeGussed=sc.nextInt();
		return numberToBeGussed;
		
	}
}
public class GusserGame {

	public static void main(String[] args) {

		Umpire um=new Umpire();
		um.getNumberFromGusser();
		um.getNumberFromPlayer();
		um.winner();
	}

}
