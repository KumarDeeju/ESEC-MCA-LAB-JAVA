package AbstractMethod.myPackage;

public class square extends shap {

    private final double sideInCms;

    public square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    public double calculatArea() {
        return Math.pow(sideInCms, 2);
    }
}
