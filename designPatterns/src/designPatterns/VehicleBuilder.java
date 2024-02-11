package designPatterns;

interface VehicleBuilder {
    void buildEngine();
    void buildSteeringWheel();
    Vehicle getVehicle();
}