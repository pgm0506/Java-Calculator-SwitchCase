package switchcasecalculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 소스만 입력하고 Ctrl+Shift+O를 누른다. 
public class KeyPad extends JFrame implements ActionListener {
	private JPanel panel1;
	private JTextArea txt;
	String islem;
	int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
	public KeyPad() {
		
		txt = new JTextArea(5,40);
		add(txt, BorderLayout.NORTH);
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
		txt.setText("************************************\n"
				+ "1. 더하기\n" + "2. 빼기\n" + "3. 곱하기\n" + "4. 나누기\n" +
				"************************************");
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(islem == null || islem.isEmpty() ) {
			islem = actionCommand;
		}
		else if(a == Integer.MAX_VALUE)
			a = Integer.parseInt(actionCommand);
		else if(b == Integer.MAX_VALUE)
			b = Integer.parseInt(actionCommand);
		
		switch (islem) {
		case "1":
			if(a == Integer.MAX_VALUE)
				txt.setText("첫번째 수: ");
			else if(b == Integer.MAX_VALUE) 
				txt.setText(txt.getText() + actionCommand + ("\n두번째 수: "));
			else
				txt.setText(txt.getText() + actionCommand + "\n계산 결과 : " + (a + b));
			break;
		case "2":
			if(a == Integer.MAX_VALUE)
				txt.setText("첫번째 수: ");
			else if(b == Integer.MAX_VALUE) 
				txt.setText(txt.getText() + actionCommand + ("\n두번째 수: "));
			else
				txt.setText(txt.getText() + actionCommand + "\n계산 결과 : " + (a - b));
			break;
		case "3":
			if(a == Integer.MAX_VALUE)
				txt.setText("첫번째 수: ");
			else if(b == Integer.MAX_VALUE) 
				txt.setText(txt.getText() + actionCommand + ("\n두번째 수: "));
			else
				txt.setText(txt.getText() + actionCommand + "\n계산 결과 : " + (a * b));
			break;
		case "4":
			if(a == Integer.MAX_VALUE)
				txt.setText("첫번째 수: ");
			else if(b == Integer.MAX_VALUE) 
				txt.setText(txt.getText() + actionCommand + ("\n두번째 수: "));
			else
				txt.setText(txt.getText() + actionCommand + "\n계산 결과 : " + (a / b));
			break;
			
		default:
			txt.setText("잘못 선택하셨습니다 프로그램을 종료합니다");
		}

	}

}
	