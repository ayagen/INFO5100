package com.neu.student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 576, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent ss = new AddStudent();
				ss.setVisible(true);
			}
		});
		btnAdd.setBounds(500, 16, 61, 29);
		btnAdd.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(btnAdd);
		
		table = new JTable();
		table.setBounds(5, 78, 576, 279);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Mike", "3", "90"},
				{"2", "Scortt", "4", "80"},
				{"3", "Ryan", "5", "100"},
				{"4", "Michal", "6", "70"},
			},
			new String[] {
				"ID", "Name", "Grade", "Score"
			}
		));
		contentPane.add(table);
	}

}
