package controller;

import model.ParkeerBoete;
import model.SnelheidsBoete;
import model.VerkeersBoete;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 4.2 Verkeersboetes
 * <p>
 * Doel     OOP applicatie om boetes te beoordelen, waarbij hoogte afhankelijk is van type overtreding.
 */
public class VerkeersBoetesLauncher {
    public static void main(String[] args) {
        ParkeerBoete parkeerBoete = new ParkeerBoete("Test", "xx-xx-MINE",2);
        System.out.println(parkeerBoete.toString());
        System.out.println();

        SnelheidsBoete snelheidsBoete = new SnelheidsBoete("Test 2", "MICROP",
                120, 100);
        System.out.println(snelheidsBoete.toString());
        System.out.println();
    }
}
