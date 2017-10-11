import javax.swing.*;
import java.awt.*;


public class window extends JFrame {
    private JLabel nameTag;
    public window(){
        super("Carl och Edward");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setBackground(Color.blue);
        nameTag = new JLabel("Carl och Edward");

        add(nameTag);

        setSize(400,400);

        setVisible(true);

    }
}
