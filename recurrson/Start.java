// package recurrson;

public class Start { 

    static void recursivePrint(int n) {

        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        recursivePrint(n - 1);
        System.out.print(n + " ");
        
    }

    //reverse print
    static void recursivePrintReverse(int n) {

        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        
        System.out.print(n + " ");
        recursivePrintReverse(n - 1);
        
    }

    // sum of first n natural number
    static void sumofnumber(int n, int sum) {
        if (n == 0) {
            System.out.println("The sum is: " + sum);
            return;
        }
        sumofnumber(n - 1, sum + n);
    }


    // sum of digit of a number
    static void sumofDigit(int n, int sum) {
        if (n == 0){
            System.out.println("The sum of digit is: " + sum);
            return;
        }
        int lastDigit = n % 10;
        sumofDigit(n / 10, sum + lastDigit);
    }

    // reversea number
    static void reverseNumber(int n, int rev) {
          if (n == 0){
            System.out.println("The reversed number is: " + rev);
            return;
        }
        int lastDigit = n % 10;
        reverseNumber(n / 10, rev * 10 + lastDigit);
    }



    public static void main(String[] durga)
    {
        // print 1 to n
        int n = 5;
        // recursivePrint(n);
        // recursivePrintReverse(n);
        // sumofnumber(n, 0);
        sumofDigit(123, 0);
        reverseNumber(123, 0);
    }
    
}
