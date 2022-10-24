package Architecture.Geometria;


public class Triangle extends Figure{

    public Double sideA;
    public Double sideB;
    public Double sideC;

    public Triangle(String nameOfFigure, Double sideA, Double sideB, Double sideC) {
        super(nameOfFigure);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public Double calculateArea() {
        Double pp = (sideA + sideB + sideC)/2;
        Double h = (2 * Math. sqrt(pp * (pp - sideA) * (pp - sideB) * (pp - sideC)))/ sideA;
        return 0.5 * sideA * h;
    }

    @Override
    public Double calculatePerimeter() {
        return sideA + sideB + sideC;
    }   

    
    
}
