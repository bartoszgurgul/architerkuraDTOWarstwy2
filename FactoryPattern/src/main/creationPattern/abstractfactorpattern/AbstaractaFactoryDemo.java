package main.creationPattern.abstractfactorpattern;

import main.creationPattern.abstractfactorpattern.card.CreditCard;

public class AbstaractaFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(creditCard);

        CreditCardFactory creditCardFactory1 = CreditCardFactory.getCreditCardFactory(800);
        CreditCard creditCard1 = creditCardFactory.getCreditCard(CardType.GOLD);
        System.out.println(creditCard1);
    }
}
