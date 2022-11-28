package main.structuralpattern.bridge.movie;

public class Detail {
    private String label;
    private String value;

    public Detail(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public Detail setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Detail setValue(String value) {
        this.value = value;
        return this;
    }
}
