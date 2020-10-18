public class reverseupper {

    public static void main(String[] args){
        String s = reverseChangeCase("my name is jane");
        System.out.println(s);
    }

    public static String reverseChangeCase(String s){

        //Convert new String to an array of characters
        char[] array1 = s.toCharArray();

        //Reverse
        String reverse = "";

        for(int i=s.length()-1;i>=0;i--){
            reverse = reverse + array1[i];  //concatenates array into the string
        }

        //Capitalise
        s = reverse.toUpperCase();

        //print string
        return s;
    }
}
