package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<F extends Fruit> {
    private List<F> fruits;

    public Box(F... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public double getWeight() {
        double weight = 0.0;
        for (F fruit: fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    public void pourAll(Box<? super F> another) {
        if (this == another) return;
        another.fruits.addAll(fruits);
        fruits.clear();
    }

    public List<F> getFruits() {
        return fruits;
    }
}
