public class Money {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public static void main(String[] args){
        try {
            Money m = new Money(1,1,true,'€');
            System.out.println("Success");
        } catch (IllegalArgumentException ex) {
            System.out.println("Failure");
        }
    }

    Money(int euro, int cents, boolean pos, char symbol){
        if(cents >= 100 || cents < 0){
            throw new IllegalArgumentException("Failure");
        }
        if(euro <0){
            throw new IllegalArgumentException("Failure");
        }
        if(symbol != '$' && symbol != '£' && symbol != '€'){
            throw new IllegalArgumentException("Failure");
        }

    }
}
