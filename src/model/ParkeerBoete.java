package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.2 Verkeersboetes
 * <p>
 * Doel     Class ParkeerBoetse, Sub class van Verkeersboete. Boete op basis van zone 1, 2, 3
 */
public class ParkeerBoete extends VerkeersBoete {
    private int zone;

    public ParkeerBoete(String naamDader, String kentekenAuto, int zone) {
        super(naamDader, kentekenAuto);
        this.setZone(zone);
        this.bepaalBedrag();
    }

    @Override
    public void bepaalBedrag() {
        final double ZONE_1_BEDRAG = 80;
        final double ZONE_2_BEDRAG = 100;
        final double ZONE_3_BEDRAG = 180;

        switch (this.getZone()) {
            default:
            case 1:     super.setBedrag(ZONE_1_BEDRAG); break;
            case 2:     super.setBedrag(ZONE_2_BEDRAG); break;
            case 3:     super.setBedrag(ZONE_3_BEDRAG); break;
        }
    }

    @Override
    public String toString() {
        return String.format(super.toString().replace("Verkeersboete", "Parkeerboete") +
                                " in zone %d", this.getZone());
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }
}
