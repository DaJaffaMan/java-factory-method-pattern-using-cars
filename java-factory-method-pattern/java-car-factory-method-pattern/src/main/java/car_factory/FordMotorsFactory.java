package car_factory;

public class FordMotorsFactory implements CarFactory {

    public Car buildCar(CarType carType) {
        return new FordCar(carType);
    }


}
