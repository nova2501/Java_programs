package java_programs;

import java.util.Scanner;

public class binaryaddition {


        public static boolean ischeck(int n)
        {
            if((n&1)==1)
                return true;
            else
                return false;
        }
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int num= scanner.nextInt();
            boolean result=ischeck( num);
            if (result==true)
            {
                System.out.println("this is odd number");
            }
            else
                System.out.println("this is even number");

        }
    }



