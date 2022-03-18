package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class StartFrame implements ActionListener {

    private JFrame startFrame;
    public static int WIDTH = 500;
    public static int HEIGHT = 500;
    private JButton start; 

    public StartFrame() {
        initStartFrame(); 
    } 

    public void initStartFrame() {
        startFrame = new JFrame();
        startFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        startFrame.setSize(WIDTH, HEIGHT); 

        initStartButtons(); 
    }
    
    public void initStartButtons() { 
        start = new JButton("Begin customizing your deck");
        start.setSize(new Dimension(300, 300));
        start.addActionListener(this);
        startFrame.add(start); 

    } 

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
            MainFrame.
	}
}
