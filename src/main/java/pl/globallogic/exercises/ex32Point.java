package pl.globallogic.exercises;

public class ex32Point {
    private int x;
    private int y;

    public ex32Point() {
    }

    public ex32Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        return Math.sqrt(x*x + y*y);
    }

    public double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
    }

    public double distance(ex32Point point){
        return Math.sqrt((point.x-this.x)*(point.x-this.x) + (point.y-this.y)*(point.y-this.y));
    }

    public static void main(String[] args) {
        ex32Point first = new ex32Point(6,5);
        ex32Point second = new ex32Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        ex32Point point = new ex32Point();
        System.out.println("distance()= " + point.distance());
    }
}
