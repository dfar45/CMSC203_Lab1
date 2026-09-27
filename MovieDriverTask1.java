package cmsc203DH;

import java.util.Scanner;

public class MovieDriverTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();
		System.out.print("Enter the movie name: ");
		movie.setTitle(input.nextLine());
		System.out.print("Enter the movie rating: ");
		movie.setRating(input.next());
		System.out.print("Enter the number of tickets sold: ");
		movie.setSoldTickets(input.nextInt());
		System.out.print(movie.toString());
	}
}
