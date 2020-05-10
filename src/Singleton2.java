/**
 * 静态内部类
 */
public class Singleton2 {
    private Singleton2(){}

    private static class LazyHolder{
        public static final Singleton2 INSTANCE = new Singleton2();
    }

    public static final Singleton2 getInstance(){
        return LazyHolder.INSTANCE;
    }
}
