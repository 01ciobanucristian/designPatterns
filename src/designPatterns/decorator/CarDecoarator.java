package designPatterns.decorator;

public class CarDecoarator implements Car{
    private final Car car;

    public CarDecoarator(Car car) {
        this.car = car;
    }

    @Override
    public void build() {
        car.build();
    }
}
