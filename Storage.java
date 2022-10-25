package Architecture.Geometria;
import java.util.ArrayList;

public class Storage implements AddFigureInStorage, Printer {

    ArrayList<Figure> figures = new ArrayList<Figure>();

    @Override
    public void addFigureinStorage(Figure newFigure) {
        if (!figures.contains(newFigure)) {
            figures.add(newFigure);
        }
    }

    public void calculatePerimeterAllFigures() {
        for (Figure fgr : figures) {
            if (!fgr.getNameOfFigure().contains("круг")){
                System.out.println("Периметр фигуры " + fgr.getNameOfFigure() + " равен " + fgr.calculatePerimeter() + " см");
            }
            else{
                System.out.println("Длина окружности круга равна " + ((Circle)(fgr)).calculateCircumference() + " см");
            }
        }
    }

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
