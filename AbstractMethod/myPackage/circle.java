package AbstractMethod.myPackage;

public class circle extends shap {

    private final double radiusCircle;

    public circle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }

    public double getRanges() {
        return radiusCircle;
    }

    public double calculatArea(){
        return Math.PI * Math.pow(radiusCircle, 2);
    }
}
