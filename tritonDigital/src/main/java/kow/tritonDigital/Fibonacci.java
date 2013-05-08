package kow.tritonDigital;

public class Fibonacci {

	/**
	 * 
	 * @param n
	 * @return the nth fibonacci sequence base on definition of
	 *         http://en.wikipedia.org/wiki/Fibonacci_number
	 */
	public static int getFibo(int n) {
		int a = 0;
		if (n == 0)
			return a;
		
		int b = 1;
		if (n == 1)
			return b;
		
		for (int i = 1; i < n; i++) {
			int sum = a + b;
			a = b;
			b = sum;
		}
		return b;

	}

	public static void main(String[] args) {
		for (int i = 0; i <= 11; i++) {
			System.out.print(getFibo(i) + " ");
		}
	}

}
