package pl.globallogic.exercises;

public class ex36Rectangle {
    private double width;
    private double length;

    public ex36Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    private void setWidth(double width){
        if(width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    private void setLength(double length){
        if(length < 0){
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return this.width * this.length;
    }
}
