package urvi2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class questionnarie extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	 private JComboBox<Object> comboBox;
	
	 private String types[]
			 = {"vegan", "vegeterian", "non vegeterian ", "eggeterian"};
	/**
	 * Launch the application.
	 */
	public static void questionScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questionnarie frame = new questionnarie();
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
	public questionnarie () throws java.lang.ClassNotFoundException
	{
		setTitle("Questionnarie Page");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 712);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("    QUESTIONNAIER");
		lblNewLabel.setBounds(170, 10, 352, 69);
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("What's Your Age?");
		lblNewLabel_1.setBounds(47, 134, 334, 31);
		lblNewLabel_1.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblNewLabel_1.setBackground(new Color(128, 128, 128));
		getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(199, 141, 144, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("What's your eating prefrence?");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(47, 188, 213, 46);
		getContentPane().add(lblNewLabel_2);

		 comboBox = new JComboBox<Object>(types);
		comboBox.setBounds(270, 202, 178, 32);
		getContentPane().add(comboBox);

		JLabel lblNewLabel_3 = new JLabel("What's your height?");
		lblNewLabel_3.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblNewLabel_3.setBounds(47, 262, 178, 31);
		getContentPane().add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(223, 263, 72, 32);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("What's your weight?");
		lblNewLabel_4.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblNewLabel_4.setBounds(47, 323, 161, 32);
		getContentPane().add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setBounds(223, 326, 72, 31);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Are you diabetic?");
		lblNewLabel_5.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblNewLabel_5.setBounds(51, 389, 137, 31);
		getContentPane().add(lblNewLabel_5);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
		rdbtnNewRadioButton.setFont(new Font("Bell MT", Font.ITALIC, 18));
		rdbtnNewRadioButton.setBounds(199, 393, 72, 23);
		getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("NO");
		rdbtnNewRadioButton_1.setFont(new Font("Bell MT", Font.ITALIC, 18));
		rdbtnNewRadioButton_1.setBounds(273, 393, 111, 23);
		getContentPane().add(rdbtnNewRadioButton_1);

		JLabel lblNewLabel_6 = new JLabel("Do you have any disease/disorder?");
		lblNewLabel_6.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblNewLabel_6.setBounds(51, 443, 244, 31);
		getContentPane().add(lblNewLabel_6);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("YES");
		rdbtnNewRadioButton_2.setFont(new Font("Bell MT", Font.ITALIC, 18));
		rdbtnNewRadioButton_2.setBounds(291, 449, 72, 23);
		getContentPane().add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("NO");
		rdbtnNewRadioButton_3.setFont(new Font("Bell MT", Font.ITALIC, 18));
		rdbtnNewRadioButton_3.setBounds(365, 447, 59, 23);
		getContentPane().add(rdbtnNewRadioButton_3);

		JLabel lblNewLabel_7 = new JLabel("If yes then describe?");
		lblNewLabel_7.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblNewLabel_7.setBounds(47, 495, 144, 31);
		getContentPane().add(lblNewLabel_7);

		textField_3 = new JTextField();
		textField_3.setBounds(199, 502, 213, 24);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Are you allergic to any food?");
		lblNewLabel_8.setFont(new Font("Bell MT", Font.ITALIC, 18));
		lblNewLabel_8.setBounds(47, 548, 213, 31);
		getContentPane().add(lblNewLabel_8);

		textField_4 = new JTextField();
		textField_4.setBounds(247, 555, 177, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
	//	JButton 
		}
		

	}


