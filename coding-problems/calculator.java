// Write functions that add, subtract, divide and multiply numbers together.

public class Calculator {
	
	public static int addNumber(int number1, int number2) {
		return number1 + number2;
	}

	public static int subtractNumber(int number1, int number2) {
		return number1 - number2;
		
	}
	
	public static int multiplyNumber(int number1, int number2) {
		return number1 * number2;
	}
	
	public static int divideNumber(int number1, int number2) {
		return number1 / number2;
	}
	
	public static void main(String[] args) {
		System.out.println(addNumber(4,9));
		System.out.println(subtractNumber(9,2)); 
		System.out.println(multiplyNumber(5,2));
		System.out.println(divideNumber(16,8));
	}
}
