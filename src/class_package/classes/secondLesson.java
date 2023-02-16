package class_package.classes;

import java.util.Locale;
import java.util.Scanner;

public class secondLesson {
    public static void main(String[] args) {
        /*String string = "abc";
        System.out.println(string);

        System.out.println(string.length()); // 3
        System.out.println(string.concat("def")); //abcdef = "abc" + "def"
        System.out.println(string); // abc

        System.out.println(string.equals("abs"));// false

        System.out.println(string.indexOf("a")); //0
        System.out.println(string.toUpperCase()); //ABC
        System.out.println(string.toLowerCase()); //abc

        //System.out.println(string.substring(1)); //bc
        // System.out.println(string.substring(1, 2));//b

        System.out.println(string.replace("b", "v")); //avc

        String month = "april";
        boolean nameon = month.contains("ap");// true
        boolean isEqualsStr = month.equals("ap"); // april != "ap" ==> false
        System.out.println(isEqualsStr);
        System.out.println(nameon);*/

        Scanner scan = new Scanner((System.in));
        System.out.println("Please enter the string");
        String string = scan.next();

        //String string = "Банан";
        string = string.toUpperCase(Locale.ROOT);
        StringBuffer sb = new StringBuffer(string);
        sb.reverse();
        System.out.println(sb);
        String reversString = sb.toString();

        if (string.equals(string)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}