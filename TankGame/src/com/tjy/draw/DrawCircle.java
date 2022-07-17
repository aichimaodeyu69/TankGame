package com.tjy.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{//JFrame对应窗口，可以理解为画框
    private MyPanel mp= null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

class MyPanel extends JPanel {


    //MyPanel是一个画板
    //Graphics g是一只画笔
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,10,10);

        //演示绘制不同的图形
    }
}
