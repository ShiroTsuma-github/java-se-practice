package pl.globallogic.exercises;

public class ex36Cuboid  extends ex36Rectangle{
    private double height;

    public ex36Cuboid(double width, double length, double height) {
        super(width, length);
        setHeight(height);
    }
    private void setHeight(double height){
        if(height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return this.getArea() * this.height;
    }

    public static void main(String[] args) {
        ex36Rectangle rectangle = new ex36Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        ex36Cuboid cuboid = new ex36Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
