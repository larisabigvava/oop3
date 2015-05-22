package sample;

import com.sun.java.util.jar.pack.*;
import javafx.collections.FXCollections;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import sample.dances.Dance;

public class Controller {
    public String chosenDance;

    @FXML
    public void chooseBreakdance() {
        chosenDance = "breakdance";
        addToTextArea();
    }

    @FXML
    public void chooseHiphop() {
        chosenDance = "hip-hop";
        addToTextArea();
    }

    @FXML
    public void chooseJive() {
        chosenDance = "jive";
        addToTextArea();
    }

    @FXML
    public void chooseRumba() {
        chosenDance = "rumba";
        addToTextArea();
    }

    @FXML
    public void chooseTango() {
        chosenDance = "tango";
        addToTextArea();
    }

    @FXML
    public void chooseLezginka() {
        chosenDance = "lezginka";
        addToTextArea();
    }

    @FXML
    public void chooseRoundelay() {
        chosenDance = "roundelay";
        addToTextArea();
    }

    @FXML
    public void chooseContemp() {
        chosenDance = "contemp";
        addToTextArea();
    }

    @FXML
    public void chooseGogo() {
        chosenDance = "go-go";
        addToTextArea();
    }

    @FXML
    public void chooseElectro() {
        chosenDance = "electro";
        addToTextArea();
    }

    @FXML
    public void chooseHouse() {
        chosenDance = "house";
        addToTextArea();
    }

    @FXML
    public void chooseRomantic() {
        chosenDance = "romantic";
        addToTextArea();
    }

    @FXML
    public void chooseClassic() {
        chosenDance = "classic";
        addToTextArea();
    }

    @FXML
    public void chooseModern() {
        chosenDance = "modern";
        addToTextArea();
    }

    @FXML
    private TextArea textarea1;

    @FXML
    public void addToTextArea() {
        textarea1.appendText(chosenDance);
        FactoryChoose factChoose = new FactoryChoose();
        Dance dance = factChoose.createDance(chosenDance);
        textarea1.appendText("(");
        textarea1.appendText(dance.rithm);
        textarea1.appendText(",");
        textarea1.appendText(dance.composition);
        textarea1.appendText(",");
        textarea1.appendText(dance.dynamics);
        textarea1.appendText(",");
        textarea1.appendText(dance.figure);
        textarea1.appendText(")\n");
    }

    @FXML
    public void serialize()  {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serfile.txt"));
            out.writeObject(textarea1.getText());
            out.close();
            textarea1.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Dance> dances = new ArrayList<Dance>();

    @FXML
    public void deserialize() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("serfile.txt"));
            dances.clear();
            textarea1.setText((String) in.readObject());
            in.close();

        } catch (ClassNotFoundException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
