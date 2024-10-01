import java.io.*;
import javax.swing.*;

class SWING{
    public static void main(String[] args){
        JFrame frame = new JFrame("SWING Example");
        JButton btn = new JButton("Click Me!");
        btn.setBounds(15, 20, 80, 50);
        frame.add(btn);
        frame.setSize(200, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
