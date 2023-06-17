import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MyFrame extends JFrame implements KeyListener {
    int bewegungsGeschwindigkeit = 30;
    JLabel label;
    ImageIcon icon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,60,60);
        label.setIcon(icon);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(label);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {

            case 'a': label.setLocation(label.getX()-bewegungsGeschwindigkeit,label.getY());
                break;
            case 'w': label.setLocation(label.getX(),label.getY()-bewegungsGeschwindigkeit);
                break;
            case 's': label.setLocation(label.getX(),label.getY()+bewegungsGeschwindigkeit);
                break;
            case 'd': label.setLocation(label.getX()+bewegungsGeschwindigkeit,label.getY());
                break;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }
}
