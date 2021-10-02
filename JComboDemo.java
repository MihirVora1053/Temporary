import javax.swing.*;
import java.awt.*;
public class JComboDemo extends JFrame{
	String[] names={"None","Mihir","Ashish","Vora","Jay","Dev","Anuj"};
	JComboDemo(String s){
		super(s);
		JComboBox<String> jc=new JComboBox<String>(names);
		add(jc);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setsize(500,500);
	}
	public static void main(String[] args){
		new JComboDemo("Combo");
	}
}