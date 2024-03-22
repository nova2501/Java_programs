package java_programs;

import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {
        String name1="The sky in blue";
        String name4="   venki";
        System.out.println(name1.toUpperCase());
        System.out.println(name4.strip());
        System.out.println(Arrays.toString(name1.split("")));
        System.out.println(name1.charAt(5));
        System.out.println(name1.lastIndexOf("a"));

    }
}
