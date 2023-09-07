import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {
    public Tela() {
        setTitle("ProFlix");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);

        JLabel nome = new JLabel("ProFlix");
        nome.setFont(new Font("Arial", Font.BOLD, 40));
        nome.setForeground(Color.WHITE);
        nome.setBounds(325, 100, 300, 50);
        add(nome);

        JTextField user = new JTextField();
        user.setFont(new Font("Arial", Font.BOLD, 15));
        user.setBounds(290, 200, 200, 25);
        add(user);

        JLabel userName = new JLabel("Usuario");
        userName.setFont(new Font("Arial", Font.PLAIN, 20));
        userName.setBounds(200, 200, 90, 25);
        userName.setForeground(Color.WHITE);
        add(userName);

        JPasswordField password = new JPasswordField();
        password.setFont(new Font("Arial", Font.BOLD, 15));
        password.setBounds(290, 240, 200, 25);
        add(password);

        JLabel indiSenha = new JLabel("Senha");
        indiSenha.setFont(new Font("Arial", Font.PLAIN, 20));
        indiSenha.setBounds(200, 240, 90, 25);
        indiSenha.setForeground(Color.WHITE);
        add(indiSenha);

        JButton logIn = new JButton("Entrar");
        logIn.setFont(new Font("Arial", Font.BOLD, 15));
        logIn.setBounds(290, 275, 200, 50);
        logIn.setBackground(Color.BLACK);
        logIn.setForeground(Color.WHITE);
        logIn.addActionListener(this::entrar);
        add(logIn);

        JButton signUp = new JButton("Cadastrar");
        signUp.setFont(new Font("Arial", Font.BOLD, 15));
        signUp.setBounds(290, 335, 200, 50);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this::cadastro);
        add(signUp);

        revalidate();
        repaint();
        setVisible(true);
    }

    private void cadastro(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Estamos em manuntençao");
    }

    private void entrar(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Estamos em manutençao");
    }
}