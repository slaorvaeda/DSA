package array;

import java.util.Arrays;

public class Reverse {
    
    public static void main(String[] args) {
        // Reverse an array
        int[] arr = { 1, 2, 3, 4, 5 };

        // approch 1: create a new array and store the elements in reverse order

        int[] rev = new int[arr.length];// O(n)
        for (int i = 0; i < arr.length; i++) {// O(n)
            rev[i] = arr[arr.length - 1 - i];// O(1)
        }
        // print the reversed array
        for (int i = 0; i < rev.length; i++) {// O(n)
            System.out.print(rev[i] + " ");// O(1)
        }

        // then the time complexity of the above code is O(n) + O(n) + O(1) + O(n) + O(1)= O(n)
        // here space complexity is O(n) : n for rev array





        // approch 2: reverse the array in place
        // we will use two pointers, one at the start and one at the end of the array, and we will swap the elements at these pointers until they meet
        int start = 0;// O(1)
        int end = arr.length - 1;// O(1)
        while (start < end) {// O(n/2)
            // swap the elements at start and end
            int temp = arr[start];// O(1)
            arr[start] = arr[end];// O(1)
            arr[end] = temp;// O(1)
            start++;// O(1)
            end--;// O(1)   
    }
        // print the reversed array
        for (int i = 0; i < arr.length; i++) {// O(n)
            System.out.print(arr[i] + " ");// O(1)
        }

        // then the time complexity of the above code is O(n/2) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(n) + O(1)= O(n)
        // here space complexity is O(1) : 1 for temp, 1 for start, 1 for end = 3 in total O(3) = O(1)


        // lets everce half of the array
        start = 0;// O(1)
        end = arr.length / 2 - 1;// O(1)
        while (start < end) {// O(n/4)
            // swap the elements at start and end
            int temp = arr[start];// O(1)
            arr[start] = arr[end];// O(1)
            arr[end] = temp;// O(1)
            start++;// O(1)
            end--;// O(1)   


    }
        // print the reversed array
        for (int i = 0; i < arr.length; i++) {// O(n)
            System.out.print(arr[i] + " ");// O(1)
        }

        // then the time complexity of the above code is O(n/4) + O(1) + O(1) + O(1) + O(1) + O(1) + O(1) + O(n) + O(1)= O(n)
        // here space complexity is O(1) : 1 for temp, 1 for start, 1 for end = 3 in total O(3) = O(1)
}
}
