// package Recursion;

public class Fibonacci {

    static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    static void fibseries(int n){
        if (n == 0){
            System.out.print(0 + " ");
            return;
        }
        if (n == 1){
            System.out.print(0 + " " + 1 + " ");
            return; 
        }
        fibseries(n - 1);
        System.out.print(fib(n) + " ");
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
        fibseries(6);
    }
}
