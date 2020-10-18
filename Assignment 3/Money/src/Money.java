//Program to take a class of values about a certain quantity of money and return it as a single string
//By Luke Boyle

public class Money {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public static void main(String[] args){
        Money m = new Money();
        m.wholeNumber = 2;
        m.decimalPart = 10;
        m.positive = false;
        m.currencySymbol = '$';
        System.out.println(m.toString());
    }

    public String toString(){
        String value = "";  //empty string

        //if negative number
        if(positive==false){
            value = value + '-';
        }

        //adds the currency symbol
        value = value + currencySymbol + wholeNumber + '.';

        String cents = String.format("%02d", decimalPart);

        value = value + cents;
        return value;
    }
}

