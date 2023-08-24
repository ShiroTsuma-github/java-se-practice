package pl.globallogic.exercises;

public class ex37Bedroom {

    private String name;
    private ex37Wall wall1;
    private ex37Wall wall2;
    private ex37Wall wall3;
    private ex37Wall wall4;
    private ex37Ceiling ceiling;
    private ex37Bed bed;
    private ex37Lamp lamp;

    public ex37Bedroom(String name, ex37Wall wall1, ex37Wall wall2, ex37Wall wall3, ex37Wall wall4, ex37Ceiling ceiling, ex37Bed bed, ex37Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed | ");
        bed.make();
    }

    public ex37Lamp getLamp() {
        return this.lamp;
    }



    public static void main(String[] args) {
        ex37Wall wall1 = new ex37Wall("West");
        ex37Wall wall2 = new ex37Wall("East");
        ex37Wall wall3 = new ex37Wall("South");
        ex37Wall wall4 = new ex37Wall("North");

        ex37Ceiling ceiling = new ex37Ceiling(12, 55);

        ex37Bed bed = new ex37Bed("Modern", 4, 3, 2, 1);

        ex37Lamp lamp = new ex37Lamp("Classic", false, 75);

        ex37Bedroom bedroom = new ex37Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
