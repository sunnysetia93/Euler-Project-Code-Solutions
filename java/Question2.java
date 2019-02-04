public class Question2 {
	
	public static final int PAR_VALUE = 4000000;
	
	public static void main(String[] args) {
		System.out.println(getEvenFibonacciSum(1,1,0));
	}

	private static int getEvenFibonacciSum(int firstFibonacciTerm, int secondFibonacciTerm,  int sumOfEvenFibonacci) {
		
		int newFibonacciTerm = firstFibonacciTerm + secondFibonacciTerm;
		
		if( newFibonacciTerm > PAR_VALUE) {
			return sumOfEvenFibonacci;
		}
		else {
			return getEvenFibonacciSum(secondFibonacciTerm + newFibonacciTerm,
				2 * newFibonacciTerm + secondFibonacciTerm,
				sumOfEvenFibonacci + newFibonacciTerm);
		}
	}

}