package main.creationPattern.prototypepattern.model;

public class Movie extends Item {
    private String runTime;

    public String getRunTime() {
        return runTime;
    }

    public Movie setRunTime(String runTime) {
        this.runTime = runTime;
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " Movie{" +
                "runTime='" + runTime + '\'' +
                '}';
    }
}
