package pl.globallogic.exercises;

import java.util.ArrayList;
import java.util.List;

class ex48Monster implements ex48Interface.ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public ex48Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // Getters

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(name);
        values.add(Integer.toString(hitPoints));
        values.add(Integer.toString(strength));
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + "}";
    }
}

