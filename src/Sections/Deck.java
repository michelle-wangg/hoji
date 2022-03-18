package Sections;  
import java.util.ArrayList;
import java.util.List; 

// deck of cards 
public class Deck { 

    private List<Card> deck; 

    // initializes a deck 
    public Deck() { 
        deck = new ArrayList<>(); 
    }

    // add card to deck 
    public void addCard(Card card) { 
        if (!deck.contains(card)) {
            deck.add(card);
        }
    }

    // remove card to deck 
    public void removeCard(Card toRemove) { 
        if (deck.contains(toRemove)) {
            deck.remove(toRemove);
        }
    }

    // count of cards in deck 
    public int getDeckCount() { 
        return deck.size();
    }
    
}