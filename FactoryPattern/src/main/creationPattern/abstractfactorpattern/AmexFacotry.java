package main.creationPattern.abstractfactorpattern;

import main.creationPattern.abstractfactorpattern.card.AmexGoldCreditCard;
import main.creationPattern.abstractfactorpattern.card.AmexPlatinumCreditCard;
import main.creationPattern.abstractfactorpattern.card.CreditCard;
import main.creationPattern.abstractfactorpattern.validator.AmexGoldValidator;
import main.creationPattern.abstractfactorpattern.validator.Validator;

public class AmexFacotry extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD -> {
                return new AmexGoldCreditCard();
            }
            case PLATINUM -> {
                return new AmexPlatinumCreditCard();
            }
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD -> {
                return new AmexGoldValidator();
            }
            case PLATINUM -> {
                return new AmexGoldValidator();
            }
        }
        return null;
    }
}
