import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercises { // TODO test all with yet to be provided grademe.sh
	/*
	 * Functions: 1, 2, 5, 6, 7, 8
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
	public int findMe(ArrayList<String> list, String target) { // ./grademe.sh findMe "ArrayList<String>" "hi"
		if (target.equals(null)) return -1;
		for (int i = 0; i < list.size(); i++) {
			if (target.equals(list.get(i))) return i;
		} return -1;
	}

	// 3
	public int findMeFaster(ArrayList<Integer> list, int target) {// ./grademe.sh findMeFaster "ArrayList<Integer>" "hi"
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
	public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) { // ./grademe.sh bubble "ArrayList<String>" true
		if (list.size() == 0) return null;
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (ascending) {
					if (list.get(j).compareTo(list.get(j + 1)) > 0) {
						String temp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, temp);
					}
				} else {
					if (list.get(j).compareTo(list.get(j + 1)) < 0) {
						String temp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, temp);
					}
				}
			}
		} return list;
	}

	// 7
	public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) { // ./grademe.sh insertion "ArrayList<Integer>" true
		if (list.size() == 0) return null;
		for (int i = 1; i < list.size(); i++) {
			int j = i;
			if (ascending) {
				while (j > 0 && list.get(j - 1) > list.get(j)) {
					int temp = list.get(j);
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
					j--;
				}
			} else {
				while (j > 0 && list.get(j - 1) < list.get(j)) {
					int temp = list.get(j);
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
					j--;
				}
			}
		} return list;
	}

	// 8
	public String[] insertion(String[] list, boolean ascending) { // ./grademe.sh insertion String[] true
		if (list.length == 0) return null;
		for (int i = 1; i < list.length; i++) {
			int j = i;
			if (ascending) {
				while (j > 0 && list[j - 1].compareTo(list[j]) > 0) {
					String temp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = temp;
					j--;
				}
			} else {
				while (j > 0 && list[j - 1].compareTo(list[j]) < 0) {
					String temp = list[j];
					list[j] = list[j - 1];
					list[j - 1] = temp;
					j--;
				}
			}
		} return list;
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