package designPatterns;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class VehicleManagerTest {
    private VehicleManager vehicleManager;

    @Before
    public void setUp() {
        vehicleManager = VehicleManager.getInstance();
    }

	@Test
	public void testAddVehicle() {
        Vehicle vehicle = new Car();
        vehicleManager.addVehicle(vehicle);
        // Retrieve the list of vehicles from the manager
        List<Vehicle> vehicles = vehicleManager.getVehicles();
        // Check if the list is not null and contains the added vehicle
        assertNotNull(vehicles);
        assertEquals(1, vehicles.size());
        assertEquals(vehicle, vehicles.get(0));
	}


	@Test
    public void testGetVehicles() {
        // Initially, the list should be empty
        List<Vehicle> vehicles = vehicleManager.getVehicles();
        assertNotNull(vehicles);
        assertEquals(0, vehicles.size());
    }

}
