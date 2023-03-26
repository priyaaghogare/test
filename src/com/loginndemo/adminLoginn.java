package com.loginndemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import org.w3c.dom.UserDataHandler;
public class adminLoginn extends Frame implements ActionListener
{
	
	static Label user;
	 static Label pass;
	 Label lblTitle;
	 Font titleFont;
	 private Label textField;
	 private Label passwordField;
	 public Button b ,b1;
	 TextField t ,t1;
	 JButton loginbt;
	
	
	 adminLoginn(){
		
		
	Frame f=new Frame();
	
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e)
			{
				System.exit(0);
			}
		});
		//f.setForeground(Color.green);
		
		lblTitle=new Label("***LOGIN FORM***");
		lblTitle.setBounds(600,200,300,50);
		lblTitle.setFont(new Font("verdana",Font.BOLD,16));
		lblTitle.setForeground(Color.BLUE);
		f.add(lblTitle);
		f.setBackground(Color.CYAN);
		
		
		Label l=new Label("USERNAME:");
		JTextField t=new JTextField();
		l.setBounds(500, 290, 100, 50);
		t.setBounds(600, 300, 200, 30);
		l.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l);
		f.add(t);
		
		
		Label l1=new Label("PASSWORD:");
		JTextField t1=new JTextField();		
		l1.setBounds(500, 320, 100, 80);		
		t1.setBounds(600, 350, 200, 30);	
		l1.setFont(new Font("verdana",Font.BOLD,14));
		f.add(t1);	
		f.add(l1);
		
		
		f.setSize(1500, 700);
		//f.setTitle("Login form");		
		f.setLayout(null);
		f.setVisible(true);
		//f.setForeground(Color.GREEN);
		
		 
		b1=new Button("login");
		b1.setBounds(580, 450, 130, 30);
		b1.setFont(new Font("verdana",Font.BOLD,14));
		f.add(b1);
		b1.setBackground(Color.LIGHT_GRAY);
	    b1.addActionListener(this);
		b1.addActionListener(this);
		b1.setVisible(true);
		  
		  
		   
	       setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
				
				 if (e.getSource() == b1)
				 	//if(t.contains(admin)&& t1.contains(password))
				 { 
					// JOptionPane.showMessageDialog(null, "Register...!");
					 JTabbedPane n=new JTabbedPane();
					n.setVisible(true);
					
				 }
				 		
				 else {
				 			 System.out.println("not submited...!");
				 		
				 }
			
	    }
	    	
	    
		 
	 public static void main(String[] args)
	 {
		 adminLoginn obj=new adminLoginn();
		
	 }
}
		
		