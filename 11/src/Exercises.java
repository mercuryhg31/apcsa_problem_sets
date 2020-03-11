import java.util.ArrayList;

public class Exercises { // TODO test all with yet to be provided grademe.sh

	public int findMe(int[] list, int target) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		} return -1;
	}

	public int findMe(ArrayList<String> list, String target) {
		if (target.equals(null)) return -1;
		for (int i = 0; i < list.size(); i++) {
			if (target.equals(list.get(i))) return i;
		} return -1;
	}

	public int findMeFaster(ArrayList<Integer> list, int target) {
		if (list.isEmpty()) return -1;
		Collections.sort(list);
		int start = 0; int end = list.size() - 1; int middle = 0;
		while (middle != target) {
			middle = (start + end) / 2;
			if (middle == 0 || middle == list.size()) return -1;
			if (middle < target) {
				end--;
			} else if (middle > target) {
				start++;
			} else {
				return middle;
			}
		}
	}

	public int findMeFaster(String[] list, String target) {
		return -1;
	}

	public int[] bubble(int[] list, boolean ascending) {
		return null;
	}

	public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
		return null;
	}

	public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
		return null;
	}

	public String[] insertion(String[] list, boolean ascending) {
		return null;
	}

	public int[] selection(int[] list, boolean ascending) {
		return null;
	}

	public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
		return null;
	}

	public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
		return null;
	}

	public String[] merge(String[] list, boolean ascending) {
		return null;
	}
}