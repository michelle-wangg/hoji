package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import Sections.*;

public class MainFrame implements ActionListener {

    public JFrame mainFrame;
    public Deck deck;

    private JButton correct;
    private JButton wrong;
    private JButton start;
    private JButton pause;
    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    public JPanel mainPanel;

    private PomoTimer pomo;


    public MainFrame() {
        initMainFrame();
    }

    public void initMainFrame() {
        mainFrame = new JFrame();
        mainPanel = new JPanel(new GridBagLayout());
        mainFrame.add(mainPanel);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(WIDTH, HEIGHT);

        initMainButtons();
    }

    public void initMainButtons() {

        correct = new JButton("\u2705");
        correct.setSize(new Dimension(300, 300));
        correct.addActionListener(this);
        mainPanel.add(correct);

        wrong = new JButton("\u2716");
        wrong.setSize(new Dimension(300, 300));
        wrong.addActionListener(this);
        mainPanel.add(correct);

        start = new JButton("Start");
        start.setSize(new Dimension(300, 300));
        start.addActionListener(this);
        mainPanel.add(correct);

        pause = new JButton("Pause");
        pause.setSize(new Dimension(300, 300));
        pause.addActionListener(this);
        mainPanel.add(correct);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == correct) {
            // deck.getNextCard();
        } else if (e.getSource() == wrong) {
            // WRONG
        } else if (e.getSource() == start) {
            pomo.startTimer();
        } else if (e.getSource() == pause) {
            pomo.stopTimer();
        }
    }

}

class TimerActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

        System.out.println("test");

    }
}
