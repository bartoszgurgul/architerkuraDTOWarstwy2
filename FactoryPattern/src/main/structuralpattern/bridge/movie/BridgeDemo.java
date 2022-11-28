package main.structuralpattern.bridge.movie;

import main.structuralpattern.bridge.movie.formatter.Formatter;
import main.structuralpattern.bridge.movie.formatter.HtmlFormatter;
import main.structuralpattern.bridge.movie.formatter.PrintFormatter;
import main.structuralpattern.bridge.movie.printer.MoviePrinter;
import main.structuralpattern.bridge.movie.printer.Printer;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie()
                .setTitle("JohnyWick")
                .setClassification("Action")
                .setRuntime("12312")
                .setYear("2014");

        Formatter formatter = new PrintFormatter();
        Formatter htmlFormatter = new HtmlFormatter();

        Printer printer = new MoviePrinter(movie);

        String print = printer.print(formatter);
        String print1 = printer.print(htmlFormatter);
        System.out.println(print1);
        System.out.println(print);
    }
}
