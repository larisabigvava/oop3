package sample.dances.ballroom;

/**
 * Created by Seagull on 07.05.2015.
 */
public class Ballroom {
    public Classic classic;
    public Modern modern;
    public Romantic romantic;

    public void getDance(String Dance)
    {
        switch (Dance) {
            case "classic": classic = new Classic();
            case "modern": modern = new Modern();
            case "romantic": romantic = new Romantic();
        }
    }
}
