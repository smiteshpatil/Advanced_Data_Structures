import java.util.HashMap;

public class MostFreqOccuring {

	public static void main(String[] args) {

		int[] array = { 1, 3, 1, 3, 2, 1, 4, 4, 4, 4, 4, 4 };

		// Integer mostFreqEle = findMostFreqEle(array);
		Integer mostFreqEle = findMostFreqUsingHM(array);
		System.out.println(mostFreqEle);
	}

	// naive solution O(n^2)
	public static Integer findMostFreqEle(int[] array) {

		// if array is empty return null
		if (array.length == 0)
			return null;

		int mostFreqEle = 0, prevCount = 0, currCount = 0;
		;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length - 1; j++) {

				if (array[i] == array[j])
					currCount++;
			}

			if (currCount > prevCount) {
				mostFreqEle = array[i];
				prevCount = currCount;
			}

		}

		return mostFreqEle;
	}

	// optimized using hashMap O(n)

	public static Integer findMostFreqUsingHM(int[] array) {

		int mostFreqEle = 0, count = 0;

		if (array.length == 0)
			return null;

		// create a hashMap key(array element) value => count
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : array) {
			if (map.putIfAbsent(i, 1) != null) {
				map.put(i, map.get(i) + 1);
			}
			if (map.get(i) > count) {

				mostFreqEle = i;
				count = map.get(i);
			}
		}

		return mostFreqEle;
	}
}
