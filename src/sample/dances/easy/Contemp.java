package sample.dances.easy;

import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Contemp extends Dance{
    public Contemp() {
        this.rithm = "slow";
        this.composition = "free";
        this.dynamics = "high";
        this.figure = "free";
    }

    public String getName(){
        return "contemp";
    }
}
