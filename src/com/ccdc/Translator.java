package com.ccdc;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;


public class Translator {
	
	public void init(){
		final JFrame jFrame = new JFrame("计算器");
		final Container container = jFrame.getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		final JTextArea sourceText = new JTextArea(30,40);
		final JTextArea resultText = new JTextArea(30,40);
		
		final JTextField sourcCount = new JTextField(4);
		
		sourcCount.setHorizontalAlignment(JTextField.RIGHT);
		
		
		JScrollPane sourceScroll=new JScrollPane(sourceText);
	
		sourceScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sourceScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane resultScroll = new JScrollPane(resultText);

		resultScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		resultScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
//		resultScroll.setBounds(new Rectangle(93, 220, 180, 30));

		sourceText.setText("please enter text...");
		
		//sourceText.setSize(50, 600);
		//resultText.setSize(50, 600);
		
		final JButton btnTranslate2Col = new JButton("列表->2列");
		final JButton btnTranslate3Col = new JButton("列表->3列");
		final JButton btnWordOne = new JButton("TowColName");
		final JButton btnWordAddTab = new JButton("btnWordAddTab");
		/*
		JScrollPane sourcePane = new JScrollPane();
		JScrollPane translateBtnPane = new JScrollPane();
		JScrollPane resultPane = new JScrollPane();
		
		sourcePane.add(sourceText);
		translateBtnPane.add(b1);
		resultPane.add(resultText);*/
		
		btnTranslate2Col.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String source = sourceText.getText();
				
				NameSort nameSort = new NameSort();
				
				List<String> list = nameSort.String2ListAndSort(source);
				
				sourcCount.setText(String.valueOf(list.size()));
				
				StringBuffer sb = nameSort.HTML2Col(list);
				
				resultText.setText(sb.toString());
				
			}
		});
		btnTranslate3Col.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String source = sourceText.getText();
				
				NameSort nameSort = new NameSort();
				
				List<String> list = nameSort.String2ListAndSort(source);
				
				sourcCount.setText(String.valueOf(list.size()));
				
				StringBuffer sb = nameSort.HTML3Col(list);
				
				resultText.setText(sb.toString());
				
			}
		});
		
		btnWordOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String source = sourceText.getText();
				
				NameSort nameSort = new NameSort();
				
				List<String> list = nameSort.String2ListAndSort(source);
				
				sourcCount.setText(String.valueOf(list.size()));
				
				StringBuffer[] sb = nameSort.WordOne(list);
				
				resultText.setText("\n First col \n" + sb[0].toString() +"\n----second col-----\n"+ sb[1].toString());
				
			}
		});
		
		btnWordAddTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String source = sourceText.getText();
				
				NameSort nameSort = new NameSort();
				
				List<String> list = nameSort.String2List(source);
				
				sourcCount.setText(String.valueOf(list.size()));
				
				String sb = nameSort.blank2Tab(list);
				
				resultText.setText(sb);
				
			}
		});
		
		
		container.add(sourceScroll);
		
		container.add(resultScroll);
		
		container.add(sourcCount);
		
		container.add(btnTranslate2Col);
		container.add(btnTranslate3Col);
		container.add(btnWordOne);
		container.add(btnWordAddTab);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(950, 750);
		jFrame.setVisible(true);
	}
	

	public static void main(String[] args) {
		new Translator().init();
	}
	
}