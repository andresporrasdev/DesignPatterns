package designPatterns;

public class BoatBuilder implements VehicleBuilder{
	private Boat boat = new Boat();

	@Override
	public void buildEngine() {
		System.out.println("Making Engine for Boat");
		
	}

	@Override
	public void buildSteeringWheel() {
		System.out.println("Making steering wheel for Boat");
		
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return boat;
	}

}
