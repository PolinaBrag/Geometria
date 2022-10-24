package Architecture.Geometria;

import java.util.Scanner;

public class Programm {
 
    public static void main(String[] args) {
        
        Storage storage = new Storage();

        Scanner iScanner = new Scanner(System.in);
        
        Boolean answer = true;

        while (answer){
            System.out.printf("Какую фигуру создать? 1 - круг, 2 - квадрат, 3 - прямоугольник, 4 - треугольник: ");
            int num = iScanner.nextInt();
            switch (num) {
                case(1):
                    System.out.printf("Введите радиус круга: ");
                    Double radius = iScanner.nextDouble();
                    while (radius == 0){
                        System.err.println("Окружность не может иметь радиус 0. Введите другое число:");
                        radius = iScanner.nextDouble();
                    }
                    Circle circle = new Circle("круг", radius);
                    storage.addFigureinStorage(circle);
                    break;
                case (2):
                    System.out.printf("Введите длину стороны квадрата: ");
                    Double a = iScanner.nextDouble();
                    while (a == 0){
                        System.err.println("Квадрат не может иметь сторону длиной 0. Введите другое число:");
                        a = iScanner.nextDouble();
                    }
                    Square square = new Square("квадрат", a);
                    storage.addFigureinStorage(square);
                    break;
                case (3):
                    System.out.printf("Введите ширину прямоугольника ");
                    Double width = iScanner.nextDouble();
                    System.out.printf("Введите длину прямоугольника ");
                    Double length = iScanner.nextDouble();
                    while (width == length){
                        System.err.println("Если ширина равна длине, это квадрат. Введите другие числа.");
                        System.out.printf("Введите ширину прямоугольника ");
                        width = iScanner.nextDouble();
                        System.out.printf("Введите длину прямоугольника ");
                        length = iScanner.nextDouble();
                    }
                    while (width == 0 || length == 0){
                        System.err.println("Сторона не может быть равна 0. Введите другие числа.");
                        System.out.printf("Введите ширину прямоугольника ");
                        width = iScanner.nextDouble();
                        System.out.printf("Введите длину прямоугольника ");
                        length = iScanner.nextDouble();
                    }
                    Rectangle rectangle = new Rectangle("прямоугольник", width, length);
                    storage.addFigureinStorage(rectangle);
                case (4):
                    System.out.printf("Введите сторону A треугольника ");
                    Double sideA = iScanner.nextDouble();
                    System.out.printf("Введите сторону B треугольника ");
                    Double sideB = iScanner.nextDouble();
                    System.out.printf("Введите сторону C треугольника ");
                    Double sideC = iScanner.nextDouble();
                    while (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA){
                        System.err.println("Треугольник не существует. Введите другие числа.");
                        System.out.printf("Введите сторону A треугольника ");
                        sideA = iScanner.nextDouble();
                        System.out.printf("Введите сторону B треугольника ");
                        sideB = iScanner.nextDouble();
                        System.out.printf("Введите сторону C треугольника ");
                        sideC = iScanner.nextDouble();
                    }
                    Triangle triangle = new Triangle("треугольник", sideA, sideB, sideC);
                    storage.addFigureinStorage(triangle);
            }
            System.out.println("Создать еще фигуру? Y - да, N - нет");
            String answ = iScanner.next();
            if (answ.contains("Y")){
                answer = true;
            }
            if (answ.contains("N")){
                answer = false;
            }
        }
        iScanner.close();

        storage.printFigureStorage();

        storage.calculateAreaAllFigures();
        storage.calculatePerimeterAllFigures();
    }
}
