package array;

import java.util.Scanner;

public class Pallendrom {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int strlen = str.length();
        boolean isPallindrome = true;


        // approach 1: using two pointers  
        int left = 0;
        int right = strlen - 1;

        while(left  < right){// O(n/2)
            if (str.charAt(left) != str.charAt(right)){ // O(1)
                isPallindrome = false; // O(1)
                break;
            }
            left++;
            right--;
        }

        if (isPallindrome) { // O(1)
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // then the time complexity of the above code is O(n/2) + O(1) + O(1) + O(1) + O(1) = O(n)
        // here space complexity is O(1) : 1 for left, 1 for right, 1 for isPallindrome = 3 in total O(3) = O(1)

        // approach 2: reverse the string and compare it with the original string
        String rev = "";
        for (int i = strlen - 1; i >= 0; i--) {// O(n)
            rev += str.charAt(i);   

        }
        if (str.equals(rev)) { // O(n)
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // then the time complexity of the above code is O(n) + O(n) = O(n)
        // here space complexity is O(n) : n for rev string
    }
}
