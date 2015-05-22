package sample.dances.club;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Club {
    public Electro electro;
    public House house;

    public void getDance(String Dance)
    {
        switch (Dance) {
            case "electro": electro = new Electro();
            case "house": house = new House();
        }
    }
}
