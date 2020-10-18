public class replace {
    public static void main(String args){
        printString("This is my longer string");
    }

    public static void printString(String s){
        System.out.println(s);

        String replaced = s.replace("my","your");
        System.out.println(replaced);
    }
}