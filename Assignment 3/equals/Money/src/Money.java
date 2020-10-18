public class Money {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public static void main(String[] args){
        Money m = new Money();
        m.wholeNumber = 2;
        m.decimalPart = 10;
        m.positive = true;
        m.currencySymbol = '$';
        System.out.println(m.equals(m));
    }

    public boolean equals(Money m1, Money m2){
        if(m1.positive != m2.positive){
            return false;
        }

        if(m1.wholeNumber != m2.wholeNumber){
            return false;
        }

        if(m1.decimalPart != m2.decimalPart){
            return false;
        }

        if(m1.currencySymbol != m2.currencySymbol){
            return false;
        }

        return true;
    }
}
