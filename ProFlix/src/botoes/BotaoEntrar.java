package botoes;

import telas.TelaCadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BotaoEntrar {
    //JButton logIn = new JButton("Entrar");

    public JButton getLogIn() {
        JButton logIn = new JButton("Entrar");
        logIn.setFont(new Font("Arial", Font.BOLD, 15));
        logIn.setBounds(290, 275, 200, 50);
        logIn.setBackground(Color.BLACK);
        logIn.setForeground(new Color(255, 215, 0));
        logIn.addActionListener(this::entrar);
        return logIn;
    }

    private void entrar (ActionEvent e) {

    }
}
