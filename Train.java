
public class Train {
    public static double gravity = 9.8;
    public final double rollingResistance = 0.00015;
    public final double airResistance = 110.0;
    Engine One_Engine;
    public int Cars;
    Car avgCarmass;
    public double velocity;
    
    public Train(double Mass, double Power, int C, double AvgCarMass, String square, double v) {
        One_Engine = new Engine(Mass, Power);
        Cars = C;
        avgCarmass = new Car(AvgCarMass, square);
        velocity = v;
    }
    
    public double getNetForce() {
        double weight = gravity* (One_Engine.Mass + Cars * avgCarmass.getAvgMassCar());
        double netForce = One_Engine.getForce(velocity) -  rollingResistance * weight * velocity - airResistance * velocity * velocity;
        return netForce;
    }

}
