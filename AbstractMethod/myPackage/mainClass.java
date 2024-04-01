package AbstractMethod.myPackage;

public class mainClass {
    public static void main(String[] args) {
        circle c1 = new circle(5);
        square q1 = new square(10.3);

        System.out.printf("Area of circle : %2.5f", c1.calculatArea());
        System.out.printf("Area of square : %2.5f", q1.calculatArea());
    }
}
