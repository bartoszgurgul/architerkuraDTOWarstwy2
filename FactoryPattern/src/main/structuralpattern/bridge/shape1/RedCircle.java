package main.structuralpattern.bridge.shape1;

public class RedCircle extends Circle {
    @Override
    void applyColor() {
        System.out.println("Applying red color");
    }
}
