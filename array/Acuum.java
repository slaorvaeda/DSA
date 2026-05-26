package array;

public class Acuum {
    public static void main(String[] args) {
        // Acuumulator pattern: means a variable that i sused to store the result

        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;// O(1)
        for (int i = 0; i < arr.length; i++) {// O(n)
            sum += arr[i];// O(1)
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        // then the time complexity of the above code is O(n) + O(1) + O(n) + O(1) =
        // O(n)
        // here space complexity is O(1) : 1 for sum, 1 for i = 2 in total O(2) = O(1)

        // Running Computation Pattern :You keep updating something while traversing.
        // eg: sum,max,min,frequency,product,prefix sum etc
        // This pattern appears in:Sliding Window,Prefix Sum,DP,Graph algorithms

        // practice q1: count the number of even and odd elements in the array
        int evenCount = 0;// O(1)
        int oddCount = 0;// O(1)
        for (int i = 0; i < arr.length; i++) {// O(n)
            if (arr[i] % 2 == 0) {// O(1)
                evenCount++;// O(1)
            } else {
                oddCount++;// O(1)
            }
        }
        System.out.println("The number of even is: " + evenCount);
        System.out.println("The number of odd is: " + oddCount);
    }

}
