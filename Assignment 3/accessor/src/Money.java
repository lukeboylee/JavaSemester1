//Program to use accessors
//By Luke Boyle

public class Money {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public static void main(String[] args){
        Money m = new Money(1,2,true,'$');
        System.out.println(m.getWholeNumber());
    }

    public int getWholeNumber(){
        return wholeNumber;
    }

    public int getDecimalPart(){
        return decimalPart;
    }

    public boolean isPositive(){
        return positive;
    }

    public char getCurrencySymbol(){
        return currencySymbol;
    }
}
