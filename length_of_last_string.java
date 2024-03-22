package java_programs;

import java.util.Arrays;
import java.util.Scanner;

public class length_of_last_string {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String name= scanner.nextLine();
            System.out.println(Arrays.toString(name.split(" ")));
            String[] words=name.split( " ");
            System.out.println(words.length);
            String lwords=words[words.length-1];
            System.out.println(lwords);
            System.out.println(lwords.length());

        }
    }


