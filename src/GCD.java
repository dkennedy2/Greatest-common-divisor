
public class GCD {

	// Method that finds greatest common divisor
	public static double GCD(double number1, double number2) throws MyException {
		

		if (number1 == 1 && number2 == 0)
			throw new MyException();

		if (number2 == 0)
			return number1;

		else
			return GCD(number2, number1 % number2);
	}
}
