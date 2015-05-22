package sample.dances.folk;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Folk {
    public Lezginka lezginka;
    public Roundelay roundelay;

    public void getDance(String Dance)
    {
        switch (Dance) {
            case "lezginka": lezginka = new Lezginka();
            case "roundelay": roundelay = new Roundelay();
        }
    }
}
