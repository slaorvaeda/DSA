package array;

public class Searching {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;

        // approch 1: linear search
        for (int i = 0; i < arr.length; i++) {// O(n)
            if (arr[i] == target) { // O(1)
                System.out.println("Element found at index: " + i); // O(1)
                break;
            }
        }
        // then the time complexity of the above code is O(n) + O(1) + O(n) + O(1) = O(n)
        // here space complexity is O(1) : 1 for i, 1 for

        // approch 2: binary search (only works on sorted arrays)
        int left = 0;// O(1)
        int right = arr.length - 1;// O(1)
        while (left <= right) {// O(log n)
            int mid = left + (right - left) / 2;// O(1)
            if (arr[mid] == target) {// O(1)
                System.out.println("Element found at index: " + mid);// O(1)
                break;
            } else if (arr[mid] < target) {// O(1)
                left = mid + 1;// O(1)
            } else {
                right = mid - 1;// O(1)
            }
        }

        // then the time complexity of the above code is O(log n) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) = O(log n)
        // here space complexity is O(1) : 1 for left, 1 for
    }
}
