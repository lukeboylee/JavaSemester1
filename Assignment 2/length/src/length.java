public class length {

    public static void main(String[] args){
        printString("This\nis\na\nString\non\ndifferent\nlines");
    }

    public static void printString(String s){
        System.out.println(s);

        System.out.println("Contains " + s.length() + " characters");
    }
}
