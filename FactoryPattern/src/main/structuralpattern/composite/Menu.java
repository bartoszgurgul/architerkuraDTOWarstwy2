package main.structuralpattern.composite;

import java.util.Iterator;

public class Menu extends MenuComponent{
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(print(this)); // toString siebie samego

        menuComponents.iterator().forEachRemaining(menuComponent -> stringBuilder.append(menuComponent.toString()));

        return stringBuilder.toString();
    }

    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }
    public MenuComponent remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }


}
