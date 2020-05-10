/**
 * 单例的饿汉模式
 */
public class Singleton {
    /**
     * 利用静态变量来记录Singleton的唯一实例
     * 直接初始化静态变量，这样就可以确保线程安全了
     */
    private static Singleton singleton = new Singleton();

    /**
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton(){}

    public Singleton getInstance(){
        return  singleton;
    }
}
