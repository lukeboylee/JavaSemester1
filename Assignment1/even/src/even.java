public class even {
    public static void main(String[] args){

        String evens = "";  //empty string to store even numbers

        //runs through and checks if number is divisible by 2 - if it is then it adds it to the list of even numbers
        for(int i=0;i<=100;i++) {
            if (i % 2 == 0) {
                evens = evens + i + " ";
            }
        }
        //prints even number list
        System.out.println(evens);
        }
    }

