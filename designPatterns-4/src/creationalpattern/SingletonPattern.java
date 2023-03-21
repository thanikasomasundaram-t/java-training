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
    private static LocalStdSingleton localStdSingleton;

    private LocalStdSingleton() {
        System.out.println("Access is granted by owner to use local std phones");
    }

    public static LocalStdSingleton getKeyForLocalStdSingleton() {
        if(localStdSingleton == null) {
            localStdSingleton = new LocalStdSingleton();
        }
        return localStdSingleton;
    }
}
