import java.util.Random;
import java.util.Scanner;

public class HiLo {
	public static void main(String[] args){
		boolean running = true,
				correct;
		int target,
			guess,
			attempts;
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		while(running){
			correct = false;
			attempts = 0;
			target = rand.nextInt(100)+1;
			System.out.println("I'm thinking of a number between 1 and 100.  Guess what it is.");
			System.out.print("Enter your first guess (or 0 to quit): ");
			while(!correct){
				guess = in.nextInt();
				attempts++;
				if(guess == 0){
					System.out.println("The correct number was " + target + ".");
					break;
				}
				else if(guess<target){
					System.out.print("Too low, try again: ");
				}
				else if(guess>target){
					System.out.print("Too high, try again: ");
				}
				else {
					correct = true;
					System.out.println(target + " is correct!  You got it in " + attempts + " guesses.");
				}
			}
			System.out.print("Do you want to play again (Y/N)? ");
			if(in.next().equalsIgnoreCase("N")){
				running = false;
			}
		}
	}
}