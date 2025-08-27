package task1_figures;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getCalculatedSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
