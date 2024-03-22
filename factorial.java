package java_programs;

import java.util.Scanner;

public class factorial {
        static  int findfact(int n)
        {
            if(n==1)
                return 1;
            else if(n>1)
                return n*findfact(n-1);
            else
                return -1;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int factorial = findfact(n);
            if (factorial != -1)
                System.out.println("the factorial of given number " + n + " is " + factorial);
            else
                System.out.println(0);
        }
    }


