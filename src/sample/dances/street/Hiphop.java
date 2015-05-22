package sample.dances.street;

import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Hiphop extends Dance {
    public Hiphop() {
        this.rithm = "any";
        this.composition = "free";
        this.dynamics = "high";
        this.figure = "free";
    }

    public String getName(){
        return "hip-hop";
    }
}
