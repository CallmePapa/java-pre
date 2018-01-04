package image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class signIn {
	JFrame jframe=new JFrame("SignIn");
	JPanel jpanel=new JPanel();
	JButton btn01=new JButton("登录");
	JButton btn02=new JButton("注册");
	JTextField text01=new JTextField();
	JPasswordField text02=new JPasswordField();
	JLabel username=new JLabel("uName");
	JLabel pwd=new JLabel("key");
	JLabel login=new JLabel("");
	public signIn() {
		username.setBounds(25, 50, 70, 40);
		pwd.setBounds(25, 95, 70, 40);
		text01.setBackground(Color.white);
		text01.setBounds(80, 50, 150, 40);
		text02.setBackground(Color.white);
		text02.setBounds(80, 95, 150, 40);
		btn01.setFont(new Font("楷体", 0, 25));
		btn01.setBackground(Color.CYAN);
		btn01.setBounds(80, 160, 150, 40);
		btn02.setFont(new Font("楷体", 0, 25));
		btn02.setBackground(Color.CYAN);
		btn02.setBounds(80, 200, 150, 40);
		login.setBounds(80,300,150,40);
		login.setBounds(80,300,150,40);
		jpanel.setLayout(null);
		jpanel.setBackground(Color.LIGHT_GRAY);
		jpanel.add(btn01);
		jpanel.add(btn02);
		jpanel.add(text01);
		jpanel.add(text02);
		jpanel.add(username);
		jpanel.add(pwd);
		jpanel.add(login);
		Container contentPane=jframe.getContentPane();
        contentPane.add(jpanel);
        jframe.setVisible(true);
		jframe.setBounds(450, 200, 300, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//点击事件
		btn01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				login.setText("login success");
			}
		});
		btn02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n=JOptionPane
						.showConfirmDialog(null, "确定退出吗？", "友情提示",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);
				if(n==0){
					jframe.dispose();
				}
			}
		});
	}
	public static void main(String args[]) {
	  new signIn();
	}	
}
