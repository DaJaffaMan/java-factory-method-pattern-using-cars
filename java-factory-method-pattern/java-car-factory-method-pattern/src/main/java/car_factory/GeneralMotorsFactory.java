package car_factory;

public class GeneralMotorsFactory implements CarFactory {

    public Car buildCar(CarType carType) {
        return new VauxhallCar(carType);
    }
}
