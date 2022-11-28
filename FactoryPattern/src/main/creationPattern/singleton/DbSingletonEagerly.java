package main.creationPattern.singleton;

public class DbSingletonEagerly {
    private static DbSingletonEagerly dbSingleton = new DbSingletonEagerly();

    private DbSingletonEagerly() {

    }

    public static DbSingletonEagerly getInstancy(){
        return dbSingleton;
    }
}
