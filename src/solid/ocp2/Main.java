package solid.ocp2;

public class Main {
    public static void main(String[] args) {
        Dreptunghi dreptunghi = new Dreptunghi(4,5);
        Cerc cerc = new Cerc(3);

        System.out.println(CalculatorArie.calculeazaArie(dreptunghi));
        System.out.println(CalculatorArie.calculeazaArie(cerc));

    }
}
