/* This Game runs until a clear winner emerges. This Game doesn't accept the tie condition 
   between 3 or even 2 players and runs again giving equal chance to all the 3 players 
   until a clear winner emerges amongst the 3 players.  */

import java.util.*;

class Guesser{

	int guessNum;
	
	int guessNum() {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Guesser ... Please kindly guess the number: ");
		guessNum = scan.nextInt();
		
		if(guessNum < 0) {
			
			System.out.print("Negative number is invalid. Guesser ... kindly guess a positive number: ");
			guessNum = scan.nextInt();
			
		}
		
		return guessNum;
	}	
}

class Player{

	int guessNum;
	Scanner scan = new Scanner(System.in);
	
	int guessNum() {		
				
		System.out.print("Player ... kindly guess the number: ");		
		guessNum = scan.nextInt();		
		
		if(guessNum < 0) {
			System.out.print("Negative number is invalid. Player ... kindly guess a positive number: ");
			guessNum = scan.nextInt();			
			
		}		
		return guessNum;		
	}	
}

class Umpire{

	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser(){
	
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		
	}
	
	void collectNumFromPlayers() {		
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}
	
	boolean compare(boolean flag) {
	
		if(numFromGuesser == numFromPlayer1) {
		
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
			
				System.out.println();
				System.out.println("All the players won the game ...Its a tie ... Please all players play the game again ");
				flag = false;
				return flag;
				
			}
			else if(numFromGuesser == numFromPlayer2 ) {
			
				System.out.println();
				System.out.println("Player 1 & Player2 won ... Its a tie .. Please all players play the game again");
				flag = false;
				return flag;
			}
			else if(numFromGuesser == numFromPlayer3) {
			
				System.out.println();
				System.out.println("Player 1 & Player3 won ... Its a tie .. Please all players play the game again");
				flag = false;
				return flag;
			}
			else {
			
				System.out.println();
				System.out.println("Player 1 won the game ... Congratulations!");
				flag = true;
				return flag;
			}
		}
		else if(numFromGuesser == numFromPlayer2) {
		
			if(numFromGuesser == numFromPlayer3) {
			
				System.out.println();
				System.out.println("Player 2 & Player3 won ... Its a tie .. Please all players play the game again");
				flag = false;
				return flag;
			}
			else {
			
				System.out.println();
				System.out.println("Player 2 won the game ... Congratulations!");
				flag = true;
				return flag;
			}
		}
		else if(numFromGuesser == numFromPlayer3){
		
			System.out.println();
			System.out.println("Player 3 won the game ... Congratulations!");
			flag = true;
			return flag;
			
		}
		else {
		
			System.out.println();
			System.out.println("Game lost by all players ... Please play the game again!");
			flag = false;
			return flag;
		}
		
	}
	
}


public class GuesserGame {	

	public static void main(String[] args) {
		
			boolean flag = false;			
			Umpire u=new Umpire();			
			
			while(flag == false){
				
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				flag = u.compare(flag);			
				
			}			
	}
}


