 class Constants{
    public static final double PI= 3.14159;
    public static  final int SPEED_OF_LIGHT = 299792458;
    public final double GRAVITY ;

    public Constants(double gravity){
        this.GRAVITY = gravity;
    }
}

public class question01 {
   public static void main(String args[]){
        Constants constants = new Constants(9.81);

       System.out.println("PI: " + Constants.PI);
       System.out.println("Speed of Light: " + Constants.SPEED_OF_LIGHT);
       System.out.println("Gravity: " + constants.GRAVITY);
   }
}
