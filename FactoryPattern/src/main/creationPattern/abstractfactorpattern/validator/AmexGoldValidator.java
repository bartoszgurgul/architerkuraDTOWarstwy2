package main.creationPattern.abstractfactorpattern.validator;

import main.creationPattern.abstractfactorpattern.card.CreditCard;

public class AmexGoldValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
