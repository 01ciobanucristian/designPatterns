package designPatterns.decorator;

public class LuxCarDecorator extends CarDecoarator {
    public LuxCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Adding luxury features");
    }
}
