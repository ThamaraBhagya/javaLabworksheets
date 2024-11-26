public class Q4_GeometryCalculator {
    public static void main(String[] args) {

        System.out.println("Value of pi: " + MathOperations.getPi());


        double circleArea = MathOperations.calculateCircleArea(5);
        System.out.println("Area of the circle with radius 5: " + circleArea);


        double squareArea = MathOperations.calculateSquareArea(4);
        System.out.println("Area of the square with side length 4: " + squareArea);
    }
}

class MathOperations {

    private static final double pi = 3.14159;


    public static double calculateCircleArea(double radius) {
        return pi * radius * radius;
    }


    public static double calculateSquareArea(double side) {
        return side * side;
    }


    public static double getPi() {
        return pi;
    }
}

