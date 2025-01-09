package app;

public class Main {
    public void run() {
        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();

        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        car.move();
        plane.move();
    }

    public static void main(String[] args) {
        Main main = new Main(); // this one is here for example only btw
        main.run();
    }
}