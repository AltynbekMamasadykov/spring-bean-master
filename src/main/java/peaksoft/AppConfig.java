package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class AppConfig {
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }


//   public Cat getCat(){
//       ClassPathXmlApplicationContext context =
//               new ClassPathXmlApplicationContext("applicationContext.xml");
//        Cat cat = context.getBean("cat",Cat.class);
//        return cat;
//   }

    @Bean(name="cat")
    public Cat getCat(){
        Cat cat = new Cat();
        return cat;
    }

}
