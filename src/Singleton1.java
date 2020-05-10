/**
 * 懒汉的双重加锁机制
 */
public class Singleton1 {
    /**
     * 利用静态变量来记录Singleton的唯一实例
     * volatile 关键字确保：当uniqueInstance变量被初始化成Singleton实例时，
     * 多个线程正确地处理uniqueInstance变量
     */
    private volatile static Singleton1 uniqueInstance;

    /**
     * 构造器私有化，只有Singleton类内才可以调用构造器
     */
    private Singleton1(){}

    /**
     * 检查实例如果不存在则进入同步区域
     * @return
     */
    public static Singleton1 getInstance(){
        if (uniqueInstance ==null){
            synchronized (Singleton1.class){ //进入同步区域
                if (uniqueInstance == null){ //再次检查如果不存在则创建。
                    uniqueInstance = new Singleton1();
                }
            }
        }
        return uniqueInstance;
    }

}
