package com.mrli.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.border.BevelBorder;

import com.mrli.dboperator.JDBCDemo;
import com.mrli.objects.MajorPlan;
import com.mrli.objects.TrainingPlan;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.LinkedList;
import java.util.Random;

public class CreateTrainingPlan extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtYearTrainingPlan;
	private JTextField txtNameTrainingPlan;
	private JTextField txtBeginTrainingPlan;
	private JTextField txtEndTrainingPlan;
	/**
	 * 面向数据库操作
	 */
	private LinkedList<JTextField[]> inputList = new LinkedList<JTextField[]>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateTrainingPlan frame = new CreateTrainingPlan();
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
	public CreateTrainingPlan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 537, 27);
		contentPane.add(menuBar);
		
		JMenu menu = new JMenu("\u6587\u4EF6");
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("\u7F16\u8F91");
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("\u67E5\u770B");
		menuBar.add(menu_2);
		
		JMenu menu_3 = new JMenu("\u5DE5\u5177");
		menuBar.add(menu_3);
		
		JMenu menu_4 = new JMenu("\u5E2E\u52A9");
		menuBar.add(menu_4);
		
		JPanel trainingPlanPanel = new JPanel();
		trainingPlanPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TrainingPlan", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLACK));
		trainingPlanPanel.setBounds(10, 37, 527, 99);
		contentPane.add(trainingPlanPanel);
		trainingPlanPanel.setLayout(null);
		
		JLabel lblYear = new JLabel("year");
		lblYear.setBounds(130, 36, 54, 15);
		trainingPlanPanel.add(lblYear);
		
		txtYearTrainingPlan = new JTextField();
		txtYearTrainingPlan.setText("2015");
		txtYearTrainingPlan.setBounds(194, 33, 66, 21);
		trainingPlanPanel.add(txtYearTrainingPlan);
		txtYearTrainingPlan.setColumns(10);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(270, 36, 54, 15);
		trainingPlanPanel.add(lblName);
		
		txtNameTrainingPlan = new JTextField();
		txtNameTrainingPlan.setText("\u7535\u6C14\u57F9\u8BAD");
		txtNameTrainingPlan.setBounds(334, 33, 66, 21);
		trainingPlanPanel.add(txtNameTrainingPlan);
		txtNameTrainingPlan.setColumns(10);
		
		JLabel lblBegin = new JLabel("begin");
		lblBegin.setBounds(130, 61, 54, 15);
		trainingPlanPanel.add(lblBegin);
		
		txtBeginTrainingPlan = new JTextField();
		txtBeginTrainingPlan.setText("1203");
		txtBeginTrainingPlan.setBounds(194, 58, 66, 21);
		trainingPlanPanel.add(txtBeginTrainingPlan);
		txtBeginTrainingPlan.setColumns(10);
		
		JLabel lblEnd = new JLabel("end");
		lblEnd.setBounds(270, 61, 54, 15);
		trainingPlanPanel.add(lblEnd);
		
		txtEndTrainingPlan = new JTextField();
		txtEndTrainingPlan.setText("1211");
		txtEndTrainingPlan.setBounds(334, 58, 66, 21);
		trainingPlanPanel.add(txtEndTrainingPlan);
		txtEndTrainingPlan.setColumns(10);
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(413, 32, 93, 23);
		trainingPlanPanel.add(btnSave);
		
		JButton btnSubmit = new JButton("submit");
		btnSubmit.setBounds(413, 57, 93, 23);
		trainingPlanPanel.add(btnSubmit);
		
		/**
		 * 产生随机数
		 */
		int bound = 40;
		Random r = new Random();
		int num = r.nextInt(bound);
		
		JLabel lblId = new JLabel("ID: " + num);
		lblId.setBounds(10, 36, 108, 38);
		trainingPlanPanel.add(lblId);
		
		JPanel majorPlanPanel = new JPanel();
		majorPlanPanel.setBorder(new TitledBorder(null, "MajorPlan", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		majorPlanPanel.setBounds(10, 146, 527, 241);
		contentPane.add(majorPlanPanel);
		majorPlanPanel.setLayout(null);
		
		JButton btnAdd = new JButton("add");
		btnAdd.setBounds(299, 22, 69, 34);
		majorPlanPanel.add(btnAdd);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setBounds(448, 22, 69, 34);
		majorPlanPanel.add(btnDelete);
		
		JPanel panelMajorPlanList = new JPanel();
		panelMajorPlanList.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panelMajorPlanList.setBounds(10, 64, 507, 167);
		majorPlanPanel.add(panelMajorPlanList);
		int  counterRow = 1;
		GridLayout layout = new GridLayout(counterRow, 5, 5, 5);
		panelMajorPlanList.setLayout(layout);
		
		JLabel label = new JLabel("\u4E13\u4E1A");
		panelMajorPlanList.add(label);
		
		JLabel label_1 = new JLabel("\u57F9\u8BAD\u76EE\u7684");
		panelMajorPlanList.add(label_1);
		
		JLabel label_2 = new JLabel("\u57F9\u8BAD\u5185\u5BB9");
		panelMajorPlanList.add(label_2);
		
		JLabel label_3 = new JLabel("\u8BFE\u65F6");
		panelMajorPlanList.add(label_3);
		
		JLabel label_4 = new JLabel("\u6388\u8BFE\u4EBA");
		panelMajorPlanList.add(label_4);
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.setRows(layout.getRows()+1);
				panelMajorPlanList.setLayout(layout);
				JTextField[] text = new JTextField[5];
				for( int i=0; i < text.length; i++){
					text[i] = new JTextField("sqdad");
					panelMajorPlanList.add(text[i]);
				}
				inputList.add(text);
				contentPane.repaint();
			}
		});
		btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				for( int i=0; i < inputList.size(); i++){
					for( int j=0; j < inputList.get(i).length; j++){
						if( inputList.get(i)[j].equals("")){
							System.out.println("empty here");
							inputList.get(i)[j].setText("empty here");
						}
					}
				}
			}
		});
		/**
		 * 保存数据
		 */
		btnSubmit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JDBCDemo jdbc = new JDBCDemo();
				/**
				 * TrainingPlan
				 */
				jdbc.insert(new TrainingPlan(
						num + " ",
						txtNameTrainingPlan.getText(),
						Integer.parseInt(txtYearTrainingPlan.getText()),
						Integer.parseInt(txtBeginTrainingPlan.getText()),
						Integer.parseInt(txtEndTrainingPlan.getText())
						));
				/**
				 * MajorPlan
				 */
				for( int i=0; i < inputList.size(); i++){
					jdbc.insert(new MajorPlan(
							inputList.get(i)[0].getText(),
							r.nextInt(1000) + " ",
							inputList.get(i)[1].getText(),
							inputList.get(i)[2].getText(),
							Integer.parseInt(inputList.get(i)[3].getText()),
							inputList.get(i)[4].getText(),
							num+""
							));
				}
			}
		});
	}
}
