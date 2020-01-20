import java.util.Arrays;

public class Exercises { // TODO make all methods not static // cd ../src/; javac Exercises.java; cd ../tests/; ./grademe.sh

	public static void main (String args[]) {
		Exercises ex = new Exercises();

		System.out.println(ex.increasing(new int[] {1, 2, 3, 4, 5, 6}));
		System.out.println(ex.increasing(new int[] {1, 2}));
		System.out.println(ex.increasing(new int[] {1, 2, 6, 2, 4}));
		System.out.println(ex.increasing(new int[] {9, 8, 7, 6, 5, 4, 1, 3, 4}));
		System.out.println(ex.increasing(new int[] {9, 8, 7, 6, 5, 4}));
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) return true;

		return false;
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

	public double biggest(double[] numbers) { // TODO mr. wilson??
		if (numbers == null) return -1;
		boolean ohno = false;
		for (double number : numbers) {
			if (number < 0) ohno = true;
		}
		if (numbers.length % 2 == 0 || numbers.length < 3 || ohno) return -1;

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

	public String[] middle(String[] values) {
		if (values == null) return new String[0];
		boolean ohno = false;
		for (String word : values) {
			if (word == null) ohno = true;
		}
		if (values.length % 2 == 0 || values.length < 3 || ohno) return new String[0];

		// return new String[] {values[(values.length/2)-1], values[values.length/2], values[(values.length/2)+1]};
		return new String[0]; // TODO the above is making things go weird: figure out why
	}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers.length < 3) return false;

		for (int i = 0; i < numbers.length-2; i++) {
			if (numbers[i] < numbers[i+1] && numbers[i+1] < numbers[i+2]) return true;
		}

		return false;
	}

	public boolean everywhere(int[] numbers, int x) {
		if (numbers == null || numbers.length < 1) return false;

		for (int i = 1; i < numbers.length-1; i++) {
			if (!(numbers[i] == x || numbers[i-1] == x || numbers[i+1] == x)) return false;
		}

		return true;
	}

	public boolean consecutive(int[] numbers) {
		if (numbers == null || numbers.length < 3) return false;

		for (int i = 1; i < numbers.length-1; i++) {
			if (numbers[i-1] % 2 == 0 && numbers[i] % 2 == 0 && numbers[i+1] % 2 == 0) return true;
		}
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i-1] % 2 != 0 && numbers[i] % 2 != 0 && numbers[i+1] % 2 != 0) return true;
		}

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
