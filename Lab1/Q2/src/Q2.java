// Java program to print all of the prime numbers less than 1000
// Author : Luke Boyle

public class Q2 {
    public static void main(String[] args){

        int numToCheck, count;
        String primes = "";

        //Outer loop to find number we're checking
        for(numToCheck=2; numToCheck<=1000; numToCheck++){
            boolean isPrime = true;

            //Inner loop to check it against divisors lower than it
            for(int divisor=2; divisor<=(numToCheck/2); divisor++) {

                if (numToCheck % divisor == 0) {  //If it divides evenly - not prime
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                primes += numToCheck + ", ";
            }
        }
        System.out.println(primes);
    }
}
