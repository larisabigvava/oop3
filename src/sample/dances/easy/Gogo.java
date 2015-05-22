package sample.dances.easy;

import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Gogo extends Dance {
    public Gogo() {
        this.rithm = "any";
        this.composition = "free";
        this.dynamics = "low";
        this.figure = "free";
    }

    public String getName(){
        return "gogo";
    }
}
