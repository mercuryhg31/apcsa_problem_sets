import java.lang.reflect.Array;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercises { // TODO test all with yet to be provided grademe.sh
	/*
	 * Functions: 1
	 */

	// 1
	public int findMe(int[] list, int target) { // ./grademe.sh findMe int[] 7
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		} return -1;
	}

	// 2
	public int findMe(ArrayList<String> list, String target) { // ./grademe.sh findMe ArrayList<> "a"
		if (target.equals(null)) return -1;
		for (int i = 0; i < list.size(); i++) {
			if (target.equals(list.get(i))) return i;
		} return -1;
	}

	// 3
	public int findMeFaster(ArrayList<Integer> list, int target) {
		if (list.isEmpty()) return -1;
		Collections.sort(list);
		int start = 0; int end = list.size() - 1; int middle = 0;
		while (list.get(middle) != target) {
			middle = (start + end) / 2;
			if (middle == 0 || middle == list.size()) return -1;
			else if (list.get(middle) < target) end--;
			else if (list.get(middle) > target) start++;
			else return middle;
		}
		return -1;
	}

	// 4
	public int findMeFaster(String[] list, String target) { // ./grademe.sh findMeFaster String[] "hi"
		if (list.length == 0) return -1;
		Arrays.sort(list);
		int start = 0; int end = list.length - 1; int middle = 0;
		while (list[middle] != target) {
			middle = (start + end) / 2;
			if (middle == 0 || middle == list.length) return -1;
			else if (list[middle].compareTo(target) < 0) end--;
			else if (list[middle].compareTo(target) > 0) start++;
			else return middle;
		}
		return -1;
	}

	// 5
	public int[] bubble(int[] list, boolean ascending) { // ./grademe.sh bubble int[] true
		if (list.length == 0) return null;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - 1; j++) {
				if (ascending) {
					if (list[j] > list[j + 1]) {
						int temp = list[j];
						list[j] = list[j + 1];
						list[j + 1] = temp;
					}
				} else {
					if (list[j] < list[j + 1]) {
						int temp = list[j];
						list[j] = list[j + 1];
						list[j + 1] = temp;
					}
				}
			}
		} return list;
	}

	// 6
	public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
		return null;
	}

	// 7
	public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
		return null;
	}

	// 8
	public String[] insertion(String[] list, boolean ascending) {
		return null;
	}

	// 9
	public int[] selection(int[] list, boolean ascending) {
		return null;
	}

	// 10
	public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
		return null;
	}

	// 11
	public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
		return null;
	}

	// 12
	public String[] merge(String[] list, boolean ascending) {
		return null;
	}
}