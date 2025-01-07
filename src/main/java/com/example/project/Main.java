package com.example.project;
public class Main {
    public static void main(String[] args) {
        Fibonacci fib3 = new Fibonacci(5);
        System.out.println(fib3.fibonacciString());
        
        int[] seq3 = fib3.getSequence();
        seq3[0] = 100;
        
        System.out.println(fib3.fibonacciString());        
    }
}