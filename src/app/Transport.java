package app;

public interface Transport {
    void move();
}

class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Car is moving on the road.");
    }
}

class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("Plane is flying in the sky.");
    }
}
