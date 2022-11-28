package main.structuralpattern.bridge.shape1;

public class RedSquare extends Square {
    @Override
    void applyColor() {
        System.out.println("Applying red color");
    }
}
