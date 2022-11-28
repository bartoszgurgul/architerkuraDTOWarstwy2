package main.creationPattern.abstractfactorpattern.validator;

import main.creationPattern.abstractfactorpattern.card.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
