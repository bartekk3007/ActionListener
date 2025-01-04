import javax.swing.*;
import java.awt.*;

public class MyComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        String filename = "animal.jpg";
        Image image = new ImageIcon(filename).getImage();
        Point centerPoint = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        g.drawImage(image, centerPoint.x - image.getWidth(null) / 2, centerPoint.y - image.getHeight(null) / 2, null);
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(640, 360);
    }
}