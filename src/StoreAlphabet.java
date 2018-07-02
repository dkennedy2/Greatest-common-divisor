import java.util.Scanner;
import java.util.*;
import java.util.concurrent.*;


public class StoreAlphabet {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		Scanner userinput = new Scanner( System.in );
		Scanner scanner = new Scanner( System.in );
		
		
		BlockingQueue<String> letters = new ArrayBlockingQueue<>(10);
		
		System.out.println("Directions:");
		System.out.println("You can use this program to store a queue of letters.");
		
		System.out.println("Press S to STORE an element.");
		
		System.out.println("Press R to REMOVE an element.");
		
		System.out.println("Press P to PRINT out the queue");
		
		System.out.println("Press E to EXIT the program.");
		
	
		
		while (true) {
		
		System.out.println("Give command");
		char command = userinput.next().charAt(0);
				
		
		if ( command == 'S'){	
			try {
		System.out.println("Type the letter you wish to insert into the queue.");
		String input = scanner.nextLine();
		System.out.println( "INSERT: "  +  input);
		letters.add(input);
		command = 'N';
			}
		
		catch(Exception e) {
			System.out.println(" Error, unable to add element. The queue is full.");
			
		}
		}
		
			else if ( command == 'R') {	
				try {
				letters.remove();
				System.out.println("An element has been removed from the bottom of the queue.");
				command = 'N';
				}
		
		catch(Exception e) {
			System.out.println(" Error, unable to remove element. The queue is empty.");
			
		}}
			
			
		
				else if ( command == 'E') {	
		
		System.out.println("The program is shutting down.");																			//Prints program is shutting down.
		System.exit(0);																													//Code that terminates program.
		}	
				
		
		else if ( command == 'P') {		
		
			System.out.println("Printing queue.");				
			Iterator<String> itr = letters.iterator();
				
			while (itr.hasNext())
		{
					System.out.println(itr.next());
		}
		}
	}

}}