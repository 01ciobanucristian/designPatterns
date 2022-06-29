package solid.ocp2;

public class Dreptunghi implements Forma{
    private double latime;
    private double lungime;

    public Dreptunghi(double latime, double lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    @Override
    public double calculeazaArie() {
        return latime * lungime;
    }
}
