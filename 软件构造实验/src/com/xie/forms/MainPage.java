package com.xie.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

public class MainPage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 512);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u7CFB\u7EDF\u7BA1\u7406");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u7528\u6237\u7BA1\u7406");
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("\u57F9\u8BAD\u8BA1\u5212\u7BA1\u7406");
		menuBar.add(menu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u65B0\u589E");
		menu_1.add(mntmNewMenuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u4FEE\u6539");
		menu_1.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5220\u9664");
		menu_1.add(menuItem_2);
		
		JMenu menu_2 = new JMenu("\u57F9\u8BAD\u6210\u7EE9\u7BA1\u7406");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u5F55\u5165");
		menu_2.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u4FEE\u6539");
		menu_2.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u67E5\u8BE2");
		menu_2.add(menuItem_5);
		
		JMenu menu_3 = new JMenu("\u5B66\u5458\u7BA1\u7406");
		menuBar.add(menu_3);
		
		JMenuItem menuItem_6 = new JMenuItem("\u90E8\u95E8\u7BA1\u7406");
		menu_3.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("\u5B66\u5458\u57FA\u672C\u4FE1\u606F");
		menu_3.add(menuItem_7);
		
		JMenuItem menuItem_8 = new JMenuItem("\u5B66\u4E60\u8BB0\u5F55\u7BA1\u7406");
		menu_3.add(menuItem_8);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("wwfd");
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u67E5\u8BE2\u6761\u4EF6", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("\u57F9\u8BAD\u8BA1\u5212\u5E74\u5EA6\uFF1A");
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2015", "2016", "2017"}));
		panel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("\u57F9\u8BAD\u4E13\u4E1A\uFF1A");
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u7535\u6C14", "\u6C7D\u673A", "\u9505\u7089"}));
		panel.add(comboBox_1);
		
		JLabel label = new JLabel("\u57F9\u8BAD\u8BA1\u5212\u7C7B\u578B\uFF1A");
		panel.add(label);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"\u65B0\u5458\u5DE5\u5165\u5382\u57F9\u8BAD", "\u4E2D\u5C42\u7BA1\u7406\u4EBA\u5458\u57F9\u8BAD", "\u73ED\u7EC4\u957F\u57F9\u8BAD"}));
		panel.add(comboBox_2);
		
		JLabel label_1 = new JLabel("\u5B8C\u6210\u60C5\u51B5\u57F9\u8BAD\uFF1A");
		panel.add(label_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"\u672A\u57F9\u8BAD", "\u57F9\u8BAD\u4E2D", "\u5DF2\u57F9\u8BAD"}));
		panel.add(comboBox_3);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		panel_1.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("   \u521B\u5EFA     ");
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u4FEE\u6539");
		toolBar.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"\u5E8F\u53F7", "\u57F9\u8BAD\u8BA1\u5212\u540D\u79F0", "\u57F9\u8BAD\u65F6\u95F4", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(114);
		scrollPane.setColumnHeaderView(table);
	}

}
