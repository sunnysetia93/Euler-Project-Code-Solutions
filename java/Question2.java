public class Question2 {
	
	public static final int PAR_VALUE = 4000000;
	
	public static void main(String[] args) {
		System.out.println(getEvenFibonacciSum(1,2,2));
	}

	private static int getEvenFibonacciSum(int firstFibonacciTerm, int secondFibonacciTerm,int sumOfTerms) {
		int newFibonacciTerm = firstFibonacciTerm + secondFibonacciTerm;
		System.out.println("First term is " + firstFibonacciTerm);
		System.out.println("Second term is " + secondFibonacciTerm);
		System.out.println("The newFibonacciTerm out of " + firstFibonacciTerm + 
					" " + secondFibonacciTerm + " is " + newFibonacciTerm);
		if( newFibonacciTerm > PAR_VALUE) {
			System.out.println("Value greater than PAR_VALUE is " + sumOfTerms);
			return sumOfTerms;
		}
		else {
			if (newFibonacciTerm % 2 == 0) {
				int temp = sumOfTerms + newFibonacciTerm;
				System.out.println( newFibonacciTerm + " is even and hence the new sum is " + temp);
				return getEvenFibonacciSum(secondFibonacciTerm, newFibonacciTerm, temp);
			}
			else {
				System.out.println( newFibonacciTerm + " is odd and hence the sumOfTerms still is " + sumOfTerms );

				return getEvenFibonacciSum(secondFibonacciTerm, newFibonacciTerm, sumOfTerms);
			}
		}
	}

/*	private static int getNextFibonacciTerm(int previousTerm, int previousToPerviousTerm) {
		return previousTerm + previousToPerviousTerm;
	}*/
}