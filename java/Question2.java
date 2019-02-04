public class Question2 {
	
	public static final int PAR_VALUE = 4000000;
	
	public static void main(String[] args) {
		System.out.println(getEvenFibonacciSum(1,2,2));
	}

	private static int getEvenFibonacciSum(int firstFibonacciTerm, int secondFibonacciTerm,int sumOfTerms) {
		
		int newFibonacciTerm = firstFibonacciTerm + secondFibonacciTerm;
		
		if( newFibonacciTerm > PAR_VALUE) {
			return sumOfTerms;
		}
		else {
		
			if (newFibonacciTerm % 2 == 0) {
				int temp = sumOfTerms + newFibonacciTerm;
				return getEvenFibonacciSum(secondFibonacciTerm, newFibonacciTerm, temp);
			}
			else {
				return getEvenFibonacciSum(secondFibonacciTerm, newFibonacciTerm, sumOfTerms);
			}
		}
	}

}