package task1_figures;

public class Triangle implements Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new RuntimeException("Сумма двух сторон треугольника не может быть меньше или равной третьей");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getCalculatedSquare() {
        double semiP = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiP * (semiP - sideA) * (semiP - sideB) * (semiP - sideC));
    }
}
