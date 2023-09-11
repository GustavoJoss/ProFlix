package telas;

import labels.UserPass;
import textAndPass.Password;
import textAndPass.Username;

import javax.swing.*;
import java.awt.*;


public class TelaCadastro extends JFrame {

    public TelaCadastro() {
        setTitle("Pro Hub");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);

        UserPass email = new UserPass();
        add(email.getIndiEmail());

        UserPass user = new UserPass();
        add(user.getIndiNovoUser());

        UserPass novaSenha = new UserPass();
        add(novaSenha.getIndiNovaSenha());

        UserPass conf = new UserPass();
        add(conf.getIndiConf());

        Username novoUser = new Username();
        add(novoUser.getNovoUsuario());

        Username novoEmail = new Username();
        add(novoEmail.getNovoEmail());

        Password caixaSenha = new Password();
        add(caixaSenha.getNovaSenha());

        Password caixaConf = new Password();
        add(caixaConf.getConfSenha());

        revalidate();
        repaint();
        setVisible(true);
    }
}
