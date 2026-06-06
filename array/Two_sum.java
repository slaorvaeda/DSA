package array;

import java.util.HashMap;

public class Two_sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // approach 1: using brute force
        for (int i = 0; i < nums.length; i++) { // O(n)
            for (int j = i + 1; j < nums.length; j++) { // O(n)
                if (nums[i] + nums[j] == target) { // O(1)
                    System.out.println("The indices are: " + i + " and " + j); // O(1)
                    break;
                }   

            }
        }
        // then the time complexity of the above code is O(n^2) + O(1) + O(1) = O(n^2)
        // here space complexity is O(1) : 1 for i, 1 for j = 2 in total O(2) = O(1)


        // approach 2: using hash map
        HashMap<Integer, Integer> map = new HashMap<>(); // O(1)
        for (int i = 0; i < nums.length; i++) { // O(n)
            int complement = target - nums[i]; // O(1)
            if (map.containsKey(complement)) { // O(1)
                System.out.println("The indices are: " + map.get(complement) + " and " + i); // O(1)
                break;  
    
            }
            map.put(nums[i], i); // O(1)
        }
        // then the time complexity of the above code is O(n) + O(1) + O(1) + O(1) = O(n)
        // here space complexity is O(n) : n for hash map
    }
    
}
