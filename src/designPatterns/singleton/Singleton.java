package designPatterns.singleton;

public class Singleton {
    private static Singleton instance;
    public static int nrOfInstances;
    private Singleton() {
        System.out.println("din constructorul default singletone");
        nrOfInstances++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            //t1 , t2
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
