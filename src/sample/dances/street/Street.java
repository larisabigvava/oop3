package sample.dances.street;

import sample.IStream;
import sample.dances.Dance;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Street implements IStream{
    public Hiphop hiphop;
    public Jive jive;
    public Breakdance breakdance;

    public void getDance(String Dance)
    {
        switch (Dance) {
            case "hiphop": hiphop = new Hiphop();
            case "jive": jive = new Jive();
            case "breakdance": breakdance = new Breakdance();
        }
    }
}
