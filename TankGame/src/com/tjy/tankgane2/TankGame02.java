package com.tjy.tankgane2;

import javax.swing.*;

public class TankGame02 extends JFrame {
    MyPanel mp=null;
    public static void main(String[] args) {
        new TankGame02();
    }
    public TankGame02(){
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }
}
