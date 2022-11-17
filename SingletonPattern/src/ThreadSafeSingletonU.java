public class ThreadSafeSingletonU {
    private static ThreadSafeSingletonU instance;

    private ThreadSafeSingletonU() {
    }

    public static ThreadSafeSingletonU getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonU();
                }
            }
        }
        return instance;
    }
}
