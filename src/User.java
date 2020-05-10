/**
 * 枚举单例实例
 */
public class User {

    private User(){}

    static enum SingletonEnum{
        INSTANCE;
        private User user;
        private SingletonEnum(){
            user = new User();
        }
        public User getInstnce(){
            return user;
        }
    }
    //对外暴露一个获取User对象的静态方法
    public static User getInstance(){
        return SingletonEnum.INSTANCE.getInstnce();
    }

        public static void main(String [] args){
            System.out.println(User.getInstance());
            System.out.println(User.getInstance());
            System.out.println(User.getInstance()==User.getInstance());
        }
}
