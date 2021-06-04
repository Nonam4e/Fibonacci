package sample;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 1;
        for ( int i = 0; i <= 20; i++ ) {
            System.out.println(a);
            System.out.println(b);
            a += b;
            b += a;
        }
    }
}