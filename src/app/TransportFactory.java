package app;

abstract class TransportFactory {
    public abstract Transport createTransport();
}

class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

class PlaneFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
