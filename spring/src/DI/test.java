package DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class test{

public static void test() {
    String xmlpath= "DI/spring-config.xml";
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
    Bookservice bookService=(Bookservice) applicationContext.getBean("bookServiceId");
bookService.addBook();

}
    public static void test1() {
        String xmlpath= "DI/spring-config.xml";
        BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource(xmlpath));

        Bookservice bookService=(Bookservice) beanFactory.getBean("bookServiceId");
        bookService.addBook();

    }
public static void main(String[] args){
test1();
}
}
