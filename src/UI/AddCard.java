package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class AddCard implements ActionListener{

    public JFrame frame;
    public JFrame errorFrame;
    private JButton addButton;
    private JTextField questionField;
    private JTextField answerField;
    private JComboBox level;


    public AddCard() {
        initNewCardFrame();
    }

    public void initNewCardFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(650, 500);
        initNewCardFrame();
        initNewCardButtons();
        initTextFields();
        initDropDown();
        addElementsToPanel();
    }

    public void initNewCardButtons() {
        addButton = new JButton("Add FlashCard");
        addButton.setSize(new Dimension(300, 300));
        addButton.addActionListener(this);
    }

    public void initTextFields() {
        questionField.setText(null);
        answerField.setText(null);
    }

    public void initDropDown() {
        String[] levels = { "Easy", "Medium", "Hard" };
        level = new JComboBox(levels);
        level.setSelectedIndex(2);
        level.addActionListener(this);
    }

    public void addElementsToPanel() {
        frame.add(addButton);
        frame.add(questionField);
        frame.add(answerField);
        frame.add(level);
        frame.add(level);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
    
    public void addButtonAction(){
        addButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			checkTextFields();
            addNewCard();
				
			}
            
        });
    }


private void errorWindow(String string){
    JOptionPane.showMessageDialog(errorFrame,string);
    initTextFields();
}

private void checkTextFields(){
    String question = questionField.getText();
    String answer  = answerField.getText();
    if(question.isEmpty()){
        errorWindow("Please enter a valid question!");
    }
    if(answer.isEmpty()){
        errorWindow("Please enter a valid answer!");
    }
    if(question.isEmpty() && answer.isEmpty()){
        errorWindow("No question or answer entered!");
    }
}

private void addNewCard(){
    
}


}
