package StaticFacroty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factorytest {
    public static void demo(){
        String xmlpath="StaticFacroty/spring-config.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
        Bookservice bookservice= applicationContext.getBean("bookserviceid",Bookservice.class);
        bookservice.addBook();
//        Bookservice bookservice=new BookServiceImpl();
//        bookservice.addBook();
    }
    public static void main(String[] args){
      demo();
    }
}
