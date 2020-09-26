package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.2 Verkeersboetes
 * <p>
 * Doel     Class VerkeersBoete. Registratie : naamOvertreder, kenteken, bedrag
 */
public class VerkeersBoete {
    private String naamDader;
    private String kentekenAuto;
    private double bedrag;

    public VerkeersBoete() {
        this("Onbekend", "XX-XX-XX");
    }

    public VerkeersBoete(String naamDader, String kentekenAuto) {
        this(naamDader, kentekenAuto, 0.0);
    }

    private VerkeersBoete(String naamDader, String kentekenAuto, double bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.bedrag = bedrag;
    }

    public double bepaalBedrag() {
        return 0.0;
    }

    @Override
    public String toString(){
        return String.format("Verkeersboete voor %s, kenteken %s, %.2f euro",
                            this.naamDader, this.kentekenAuto, this.getBedrag());
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }
}
