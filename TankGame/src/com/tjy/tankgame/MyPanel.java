package com.tjy.tankgame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Hero hero = null;
    public MyPanel(){
        hero = new Hero(100,100);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.setColor(Color.BLACK);
        g.fillRect(0,0,1000,750);

        drawTank(hero.getX(),hero.getY(),g,0,1);
    }

    public void drawTank(int x,int y,Graphics g,int direct,int type){
        switch (type){
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        switch (direct){
            case 0:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);

        }
    }




}
