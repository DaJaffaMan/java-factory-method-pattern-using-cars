package car_factory;

public class FordCar implements Car {

    private CarType carType;

    public FordCar(CarType carType) {
        this.carType = carType;
    }

    public String toString() {
        if (carType == CarType.FIESTA) {
            return ("Ford " + carType).toLowerCase();
        } else {
            return "" + CarType.UNKNOWN;
        }
    }

    public CarType getCarType() {
        return carType;
    }
}
