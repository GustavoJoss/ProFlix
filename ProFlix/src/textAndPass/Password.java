package textAndPass;

import javax.swing.*;
import java.awt.*;

public class Password {
    public JPasswordField getSenha(){
        JPasswordField password = new JPasswordField();
        password.setFont(new Font("Arial", Font.BOLD, 15));
        password.setForeground(new Color(255, 215, 0));
        password.setBackground(Color.BLACK);
        password.setBounds(290, 240, 200, 25);
        return password;
    }

    public JPasswordField getNovaSenha(){
        JPasswordField senha = new JPasswordField();
        senha.setFont(new Font("Arial", Font.BOLD, 15));
        senha.setForeground(new Color(255, 215, 0));
        senha.setBackground(Color.BLACK);
        senha.setBounds(290, 200, 200, 25);
        return senha;
    }

    public JPasswordField getConfSenha(){
        JPasswordField conf = new JPasswordField();
        conf.setFont(new Font("Arial", Font.BOLD, 15));
        conf.setForeground(new Color(255, 215, 0));
        conf.setBackground(Color.BLACK);
        conf.setBounds(290, 240, 200, 25);
        return conf;
    }
}
