package Factory;

public class Bike implements Carrier {
    @Override
    public void run() {
        System.out.println("自行车在行驶");
    }
}
