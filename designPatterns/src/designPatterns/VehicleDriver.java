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
		System.out.println("Reference of car: "+vehicleManager);
		System.out.println("Reference of boat: "+vehicleManager2);
		CheckingSingleton checkSingleton = new CheckingSingleton();
		checkSingleton.checking(vehicleManager, vehicleManager2);

		//Builder Pattern
		System.out.println("\nDemo Builder Patterns:");
		
		//Building Car
		System.out.println("\nBuilding Car:");
	    VehicleBuilder carBuilder = new CarBuilder();
	    VehicleDirector carDirector = new VehicleDirector(carBuilder);
	    carDirector.build();
	    System.out.println("Car reference: " + carBuilder.getVehicle());
	    //Adding car to List
	    vehicleManager.addVehicle(carBuilder.getVehicle());
	    
	    //Building boat
		System.out.println("\nBuilding Boat:");
	    VehicleBuilder boatBuilder = new BoatBuilder();
	    VehicleDirector boatDirector = new VehicleDirector(boatBuilder);
	    boatDirector.build();
	    System.out.println("Boat reference :"  +boatBuilder.getVehicle());
	    //Adding boat to List
	    vehicleManager2.addVehicle(boatBuilder.getVehicle());
	    
	    //Verifying singleton again
		checkSingleton.checking(vehicleManager, vehicleManager2);
		
		//Demo Single Factory
		System.out.println("\nDemo Single Factory Pattern:");
		VehicleFactory vehicleFactory= new VehicleFactory();
		vehicleFactory.getVehicle("Car");
		vehicleFactory.getVehicle("Boat");
	    //Verifying singleton again
		checkSingleton.checking(vehicleManager, vehicleManager2);

	}	
}
