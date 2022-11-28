package main.structuralpattern.bridge.movie.formatter;

import main.structuralpattern.bridge.movie.Detail;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
