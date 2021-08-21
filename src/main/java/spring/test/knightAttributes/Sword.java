package spring.test.knightAttributes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sword {
    @Value("${sword.name}")
    private String name;

    @Value("${sword.length}")
    private int length;

    @Value("${sword.weight}")
    private double weight;

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }
}
