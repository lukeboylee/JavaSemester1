public class prime {
    public static void main(String[] args) {

        int check;  //number to be checked - start at 3 because one and two aren't prime but will flag as prime
        int i;
        int count;

        String primes = ""; //empty string to store primes

        for(check=2;check<=1000;check++){  //checks from 2 - 1000
            count = 0;  //sets count to 0 after change in number

            for(i=2;i<check;i++){ //starts dividing the number - increments by 1 each time
                if(check%i == 0){  //if the number divides evenly
                    count++;  //count of divisors increases
                }
            }
            if (count == 0){  //if no divisors except for itself and 1
                primes = primes + check + " ";  //add to list of primes
            }

        }
        System.out.println(primes);  //print list
    }
}
