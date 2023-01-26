public class Boat extends Vehicles {
    double maxKnotsSpeed;
    int boatKilosWeight;

    public void doVehicleSound() {
        System.out.println("***");
        System.out.println("fuuuu fuuuu");
    }

    public Boat(double maxSpeed, int weight) {
        this.type = "Boat";
        this.numberOfWheels = 0;
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public String getBoatWeightAndSpeed() {
        return "La barca pesa " + this.boatKilosWeight + " e può andare a " + this.maxKnotsSpeed + " nodi";
    }
}

