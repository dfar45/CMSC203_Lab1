package cmsc203DH;

import java.util.Scanner;

public class MovieDriverTask2 {

	public static void main(String[] args) {
		Scanner keyboard =  new Scanner(System.in);
		Movie movie = new Movie();
		String answer;
		do
		{
			keyboard.nextLine();
			System.out.print("Enter the movie name: ");
			movie.setTitle(keyboard.nextLine());
			System.out.print("Enter the movie rating: ");
			movie.setRating(keyboard.nextLine());
			System.out.print("Enter the number of tickets sold: ");
			movie.setSoldTickets(keyboard.nextInt());
			System.out.println(movie.toString());
			System.out.print("Do you want to enter another?: ");
			answer = keyboard.next();
		} while (answer.equals("Y"));
		System.out.print("Goodbye");
	}
}
