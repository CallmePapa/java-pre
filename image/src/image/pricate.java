package image;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pricate {
	JFrame jframe = new JFrame("01");
	JPanel jpanel = new JPanel();
	JLabel label = new JLabel("��ǩ");
	JButton btn = new JButton("ȷ��");
	JTextField text = new JTextField("�ı���");

	public pricate() {
		text.setBackground(Color.RED);
		
		// ��������
		label.setFont(new Font("����",0,20));;
		btn.setFont(new Font("����", 0, 25));
		//����ǰ��ɫ
		label.setForeground(Color.blue);
		// ���ñ���ɫ
		label.setBackground(Color.gray);
		btn.setBackground(Color.CYAN);
		
		// FlowLayout����
		FlowLayout flow = new FlowLayout();
		jpanel.setLayout(flow);
		jpanel.setBackground(Color.LIGHT_GRAY);
		
		jpanel.add(label);
		jpanel.add(btn);
		jpanel.add(text);
		Container contentPane = jframe.getContentPane();
		contentPane.add(jpanel);
		jframe.setVisible(true);
		jframe.setBounds(450, 200, 300, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	// ������
	public static void main(String[] args) {
		new pricate();
	}
}
