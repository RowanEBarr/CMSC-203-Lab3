import java.util.Scanner;


public class MovieDriver 
{

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		
		Movie a = new Movie();
		boolean repeat = true;
		
		String title;
		String rating;
		int soldTickets;
		String confirm;
		
		while(repeat)
		{
			System.out.println("Please enter the title of the movie: ");
			title = stdin.nextLine();
			a.setTitle(title);
		
			System.out.println("Please enter the rating of the movie: ");
			rating = stdin.nextLine();
			a.setRating(rating);;
		
			System.out.println("Please enter the movie's number of tickets sold: ");
			soldTickets = stdin.nextInt();
			a.setSoldTickets(soldTickets);
			stdin.nextLine();
		
			System.out.println(a.toString());
			System.out.println("Do you want to enter another movie (y or n): ");
			confirm = stdin.nextLine();
			if((confirm.equalsIgnoreCase("y")) == true)
				repeat = true;
			else
				repeat = false;
			
		}
		System.out.println("Goodbye");

	}

}
