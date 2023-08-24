package pl.globallogic.exercises;

public class ex35Circle {
    private final double radius;

    public ex35Circle(double radius) {
        if(radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

}
