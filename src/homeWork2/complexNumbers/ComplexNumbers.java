package homeWork2.complexNumbers;

public class ComplexNumbers {
    private final double reZ;
    private double imZ;

    public ComplexNumbers(double reZ) {
        this.reZ = reZ;
    }

    public ComplexNumbers(double reZ, double imZ) {
        this.reZ = reZ;
        this.imZ = imZ;
    }

    public double getReZ() {
        return reZ;
    }

    public double getImZ() {
        return imZ;
    }

    public ComplexNumbers add(ComplexNumbers cn2) {
        double resultReZ = this.getReZ() + cn2.getReZ();
        double resultImZ = this.getImZ() + cn2.getImZ();
        return new ComplexNumbers(resultReZ, resultImZ);
    }

    public ComplexNumbers subtract(ComplexNumbers cn2) {
        double resultReZ = this.getReZ() - cn2.getReZ();
        double resultImZ = this.getImZ() - cn2.getImZ();
        return new ComplexNumbers(resultReZ, resultImZ);
    }

    public ComplexNumbers multiply(ComplexNumbers cn2) {
        double resultReZ;
        double resultImZ;
        resultReZ = (this.getReZ() * cn2.getReZ()) - (this.getImZ() * cn2.getImZ());
        resultImZ = (this.getImZ() * cn2.getReZ()) + (this.getReZ() * cn2.getImZ());
        return new ComplexNumbers(resultReZ, resultImZ);
    }

    public double modul() {
        return Math.sqrt((getReZ() * getReZ()) + (getImZ() * getImZ()));
    }

    @Override
    public String toString() {
        return "Z = " + (Math.round(getReZ() * 100.0) / 100.0) + " + " + (Math.round(getImZ() * 100.0) / 100.0);
    }
}
