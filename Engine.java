
public class Engine {
    public double Mass;
    public double Power;
    public static double friction_mu = 0.3;
    
    
    public Engine (double M, double p){
        Mass = M;
        Power = p;
    }
    
    public double getMass(){
        return Mass;
    }
    
    public double getForce(double velocity) {
        double f1 = Power/velocity;      //limit of engine horsepower
        double f2 = Mass * Train.gravity * friction_mu;       //limit of adhesion to rail
        return Math.min(f1,f2);
        
    }
    
    public static double getForce(double Mass, double Power,double velocity) {
        double f1 = Power/velocity;      //limit of engine horsepower
        double f2 = Mass * Train.gravity * friction_mu;       //limit of adhesion to rail
        return Math.min(f1,f2);
        }

}
