import java.util.HashSet;
import java.util.Scanner;

/**
 * Given an array arr of n integers, write a function that returns true if there
 * is a triplet (a, b, c) from the array (where a, b, and c are on different
 * indexes) that satisfies a2 + b2 = c2, otherwise return false.
 */
public class PythaoreanTriplet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element no. " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        if (checkTriplet(array, size)) {
            System.out.println("Pythagorean triplet exists");
        } else {
            System.out.println("No pythagorian triplet found !");
        }

        sc.close();
    }

    public static boolean checkTriplet(int[] array, int size) {
        HashSet<Integer> a = new HashSet<>();
        for (int y : array) {
            a.add(y * y);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    int sum = (array[i] * array[i]) + (array[j] * array[j]);
                    if (a.contains(sum))
                        return true;
                }
            }
        }
        return false;
    }
}