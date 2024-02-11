package designPatterns;

public class BoatBuilder implements VehicleBuilder{
	private Boat boat = new Boat();

	@Override
	public void buildEngine() {
		Engine boatEngine = new Engine("Boat Engine");
		
	}

	@Override
	public void buildSteeringWheel() {
		SteeringWheel boatSteeringWheels = new SteeringWheel(2);
		
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return boat;
	}

}
