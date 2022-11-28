package main.structuralpattern.bridge.shape1;

public class Share1BridgeDemo {
    public static void main(String[] args) {
        BlueCircle blueCircle = new BlueCircle();
        RedCircle redCircle = new RedCircle();

        blueCircle.applyColor();
        redCircle.applyColor();
    }
}
