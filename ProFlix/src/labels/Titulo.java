package labels;

import javax.swing.*;
import java.awt.*;

public class Titulo {
    public JLabel getPro() {
        JLabel pro = new JLabel("Pro");
        pro.setFont(new Font("Arial", Font.BOLD, 40));
        pro.setForeground(Color.WHITE);
        pro.setBounds(315, 100, 300, 50);

        return  pro;
    }

    public JLabel getHub(){


        JLabel hub = new JLabel("Hub");
        hub.setFont(new Font("Arial", Font.BOLD, 40));
        hub.setForeground(new Color(255,215,0));
        hub.setBounds(390, 100, 300, 50);

        return hub;
    }
}
