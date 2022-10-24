package Architecture.Geometria;

public abstract class Figure{
    
    private String nameOfFigure;

    public Figure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    } 

    public String getNameOfFigure() {
        return nameOfFigure;
    }

    public Double calculatePerimeter() {
        return null;
    }

    public Double calculateArea() {
        return null;
    }


}
