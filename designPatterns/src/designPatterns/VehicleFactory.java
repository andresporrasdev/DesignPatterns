package designPatterns;

public class VehicleFactory {
	
	public Vehicle getVehicle (String typeVehicle) {
		switch (typeVehicle) {
		case "Car": return buildCar();
		case "Boat": return buildBoat();
        default: throw new IllegalArgumentException("Invalid vehicle type: " + typeVehicle);
		}
	}
	
	Vehicle buildCar(){
		//Building Car
		System.out.println("\nBuilding Car:");
	    VehicleBuilder carBuilder = new CarBuilder();
	    VehicleDirector carDirector = new VehicleDirector(carBuilder);
	    carDirector.build();
	    System.out.println("Car reference: " + carBuilder.getVehicle());
		VehicleManager vehicleManager = VehicleManager.getInstance();
	    //Adding car to List
	    vehicleManager.addVehicle(carBuilder.getVehicle());
	    return carBuilder.getVehicle();
	}
	
	Vehicle buildBoat() {
		System.out.println("\nBuilding Boat:");
	    VehicleBuilder boatBuilder = new BoatBuilder();
	    VehicleDirector boatDirector = new VehicleDirector(boatBuilder);
	    boatDirector.build();
	    System.out.println("Boat reference :"  +boatBuilder.getVehicle());
		VehicleManager vehicleManager2 = VehicleManager.getInstance();
	    //Adding boat to List
	    vehicleManager2.addVehicle(boatBuilder.getVehicle());
	    return boatBuilder.getVehicle();

	}

}
