import java.lang.*;

public class intfun {

    public static void main(String[] args){
        integerFun(2,3);
    }

    public static void integerFun(int a, int b){
        System.out.println("Sum: "+ (a + b));
        System.out.println("Product: "+ a*b);
        System.out.println("Concatenation: "+ a + b);
        System.out.println("Power: " + (Math.pow(a,b)) );

    }
}
