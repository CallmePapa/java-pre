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
	JLabel label = new JLabel("标签");
	JButton btn = new JButton("确定");
	JTextField text = new JTextField("文本框");

	public pricate() {
		text.setBackground(Color.RED);
		
		// 设置字体
		label.setFont(new Font("宋体",0,20));;
		btn.setFont(new Font("楷体", 0, 25));
		//设置前景色
		label.setForeground(Color.blue);
		// 设置背景色
		label.setBackground(Color.gray);
		btn.setBackground(Color.CYAN);
		
		// FlowLayout布局
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
	// 主函数
	public static void main(String[] args) {
		new pricate();
	}
}
