package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class GUI implements ActionListener {
    private static final String JSON_Flashcard = "";

    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    //FRAMES
    private JFrame startFrame;
    private JFrame addCardFrame;

    private JPanel buttonPanel;

    //BUTTONS
    
    //makeSet frame
    private JButton makeCard;
    
    //DROPDOWN 
    private JComboBox chooseLevel; 

    //TEXTFIELDS
    //makeCard frame
    private JTextField insertAnswer;
    private JTextField insertQuestion;


    public GUI () {
        init();
    }

    public void init() {
        new StartFrame();
    }

    public void initAddCardButtons(){
        add = new JButton("Add FlashCard");
        add.setSize(new Dimension(300,300));
        add.addActionListener(this);

        delete = new JButton("Delete FlashCard");
        delete.setSize(new Dimension(300,300));
        delete.addActionListener(this);
    }

}