package sample.dances.folk;

import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
/* Хоровод */
public class Roundelay extends Dance{
    public Roundelay() {
        this.rithm = "fast";
        this.composition = "certain";
        this.dynamics = "low";
        this.figure = "certain";
    }

    public String getName(){
        return "roundelay";
    }
}
