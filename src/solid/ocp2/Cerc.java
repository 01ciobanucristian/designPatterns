package solid.ocp2;

public class Cerc implements Forma{
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double calculeazaArie() {
        return Math.PI * raza * raza;
    }
}
