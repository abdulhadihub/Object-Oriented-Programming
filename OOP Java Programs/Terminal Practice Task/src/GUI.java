import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI extends JFrame {
	
	JPanel name;
	JPanel email;
	
	JLabel firstName;
	JLabel lastName;
	JLabel title;
	JLabel nickName;
	JLabel format;
	
	JTextField firstNameTF;
	JTextField lastNameTF;
	JTextField titleTF;
	JTextField nickNameTF;
	
	JComboBox formatList;
	
	String[] combo = {"item 1", "item 2", "item 3", "item 4"};
	
	JLabel emailAddress;
	JTextField emailTF;
	JLabel mailFormat;
	JButton add;
	JRadioButton html = new JRadioButton("HTML");
	JRadioButton pt = new JRadioButton("Plain Text");
	JRadioButton custom = new JRadioButton("Custom");
	ButtonGroup htmlEtc;
	
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("Cancel");
	
	ActionHandler actionHandle = new ActionHandler();
	PrintWriter output;
	
	
	public GUI() throws FileNotFoundException {		
		name = new JPanel();
		email = new JPanel();
		
		firstName = new JLabel("First Name: ");
		firstNameTF = new JTextField(5);
		lastName = new JLabel("Last Name: ");
		lastNameTF = new JTextField(5);
		title= new JLabel("Title: ");
		titleTF = new JTextField(5);
		nickName = new JLabel("Nickname: ");
		nickNameTF = new JTextField(5);
		output = new PrintWriter(new File("userdata.txt"));
		
		format = new JLabel("Format: ");
		formatList = new JComboBox(combo);
		
		emailAddress = new JLabel("E-mail Address: ");
		emailTF = new JTextField(5);
		add = new JButton("Add");
		mailFormat = new JLabel("Mail Format: ");
		htmlEtc = new ButtonGroup();
		mailFormat.setFont(new Font("Serif", Font.PLAIN, 12));
		
		firstNameTF.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				firstNameTF.setText("");
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				
				
			}
			
		});
		
		lastNameTF.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				lastNameTF.setText("");
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				
				
			}
			
		});
		nickNameTF.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				nickNameTF.setText("");
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				
				
			}
			
		});
		
		formatList.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				String item = (String)e.getItem();
				
				titleTF.setText(item);
				nickNameTF.setText(item);
				
			}
			
		});
		
		titleTF.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				titleTF.setText("");
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				
				
			}
			
		});
		
		emailTF.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				emailTF.setText("");
				
			}

			@Override
			public void focusLost(FocusEvent e) throws IndexOutOfBoundsException{
				String mail = emailTF.getText();
				String[] mailArr = mail.split("@");
				String part1 = mailArr[0];
				String part23 = mailArr[1];
//				String[] part23Arr = part23.split(".", 1);
//				String part2 = part23Arr[0];
//				String part3 = part23Arr[1];
//				
				System.out.println(part1);
				
			}
			
		});
		
		html.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(html.isSelected()) {
					mailFormat.setFont(new Font("Times New Roman", Font.ITALIC, 20));
				}
				
			}
			
		});
		
		pt.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(pt.isSelected()) {
					mailFormat.setFont(new Font("Serif", Font.PLAIN, 12));
				}
			}
			
		});
		
		custom.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(custom.isSelected()) {
					mailFormat.setFont(new Font("Serif", Font.PLAIN, 12));
				}
			}
			
		});
		
		add.addActionListener(actionHandle);
		
		htmlEtc.add(html);
		htmlEtc.add(pt);
		htmlEtc.add(custom);
		
		email.add(emailAddress);
		email.add(emailTF);
		email.add(add);
		email.add(mailFormat);
		email.add(html);
		email.add(pt);
		email.add(custom);
		email.setLayout(new FlowLayout());
		
		
		name.add(firstName);
		name.add(firstNameTF);
		name.add(lastName);
		name.add(lastNameTF);
		name.add(title);
		name.add(titleTF);
		name.add(nickName);
		name.add(nickNameTF);
		name.add(format);
		name.add(formatList);
		name.setLayout(new FlowLayout());
		
		ok.addActionListener(actionHandle);
		
		add(name);
		add(email);
		add(ok);
		add(cancel);
		
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(700, 500);
	}

	public static void main(String[] args) {
		try {
			new GUI();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	private class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == ok) {
				if(firstNameTF.getText() == "" || lastNameTF.getText() == "" || nickNameTF.getText() == "" ) {
					JOptionPane.showMessageDialog(null, "Text Field names should be filled", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Exiting", "Exit", JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			if(e.getSource() == add) {
				output.println(firstNameTF.getText());
				output.println(lastNameTF.getText());
				output.println(emailTF.getText());
				output.close();
				System.out.println("File Write Successful");
			}
				
		}
		
	}

}
