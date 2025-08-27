package task1_figures;

public class Square implements Figure {
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getCalculatedSquare() {
        return Math.pow(sideLength, 2);
    }
}
