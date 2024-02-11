package designPatterns;

public class CarBuilder implements VehicleBuilder {
	private Vehicle car = new Car();

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		System.out.println("Making Engine for car");
	}

	@Override
	public void buildSteeringWheel() {
		// TODO Auto-generated method stub
		System.out.println("Making steering Wheels for car");
		
	}

	@Override
	public Vehicle getVehicle() {
		// TODO Auto-generated method stub
		return car;
	}

}
