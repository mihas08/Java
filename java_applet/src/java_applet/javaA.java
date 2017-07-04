package java_applet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class javaA extends Applet implements ActionListener{
	
	final static int COLUMNS = 2;
	final static int ROWS = 6;
	final static int HORIZ_GAP = 5;
	final static int VERT_GAP = 5;

	JPanel panel;
	JTextField txtName;
	Choice lstyou;	
	CheckboxGroup radioage;
	Checkbox radio1;
	Checkbox radio2;
	Checkbox radio3;
	Checkbox radio4;
	Checkbox radio5;
	JButton btnSend;
	JButton btnClear;

    
    public void init(){

//    	setBackground(Color.white);
    	panel = new JPanel();       
    	panel.setLayout(new GridLayout(ROWS, COLUMNS, HORIZ_GAP, VERT_GAP));    	
    	panel.setBackground(Color.white);
    	
    	//==========================
    	panel.add(new Label("Enter name"));
		
    	txtName = new JTextField(15);
    	panel.add(txtName);
		
    	//==========================		
    			panel.add(new Label("Enter your age"));
    					
    			radioage = new CheckboxGroup();		
    			radio1 = new Checkbox("10-20", false, radioage);		
    			radio2 = new Checkbox("21-30", false, radioage);
    			radio3 = new Checkbox("31-40", false, radioage);
    			radio4 = new Checkbox("41-50", false, radioage);
    			radio5 = new Checkbox("51-", false, radioage);
    			
    			JPanel radioPanel = new JPanel();
    			radioPanel.setBackground(Color.white);
    			radioPanel.add(radio1);
    			radioPanel.add(radio2);
    			radioPanel.add(radio3);
    			radioPanel.add(radio4);
    			radioPanel.add(radio5);
    			
    			panel.add(radioPanel);
    			
		//==========================
		panel.add(new Label("You are"));
				
		lstyou = new Choice();
		lstyou.add("male");
		lstyou.add("female");
		panel.add(lstyou);
		
		
		//==========================
		btnSend = new JButton("Send");
		btnClear = new JButton("Clear");
		
		btnSend.addActionListener(this);
		btnClear.addActionListener(this);
		
		JPanel btnSendPanel = new JPanel();
		btnSendPanel.setBackground(Color.white);
		btnSendPanel.add(btnSend);
		panel.add(btnSendPanel);
		
		JPanel btnClearPanel = new JPanel();
		btnClearPanel.setBackground(Color.white);
		btnClearPanel.add(btnClear);
		panel.add(btnClearPanel);
		
		//==========================
		add(panel);		
    }


	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == btnSend){
			String message = "";
			
			if(!txtName.getText().equals("") && 				
					 radioage.getSelectedCheckbox()!=null){
					
						message+= "Name: " + txtName.getText();
						message+= "\nYou are: " + lstyou.getSelectedItem();
						message+= "\nYour age is: " + radioage.getSelectedCheckbox().getLabel();
					}
					
			else{
				message+= "Please fill all the fields.";
			}
			
			JOptionPane.showMessageDialog(null, message);
		}
		else if(evt.getSource() == btnClear){
			txtName.setText("");
			lstyou.select(0);
			radioage.setSelectedCheckbox(null);
		}
		
	}

}