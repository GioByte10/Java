import javax.swing.JFrame;
import java.awt.GridLayout;

public class Frame extends JFrame {
	
	Dice s;
	
	public Frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setResizable(false);
		setTitle("Graphics");
		
		init();
		
	}
	
	public void init() {
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1, 1, 0, 0));
		
		s = new Dice();
		add(s);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Frame();
		
	}

}
