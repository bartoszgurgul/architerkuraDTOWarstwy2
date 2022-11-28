package main.creationPattern.abstractfactorpattern.card;

public abstract class CreditCard {
    protected int cardNumberLength;
    protected int cscNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public CreditCard setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
        return this;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public CreditCard setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
        return this;
    }
}
