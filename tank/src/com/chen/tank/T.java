package com.chen.tank;

public class T {
    public static void main(String[] args) throws InterruptedException {
        //frame 是一个窗口
        TankFrame f = new TankFrame();
        while (true){
            Thread.sleep(50);
            f.repaint();
        }


//        f.setVisible(true);
    }
}
