package com.app.view;

//import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.app.controller.DBHelper;
import com.app.model.Student;

public class AddStudentGUI implements ActionListener {

	JFrame fr;
	JPanel pnlTitle, pnlName,  pnlEmail, pnlCourse, pnlButton, pnlAll;
	JLabel lblTitle, lblName,  lblEmail, lblCourse;
	JTextField txtName, txtEmail, txtCourse;
	JButton btnAddStudent;
	
	public AddStudentGUI() {
		fr = new JFrame("Add Student");
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlEmail = new JPanel();
		pnlCourse = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
		
		lblTitle = new JLabel("Enter Student Details");
		
		lblName = new JLabel();
		lblName.setText("Enter Student Name");
		
		lblEmail = new JLabel();
		lblEmail.setText("Enter Student Email");
		
		lblCourse = new JLabel();
		lblCourse.setText("Enter Student Course");
		
		txtName = new JTextField(16);
		txtEmail = new JTextField(16);
		txtCourse = new JTextField(16);
		
		btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(this);
		
	}
	
	
	public void showGUI() {
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlCourse.add(lblCourse);
		pnlCourse.add(txtCourse);
		
		pnlButton.add(btnAddStudent);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlCourse);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(5,1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		
		fr.setSize(400,400);
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Student sRef= new Student();
		sRef.name=txtName.getText();
		sRef.email=txtEmail.getText();
		sRef.course=txtCourse.getText();
		
		DBHelper db = new DBHelper();
		db.createConnectionn();
		db.saveStudentInDB(sRef);
		db.closeConnection();
		
	}
}
