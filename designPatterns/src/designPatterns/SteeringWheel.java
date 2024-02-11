package designPatterns;

class SteeringWheel {
	int steeringWheels;
	
	SteeringWheel (int numberWheels){
		steeringWheels = numberWheels;
		System.out.println("Making this number of Steering Wheels: " + numberWheels);
	}
	
	@Override
	public String toString() {
		return "Number of Wheels :"+steeringWheels;
	}
	
}
