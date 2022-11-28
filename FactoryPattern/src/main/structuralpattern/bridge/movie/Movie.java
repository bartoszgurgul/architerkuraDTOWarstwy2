package main.structuralpattern.bridge.movie;

public class Movie {
    private String classification;
    private String runtime;
    private String title;
    private String year;

    public String getClassification() {
        return classification;
    }

    public Movie setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    public String getRuntime() {
        return runtime;
    }

    public Movie setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getYear() {
        return year;
    }

    public Movie setYear(String year) {
        this.year = year;
        return this;
    }
}
