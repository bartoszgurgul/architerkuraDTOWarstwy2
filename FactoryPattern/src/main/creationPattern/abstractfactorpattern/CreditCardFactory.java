package main.creationPattern.abstractfactorpattern;

import main.creationPattern.abstractfactorpattern.card.CreditCard;
import main.creationPattern.abstractfactorpattern.validator.Validator;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650)
            return new AmexFacotry();
        else
            return new VisaFactory();
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
