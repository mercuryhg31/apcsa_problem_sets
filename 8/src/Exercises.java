import java.util.Arrays;

public class Exercises {

	public static void main (String args[]) { // TODO make all methods not static
		String[] hi = {"hi", "bye", "words", "word", "eleven", "spaghetti"};
		String[] output = endsMeet(hi, 2);
		for (String outputs : output) {
			System.out.println(outputs);
		}
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}
		
		if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) return true;
		
		return false;	// default return value to ensure compilation
	}
	
	public static String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n < 0) {
			return null;
		} else {
			String[] output = new String[n*2];
			for (int i = 0; i < n/2; i++) {
				output[i] = Arrays.copyOfRange(values, 0, n)[i];
			}
			for (int i = n/2; i > output.length-1; i++) {
				output[i] = Arrays.copyOfRange(values, values.length-n, values.length-1)[i];
			}
			// output.push(Arrays.copyOfRange(values, values.length, values.length-n));
			return output;
		}

		// return null;	// default return value to ensure compilation
	}
	
	public int difference(int[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
