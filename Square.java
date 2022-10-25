package Architecture.Geometria;

public class Square extends Rectangle {
   
    public Double side;

    public Square(String nameOfFigure, Double side) {
        super(nameOfFigure, side, side);
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
