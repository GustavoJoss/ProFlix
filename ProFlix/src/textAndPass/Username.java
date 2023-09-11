package textAndPass;

import javax.swing.*;
import java.awt.*;

public class Username {
    public JTextField getUsuario(){
        JTextField user = new JTextField();
        user.setBackground(Color.BLACK);
        user.setForeground(new Color(255,215,0));
        user.setFont(new Font("Arial", Font.BOLD, 15));
        user.setBounds(290, 200, 200, 25);

        return user;
    }

    public JTextField getNovoEmail(){
        JTextField email = new JTextField();
        email.setBackground(Color.BLACK);
        email.setForeground(new Color(255,215,0));
        email.setFont(new Font("Arial", Font.BOLD, 15));
        email.setBounds(290, 120, 200, 25);

        return email;

    }

    public JTextField getNovoUsuario(){
        JTextField novoUser = new JTextField();
        novoUser.setBackground(Color.BLACK);
        novoUser.setForeground(new Color(255,215,0));
        novoUser.setFont(new Font("Arial", Font.BOLD, 15));
        novoUser.setBounds(290, 160, 200, 25);

        return novoUser;
    }
}
