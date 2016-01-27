package car_factory;

public class App 
{
    public static void main( String[] args ) {
        CarFactory factory = new FordMotorsFactory();

        Car fiesta = factory.buildCar(CarType.FIESTA);

        System.out.println(fiesta.toString());
    }
}
