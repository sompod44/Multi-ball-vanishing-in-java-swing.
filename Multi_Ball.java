/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_java_ball_paint;

/**
 *
 * @author Sompod_Programmer
 */
public class Multi_Ball {
    private int x;
    private int y;
    private int dx;
    private int dz;
    private int radius;
    private boolean print;

    public Multi_Ball(int x, int y, int dx, int dz, int radiusm,boolean print) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dz = dz;
        this.radius = radiusm;
        this.print = print;
    }

    public boolean isPrintornot() {
        return print;
    }

    public void setPrintornot(boolean printornot) {
        this.print = printornot;
    }
    
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDz() {
        return dz;
    }

    public void setDz(int dz) {
        this.dz = dz;
    }
    

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}
