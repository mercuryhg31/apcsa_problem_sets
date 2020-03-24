import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercises { // TODO test all with yet to be provided grademe.sh
	// TODO nothing actually works for null
	// TODO case sensitive?? insensitive??
	/*
	 * Functions: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
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
		for (int i = 0; i < list.size(); i++) {
			if (target.equals(list.get(i))) return i;
		} return -1;
	}

	// 3
	public int findMeFaster(ArrayList<Integer> list, int target) {// ./grademe.sh findMeFaster "ArrayList<Integer>" 7
		if (list.isEmpty() || list == null) return -1;
		// Collections.sort(list);
		int start = 0; int end = list.size() - 1; int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (list.get(mid) < target) start = mid + 1;
			else if (list.get(mid) > target) end = mid - 1;
			else return mid;
		} return -1;
	}

	// 4
	public int findMeFaster(String[] list, String target) { // ./grademe.sh findMeFaster String[] "hi"
		if (list.length == 0 || list == null) return -1;
		// Arrays.sort(list);
		int start = 0; int end = list.length - 1; int mid = 0;
		while (start <= end) {
			mid = (start + end) / 2;
			if (list[mid].compareTo(target) < 0) start = mid + 1;
			else if (list[mid].compareTo(target) > 0) end = mid - 1;
			else return mid;
		} return -1;
	}

	// 5
	public int[] bubble(int[] list, boolean ascending) { // ./grademe.sh bubble int[] true
		if (list == null) return null;
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
		if (list == null) return null;
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
		if (list == null) return null;
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
		if (list == null) return null;
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
	public int[] selection(int[] list, boolean ascending) { // ./grademe.sh selection int[] true
		if (list == null) return null;
		for (int i = 0; i < list.length - 1; i++){
			int extIdx = i;
			for (int j = i + 1; j < list.length; j++) {
				if (ascending) {
					if (list[j] < list[extIdx]) {
						extIdx = j;
					}
				} else {
					if (list[j] > list[extIdx]) {
						extIdx = j;
					}
				}
			}
			int temp = list[i];
			list[i] = list[extIdx];
			list[extIdx] = temp;
		} return list;
	}

	// 10
	public ArrayList<String> selection(ArrayList<String> list, boolean ascending) { // ./grademe.sh selection "ArrayList<String>" true
		if (list == null) return null;
		for (int i = 0; i < list.size() - 1; i++){
			int extIdx = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (ascending) {
					if (list.get(j).compareTo(list.get(extIdx)) < 0) {
						extIdx = j;
					}
				} else {
					if (list.get(j).compareTo(list.get(extIdx)) > 0) {
						extIdx = j;
					}
				}
			}
			String temp = list.get(i);
			list.set(i, list.get(extIdx));
			list.set(extIdx, temp);
		} return list;
	}

	// 11
	public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) { // ./grademe.sh merge "ArrayList<Integer>" true
		if (list == null) return null;
		if (list.size() == 0 || list.size() == 1) return list;
		int mid = list.size() / 2;
		ArrayList<Integer> left = new ArrayList<Integer>();
		for (int i = 0; i < mid; i++) {
			left.add(list.get(i));
		}
		ArrayList<Integer> right = new ArrayList<Integer>();
		for (int i = mid; i < list.size(); i++) {
			right.add(list.get(i));
		}
		left = merge(left, ascending); right = merge(right, ascending);
		return combine(left, right, ascending);
	}

	public ArrayList<Integer> combine(ArrayList<Integer> left, ArrayList<Integer> right, boolean ascending) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int l, r; l = r = 0;
		while (l < left.size() || r < right.size()) {
			if (l < left.size() && r < right.size()) {
				if (ascending) {
					if (left.get(l) < right.get(r)) {
						output.add(left.get(l)); l++;
					} else {
						output.add(right.get(r)); r++;
					}
				} else {
					if (left.get(l) > right.get(r)) {
						output.add(left.get(l)); l++;
					} else {
						output.add(right.get(r)); r++;
					}
				}
			} else if (l < left.size()) {
				output.add(left.get(l)); l++;
			} else if (r < right.size()) {
				output.add(right.get(r)); r++;
			}
		} return output;
	}

	// 12
	public String[] merge(String[] list, boolean ascending) { // ./grademe.sh merge String[] true
		if (list == null) return null;
		if (list.length == 0 || list.length == 1) return list;
		int mid = list.length / 2;
		String[] left = new String[mid];
		for (int i = 0; i < mid; i++) {
			left[i] = list[i];
		}
		String[] right = new String[list.length - mid];
		for (int i = mid; i < list.length; i++) {
			right[i - mid] = list[i];
		}
		left = merge(left, ascending); right = merge(right, ascending);
		return combine(left, right, ascending);
	}

	public String[] combine(String[] left, String[] right, boolean ascending) {
		String[] output = new String[left.length + right.length];
		int l, r, o; l = r = o = 0;
		while (l < left.length || r < right.length) {
			if (l < left.length && r < right.length) {
				if (ascending) {
					if (left[l].compareTo(right[r]) < 0) {
						output[o] = left[l]; o++; l++;
					} else {
						output[o] = right[r]; o++; r++;
					}
				} else {
					if (left[l].compareTo(right[r]) > 0) {
						output[o] = left[l]; o++; l++;
					} else {
						output[o] = right[r]; o++; r++;
					}
				}
			} else if (l < left.length) {
				output[o] = left[l]; o++; l++;
			} else if (r < right.length) {
				output[o] = right[r]; o++; r++;
			}
		} return output;
	}
}