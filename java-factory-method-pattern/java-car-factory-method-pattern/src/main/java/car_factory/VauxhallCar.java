package car_factory;

public class VauxhallCar implements Car {
    private CarType carType;

    public VauxhallCar(CarType carType) {
        this.carType = carType;
    }

    public String toString() {
        if (carType == CarType.CORSA) {
            return ("Vauxhall " + CarType.CORSA).toLowerCase();
        } else if (carType == CarType.ASTRA) {
            return ("Vauxhall " + CarType.ASTRA).toLowerCase();
        } else {
            return "" + CarType.UNKNOWN;
        }
    }

    public CarType getCarType() {
        return carType;
    }
}
