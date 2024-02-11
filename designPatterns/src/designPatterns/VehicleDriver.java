package designPatterns;

public class VehicleDriver {

	public static void main(String[] args) {
		///Singleton
		System.out.println("Demo Singleton:");
		VehicleManager vehicleManager = VehicleManager.getInstance();
		vehicleManager.addVehicle(new Car());
		vehicleManager.addVehicle(new Boat());

		//Creating another object on VehicleManager
		VehicleManager vehicleManager2 = VehicleManager.getInstance();
		
		//Demonstrating both instances are the same object
		System.out.println(vehicleManager);
		System.out.println(vehicleManager2);
		if (vehicleManager == vehicleManager2 ) {
			System.out.println("There are the same object");
			}
		
		//Builder Pattern
		System.out.println("\nDemo Builder Patterns:");
		
		//Building Car
		System.out.println("\nBuilding Car:");
	
	    VehicleBuilder carBuilder = new CarBuilder();
	    VehicleDirector carDirector = new VehicleDirector(carBuilder);
	    carDirector.build();
	    System.out.println("Car:\n" + carBuilder.getVehicle());
	    
	    //Building boat
		System.out.println("\nBuilding Boat:");
	
	    VehicleBuilder boatBuilder = new BoatBuilder();
	    VehicleDirector boatDirector = new VehicleDirector(boatBuilder);
	    boatDirector.build();
	    System.out.println("Boat:\n"  +boatBuilder.getVehicle());
	}	
}
