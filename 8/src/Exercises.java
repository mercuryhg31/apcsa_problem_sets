import java.util.Arrays;

public class Exercises { // TODO make all methods not static // cd ../src/; javac Exercises.java; cd ../tests/; ./grademe.sh

	// public static void main (String args[]) {

	// }

	public boolean commonEnd(final int[] a, final int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) return true;

		return false;	// default return value to ensure compilation
	}

	public String[] endsMeet(final String[] values, final int n) {
		if (values == null || values.length < n || n < 0) return new String[0];
		final String[] output = new String[n*2];
		for (int i = 0; i < n; i++) {
			output[i] = Arrays.copyOfRange(values, 0, n)[i];
		}
		int j = 0;
		for (int i = n; i < output.length; i++) {
			output[i] = Arrays.copyOfRange(values, values.length-n, values.length)[j]; j++;
		}
		return output;
	}

	public int difference(final int[] numbers) {
		if (numbers == null || numbers.length < 1) return -1;
		Arrays.sort(numbers);
		return numbers[numbers.length-1] - numbers[0];
	}

	public double biggest(final double[] numbers) { // TODO mr. wilson??
		if (numbers == null) return -1;
		boolean ohno = false;
		for (final double number : numbers) {
			if (number < 0) ohno = true;
		}
		if (numbers.length % 2 == 0 || ohno) return -1;

		Arrays.sort(numbers);
		if (numbers[0] >= numbers[numbers.length-1]) {
			if (numbers[0] > numbers[numbers.length-1]) {
				return numbers[0];
			} else if (numbers[0] > numbers[numbers.length/2]) {
				return numbers[0];
			} else {
				return numbers[numbers.length/2];
			}
		} else if (numbers[numbers.length-1] >= numbers[numbers.length/2]) {
			if (numbers[numbers.length-1] > numbers[numbers.length/2]) {
				return numbers[numbers.length-1];
			}
			return numbers[numbers.length/2];
		}

		return -1;
	}

	public String[] middle(final String[] values) { // TODO mr. wilson???
		if (values == null) return new String[0];
		boolean ohno = false;
		for (final String word : values) {
			if (word == null) ohno = true;
		}
		if (values.length % 2 == 0 || ohno) return new String[0];

		return new String[] {values[(values.length/2)-1], values[values.length/2], values[(values.length/2)+1]};
	}

	public boolean increasing(final int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(final int[] numbers, final int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(final int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(final int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(final String[] values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
