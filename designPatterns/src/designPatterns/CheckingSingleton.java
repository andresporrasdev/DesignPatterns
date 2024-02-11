package designPatterns;

public class CheckingSingleton {
	void checking(VehicleManager vehicleManager, VehicleManager vehicleManager2){
		if (vehicleManager == vehicleManager2 ) {
			System.out.println("Singleton working, there are the same object");
			}
		System.out.println("List of vehicles until now: " +vehicleManager.getVehicles());
	}

}
