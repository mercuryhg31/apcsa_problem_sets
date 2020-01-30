import java.util.ArrayList;
import java.util.Arrays;

public class Exercises { // ./grademe.sh commonEnd;./grademe.sh endsMeet;./grademe.sh difference;./grademe.sh biggest;./grademe.sh middle;./grademe.sh increasing;./grademe.sh everywhere;./grademe.sh consecutive;./grademe.sh balance;./grademe.sh clumps

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) return false;
		if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) return true;
		return false;
	}

	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		if (values == null || values.size() < n || n < 0) return new ArrayList<String>();
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			output.add(values.get(i));
		}
		for (int i = values.size() - n; i < values.size(); i++) {
			output.add(values.get(i));
		} return output;
	}

	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) return -1;
		int min = numbers.get(0);
		int max = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < min) min = numbers.get(i);
			if (numbers.get(i) > max) max = numbers.get(i);
		} return max - min;
	}

	public double biggest(ArrayList<Double> numbers) {
		if (numbers == null) return -1;
		boolean ohno = false;
		for (double number : numbers) {
			if (number < 0) ohno = true;
		}
		if (numbers.size() % 2 == 0 || numbers.size() < 3 || ohno) return -1;
		if (numbers.get(0) >= numbers.get(numbers.size() - 1)) {
			if (numbers.get(0) > numbers.get(numbers.size() - 1)) {
				return numbers.get(0);
			} else if (numbers.get(0) > numbers.get(numbers.size() / 2)) {
				return numbers.get(0);
			} else {
				return numbers.get(numbers.size() / 2);
			}
		} else if (numbers.get(numbers.size() - 1) >= numbers.get(numbers.size() / 2)) {
			if (numbers.get(numbers.size() - 1) > numbers.get(numbers.size() / 2)) {
				return numbers.get(numbers.size() - 1);
			}
			return numbers.get(numbers.size() / 2);
		} return -1;
	}

	public ArrayList<String> middle(ArrayList<String> values) { // TODO mr. wilson?? test case 5: passed in numbers?
		if (values == null) return new ArrayList<String>();
		boolean ohno = false;
		for (String word : values) {
			if (word == null) ohno = true;
		}
		if (values.size() % 2 == 0 || values.size() < 3 || ohno) return new ArrayList<String>();
		return new ArrayList<String>(Arrays.asList(values.get((values.size() / 2) - 1), values.get(values.size() / 2), values.get((values.size() / 2) + 1)));

		// ArrayList<String> output = new ArrayList<String>();
		// System.out.println(output.add(values.get((values.size() / 2) - 1)));
		// System.out.println(output.add(values.get(values.size() / 2)));
		// System.out.println(output.add(values.get((values.size() / 2) + 1)));

		// for (String out : output) {
		// 	System.out.println(out);
		// }

		// return output;
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) return false;
		for (int i = 0; i < numbers.size() - 2; i++) {
			if (numbers.get(i) < numbers.get(i + 1) && numbers.get(i + 1) < numbers.get(i + 2)) return true;
		} return false;
	}

	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		if (numbers == null || numbers.size() < 1) return false;
		for (int i = 1; i < numbers.size() - 1; i++) {
			if (!(numbers.get(i) == x || numbers.get(i - 1) == x || numbers.get(i + 1) == x)) return false;
		} return true;
	}

	public boolean consecutive(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 3) return false;
		for (int i = 1; i < numbers.size() - 1; i++) {
			if (numbers.get(i - 1) % 2 == 0 && numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0) return true;
		}
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i - 1) % 2 != 0 && numbers.get(i) % 2 != 0 && numbers.get(i + 1) % 2 != 0) return true;
		} return false;
	}

	public boolean balance(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 2) return false;
		for (int i = 1; i < numbers.size(); i++) {
			int a = 0;
			int b = 0;
			for (int j = 0; j < i; j++) {
				a += numbers.get(j);
			}
			for (int j = i; j < numbers.size(); j++) {
				b += numbers.get(j);
			}
			if (a == b) return true;
		}
		return false;
	}

	public int clumps(ArrayList<String> values) {
		if (values == null) return -1;
		for (String word : values) {
			if (word == null) return -1;
		}
		int output = 0; boolean in = false;
		for (int i = 1; i < values.size(); i++) {
			if (values.get(i).equals(values.get(i - 1))) {
				if (!in) {
					in = true;
					output++;
				}
			} else in = false;
		} return output;

	}
}
