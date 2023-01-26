public abstract class Vehicles {
    public String type;
    int numberOfWheels;

    public Vehicles() {

    }
     void showVehiclesDetails() {
         System.out.println("Questa è un' " + this.type + "e ha " + this.numberOfWheels + " ruote");
     }
   public abstract void doVehicleSound();{
   }
}

