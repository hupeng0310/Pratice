package Factory;

public class Car implements Carrier{
    @Override
    public void run() {
        System.out.println("汽车在行驶");
    }
}
