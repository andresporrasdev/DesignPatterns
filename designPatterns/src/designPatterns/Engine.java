package designPatterns;

class Engine {
    String typeEngine;

    Engine(String type) {
        this.typeEngine = type;
		System.out.println("Making " + typeEngine);

    }

    @Override
    public String toString() {
        return "Engine: " + typeEngine;
    }
}