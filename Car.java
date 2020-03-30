
public class Car {
    private double AvgMassCar; 
    private String CarType;
    
    public Car(double AMC, String CT){
        AvgMassCar = AMC;
        CarType = CT;
            }
    
    public double getAvgMassCar() {
        return AvgMassCar;
    }
    
    public void setAvgMassCar(double Average) {
        AvgMassCar = Average;
        
    }
    
    public void setCarType(String Car ) {
        CarType = Car;
    }
    
    public String getCarType() {
        return CarType;
    }

}
