package sample.dances.folk;

import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Lezginka extends Dance{
    public Lezginka() {
        this.rithm = "fast";
        this.composition = "certain";
        this.dynamics = "high";
        this.figure = "certain";
    }
    public String getName(){
        return "lezginka";
    }
}
