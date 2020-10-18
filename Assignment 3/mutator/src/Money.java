//mutator

public class Money {
    int wholeNumber;
    int decimalPart;
    boolean positive;
    char currencySymbol;

    //Mutator
    public void setWholeNumber(int wholeNumber) {
        if (wholeNumber < 0) {
            throw new IllegalArgumentException("Failed");
        } else {
            this.wholeNumber = wholeNumber;
        }
    }

    public void setDecimalPart(int decimalPart) {
        if (decimalPart < 0 || decimalPart > 100) {
            throw new IllegalArgumentException("Failed");
        } else {
            this.decimalPart = decimalPart;
        }
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }

    public void setCurrencySymbol(char currencySymbol) {
        if (currencySymbol != '$' && currencySymbol != '£' && currencySymbol != '€') {
            throw new IllegalArgumentException("Failure");
        } else {
            this.currencySymbol = currencySymbol;
        }
    }
}
