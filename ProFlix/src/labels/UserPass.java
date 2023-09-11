package labels;

import javax.swing.*;
import java.awt.*;

public class UserPass {

    public JLabel getIndicUs(){
        JLabel indiUsuario = new JLabel("Usuario");
        indiUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
        indiUsuario.setBounds(100, 200, 90, 25);
        indiUsuario.setForeground(new Color(255, 215, 0));

        return indiUsuario;

    }

    public JLabel getIndicPas(){
        JLabel indiSenha = new JLabel("Senha");
        indiSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        indiSenha.setBounds(100, 240, 90, 25);
        indiSenha.setForeground(new Color(255, 215, 0));

        return indiSenha;
    }

    public JLabel getIndiEmail(){
        JLabel indiEmail = new JLabel("Email");
        indiEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        indiEmail.setBounds(100, 120, 90, 25);
        indiEmail.setForeground(new Color(255, 215, 0));

        return indiEmail;
    }

    public JLabel getIndiNovoUser(){
        JLabel indiUser = new JLabel("Usuario");
        indiUser.setFont(new Font("Arial", Font.PLAIN, 20));
        indiUser.setBounds(100, 160, 90, 25);
        indiUser.setForeground(new Color(255, 215, 0));

        return indiUser;

    }

    public JLabel getIndiNovaSenha(){
        JLabel indiSenha = new JLabel("Senha");
        indiSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        indiSenha.setBounds(100, 200, 90, 25);
        indiSenha.setForeground(new Color(255, 215, 0));
        return  indiSenha;

    }

    public JLabel getIndiConf(){
        JLabel indiConfi = new JLabel("Confirme a senha");
        indiConfi.setFont(new Font("Arial", Font.PLAIN, 20));
        indiConfi.setBounds(100, 240, 155, 25);
        indiConfi.setForeground(new Color(255, 215, 0));
        return indiConfi;

    }


}


