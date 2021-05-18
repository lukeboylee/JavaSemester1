// Program to print a triangle given height and character to make it out of
// Author : Luke Boyle

public class Q7{
    public static void main(String[] args){
        System.out.print("");
        printTriangle(5, '*');
    }

    public static void printTriangle(int size, char sym){

        for(int i=1; i<=size; i++){
            for(int j=1; j<=i; j++){
                System.out.print(sym + " ");
            }
            System.out.print("\n");
        }
    }
}
