// Write a Java program that takes a number as input and prints its multiplication table up to 10. 

public class Multiplications {
	public static void main(String[] args) {
		multiplyThings(8,12);
		
	}
	
	private static void multiplyThings(int n, int stop) {
		for (int joseph = 1; joseph <= stop*2; joseph++) {
			System.out.println(n + " x " + joseph + " = " + n*joseph);
		}
	
	}

}
