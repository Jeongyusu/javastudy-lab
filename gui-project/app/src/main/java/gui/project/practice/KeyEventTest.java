package gui.project.practice;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener {
    public KeyEventTest() {
        setTitle("이벤트 예제");
        setSize(300, 200);
        JTextField tf = new JTextField(20);
        tf.addKeyListener(this);
        add(tf);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        display(e, "keyTyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        display(e, "keyPressed");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        display(e, "Key Realeasd");
    }

    protected void display(KeyEvent e, String s) {
        char c = e.getKeyChar();
        int keyCode = e.getKeyCode();
        String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
        System.out.println(s + " " + keyCode + " " + modifiers);

    }

    public static void main(String[] args) {
        KeyEventTest f = new KeyEventTest();

    }
}
