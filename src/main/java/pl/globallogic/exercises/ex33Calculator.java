package pl.globallogic.exercises;

public class ex33Calculator {
    private final ex33Floor floor;
    private final ex33Carpet carpet;

    public ex33Calculator(ex33Floor floor, ex33Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getLength() * floor.getWidth() * carpet.getCost();
    }

    public static void main(String[] args) {
        ex33Carpet carpet = new ex33Carpet(3.5);
        ex33Floor floor = new ex33Floor(2.75, 4.0);
        ex33Calculator calculator = new ex33Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new ex33Carpet(1.5);
        floor = new ex33Floor(5.4, 4.5);
        calculator = new ex33Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
