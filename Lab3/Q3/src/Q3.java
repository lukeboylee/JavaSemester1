// Constructor for the money class
// Author : Luke Boyle

public class Q3 {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public Q3(int wholeNumber, int decimalPart, boolean positive, char currencySymbol){
        this.wholeNumber = wholeNumber;
        this.decimalPart = decimalPart;
        this.positive = positive;
        this.currencySymbol = currencySymbol;
    }

    public static void main(String[] args){
        try {
            Q3 m = new Q3(1,1,true,'€');
            System.out.println("Success");
        } catch (IllegalArgumentException ex) {
            System.out.println("Failure");
        }
    }
}
