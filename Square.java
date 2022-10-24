package Architecture.Geometria;

public class Square extends Figure {
    
    public Double side;

    public Square(String nameOfFigure, Double side) {
        super(nameOfFigure);
        this.side = side;
    }

    @Override
    public Double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return 4 * side;
    }


}
