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
    private ArrayList<Dance> dances = new ArrayList<Dance>();

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
        dances.add(dance);
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
            FromTextToObj();
            out.writeObject(dances);
            out.close();
            textarea1.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void FromTextToObj(){
        char[] text = textarea1.getText().toCharArray();
        char[][] temp = new char[4][10];
        int i=0,j=0,k=0,l=0;
        while (i!=text.length){
            while(text[i]!='(')
                i++;
            i++;
            while(text[i-1]!=')') {
                while ((text[i] != ',')&&(text[i]!=')')) {
                    temp[k][j] = text[i];
                    i++;
                    j++;
                }
                for (;j<10;j++)
                    temp[k][j]=' ';
                j=0;
                k++;
                i++;
            }
            k=0;
            dances.get(l).rithm = new String(temp[0]).trim();
            dances.get(l).composition = new String(temp[1]).trim();
            dances.get(l).dynamics = new String(temp[2]).trim();
            dances.get(l).figure = new String(temp[3]).trim();
            l++;
            i++;
        }
    }


    @FXML
    public void deserialize() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("serfile.txt"));
            dances.clear();
            dances=(ArrayList<Dance>)in.readObject();
            in.close();

        } catch (ClassNotFoundException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Dance dance:dances ){
            textarea1.appendText(dance.getName());
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
    }

}
