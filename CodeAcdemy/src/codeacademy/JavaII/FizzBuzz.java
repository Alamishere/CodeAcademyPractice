package codeacademy.JavaII;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzbuzz(100));
    }

    public static ArrayList fizzbuzz(int n) {
        ArrayList<Object> fizzbuzz = new ArrayList<Object>();
        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzbuzz.add("FizzBuzz");
            }else if (i % 3 == 0) {
                fizzbuzz.add("Fizz");
            }else if (i % 5 == 0) {
                fizzbuzz.add("Buzz");
            }else{
                fizzbuzz.add(i);
            }
        } return fizzbuzz;
    }
}