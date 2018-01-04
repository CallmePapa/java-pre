package image;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

class FirstWindow extends JFrame{
	JMenuBar menubar;
	JMenu menu;
	JMenuItem item1,item2;
	FirstWindow(String s){
		super(s);
		setSize(160,170);
		setLocation(130,120);
		setVisible(true);
		menubar=new JMenuBar();
		menu=new JMenu("ÎÄ¼þ");
		item1=new JMenuItem("open",new ImageIcon("open.gif"));
		item2=new JMenuItem("save",new ImageIcon("save.gif"));
		item1.setAccelerator(KeyStroke.getKeyStroke('o'));
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
	    menubar.add(menu);
	    setJMenuBar(menubar);
	    validate();
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
public class Swing {
	public static void main(String args[]) {
	 new FirstWindow("´°¿Ú");
	}

}
