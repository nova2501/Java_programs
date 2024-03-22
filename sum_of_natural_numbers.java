package java_programs;

import java.util.Scanner;

public class sum_of_natural_numbers {
    static int findnat(int n) {
        int sum = 0;
        if(n==0)
            return n;
        else if(n==1)
            return n;
        else {
            sum = n + findnat(n - 1);
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scanner.nextInt();
        int natural=findnat(n);
        System.out.println(natural);
    }
}


