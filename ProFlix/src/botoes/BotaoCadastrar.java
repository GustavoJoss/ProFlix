package botoes;

import telas.TelaCadastro;
import telas.TelaLogIn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BotaoCadastrar {

    private final JFrame frameAnterior;

    public BotaoCadastrar(JFrame frameAnterior){
    this.frameAnterior = frameAnterior;

}

    public JButton getsignUp() {
        JButton signUp = new JButton("Cadastrar");
        signUp.setFont(new Font("Arial", Font.BOLD, 15));
        signUp.setBounds(290, 335, 200, 50);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(new Color(255, 215, 0));
        signUp.addActionListener(this::cadastro);

        return signUp;
    }

        private void cadastro(ActionEvent actionEvent) {
            TelaCadastro cadastro = new TelaCadastro();
            cadastro.setVisible(true);
            frameAnterior.dispose();
        }

        public JButton confCadastro(){
            JButton confCadastro = new JButton("Confirmar  Cadastro");

            return confCadastro;
        }

}
