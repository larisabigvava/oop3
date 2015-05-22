package sample.dances.latin;

import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Rumba extends Dance {
    public Rumba() {
        this.rithm = "fast";
        this.composition = "certain";
        this.dynamics = "high";
        this.figure = "certain";
    }
    public String getName(){
        return "rumba";
    }
}
