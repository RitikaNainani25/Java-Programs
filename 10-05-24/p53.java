import java.awt.*;

class AWT {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button btn = new Button("Click Me!");
        btn.setBounds(80, 100, 60, 30);
        frame.add(btn);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
