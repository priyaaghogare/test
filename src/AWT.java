import java.awt.*;
import java.awt.event.*;
public class AWT extends Frame implements ActionListener
{

	TextField tf;
	AWT(){
		tf=new TextField();
		tf.setBounds(100, 120,100, 20);
		Button b=new Button("Click me");
		b.setBounds(100, 180, 80, 30);
		
		b.addActionListener(this);
		
		add(b);
		add(tf);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Welcome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AWT();
	}

}
