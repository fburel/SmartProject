package florianburel.fr.smartproject;

import java.util.ArrayList;

/**
 * Created by fl0 on 09/09/2014.
 */
public class Zone
{

    public enum HeatingMode
    {
        ECO, CONFORT, STOP, HORS_GEL, PROG,
    }

    private String name;
    private ArrayList<Heater> heaters;
    private double point;
    private HeatingMode mode;

    // accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Heater> getHeaters() {
        return heaters;
    }

    public void setHeaters(ArrayList<Heater> heaters) {
        this.heaters = heaters;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public HeatingMode getMode() {
        return mode;
    }

    public void setMode(HeatingMode mode) {
        this.mode = mode;
    }


    // constructors

    public Zone(String name) {
        this.name = name;

    }

    // TODO : une nouvelle zone doit avoir 10 radiateurs
    // TODO : une nouvelle zone doit avoir un sp entre 16 et 25;
    // TODO : une nouvelle zone doit etre creer en mode STOPPED
    // TODO : Changer le sp d'une zone change le sp de tous ses radiateurs
    // TODO : Changer le mode d'une zone change le mode de tous ces radiateurs.

}
