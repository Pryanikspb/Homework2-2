public class Main {
    public static void main(String[] args) {
        Car car = new Car("car", 4);
        Bike bike = new Bike("bike", 2);

        Truck truck = new Truck("truck" , 6);

        Bicycle bicycle = new Bicycle("bicycle", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);
        station.check(bike);
    }
}