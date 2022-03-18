package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class AddCard implements ActionListener {

    public JFrame addCardFrame;
    private JButton add;
    private JButton delete;
    private JTextField question;
    private JTextField answer;
    private JComboBox level;

    public AddCard() {

    }

    public void initAddCardFrame() {
        addCardFrame = new JFrame();
    }

    public void initAddCardButtons() {
        add = new JButton("Add FlashCard");
        add.setSize(new Dimension(300, 300));
        add.addActionListener(this);
    }

    public void addElementsToPanel(){
    
    }

}
