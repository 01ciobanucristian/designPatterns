package designPatterns.decorator;

public class SportCarDecorator extends CarDecoarator{
    public SportCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Adding sport features");
    }
}
