package files;

import java.awt.*;
import java.util.*;

import javax.swing.*;

/**
 * GUI 
 * 
 * @author Rgarcia, ArslanK00
 */
public class GUI 
{
    private int Gheight;
    private int Gwidth;

    private JPanel ColorsPanel;
    private JFrame frame;
    private JPanel rightScreen;
    private Button b;

    public GUI()
    {
        Gheight = 50;
        Gwidth = 50;
        create();
    }
    
   public GUI(int h, int w)
    {
        Gheight = h;
        Gwidth = w;
        create();
    }

    private void create()
    {
        frame = new JFrame();
        frame.setSize(1249, 750);
        frame.setVisible(true);
        frame.setTitle("Fanbaslan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0x705549));
        frame.setMinimumSize(new Dimension(1250, 750));
        frame.setLayout(new BorderLayout(50,50));
        
        JPanel BottomFrame = new JPanel();
        JPanel TopRight = new JPanel();
        JPanel Drawing = new JPanel(new GridLayout(Gheight, Gwidth));


        rightScreen = new JPanel(new FlowLayout());
        rightScreen.setBackground(new Color(12345));
        rightScreen.setPreferredSize(new Dimension(300, 1000));
        
        JPanel empty = new JPanel();
        empty.setVisible(false);

        
        
        Color[] c = {Color.red, Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA};
        ColorsPanel = new JPanel(new GridLayout(3, c.length/2));
        ColorsPanel.setBackground(new Color(0x46383c));
        // ColorsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 200, 100));
        // ColorsPanel.setBounds(frame.getWidth()-200, 100, 200, 400);
        ColorsPanel.setPreferredSize(new Dimension(300, 100));

        

        makeCells(c);
        
        frame.add(rightScreen, BorderLayout.EAST);
        rightScreen.add(ColorsPanel);
        
        BottomFrame.setBackground(Color.DARK_GRAY);
        BottomFrame.setBounds(200, 500, 900, 200);
       
        
        frame.add(BottomFrame);




        frame.add(empty);
        frame.setSize(1250, 750);
    }

    private void makeCells(Color[] colors) {
        for (Color color: colors) {
            b = new Button(0, 0, 40, 100, color);
            ColorsPanel.add(b);

            String temp = String.valueOf(b.getColor().getRed());
            temp += " " + b.getColor().getGreen();
            temp += " " + b.getColor().getBlue();
            b.setActionCommand(temp);
            ColorsPanel.add(b);
            ColorsPanel.revalidate();
            ColorsPanel.repaint();
        }
    }
}
