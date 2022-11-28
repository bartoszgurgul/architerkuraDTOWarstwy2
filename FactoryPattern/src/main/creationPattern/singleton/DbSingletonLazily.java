package main.creationPattern.singleton;

public class DbSingletonLazily {
    private static DbSingletonLazily dbSingletonLazily;

    private DbSingletonLazily() {
    }

    public static DbSingletonLazily getInstancy(){
        if (dbSingletonLazily==null){
            dbSingletonLazily = new DbSingletonLazily();
        }
        return dbSingletonLazily;
    }
}
