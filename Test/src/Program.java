import javax.swing.JFrame;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout; 
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import java.util.*;

public class Program extends JPanel {
	
	public static void main(String[] args) {
		
		Program panel = new Program(); 
        JFrame application = new JFrame();                            // the program itself
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // set frame to exit
                                                                      // when it is closed
        application.add(panel);           

        application.setSize(1000, 1000);         // window is 500 pixels wide, 400 high
        application.setVisible(true);  
		
		
	}
	
	 public Program()                       // set up graphics window
	    {
	        super();
	        setBackground(Color.BLACK);
	    }

	    public void paintComponent(Graphics g)  // draw graphics in the panel
	    {
	        int width = getWidth();             // width of window in pixels
	        int height = getHeight();           // height of window in pixels



	        super.paintComponent(g);            // call superclass to make panel display correctly
	 
	        //output a message at top of screen (x = 50, y = 50)
	        

	        //initialize the following variables, r1=0, r2=1, counter, startX = 70, startY = 70
	      

	        //create a while loop that checks that r1 and r2 are not equal
	        

	        // get two random numbers and assign it to r1 and r2
	        

	        // do this last -- if counter = 10 assign startX=300, startY = 70; moves to new column and back to top.  Do the same for 20 and 30.
	        

	        // call showDie method sending Graphics object, the die filename "die" + r1 + ".jpg", the value (1-6), x, y
	        

	        //increment the startY value by 75 (moves down 75 if it's not equal)
	       

	        //increment counter by 1
	       

	        // end of while 
	        
	        // draw a message on screen that outputs "Total times: " + counter.
	       
	        
	    }

	    public static void showDie(Graphics g, String fn, int x, int y) {

	        // method locads the filename (fn) and draws it at x, y

	    }

	    public static int getRandomNumber() {
	        // return Math.random() * 5; // 0-5 make sure your die images are die0.jpg die1.jpg die2.jpg..etc.
	    }

	
	
	
}