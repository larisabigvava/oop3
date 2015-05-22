package sample;

import sample.dances.Dance;
import sample.dances.ballroom.Classic;
import sample.dances.ballroom.Modern;
import sample.dances.ballroom.Romantic;
import sample.dances.club.Electro;
import sample.dances.club.House;
import sample.dances.easy.Contemp;
import sample.dances.easy.Gogo;
import sample.dances.folk.Lezginka;
import sample.dances.folk.Roundelay;
import sample.dances.latin.Rumba;
import sample.dances.latin.Tango;
import sample.dances.street.Breakdance;
import sample.dances.street.Hiphop;
import sample.dances.street.Jive;

import java.security.InvalidParameterException;

/**
 * Created by Seagull on 11.05.2015.
 */
public class FactoryChoose {
    public Dance createDance (String name){
        switch (name){
            case("romantic"):
                return new Romantic();
            case ("classic"):
                return new Classic();
            case ("modern"):
                return new Modern();
            case ("electro"):
                return new Electro();
            case ("house"):
                return new House();
            case ("contemp"):
                return new Contemp();
            case ("go-go"):
                return new Gogo();
            case ("lezginka"):
                return new Lezginka();
            case ("roundelay"):
                return new Roundelay();
            case ("rumba"):
                return new Rumba();
            case ("tango"):
                return new Tango();
            case ("breakdance"):
                return new Breakdance();
            case ("jive"):
                return new Jive();
            case ("hip-hop"):
                return new Hiphop();
            default: throw new InvalidParameterException("Use only defined dances");
        }
    }
}
