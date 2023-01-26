public class Main {
    public Main(){

    }

    public static void main(String[] args) {
        Car car = new Car(4, 5, 23000);
        car.doVehicleSound();
        car.showVehiclesDetails();
        Boat boat = new Boat(65, 1100);
        boat.doVehicleSound();
        boat.showVehiclesDetails();
        System.out.println(boat.getBoatWeightAndSpeed());
    }
}
