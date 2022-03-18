package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ViewDeck implements ActionListener {
    public JFrame viewDeck;
    private JButton delete;
    private JButton newCard;
    private NewCard newCardWindow;
    private Deck deckOfCards;

    public ViewDeck() {
        initViewDeck();
        initButton();
    }

    public void initViewDeck() {
        viewDeck = new JFrame(); 
    }

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() = delete) {
           // ....
        } else if (e.getSource() = newCard) {
                newCardWindow = new NewCard();
        }
	}

    public void initButton() {
        delete = new JButton("Delete");
        delete.addActionListener(this);
        newCard = new JButton("Add Card");
        newCard.addActionListener(this);
    }
}
