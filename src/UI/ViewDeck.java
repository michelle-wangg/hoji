package UI;

import Sections.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ViewDeck implements ActionListener {
    public JFrame viewDeck;
    private JButton delete;
    private JButton newCard;
    private AddCard newCardWindow;
    private Deck deckOfCards;
    private static final String JSON_Save = "./data/BackEnd.json";

    public ViewDeck() {
        initViewDeck();
        initButton();
    }

    public void initViewDeck() {
        viewDeck = new JFrame();

    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == delete) {
            // ....
        } else if (e.getSource() == newCard) {
            new AddCard = new AddCard();
        }
    }

    public void initButton() {
        delete = new JButton("Delete");
        delete.addActionListener(this);
        addCard = new JButton("Add Card");
        addCard.addActionListener(this);
    }
}
