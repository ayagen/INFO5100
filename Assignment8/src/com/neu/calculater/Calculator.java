package com.neu.calculater;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	
	private String interNumbers = "";
	private Stack<String> stack = new Stack<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(52, 16, 383, 67);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(52, 99, 383, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				stack.clear();
			}
		});
		btnNewButton.setBounds(52, 117, 71, 64);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("0");
		button.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button.getText());
				interNumbers += "0";
			}
		});
		button.setBounds(153, 118, 71, 64);
		contentPane.add(button);
		
		JButton button_1 = new JButton("+");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_1.getText());
				stack.push(interNumbers);
				stack.push("+");
				interNumbers = "";
			}
		});
		button_1.setBounds(257, 117, 71, 64);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_2.getText());
				interNumbers += "1";
			}
		});
		button_2.setBounds(52, 208, 71, 64);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_3.getText());
				interNumbers += "2";
			}
		});
		button_3.setBounds(153, 208, 71, 64);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_4.getText());
				interNumbers += "3";
			}
		});
		button_4.setBounds(257, 208, 71, 64);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_5.getText());
				interNumbers += "4";
			}
		});
		button_5.setBounds(52, 307, 71, 64);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_6.getText());
				interNumbers += "5";
			}
		});
		button_6.setBounds(153, 307, 71, 64);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_7.getText());
				interNumbers += "6";
			}
		});
		button_7.setBounds(257, 307, 71, 64);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("-");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_8.getText());
				stack.push(interNumbers);
				stack.push("-");
				interNumbers = "";
			}
		});
		button_8.setBounds(366, 117, 71, 64);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_9.getText());
				stack.push(interNumbers);
				stack.push("*");
				interNumbers = "";
			}
		});
		button_9.setBounds(366, 208, 71, 64);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("/");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_10.getText());
				stack.push(interNumbers);
				stack.push("/");
				interNumbers = "";
			}
		});
		button_10.setBounds(366, 307, 71, 64);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("7");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_11.getText());
				interNumbers += "7";
			}
		});
		button_11.setBounds(52, 408, 71, 64);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("8");
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_12.getText());
				interNumbers += "8";
			}
		});
		button_12.setBounds(153, 408, 71, 64);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("9");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + button_13.getText());
				interNumbers += "9";
			}
		});
		button_13.setBounds(257, 408, 71, 64);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stack.push(interNumbers);
				interNumbers = "";
				
				Stack<String> ano = new Stack<String>();
				while(!stack.isEmpty()) {
					String numb1 = stack.pop();
					if(stack.isEmpty()) {
						ano.push(numb1);
						break;
					}
					String op = stack.pop();
					String numb2 = stack.pop();
					if(op.equals("*")) {
						stack.push(String.valueOf(Integer.parseInt(numb1) * Integer.parseInt(numb2)));
					} else if(op.equals("/")) {
						stack.push(String.valueOf(Integer.parseInt(numb2) / Integer.parseInt(numb1)));
					} else {
						ano.push(numb1);
						ano.push(op);
						ano.push(numb2);
					}
				}
				while(!ano.isEmpty()) {
					String numb1 = ano.pop();
					if(ano.isEmpty()) {
						textField.setText(textField.getText() + "=" + numb1);
						break;
					}
					String op = ano.pop();
					String numb2 = ano.pop();
					
					int result = 0;
					if(op.equals("+")) {
						result += Math.addExact(Integer.parseInt(numb2), Integer.parseInt(numb1));
					} else if(op.equals("-")) {
						result += Math.subtractExact(Integer.parseInt(numb1), Integer.parseInt(numb2));
					}
					ano.push(String.valueOf(result));
				}
				
				stack.clear();
			}
		});
		button_14.setBounds(366, 408, 71, 64);
		contentPane.add(button_14);
	}
}
