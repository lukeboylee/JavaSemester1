/* Determines if first money value is greater than second
* By Luke Boyle */

public class Money {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public static void main(String[] args){
        Money m1 = new Money(1, 1, true, '$');
        Money m2 = new Money(200, 10, true, '€');
        System.out.println(m1.greaterThan(m2));
    }

    public boolean greaterThan(Money m1){
        if(m1.positive == false && positive == true){
            return true;
        }

        if(m1.positive == true && positive == false){
            return false;
        }

        if(m1.positive == false && m1.positive == false){
            if(m1.wholeNumber > wholeNumber){
                return true;
            }
            if(m1.wholeNumber == wholeNumber){
                if(m1.decimalPart < decimalPart){
                    return true;
                }
            }
        }

        if(m1.positive == true && positive == true){
            if(m1.wholeNumber < wholeNumber){
                return true;
            }
            if(m1.wholeNumber == wholeNumber){
                if(m1.decimalPart < decimalPart){
                    return true;
                }
            }
        }
        return false;
    }
}
