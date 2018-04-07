/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java_ball_paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Sompod_Programmer
 */
public class Ball_paint_panel extends JPanel implements ActionListener {

    private Timer timer;
    private static final int timelapes = 150;
    public Multi_Ball[] multi_Balls;

    public Random randoms = new Random();

    public Ball_paint_panel() {
        timer = new Timer(timelapes, this);
        timer.start();
        multi_Balls = new Multi_Ball[20];
        boolean b = true;
        for (int i = 0; i < 20; i++) {
            multi_Balls[i] = new Multi_Ball(randoms.nextInt(700), randoms.nextInt(600), randoms.nextInt(10), randoms.nextInt(10), 10 + randoms.nextInt(50), b);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int i = 0; i < 20; i++) {
            switch (i) {
                case 0:
                    g.setColor(Color.red);
                    break;
                case 1:
                    g.setColor(Color.BLUE);
                    break;
                case 2:
                    g.setColor(Color.CYAN);
                    break;
                case 3:
                    g.setColor(Color.DARK_GRAY);
                    break;
                case 4:
                    g.setColor(Color.GRAY);
                    break;
                case 5:
                    g.setColor(Color.GREEN);
                    break;
                case 6:
                    g.setColor(Color.MAGENTA);
                    break;
                case 7:
                    g.setColor(Color.ORANGE);
                    break;
                case 8:
                    g.setColor(Color.PINK);
                    break;
                case 9:
                    g.setColor(Color.YELLOW);
                    break;
                case 10:
                    g.setColor(Color.red);
                    break;
                case 11:
                    g.setColor(Color.BLUE);
                    break;
                case 12:
                    g.setColor(Color.CYAN);
                    break;
                case 13:
                    g.setColor(Color.DARK_GRAY);
                    break;
                case 14:
                    g.setColor(Color.GRAY);
                    break;
                case 15:
                    g.setColor(Color.GREEN);
                    break;
                case 16:
                    g.setColor(Color.MAGENTA);
                    break;
                case 17:
                    g.setColor(Color.ORANGE);
                    break;
                case 18:
                    g.setColor(Color.PINK);
                    break;
                case 19:
                    g.setColor(Color.YELLOW);
                    break;
            }
            if(multi_Balls[i].isPrintornot()){
                g.fillOval(multi_Balls[i].getX(), multi_Balls[i].getY(), multi_Balls[i].getRadius(), multi_Balls[i].getRadius());
            }
            

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double x1, x2, y1, y2, d1, d2;
        for (int i = 0; i < 20; i++) {
            multi_Balls[i].setX(multi_Balls[i].getX() + multi_Balls[i].getDx());
            multi_Balls[i].setY(multi_Balls[i].getY() + multi_Balls[i].getDz());
            if (multi_Balls[i].getX() < 0 || multi_Balls[i].getX() > 645) {
                multi_Balls[i].setDx(-multi_Balls[i].getDx());
            } else if (multi_Balls[i].getY() < 0 || multi_Balls[i].getY() > 510) {
                multi_Balls[i].setDz(-multi_Balls[i].getDz());
            }

            
            x1 = multi_Balls[i].getX() + multi_Balls[i].getRadius() / 2;
            y1 = multi_Balls[i].getY() + multi_Balls[i].getRadius() / 2;
            
            if(multi_Balls[i].isPrintornot() != false){
                for (int j = 0; j < 20; j++) {
                if (multi_Balls[j].isPrintornot() != false) {
                    if (i != j) {
                        x2 = multi_Balls[j].getX() + multi_Balls[j].getRadius() / 2;
                        y2 = multi_Balls[j].getY() + multi_Balls[j].getRadius() / 2;

                        d1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
                        d2 = (multi_Balls[i].getRadius() / 2) + (multi_Balls[j].getRadius() / 2);
                        if (d1 == d2 || d1 < d2) {
                            multi_Balls[i].setPrintornot(false);
                            multi_Balls[j].setPrintornot(false);

                        }

                    }
                }
            }
            }


        }

        repaint();

    }

}
