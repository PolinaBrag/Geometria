package Architecture.Geometria;

public class Circle extends Figure implements CalcCircumference {
    
    public Double radius;

    public Circle(String nameOfFigure, Double radius) {
        super(nameOfFigure);
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
        
    }

    @Override
    public Double calculateCircumference() {
        return 2 * radius * Math.PI;
        
    }

}
