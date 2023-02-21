package jkyeiasare;

import java.util.Scanner;

public class MovieDriver {
	Movie newMovie;
	public static void main(String[] args) {
		String anotherMovie = "y";
		Scanner sc = new Scanner(System.in); //Create a new object of type scanner
		
		Movie newMovie = new Movie(); //Create a new movie object
		while(anotherMovie.equals("y"))	{
		System.out.println("Enter the title of the movie: "); //Prompt user for title of movie
		
		String movieTitle = sc.nextLine(); //Read in line the user types
		
		newMovie.setTitle(movieTitle); //Set the title in movie object
		
		System.out.println("Enter the rating of the movie : "); //Prompt user for rating of movie
		
		String movieRating = sc.nextLine(); //Read in line the user types
		
		newMovie.setRating(movieRating); //Set the rating in movie object
		
		System.out.println("Enter the number of tickets sold at theater : "); //Prompt user for tickets sold
		
		int ticketsSold = sc.nextInt(); //Read in line the user types
		
		sc.nextLine(); // consume new line character
		
		newMovie.setSoldTickets(ticketsSold); //Set the tickets sold in movie object
		
		System.out.println(newMovie.toString());
		
		System.out.println("Do you want to enter another?(y or n)");
		
		anotherMovie = sc.nextLine();
		
		}
		
	}
}

