package demoincapsulation;

public class AreaMain {

    public static void main(String[] args) {

        Rectengle rectengle = new Rectengle();
        AreaOfTriangle triangle = new AreaOfTriangle();
        rectengle.setBreadth(11.00);
        rectengle.setLength(99.00);


        triangle.setBase(11.00);
        triangle.setHeight(99.00);
        System.out.println("Area of triangle" + triangle.calculateArea());
        System.out.println("Area of rectengle" + rectengle.calculateArea());
    }
}
