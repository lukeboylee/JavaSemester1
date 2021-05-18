// Java program that prints all the numbers between 1 and 500 that are divisible by either 3 or 5
// Author : Luke Boyle

public class Q5 {

    public static void main(String[] args){

        String numbers = "";

        for(int i=1; i<=500; i++){
            //If divisible by 3
            if(i%3 == 0){
                numbers += i + ", ";
            }

            //If divisible by 5 but not by 3 - stops duplicates
            if(i%5 == 0 && i%3 != 0){
                numbers += i + ", ";
            }
        }
        System.out.println(numbers);
    }
}
