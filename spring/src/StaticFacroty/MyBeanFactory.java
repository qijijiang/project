package StaticFacroty;

public class MyBeanFactory {
    public static Bookservice createService(){
        return new BookServiceImpl();
    }
}
