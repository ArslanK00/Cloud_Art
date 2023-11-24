package files;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI 
{
    private int Gheight;
    private int Gwidth;

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
        JFrame frame = new JFrame();
        frame.setSize(1249, 750);
        frame.setVisible(true);
        frame.setTitle("Fanbaslan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0x705549));
        frame.setMinimumSize(new Dimension(1250, 750));
        
        JPanel ColorsLeft = new JPanel(new GridLayout(5, 6));
        JPanel BottomFrame = new JPanel();
        JPanel TopRight = new JPanel();
        JPanel Drawing = new JPanel(new GridLayout(Gheight, Gwidth));
        
        JPanel empty = new JPanel();
        empty.setVisible(false);

        ColorsLeft.setBackground(new Color(0x46383c));
        ColorsLeft.setBounds(0, 0, 200, 500);
        
        Color[] c = {Color.red, Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA};
        Button b;
        for(int i = 1; i <= 6; i++)
        { 
            for(int j = 1; j <= 5; j++)
            {
                if( i * j < c.length)
                { b = new Button(0, 0, 40, 100, c[i*j]);}
                else{ b = new Button(0, 0, 40, 100, Color.white);}
                b.setActionCommand(b.getColor().toString());
                ColorsLeft.add(b);
            }
        }
        
        frame.add(ColorsLeft);
        
        BottomFrame.setBackground(Color.DARK_GRAY);
        BottomFrame.setBounds(200, 500, 900, 200);
       
        
        frame.add(BottomFrame);




        frame.add(empty);
        frame.setSize(1250, 750);
    }
}
