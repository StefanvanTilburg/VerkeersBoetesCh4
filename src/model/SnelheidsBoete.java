package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.2 Verkeersboetes
 * <p>
 * Doel     Class SnelheidsBoete. Sub Class van Verkeersboete, boete op basis van snelheid
 */
public class SnelheidsBoete extends VerkeersBoete {
    private int gemetenSnelheid;
    private int maximumSnelheid;

    public SnelheidsBoete(String naamDader, String kentekenAuto, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kentekenAuto);
        this.setGemetenSnelheid(gemetenSnelheid);
        this.setMaximumSnelheid(maximumSnelheid);
        this.bepaalBedrag();
    }

    @Override
    public void bepaalBedrag() {
        final int MIN_SNELHEID = 0;
        final int MAX_SNELHEID_BOETESCHAAL_1 = 10;
        final int MAX_SNELHEID_BOETESCHAAL_2 = 30;
        final double BOETEBEDRAG_SCHAAL_1 = 10;
        final double BOETEBEDRAG_SCHAAL_2 = 15;
        final double BOETEBEDRAG_SCHAAL_3 = 20;
        final double MAX_BOETEBEDRAG = 1000.00;

        int snelheidsVerschil = this.getGemetenSnelheid() - this.getMaximumSnelheid();
        double boeteBedrag;

        if (snelheidsVerschil > MIN_SNELHEID && snelheidsVerschil <= MAX_SNELHEID_BOETESCHAAL_1) {
            boeteBedrag = snelheidsVerschil * BOETEBEDRAG_SCHAAL_1;
        } else if (snelheidsVerschil <= MAX_SNELHEID_BOETESCHAAL_2) {
            boeteBedrag = snelheidsVerschil * BOETEBEDRAG_SCHAAL_2;
        } else {
            boeteBedrag = snelheidsVerschil * BOETEBEDRAG_SCHAAL_3;
        }

        if (boeteBedrag > MAX_BOETEBEDRAG) {
            boeteBedrag = MAX_BOETEBEDRAG;
        }

        super.setBedrag(boeteBedrag);
    }

    @Override
    public String toString() {
        return String.format(super.toString().replace("Verkeersboete", "Snelheidsboete") +
                " voor %d km/u waar %d km/u is toegestaan.", this.getGemetenSnelheid(), this.getMaximumSnelheid());
    }

    public int getGemetenSnelheid() {
        return gemetenSnelheid;
    }

    public void setGemetenSnelheid(int gemetenSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
    }

    public int getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public void setMaximumSnelheid(int maximumSnelheid) {
        this.maximumSnelheid = maximumSnelheid;
    }
}
