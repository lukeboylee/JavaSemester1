// Java program to print the even numbers between 0 and 100
// Author : Luke Boyle

public class Q4 {

    public static void main(String[] args){
        String evens = "";

        for(int i=0; i<=100; i++){
            if(i%2 == 0){
                evens += i + ", ";
            }
        }
        System.out.println(evens);
    }
}
