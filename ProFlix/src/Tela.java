import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class Tela extends JFrame  {
    public Tela () {


        JFrame tela = new JFrame();
        setTitle("ProFlix");
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);


        JLabel nome = new JLabel();
        nome.setVisible(true);
        nome.setText("ProFlix");
        nome.setFont(new Font("Arial", Font.BOLD, 40));
        nome.setForeground(Color.WHITE);
        nome.setBounds(325, 100, 300, 50);

        add(nome);

        JTextField user = new JTextField();
        user.setVisible(true);
        user.setFont(new Font("Arial", Font.BOLD, 15));
        user.setBounds(290, 200, 200, 25);
        user.setBackground(Color.WHITE);

        add(user);

        JLabel userName = new JLabel();
        userName.setVisible(true);
        userName.setText("Usuario");
        userName.setFont(new Font("Arial", Font.PLAIN, 20));
        userName.setBounds(100, 200, 90, 50);
        userName.setForeground(Color.WHITE);

        add(userName);

        JPasswordField password = new JPasswordField();
        password.setVisible(true);
        password.setFont(new Font("Arial", Font.BOLD, 15));
        password.setBounds(290, 240, 200, 25);
        password.setBackground(Color.WHITE);

        add(password);

        JButton logIn = new JButton();
        logIn.setVisible(true);
        logIn.setText("Entrar");
        logIn.setBounds(290, 275, 200, 50);
        logIn.setFont(new Font("Arial", Font.BOLD, 15));
        logIn.setBackground(Color.BLACK);
        logIn.setForeground(Color.WHITE);

        add(logIn);

        JButton signUp = new JButton();
        signUp.setVisible(true);
        signUp.setText("Cadastrar");
        signUp.setBounds(290, 335, 200, 50);
        signUp.setFont(new Font("Arial", Font.BOLD, 15));
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);

        add(signUp);

        logIn.addActionListener(this::entrar);

        signUp.addActionListener(this::cadastro);


    }

    private void cadastro(ActionEvent actionEvent) {

        JOptionPane.showMessageDialog(null, "Estamos em manuntençao");
    }


    private void entrar(ActionEvent e) {

        JOptionPane.showMessageDialog(null, "Estamos em manutençao");
    }
}
