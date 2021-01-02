package com.tyoma17.algorithms;

public class Recursion {

    public static int factorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

}
