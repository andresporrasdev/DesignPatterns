package designPatterns;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleFactoryTest {
    private VehicleFactory vehicleFactory;

    @Before
    public void setUp() {
        vehicleFactory = new VehicleFactory();
    }

    public void testGetCar() {
        Vehicle car = vehicleFactory.getVehicle("Car");
        assertNotNull(car);
        assertTrue(car instanceof Car);
    }

    @Test
    public void testGetBoat() {
        Vehicle boat = vehicleFactory.getVehicle("Boat");
        assertNotNull(boat);
        assertTrue(boat instanceof Boat);
    }

}
