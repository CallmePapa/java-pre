package image;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Passwd extends JFrame implements ActionListener{
	JLabel lb=new JLabel("����������");
	JPasswordField txt1=new JPasswordField(25);
	JButton bn=new JButton("ȷ��");
	JTextField txt2=new JTextField(25);
	Passwd(){
		setSize(300,200);
		setVisible(true);
		setTitle("������֤");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(lb);
		add(txt1);
		txt1.setEchoChar('*');
		add(bn);
		add(txt2);
		validate();
		bn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(txt1.getText().equals("weiqiujuan"))
			txt2.setText("Success");
		else txt2.setText("Error");
	}
}
public class frame {
	public static void main(String args[]) {
	    new Passwd();
	}
}
