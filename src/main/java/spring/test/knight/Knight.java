package spring.test.knight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import spring.test.knightAttributes.Horse;
import spring.test.knightAttributes.Sword;

import java.util.LinkedList;
@Component
public class Knight {
private Horse knightsHorse;
    private Sword knightsSword;
     private LinkedList<String> feats;

    @Autowired
    public Knight(Horse knightsHorse, Sword knightsSword) {
        this.knightsHorse = knightsHorse;
        this.knightsSword = knightsSword;
        this.feats = new LinkedList<>();
    }
    public void addFeat(String feat) {
        feats.add(feat);
    }

    public String getInfo() {
        return "Knight{" +
                "knightsHorse=" + knightsHorse +
                ", knightsSword=" + knightsSword +
                '}';
    }
    public void getFeats() {
        feats.forEach(System.out::println);
    }
}
