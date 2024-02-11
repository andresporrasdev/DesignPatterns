package designPatterns;

public class CarBuilder implements VehicleBuilder {
	private Vehicle car = new Car();

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		Engine carEngine = new Engine("Car Engine");
	}

	@Override
	public void buildSteeringWheel() {
		// TODO Auto-generated method stub
		SteeringWheel carSteeringWheel = new SteeringWheel(1);
		
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return car;
	}

}
