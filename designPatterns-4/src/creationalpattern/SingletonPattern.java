package creationalpattern;

public class SingletonPattern {
    public static void main(String[] args) {
        LocalStdSingleton user1 = LocalStdSingleton.getKeyForLocalStdSingleton();
        System.out.println("user 1 got the access " + user1);

        LocalStdSingleton user2 = LocalStdSingleton.getKeyForLocalStdSingleton();
        System.out.println("user 2 got the access " + user2);

    }
}


class LocalStdSingleton {
	//by making it private we can only create object from inside the class
	// by making static we can only create a single instance
    private static LocalStdSingleton localStdSingleton;

    private LocalStdSingleton() {
        System.out.println("Access is granted by owner to use local std phones");
    }
    
    
    // to avoid multiple threads from creating instance we use synchronized
    //by adding static we make available to global
    synchronized public static LocalStdSingleton getKeyForLocalStdSingleton() {
        if(localStdSingleton == null) {
            localStdSingleton = new LocalStdSingleton();
        }
        return localStdSingleton;
    }
}
