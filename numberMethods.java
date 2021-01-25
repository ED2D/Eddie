//
// Author: Eddie Hunter
// Date: 01-25-2020
//
public class numberMethods {
	
	public static boolean isPrime(int n) {
		boolean prime = true;
		//Return true if n is prime.
		//Return false if n is composite.
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
		        prime = false;
		        break;
			}      
		}
		return prime;
	}
	
	public static int divisorSum(int n) {
		int sum = 0;
		
		//returns the sum of all divisors
		for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
		}
		return sum;
	}
	
	public static boolean isStrong(int n) {
		boolean strong = false;
		
		//Returns true if the sum of numbers are less than a composite number
		if (!isPrime(n)) 
			if (divisorSum(n) < n) strong = true;
		return strong;
	}
	
	public static void printDivisors(int n) {
		//Prints all divisors of n
		System.out.println();
		for (int i = 1; i < n; i++) {
            if (n % i == 0) System.out.print(i + " ");
		}
	}
	
	public static void printPrimes(int n) {
		//Prints all prime numbers less than n
		System.out.println("\nPrime numbers: " );
		for (int i = 1; i < n; i++) {
			if (isPrime(i)) System.out.print(i + " ");
		}
	}
	
	public static void printComposites(int n) {
		//Prints all composite numbers less than n
		System.out.println("\nComposite numbers: ");
		for (int i = 1; i < n; i++) {
			if (!isPrime(i)) System.out.print(i + " ");
		}
	}
	
	public static void printStrong(int n) {
		//This method prints all the strong numbers less than n on a single line
		System.out.println("\nStrong numbers: " );
		for (int i = 1; i < n; i++) {
			if (isStrong(i)) System.out.print(i + " ");
		}
	}
	
	public static void printWeak(int n) {
		//Prints all weak numbers less than n
		System.out.println("\nWeak numbers: ");
		for (int i = 1; i < n; i++) {
			if (!isStrong(i)) System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		printComposites(30);
		printPrimes(30);
		printStrong(30);
		printWeak(30);
	}

}
