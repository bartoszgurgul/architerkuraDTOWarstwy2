package main.structuralpattern.composite;

public class CompositeMenuDemo {
    public static void main(String[] args) {
        Menu main = new Menu("Main", "/main");
        MenuItem safety = new MenuItem("Safety", "/safety");

        main.add(safety);

        Menu claims = new Menu("Claims", "/claims");
        main.add(claims);

        MenuItem personal_claim = new MenuItem("Personal Claim", "/personamClaim");
        claims.add(personal_claim);

        System.out.println(main);
    }
}
