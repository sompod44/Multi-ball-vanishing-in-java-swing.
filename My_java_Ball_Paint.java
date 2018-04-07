package my_java_ball_paint;
import javax.swing.*;
/**
 *
 * @author Sompod_Programmer
 */
public class My_java_Ball_Paint extends JFrame {
    public static final int x = 700;
    public static final int y = 600;

    public My_java_Ball_Paint() {
        getContentPane().add(new Ball_paint_panel());
        setTitle("Moving Ball By Sompod.");
        setSize(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new My_java_Ball_Paint();
    }
    
}
