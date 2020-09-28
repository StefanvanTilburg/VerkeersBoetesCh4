package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.2 Verkeersboetes
 * <p>
 * Doel     Class VerkeersBoete. Registratie : naamOvertreder, kenteken, bedrag
 */
public abstract class VerkeersBoete {
    private static final String DEFAULT_STRING_WAARDE = "Onbekend";
    private static final double DEFAULT_DOUBLE_WAARDE = 0.0;
    private String naamDader;
    private String kentekenAuto;
    private double bedrag;

    public VerkeersBoete() {
        this(DEFAULT_STRING_WAARDE, DEFAULT_STRING_WAARDE);
    }

    public VerkeersBoete(String naamDader, String kentekenAuto) {
        this(naamDader, kentekenAuto, DEFAULT_DOUBLE_WAARDE);
    }

    private VerkeersBoete(String naamDader, String kentekenAuto, double bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.setBedrag(bedrag);
    }

    public abstract void bepaalBedrag();

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
