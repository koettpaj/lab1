import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws Exception{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String buttonInfo = stdin.readLine();



        window2 myWindow = new window2(buttonInfo);

    }
}

