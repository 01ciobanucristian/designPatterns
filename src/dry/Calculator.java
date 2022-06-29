package dry;

public class Calculator {
    public int sum(int a , int b) {
        System.out.println("Se calculeaza suma pentru " + a + "si " + b);
        return a + b;
    }

    public int average(int a , int b) {
        int sum = sum(a, b);
        return sum / 2;
    }
}
