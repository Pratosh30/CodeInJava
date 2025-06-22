//write a java program for a binary search in an array and input should be taken by a user

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element for binary search:");
        int target = scanner.nextInt();

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Target element not found in the array.");
        } else {
            System.out.println("Target element found at index " + result + " in the array.");
        }
    }

    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}














