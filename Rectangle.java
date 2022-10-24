package Architecture.Geometria;

public class Rectangle extends Figure {
    
    public Double width;
    public Double length;

    public Rectangle(String nameOfFigure, Double width, Double lenght) {
        super(nameOfFigure);
        this.width = width;
        this.length = lenght;
    }

    @Override
    public Double calculateArea() {
        return width * length;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (width + length);
    }

    
    
}
