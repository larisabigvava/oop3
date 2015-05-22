package sample.dances.easy;

/**
 * Created by Seagull on 07.05.2015.
 */
/* Свободный танец  */
public class Easy {
    public Contemp contemp;
    public Gogo gogo;

    public void getDance(String Dance)
    {
        switch (Dance) {
            case "contemp": contemp = new Contemp();
            case "gogo": gogo = new Gogo();
        }
    }
}
