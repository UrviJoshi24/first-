package urvi2;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;

public class Calorie extends JFrame {

	private JPanel contentPane;
	String gender;
	private String gender1[]
			 = {"Male","Female","Others" };
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	 String height="",weight="",age="",calculate="";
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calorie frame = new Calorie();
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
	public Calorie() {
		setTitle("Calorie Calculator");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 767, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrCalorieCalculatore = new JTextArea();
		txtrCalorieCalculatore.setBounds(171, 46, 327, 59);
		txtrCalorieCalculatore.setBackground(new Color(211, 211, 211));
		txtrCalorieCalculatore.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		txtrCalorieCalculatore.setText("Calorie Calculator");
		contentPane.add(txtrCalorieCalculatore);
		
		JLabel lblNewLabel = new JLabel("Gender:");
		lblNewLabel.setBounds(171, 162, 121, 39);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox<Object>(gender1);
		comboBox.setBounds(328, 168, 107, 30);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Age:");
		lblNewLabel_1.setBounds(191, 226, 101, 30);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(296, 231, 139, 30);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("years");
		lblNewLabel_2.setBounds(427, 240, 85, 21);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Weight:");
		lblNewLabel_3.setBounds(191, 283, 95, 30);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(296, 288, 139, 30);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("kgs");
		lblNewLabel_4.setBounds(435, 292, 57, 21);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Height:");
		lblNewLabel_5.setBounds(191, 350, 95, 30);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(296, 350, 139, 30);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("cm");
		lblNewLabel_6.setBounds(432, 362, 45, 13);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(267, 428, 192, 39);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			calculate_calorie();
	}
	});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\calorie-1.jpg"));
		lblNewLabel_7.setBounds(0, 0, 753, 570);
		contentPane.add(lblNewLabel_7);

	}
	protected void calculate_calorie() {
		// TODO Auto-generated method stub

		if(textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty()) {
			error();
			return;
		}
		double a,h = 0,w = 0,r,c = 0;
		age=textField.getText();
	height=textField_1.getText();
	weight=textField_2.getText();
	r=w/Math.pow((h/100), 2);
	// DecimalFormat df = new DecimalFormat("###.##");
	// calculate="";
	// calculate+=String.valueOf(df.format(c));
     if (r==0)
     {
         c = (r * 1.375);
         calculate="\t Your calorie count is";
         DecimalFormat df = new DecimalFormat("###.##");
    	 calculate="";
    	 calculate+=String.valueOf(df.format(c));
     }
     else if (r>=0)
     {
         c = (r * 1.55);
         calculate="\t Your calorie count is ";
         DecimalFormat df = new DecimalFormat("###.##");
    	 calculate="";
    	 calculate+=String.valueOf(df.format(c));
     }
    
     else
     {
         c = (r * 1.9);
         calculate+="\t Your calorie count is ";
         DecimalFormat df = new DecimalFormat("###.##");
    	 calculate="";
    	 calculate+=String.valueOf(df.format(c));
     }
    

	 JFrame f =new JFrame(); 
	 JOptionPane.showMessageDialog(f,calculate); 
	 }
	
	public void error() {
		 JFrame f =new JFrame(); 
		 JOptionPane.showMessageDialog(f,"Fill all the details","Alert",JOptionPane.WARNING_MESSAGE); 
		 }
}

