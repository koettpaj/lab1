import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class window extends JFrame {
    private JLabel nameTag;
    public window(){
        super("Carl och Edward");
        Handler handler = new Handler();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setBackground(Color.blue);
        setLayout(new FlowLayout());
        nameTag = new JLabel("Carl och Edward");

        add(nameTag);
        MyButton mybutton = new MyButton(Color.white, Color.cyan, "On", "Off");
        mybutton.addActionListener(handler);
        add(mybutton);
        setSize(400,400);


        setVisible(true);

    }

    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event){
            System.out.println("hej");
            MyButton buttonpressed = (MyButton)event.getSource();
            buttonpressed.toggleState();

        }

    }
}
