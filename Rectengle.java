package demoincapsulation;

public class Rectengle {
    private double length;
    private double breadth;

    public double calculateArea(){
        double area = length * breadth;
        return area;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

}
