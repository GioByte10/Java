import java.awt.*;
import javax.swing.JPanel;


public class GraphicsPanel extends JPanel {

    public GraphicsPanel() {
        this(null);  // Call the other constructor, with parameter null.
    }

    public GraphicsPanel(String messageString) {

        setBackground(Color.BLACK);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);  // Call the paintComponent method from the 
                                  // superclass, JPanel.  This simply fills the 
                                  // entire panel with the background color, black.
        
        Graphics2D g2 = (Graphics2D)g;  // (To make the text smoother.)
       
        int width = getWidth();
        int height = getHeight();
        
        g.setColor(Color.WHITE);
        g.fillRect(10,10,100,100);
        g.setColor(Color.BLUE);
        g.drawRect(10,10,100,100);

        } // end 

    } // end paintComponent()
