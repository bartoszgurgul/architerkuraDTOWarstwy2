package main.creationPattern.prototypepattern;

import main.creationPattern.prototypepattern.model.*;
import main.creationPattern.prototypepattern.prototype.ITEMS;
import main.creationPattern.prototypepattern.prototype.Registry;

public class Demo {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Book book = (Book) registry.createItem(ITEMS.BOOKS);

        book.setTitle("NewOneBook");
        System.out.println(book);

        Movie movie = (Movie) registry.createItem(ITEMS.MOVIE);
        movie.setTitle("SeconOneMovie");
        System.out.println(movie );

    }
}
