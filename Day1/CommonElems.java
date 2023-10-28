import java.util.ArrayList;

public class CommonElems {

	// main method
	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 4, 6, 7, 9 };
		int[] arr2 = { 1, 2, 4, 5, 9, 10 };

		// ArrayList<Integer> commonElems = findCommonElems(arr1, arr2);
		ArrayList<Integer> commonElems = findCommonElemsOptimized(arr1, arr2);

		for (int i : commonElems)
			System.out.print(i + " ");

	}

	// function to find common elements
	// O(n^2)
	public static ArrayList<Integer> findCommonElems(int[] a1, int[] a2) {

		ArrayList<Integer> commonArrayList = new ArrayList<Integer>();

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j])
					commonArrayList.add(a1[i]);
			}
		}
		return commonArrayList;
	}

	// function to find common elements (both arrays must be sorted)
	// two pointer approach
	public static ArrayList<Integer> findCommonElemsOptimized(int[] a1, int[] a2) {

		ArrayList<Integer> common = new ArrayList<Integer>();

		int i = 0, j = 0;

		while (i != a1.length && j != a2.length) {

			if (a1[i] == a2[j]) {
				common.add(a1[i]);
				i++;
				j++;
			} else if (a1[i] < a2[j])
				i++;
			else
				j++;
		}

		return common;
	}
}
