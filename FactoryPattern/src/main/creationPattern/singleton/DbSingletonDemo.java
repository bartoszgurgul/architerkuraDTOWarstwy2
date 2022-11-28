package main.creationPattern.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingletonEagerly instancy = DbSingletonEagerly.getInstancy();
        DbSingletonEagerly instancy1 = DbSingletonEagerly.getInstancy();
        System.out.println(instancy);
        System.out.println(instancy1);
    }
}
