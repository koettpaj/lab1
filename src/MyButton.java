import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {
    private Color c1,c2;
    private String s1,s2;
    private Boolean toggled = false;
    public MyButton(Color c1, Color c2, String s1, String s2){
        super(s1);
        this.c1=c1;
        this.c2=c2;
        this.s1=s1;
        this.s2=s2;
        setSize(50,50);


    }
    public void toggleState(){
        if(toggled){
            setBackground(c1);
            setText(s1);
            this.toggled=false;
        }
        else{
            setBackground(c2);
            setText(s2);
            this.toggled=true;
        }
    }
}
