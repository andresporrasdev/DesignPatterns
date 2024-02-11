package designPatterns;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
	private static VehicleManager vehicleInstance;
	private List<Vehicle> vehicles;
	
	private VehicleManager() {
		vehicles = new ArrayList<>();
		
	}
	
	public static synchronized VehicleManager getInstance() {
		if (vehicleInstance == null) {
			vehicleInstance = new VehicleManager();
		}
		return vehicleInstance;
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public List<Vehicle> getVehicles() {
		return vehicles;
		
	}

}
