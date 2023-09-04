package pl.globallogic.exercises;

import java.util.ArrayList;
import java.util.List;

class ex48Player implements ex48Interface.ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public ex48Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getWeapon(){return weapon;}
    public void setWeapon(String weapon){this.weapon=weapon;}
    public int getHitPoints(){return hitPoints;}
    public void setHitPoints(int hitPoints){this.hitPoints = hitPoints;}
    public int getStrength(){return strength;}
    public void setStrength(int str) {this.strength = str;}

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(name);
        values.add(Integer.toString(hitPoints));
        values.add(Integer.toString(strength));
        values.add(weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
            weapon = savedValues.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + ", weapon='" + weapon + "'}";
    }
}
