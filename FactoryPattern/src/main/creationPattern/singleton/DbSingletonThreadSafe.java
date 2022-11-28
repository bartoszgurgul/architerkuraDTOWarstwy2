package main.creationPattern.singleton;

public class DbSingletonThreadSafe {
    private static volatile DbSingletonThreadSafe dbSingletonThreadSafe;

    private DbSingletonThreadSafe() {
        if (dbSingletonThreadSafe != null)
            throw new RuntimeException("Pls use getInstances!!!");
    }

    public static DbSingletonThreadSafe getInstance() {
        if (dbSingletonThreadSafe == null) {
            synchronized (DbSingletonThreadSafe.class) {
                if (dbSingletonThreadSafe == null)
                     dbSingletonThreadSafe = new DbSingletonThreadSafe();
            }
        }
        return dbSingletonThreadSafe;
    }
}
