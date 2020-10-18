public class triangle {

    public static void main(String[] args){
        printTriangle(10, 't');
    }

    public static void printTriangle(int h, char x){
        if(h >= 2 && h <= 10){
            for(int i=1;i<=h;i++){
                for(int j=1;j<=i;j++){
                    System.out.printf("%c ", x);
                }
                System.out.printf("\n");
            }
        }
        else{
            System.out.println("Not valid input");
        }
    }
}
