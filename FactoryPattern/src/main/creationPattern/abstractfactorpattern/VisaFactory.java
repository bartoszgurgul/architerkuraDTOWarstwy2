package main.creationPattern.abstractfactorpattern;

import main.creationPattern.abstractfactorpattern.card.CreditCard;
import main.creationPattern.abstractfactorpattern.card.VisaBlackCreditCard;
import main.creationPattern.abstractfactorpattern.card.VisaGoldCreditCard;
import main.creationPattern.abstractfactorpattern.validator.Validator;
import main.creationPattern.abstractfactorpattern.validator.VisaValidator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType){
            case GOLD :
                return new VisaGoldCreditCard();

            case PLATINUM :
                return new VisaBlackCreditCard();


        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType){
            case GOLD -> {
                return new VisaValidator();
            }
            case PLATINUM -> {
                return new VisaValidator();
            }
        }
        return null;
    }
}
