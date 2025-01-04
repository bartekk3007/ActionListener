import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main
{
    public static void main(String[] args)
    {
        var frame = new JFrame();
        //1536x816
        frame.setSize(1280, 720);
        frame.setTitle("Ramka");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setVisible(true);
        frame.add(new MyComponent());
        //frame.pack();

        ActionListener listener = new MyListener();
        JButton button = new JButton("OK");
        button.addActionListener(listener);

        System.out.println(System.getProperty("user.dir"));
        Point centerPoint = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        System.out.println(centerPoint.x);
        System.out.println(centerPoint.y);
    }
}