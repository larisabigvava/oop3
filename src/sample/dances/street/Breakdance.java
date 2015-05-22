package sample.dances.street;

import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Breakdance extends Dance {
    public Breakdance() {
        this.rithm = "fast";
        this.composition = "free";
        this.dynamics = "high";
        this.figure = "free";
    }
    public String getName(){
        return "breakdance";
    }
}
