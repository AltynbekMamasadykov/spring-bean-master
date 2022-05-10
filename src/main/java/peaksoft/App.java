package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


//        AppConfig appConfig = new AppConfig();
//        appConfig.getCat();
//        appConfig.getCat();
//        appConfig.getCat();

        ClassPathXmlApplicationContext context =
               new ClassPathXmlApplicationContext("applicationContext.xml");
        Cat cat = context.getBean("cat",Cat.class);



    }
}
