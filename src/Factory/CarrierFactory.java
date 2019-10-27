package Factory;

public class CarrierFactory {
    public static Carrier FactoryPatten(String name){
        if(name.equals("汽车")) {
            return new Car();
        } else if(name.equals("自行车")) {
            return new Bike();
        }else {
            return null;
        }
    }
}
