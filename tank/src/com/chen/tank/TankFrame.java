package com.chen.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

    int x = 200;
    int y = 200;


    Dir dir = Dir.DOWN;

    final int SPEED = 10;


    public TankFrame() {
        setSize(800, 600);//窗口大小
        setResizable(false);//窗口大小不可改变
        setTitle("tank war");//窗口名称
        setVisible(true);

        this.addKeyListener(new MyKeyListener());

        //给窗口添加 关闭事件
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });


    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
        }
//        x += 10;
//        y += 10;
    }

    class MyKeyListener extends KeyAdapter {
        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;


        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    x -= 10;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    y -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    x += 10;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    y += 10;
                    break;
                default:
                    break;
            }

            setMainTankDir();

        }

        private void setMainTankDir() {
            if (bL) dir = Dir.LEFT;
            if (bU) dir = Dir.UP;
            if (bR) dir = Dir.RIGHT;
            if (bD) dir = Dir.DOWN;
        }


        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    x -= 10;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    y -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    x += 10;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    y += 10;
                    break;
                default:
                    break;
            }
        }
    }


}
