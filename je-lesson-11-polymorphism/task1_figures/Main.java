package task1_figures;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(3, 8, 10),
                new Circle(5),
                new Square(10)
        };

        FigureUtils.printTheTotalSquareOfFigures(figures);

        Figure square = new Square(3);
    }
}
