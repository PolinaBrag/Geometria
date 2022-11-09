package Architecture.Geometria;

public abstract class Figure implements CalcArea {
    
    private String nameOfFigure;

    public Figure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    } 

    public String getNameOfFigure() {
        return nameOfFigure;
    }

    @Override
    public Double calculateArea() {
        return null;
    }

}
