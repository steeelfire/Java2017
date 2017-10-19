package lesson170724;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DemoInterfaces {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Demo");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.addMouseListener(new MymouseListener());
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });
        panel.setPreferredSize(new Dimension(400,400));
        jFrame.add(panel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}

