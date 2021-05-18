// Program to reverse the string, converts it to uppercase, return the result
// Author : Luke Boyle

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        System.out.println("Enter the string you want to convert:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String output = reverseChangeCase(input);
        System.out.println(output);
    }

    public static String reverseChangeCase(String input){

        //Convert to character array
        char[] inputToArray = input.toCharArray();

        //Reverse
        String reverse = "";
        for(int i=inputToArray.length-1; i>=0; i--){
            reverse += inputToArray[i];
        }

        //Convert to uppercase
        String outputUpper = reverse.toUpperCase();

        return outputUpper;
    }
}
