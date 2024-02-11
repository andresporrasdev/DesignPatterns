package designPatterns;

public class VehicleDirector {
	private VehicleBuilder builder;
	
	VehicleDirector (VehicleBuilder builder){
		this.builder = builder;
	}
	
	void build() {
		builder.buildEngine();
		builder.buildSteeringWheel();
	}

}
