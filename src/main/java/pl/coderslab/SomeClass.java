package pl.coderslab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeClass {



    public static void getHello(ClassPathXmlApplicationContext context){
        HelloWorld hello1 = context.getBean("hello", HelloWorld.class);
    }


}
