public class Car extends Vehicles {
    int numberOfDoors;
    double carPrice;

    @Override
    void showVehiclesDetails() {
        super.showVehiclesDetails();
        System.out.println("L'auto ha " + numberOfDoors + " porte");
    }

    public void doVehicleSound() {
        System.out.println("Bruuum!");
    }

    public Car(int wheels, int doors, double price) {
        this.type = "Auto";
        this.numberOfWheels = wheels;
        this.numberOfDoors = doors;
        this.carPrice = price;
    }
}
