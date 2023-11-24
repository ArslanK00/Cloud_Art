import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//test
public class Button extends JButton implements ActionListener
{
    private int x, y, width, height;
    private Color color;

    public Button(int x, int y, int w, int h, Color c)
    {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        color = c;
        
        this.setBounds(this.x, this.y, width, height);
        this.setBackground(color);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String s = e.getActionCommand();
        System.out.println(s);
    }

    public Color getColor()
    {
        return color;
    }
}
