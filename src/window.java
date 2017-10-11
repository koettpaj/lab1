import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class window extends JFrame {
    private JLabel nameTag;
    public window(){
        super("Carl och Edward");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setBackground(Color.blue);
        setLayout(new FlowLayout());
        nameTag = new JLabel("Carl och Edward");

        add(nameTag);
        MyButton mybutton = new MyButton(Color.white, Color.cyan, "On", "Off");
        MyButton mybutton2 = new MyButton(Color.white, Color.cyan, "On", "Off");
        add(mybutton);
        setSize(400,400);


        setVisible(true);

    }


}
