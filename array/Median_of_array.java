package array;

public class Median_of_array {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        // approach 1: using merge sort
        int[] merged = new int[nums1.length + nums2.length]; // O(n + m)
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) { // O(n + m)
            if (nums1[i] < nums2[j]) { // O(1)
                merged[k++] = nums1[i++]; // O(1)
            } else {
                merged[k++] = nums2[j++]; // O(1)
            }
        }

        while (i < nums1.length) { // O(n)
            merged[k++] = nums1[i++]; // O(1)
        }

        while (j < nums2.length) { // O(m)
            merged[k++] = nums2[j++]; // O(1)
        }

        double median;
        int totalLength = merged.length; // O(1)

        if (totalLength % 2 == 0) { // O(1)
            median = (merged[totalLength / 2 - 1] + merged[totalLength / 2]) / 2.0; // O(1)
        } else {
            median = merged[totalLength / 2]; // O(1)
        }

        System.out.println("The median is: " + median); // O(1)

        // then the time complexity of the above code is O(n + m) + O(n + m) + O(1) + O(1) + O(1) + O(1) + O(1) = O(n + m)
        // here space complexity is O(n + m) : n for merged array
    }
}