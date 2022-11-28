package main.creationPattern.prototypepattern.model;

public class Book extends Item {
    private double numberOfPages;

    public double getNumberOfPages() {
        return numberOfPages;
    }

    public Book setNumberOfPages(double numberOfPages) {
        this.numberOfPages = numberOfPages;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " Book{" +
                "numberOfPages=" + numberOfPages +
                '}';
    }
}
