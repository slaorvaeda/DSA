package array;

import java.lang.reflect.Array;

public class Pra {
    public static void main(String[] arags) {

        // find the largest element in the array
        int[] arr = { 1, 2, 3, 4, 5 }; // O(n)

        // approch 1:sort the array and then get the last element
        // Array.sort(arr); // O(n log n)
        // int max = arr[arr.length - 1];// O(1)

        // System.out.println("The largest element in the array is: " + max);

        // then the time complexity of the above code is O(n log n) + O(1) = O(n log n)
        // = wich is very bad

        // aproch 2: on traversing the array only once
        int max = arr[0];// O(1)
        for (int i = 1; i < arr.length; i++) {// O(n)
            if (arr[i] > max) {// O(1)
                max = arr[i];// O(1)
            }
        }
        System.out.println("The largest element in the array is: " + max);// O(1)

        // then the time complexity of the above code is O(n) + O(1) + O(n) + O(1) +
        // O(1) = O(n)

        // find the minimal element in the array
        int min = arr[0];// O(1)
        for (int i = 1; i < arr.length; i++) {// O(n)
            if (arr[i] < min) {// O(1)
                min = arr[i];// O(1)
            }

        }
        System.out.println("The minimal element in the array is: " + min);// O(1)

        // then the time complexity of the above code is O(n) + O(1) + O(n) + O(1) +
        // O(1) = O(n)

        // find the second largest element in the array
        int second = arr[0];// O(1)
        for (int i = 1; i < arr.length; i++) {// O(n)
            if (arr[i] > second && arr[i] < max) {// O(1)
                second = arr[i];// O(1)

            }
        }
        System.out.println("The second largest element in the array is: " + second);// O(1)

        // then the time complexity of the above code is O(n) + O(1) + O(n) + O(1) +
        // O(1) = O(n)
        // here spcace complexity is O(1) : 1: for max, 1 for second, 1 for min, 1 for i
        // = 4 in total O(4) = O(1)

        // find large and small element in the array
        // approch 1: sort the array and then get the first and last element

        // approch 2: on traversing the array only once

        int max1 = arr[0];// O(1)
        int min1 = arr[0];// O(1)
        for (int i = 1; i < arr.length; i++) {// O(n)
            if (arr[i] > max1) {// O(1)
                max1 = arr[i];// O(1)
            } else if (arr[i] < min1) {// O(1)
                min1 = arr[i];// O(1)
            }

        }
        System.out.println("The largest element in the array is: " + max1);
        System.out.println("The smallest element in the array is: " + min1);
        // then the time complexity of the above code is O(n) + O(1) + O(n) + O(1) +
        // O(1) = O(n)
        // here spcace complexity is O(1) : 1: for max, 1 for min, 1 for i = 4 in total
        // O(4) = O(1)

    }
}