package demoincapsulation;

public class AreaOfTriangle {

    private Double base;
    private Double height;

    public double calculateArea(){
        double area = (base*height) / 2;
        return area;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }
}
