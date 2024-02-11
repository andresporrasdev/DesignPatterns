package designPatterns;

import static org.junit.Assert.*;
import org.junit.Test;

public class VehicleDirectorTest {

    // Concrete implementation of VehicleBuilder for testing
    private class TestVehicleBuilder implements VehicleBuilder {
        private boolean engineBuilt = false;
        private boolean steeringWheelBuilt = false;
        private Vehicle vehicle = null;

        @Override
        public void buildEngine() {
            engineBuilt = true;
        }

        @Override
        public void buildSteeringWheel() {
            steeringWheelBuilt = true;
        }

        @Override
        public Vehicle getVehicle() {
            if (engineBuilt && steeringWheelBuilt) {
                vehicle = new Car(); // or any other vehicle type you're using in your implementation
            }
            return vehicle;
        }
    }

    @Test
    public void testBuild() {
        // Create a new instance of the TestVehicleBuilder
        TestVehicleBuilder testBuilder = new TestVehicleBuilder();

        // Create a VehicleDirector with the test builder
        VehicleDirector director = new VehicleDirector(testBuilder);

        // Call the build method
        director.build();

        // Check if the test builder built the engine and steering wheel
        assertNotNull(testBuilder.getVehicle());
    }
}
