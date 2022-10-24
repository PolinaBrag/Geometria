package Architecture.Geometria;
import java.util.ArrayList;

public class Storage implements CalcAreaAllFigures, CalcPerimeterAllFigures, AddFigureInStorage, Printer {

    ArrayList<Figure> figures = new ArrayList<Figure>();

    @Override
    public void addFigureinStorage(Figure newFigure) {
        if (!figures.contains(newFigure)) {
            figures.add(newFigure);
        }
    }

    @Override
    public void calculatePerimeterAllFigures() {
        for (Figure fgr : figures) {
            System.out.println("Периметр фигуры " + fgr.getNameOfFigure() + " равен " + fgr.calculatePerimeter() + " см");
        }
    }

    @Override
    public void calculateAreaAllFigures() {
        for (Figure fgr : figures) {
            System.out.println("Площадь фигуры " + fgr.getNameOfFigure() + " равна " + fgr.calculateArea() + " см^2");
        }
    }

    @Override
    public void printFigureStorage() {
        for (Figure fgr : figures) {
            System.out.println(fgr.getNameOfFigure());
        }
        
    }
    
}
