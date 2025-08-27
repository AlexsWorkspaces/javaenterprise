package task1_figures;

public class FigureUtils {
    static void printTheTotalSquareOfFigures(Figure[] figures) {
        double totalSquare = 0;
        for (int i = 0; i < figures.length; i++) {
            double square = figures[i].getCalculatedSquare();
            System.out.println("Площадь фигуры " + i + " = " + square);
            totalSquare += square;
        }
        System.out.println("Площадь всех фигур = " + totalSquare);
    }
}
