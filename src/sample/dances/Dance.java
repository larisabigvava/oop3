package sample.dances;

import java.io.Serializable;

/**
 * Created by Seagull on 07.05.2015.
 */
public abstract class Dance implements Serializable{
    public String rithm;
    public String figure;
    public String dynamics;
    public String composition;
    public String getName(){
        return "name";
    }
}
