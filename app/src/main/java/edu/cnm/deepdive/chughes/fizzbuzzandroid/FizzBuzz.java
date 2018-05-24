package edu.cnm.deepdive.chughes.fizzbuzzandroid;

public class FizzBuzz {

    public static final int MAX_COUNT = 100;

    public static void main(String[] args) {
        for (int i = 0; i < MAX_COUNT; i++) {
            System.out.println(count(i+1));
        }
    }

    public static String count(int i) {
        if (i % 15 == 0){
            return "FizzBuzz";
        }
        if (i % 3 == 0){
            return "Fizz";
        }
        if (i % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
