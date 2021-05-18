// Program that takes 2 integers as input and prints their sum, product, concatenation, first to the power of the second
// Author : Luke Boyle

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){
        System.out.println("Integer 1:");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        System.out.println("Integer 2:");
        int num2 = in.nextInt();

        integerFun(num1, num2);
    }

    public static void integerFun(int num1, int num2){
        //Sum
        System.out.println("Sum : " + (num1+ num2));

        //Product
        System.out.println("Product : " + (num1 * num2));

        //Concatenation
        System.out.println("Concatenation : " + num1 + num2);

        //Power
        System.out.println("Power : " + (Math.pow(num1, num2)));
    }
}
