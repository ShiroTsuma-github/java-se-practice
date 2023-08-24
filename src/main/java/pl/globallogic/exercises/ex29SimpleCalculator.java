package pl.globallogic.exercises;

public class ex29SimpleCalculator {
    private double FirstNumber;
    private double SecondNumber;
    public double getFirstNumber() {
        return this.FirstNumber;
    }
    public double getSecondNumber() {
        return this.SecondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.FirstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.SecondNumber = secondNumber;
    }
    public double getAdditionResult(){
        return this.FirstNumber + this.SecondNumber;
    }
    public double getSubtractionResult(){
        return this.FirstNumber - this.SecondNumber;
    }
    public double getMultiplicationResult(){
        return this.FirstNumber * this.SecondNumber;
    }
    public double getDivisionResult(){
        if(this.SecondNumber == 0){
            return 0;
        }
        return this.FirstNumber / this.SecondNumber;
    }

    public static void main(String[] args) {
        ex29SimpleCalculator calculator = new ex29SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
