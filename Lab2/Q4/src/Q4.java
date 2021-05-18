// Program to replace all occurrences of 'my' in a string with 'your'
// Author : Luke Boyle

public class Q4 {
    public static void main(String[] args){
        String input1 = "hello";
        String input2 = "my name is Bill";
        String input3 = "this is my favourite language";

        //Prints original strings
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);

        //Replace
        String output1 = input1.replace("my" , "your");
        String output2 = input2.replace("my" , "your");
        String output3 = input3.replace("my" , "your");

        //Print outputs
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }
}
