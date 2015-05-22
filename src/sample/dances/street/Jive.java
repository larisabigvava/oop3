package sample.dances.street;

import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Jive extends Dance {
    public Jive() {
        this.rithm = "fast";
        this.composition = "certain";
        this.dynamics = "high";
        this.figure = "certain";
    }

    public String getName(){
        return "jive";
    }
}
