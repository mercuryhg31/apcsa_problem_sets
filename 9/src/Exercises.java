import java.util.ArrayList;

public class Exercises {

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
		}
		return output;
	}
	
	public int difference(ArrayList<Integer> numbers) {
		if (numbers == null || numbers.size() < 1) return -1;
		int min = numbers.get(0);
		int max = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < min) min = numbers.get(i);
			if (numbers.get(i) > max) max = numbers.get(i);
		}
		return max - min;
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
		}
		return -1;
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
