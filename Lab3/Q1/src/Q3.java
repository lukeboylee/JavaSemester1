// toString method for a money class
// Author : Luke Boyle

public class Q3 {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    public static void main(String[] args){
        Q3 bank = new Q3();
        bank.wholeNumber = 373;
        bank.decimalPart = 17;
        bank.positive = false;
        bank.currencySymbol = '$';
        System.out.println(bank.toString());
    }

    @Override
    public String toString(){
        String money = "";

        if(!positive){
            money += "-";
        }

        money += currencySymbol;
        money += wholeNumber + ".";
        money += decimalPart;
        return money;
    }
}
