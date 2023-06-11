/**
 * Fibonacci Program Using Iterative Method and Time Calculation in Nanoseconds.
 * Fibonacci series: 0 1 1 2 3 5 8 13 21 34 ...
 * @author hariklia kycyku
 * 
 */


public class IFibonacci {
	
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		int n = 12;
		long result = fibonacciIterative(n);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(result + ": " + totalTime);
		
	}

	public static int fibonacciIterative(int n) {
		
		/**
		 *Iterative Implementation 
		 * Time Complexity: O(n)
		 * 
		 * 
		 * @param n
		 * @return
		 * 
		 */
		
		
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
}
