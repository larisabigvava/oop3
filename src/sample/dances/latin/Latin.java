package sample.dances.latin;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Latin {
    public Rumba rumba;
    public Tango tango;

    public void getDance(String Dance)
    {
        switch (Dance) {
            case "rumba": rumba = new Rumba();
            case "tango": tango = new Tango();
        }
    }
}
