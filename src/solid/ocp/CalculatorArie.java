package solid.ocp;

public class CalculatorArie {
    public int calculeazaArieDreptunghi(Dreptunghi dreptunghi) {
        return dreptunghi.getLatime() * dreptunghi.getLungime();
    }

    public double calculeazaArieCerc(Cerc cerc) {
        return cerc.getRaza() * cerc.getRaza() * Math.PI;
    }
}
