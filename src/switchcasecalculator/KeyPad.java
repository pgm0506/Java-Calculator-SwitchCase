package switchcasecalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 소스만 입력하고 Ctrl+Shift+O를 누른다. 
public class KeyPad extends JFrame implements ActionListener {
	private JPanel panel1;
	private String temp = "";

	public KeyPad() {
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3, 3));
		add(panel1, BorderLayout.CENTER);
		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton("" + i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100, 30));
			panel1.add(btn);
		}
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String result = "";
		
		
		
		
	}
	
	}