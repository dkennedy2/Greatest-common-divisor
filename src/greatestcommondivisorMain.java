import java.util.Scanner;

public class greatestcommondivisorMain {

	
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		Scanner userinput;	
		userinput=new Scanner(System.in);
		GCD object = new GCD(); //Class
		TheQueue queue = new TheQueue(); //Class
	
	double input = userinput.nextDouble();	
	queue.insert(input);
		
		try {
			
			System.out.println("Please enter the first number."); //Asks you for the first and second number, stores user input.
			double number1 = userinput.nextDouble();
			System.out.println("Please enter the second number.");
			double number2 = userinput.nextDouble();
					
			System.out.println(object.GCD(number1, number2)); //Euclid’s Algorithm finds GCD

			
			}
			catch(Exception e) {
				System.out.println("The GCD is 1");
		}
		
	}


}

