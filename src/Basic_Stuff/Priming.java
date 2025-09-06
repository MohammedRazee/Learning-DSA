package Basic_Stuff;

import java.util.Scanner;
import java.io.*;

public class Priming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(checkPrime(n));

    }

    static boolean checkPrime(int num) {
        if (num <= 2) return true;

        int i = 2;
        while (i * i < num) {
            if (num % i == 0) return false;
            ++i;
        }
        return true;
    }
}
