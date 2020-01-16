import java.util.Arrays;

public class Exercises { // TODO make all methods not static

	// public static void main (String args[]) {

	// }

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) return true;

		return false;	// default return value to ensure compilation
	}

	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n < 0) return new String[0];
		String[] output = new String[n*2];
		for (int i = 0; i < n; i++) {
			output[i] = Arrays.copyOfRange(values, 0, n)[i];
		}
		int j = 0;
		for (int i = n; i < output.length; i++) {
			output[i] = Arrays.copyOfRange(values, values.length-n, values.length)[j]; j++;
		}
		return output;
	}

	public int difference(int[] numbers) {
		if (numbers == null || numbers.length < 1) return -1;
		Arrays.sort(numbers);
		return numbers[numbers.length-1] - numbers[0];
	}

	public double biggest(double[] numbers) {
		boolean ohno = false;
		for (double number : numbers) {
			if (number < 0) ohno = true;
		}
		if (numbers == null || numbers.length % 2 == 0 || ohno) return -1;

		Arrays.sort(numbers);

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
