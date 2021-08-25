package pl.coderslab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiApplication {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");


        HelloWorld hello = context.getBean("hello", HelloWorld.class);

//        hello.setMessage("Some message");
        String message = hello.getMessage();
        hello.printMessage();

        SomeClass.getHello(context);

//        HelloWorld hello1 = context.getBean("hello", HelloWorld.class);
//        HelloWorld hello2 = context.getBean("hello", HelloWorld.class);
//        HelloWorld hello3 = context.getBean("hello", HelloWorld.class);
//
//        System.out.println(hello1);
//        System.out.println(hello2);
//        System.out.println(hello3);

        context.close();
    }
}
