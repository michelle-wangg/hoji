package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

public class MainFrame implements ActionListener {

    public JFrame mainFrame;
    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    private JButton add;
    private JButton delete;
    private JButton correct;
    private JButton wrong;
    private JButton start;
    private JButton pause;

    private Timer timer;
    private int delay;

    public MainFrame() {
        initMainFrame();
    }

    public void initMainFrame() {
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(WIDTH,HEIGHT);

        initMainButtons();
        initTimer();
    }

    public void initMainButtons() {

        correct = new JButton("\u2705");
        correct.setSize(new Dimension(300,300));
        correct.addActionListener(this);

        wrong = new JButton("\u2716");
        wrong.setSize(new Dimension(300,300));
        wrong.addActionListener(this);

        start = new JButton("Start");
        start.setSize(new Dimension(300,300));
        start.addActionListener(this);

        pause = new JButton("Pause");
        pause.setSize(new Dimension(300,300));
        pause.addActionListener(this);
    }

    public void initTimer() {
        delay = 1000;
        timer = new Timer(delay, actionListener);
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void actionPerformed(ActionEvent e) {
        switch(e.getSource()) {
            case add: 

            
            case delete: 
                
            
            case correct: 
                
            
            case wrong: 
                
            
            case start: 
                
            
            case pause: 
                
            
        }
    }

}
