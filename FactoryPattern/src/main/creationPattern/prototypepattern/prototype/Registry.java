package main.creationPattern.prototypepattern.prototype;

import main.creationPattern.prototypepattern.model.*;


import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<ITEMS, Item> itemMap = new HashMap<>();

    public Registry() {
        loadData();
    }

    private void loadData(){
        Movie movie = new Movie();
        movie.setTitle("DefaultMovie");
        movie.setRunTime("123");
        movie.setPrice(1234);
        movie.setUrl("home.pl");

        Book book = new Book();
        book.setTitle("DefaultBook");
        book.setPrice(234);
        book.setNumberOfPages(400);
        book.setUrl("home.pl");

        itemMap.put(ITEMS.BOOKS, book);
        itemMap.put(ITEMS.MOVIE, movie);
    }

    public Item createItem(ITEMS items){
        Item item = null;

        try{
            item = (Item)(itemMap.get(items)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
}
