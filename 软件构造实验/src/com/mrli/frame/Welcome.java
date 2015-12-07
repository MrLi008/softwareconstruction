package com.mrli.frame;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.mrli.dboperator.BridgeOfDataAndFrame;
import com.mrli.objects.UserLogData;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	/**
	 * 将界面控制在屏幕中间偏右
	 */
	private int widthCenter = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2);
	private int heightCenter = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()/2);
	private int width = 150;
	private int height = 100;
	private JTextField txtName;
	private JLabel lblPsw;
	private JTextField txtTxtpsw;
	private JButton btnLogOn;
	private JButton btnRegister;
	private JLabel lblTip;
	private JTextField txtTip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(widthCenter-width, heightCenter-height, width * 2, height * 2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(46, 25, 32, 21);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(88, 25, 136, 21);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		lblPsw = new JLabel("psw");
		lblPsw.setBounds(46, 56, 32, 21);
		contentPane.add(lblPsw);
		
		txtTxtpsw = new JTextField();
		txtTxtpsw.setBounds(88, 56, 136, 21);
		contentPane.add(txtTxtpsw);
		txtTxtpsw.setColumns(10);
		
		lblTip = new JLabel("tip");
		lblTip.setBounds(46, 87, 32, 21);
		contentPane.add(lblTip);
		
		txtTip = new JTextField();
		txtTip.setBounds(88, 87, 136, 21);
		contentPane.add(txtTip);
		txtTip.setColumns(10);
		
		btnLogOn = new JButton("Log on");
		btnLogOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( BridgeOfDataAndFrame.isSame(
						new UserLogData( 
								txtName.getText(), 
								txtTxtpsw.getText()
								))){
					/**
					 * 登陆成功
					 */
					System.out.println("success");
				} else {
					/**
					 * 登陆失败
					 */
					System.out.println(" false");
				}
			}
		});
		btnLogOn.setBounds(46, 118, 102, 34);
		contentPane.add(btnLogOn);
		
		btnRegister = new JButton("register");
		btnRegister.setBounds(172, 118, 102, 34);
		contentPane.add(btnRegister);
		
	}
	
	public static void getWelcomeFrame(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
