// greaterThan method for the money class
// Author : Luke Boyle

public class Q6 {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public Q6(int wholeNumber, int decimalPart, boolean positive, char currencySymbol){
        this.wholeNumber = wholeNumber;
        this.decimalPart = decimalPart;
        this.positive = positive;
        this.currencySymbol = currencySymbol;
    }

    public static void main(String[] args){
        Q6 m1 = new Q6(1, 1, true, '$');
        Q6 m2 = new Q6(200, 10, true, '€');
        System.out.println(m1.greaterThan(m2));
    }

    public boolean greaterThan(Q6 m2){
        //If m1 is positive and m2 is negatve
        if(positive && !m2.positive){
            return true;
        }
        //If m1 is negative and m2 is positive
        if(!positive && m2.positive){
            return true;
        }

        //If both positive
        if(positive && m2.positive){
            if(wholeNumber > m2.wholeNumber){
                return true;
            }
            if(wholeNumber < m2.wholeNumber){
                return false;
            }
            //If they're equal - check decimal
            if(wholeNumber == m2.wholeNumber){
                if(decimalPart <= m2.decimalPart){
                    return false;
                }else{
                    return true;
                }
            }
        }

        //If both negative
        if(!positive && !m2.positive){
            if(wholeNumber > m2.wholeNumber){
                return false;
            }
            if(wholeNumber < m2.wholeNumber){
                return true;
            }
            //If they're equal - check decimal
            if(wholeNumber == m2.wholeNumber){
                if(decimalPart <= m2.decimalPart){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
