package main.creationPattern.abstractfactorpattern.validator;

import main.creationPattern.abstractfactorpattern.card.CreditCard;

public class VisaValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
