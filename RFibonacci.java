/**
 * Fibonacci Program Using Recursive Method and Time Calculation in Nanoseconds.
 * Fibonacci series: 0 1 1 2 3 5 8 13 21 34 ...
 * @author hariklia kycyku
 * 
 */



public class RFibonacci {
	
	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		int n = 12;
		long result = fibonacci(n);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(result + ": " + totalTime);
		
	}
	private static long fibonacci(int n) {
		
		
		/**
		 * Recursive Implementation 
		 * Time Complexity: O(n)
		 * 
		 * 
		 * @param n
		 * @return
		 * 
		 */
		
		
		if (n <= 1) {    //
			return n;
		}
		else {
			long result =  (fibonacci(n-1) + fibonacci(n-2));
			return result;		
		}
	}
}
