package telas;

import javax.swing.*;
import java.awt.*;

import botoes.BotaoCadastrar;
import botoes.BotaoEntrar;
import labels.Titulo;
import labels.UserPass;
import textAndPass.Password;
import textAndPass.Username;

public class TelaLogIn extends JFrame {
    public TelaLogIn() {
        setTitle("Pro Hub");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);

        Titulo  primNome = new Titulo();
        add(primNome.getPro());

        Titulo segNome = new Titulo();
        add(segNome.getHub());

        Username usuario = new Username();
        add(usuario.getUsuario());

        Password senha = new Password();
        add(senha.getSenha());

        UserPass indicUs = new UserPass();
        add(indicUs.getIndicUs());

        UserPass indicSe = new UserPass();
        add(indicSe.getIndicPas());

        BotaoEntrar logIN = new BotaoEntrar();
        add(logIN.getLogIn());

        BotaoCadastrar cadastro = new BotaoCadastrar(this);
        JButton signUp = cadastro.getsignUp();
        add(signUp);


        revalidate();
        repaint();
        setVisible(true);
    }

}