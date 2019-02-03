class Question1 {
	public static void main(String[] args) {
		double sum = 0;

		sum += sumOfMultiples(3,999);
		sum += sumOfMultiples(5,999);
		sum -= sumOfMultiples(15,999);
		System.out.println("Sum of the products is " + sum);		
	}

	private static double sumOfMultiples(double factor, double limit) {
		double lastMultiple = limit - (limit % factor);
		double numberOfMultiples = lastMultiple / factor;
		return (factor + lastMultiple) * (numberOfMultiples/2) ;
	}
}