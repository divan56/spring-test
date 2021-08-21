package spring.test.knightAttributes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Horse {
    @Value("${horse.name}")
    private String name;

    @Value("${horse.age}")
    private int age;

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
