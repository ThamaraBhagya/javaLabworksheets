class  Circle{
    private double radius ;

    public  Circle(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI*radius*radius ;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Question05 {
    public static void main(String[] args){
        double ri = 7.0 ;//inner radius
        double ro = 14.0 ;//outer radius

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double circularRegionArea = outerCircle.computeArea() - innerCircle.computeArea();

        double innerCircumference = innerCircle.computeCircumference();
        double outerCircumference = outerCircle.computeCircumference();

        System.out.println("Area of the circular region: " + circularRegionArea);
        System.out.println("Circumference of the inner circle: " + innerCircumference);
        System.out.println("Circumference of the outer circle: " + outerCircumference);
    }

}
