package spring.test;

import config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.test.knight.Knight;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Knight knight = applicationContext.getBean(Knight.class);
        System.out.println(knight.getInfo());
    }
}
