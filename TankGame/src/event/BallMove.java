package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        new BallMove();
    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y =10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y = y+10;
            this.repaint();
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            y = y-10;
            this.repaint();
        }
        else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x = x-10;
            this.repaint();
        }
        else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x = x+10;
            this.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
