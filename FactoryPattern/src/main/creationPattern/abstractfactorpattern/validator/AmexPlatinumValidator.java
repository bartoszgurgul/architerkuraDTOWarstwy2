package main.creationPattern.abstractfactorpattern.validator;

import main.creationPattern.abstractfactorpattern.card.CreditCard;

public class AmexPlatinumValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
