// equals() method for money class
// Author : Luke Boyle

public class Q2 {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public static void main(String[] args){
        Q2 m1 = new Q2();
        m1.wholeNumber = 52;
        m1.decimalPart = 1;
        m1.positive = false;
        m1.currencySymbol = '€';

        Q2 m2 = new Q2();
        m2.wholeNumber = 2;
        m2.decimalPart = 10;
        m2.positive = true;
        m2.currencySymbol = '$';

        System.out.println(m1.equals(m2));
    }

    public boolean equals(Q2 b){
        if(wholeNumber != b.wholeNumber){
            return false;
        }
        if(decimalPart != b.decimalPart){
            return false;
        }
        if(positive != b.positive){
            return false;
        }
        if(currencySymbol != b.currencySymbol){
            return false;
        }
        return true;
    }
}
