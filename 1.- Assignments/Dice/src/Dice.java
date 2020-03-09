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
import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dice extends JPanel
{
	
	static boolean doubles = false, eyes = false;
	
    public Dice()                       // set up graphics window
    {
        super();
        setBackground(Color.BLACK);
        
        JButton b = new JButton("Doubles");  
        b.setBounds(250, 30, 95, 30);  
        b.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            doubles = true;  
        	            repaint();
        	        }  
        	    });  
        
        this.add(b);
        
        JButton b2 = new JButton("Snake Eyes");  
        b2.setBounds(300, 30, 95, 30);  
        b2.addActionListener(new ActionListener(){  
        	public void actionPerformed(ActionEvent e){  
        	            eyes = true;  
        	            repaint();
        	        }  
        	    });  
        
        this.add(b2);
    }

    public void paintComponent(Graphics g)  // draw graphics in the panel
    {
        int width = getWidth();             // width of window in pixels
        int height = getHeight();           // height of window in pixels



        super.paintComponent(g);            // call superclass to make panel display correctly
 
        //output a message at top of screen (x = 50, y = 50)
        g.setColor(Color.WHITE);
        g.drawString("Dice Simulation", 50, 50);
        //initialize the following variables, r1=0, r2=1, counter, startX = 70, startY = 70
        int r1 = 0;
        int r2 = 1;
        int counter = 0;
        int startX = 70;
        int startY = 70;
        
        
     

        if(doubles) {
        while (r1 != r2)
        {

       
            r1 = getRandomNumber();
            r2 = getRandomNumber();

        if (counter % 10 == 0 && counter!=0)
        {
            startX += 230;
            startY = 70;
            
        }

        
        showDie(g, "image/die" + r1 + ".jpg", startX, startY);
        showDie(g, "image/die" + r2 + ".jpg", startX + 70, startY);

        startY = startY + 75;

        counter++;

       } 
        }
        if(eyes){
        	while (!(r1 == 1 && r2 == 1))
            {

           
                r1 = getRandomNumber();
                r2 = getRandomNumber();

                if (counter % 10 == 0 && counter!=0)
                {
                    startX += 230;
                    startY = 70;
                    
                }

            
            showDie(g, "image/die" + r1 + ".jpg", startX, startY);
            showDie(g, "image/die" + r2 + ".jpg", startX + 70, startY);

            startY = startY + 75;

            counter++;
        	
        }
        	g.drawString("Counter = " + counter , 200, 50);
        }
        
        
       
    }

    public static void showDie(Graphics g, String fn, int x, int y)
    {

       
        ImageIcon die = new ImageIcon(fn);
        Image die2 = die.getImage();
        g.drawImage(die2, x, y, null);

    }

    public static int getRandomNumber()
    {
        return (int)(Math.random() * 6) + 1;
        
    }

    public static void main(String[] args)
    {
        Dice panel = new Dice();
        JFrame application = new JFrame();                            // the program itself
        
        
       
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // set frame to exit
                                                                      // when it is closed
        application.add(panel);          

        application.setSize(1000, 1000);         // window is 500 pixels wide, 400 high
        application.setVisible(true);          
    }
   
   

}