package mapa;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField campoLogin;
    private JPasswordField campoSenha;
    private JLabel labelLogin;
    private JLabel labelSenha;
    private JButton botaoEntrar;
    private JButton botaoRegistrar;

    public Login() {
        super("Login");

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(265, 200);

        configurarTela();
    }

    private void configurarTela() {
        campoLogin = new JTextField(20);
        campoSenha = new JPasswordField(20);
        campoLogin.setFont(new Font("Serif", Font.PLAIN, 14));
        campoSenha.setFont(new Font("Serif", Font.PLAIN, 14));

        labelLogin = new JLabel("Login");
        labelLogin.setToolTipText("Login");

        this.add(labelLogin);
        this.add(campoLogin);

        labelSenha = new JLabel("Senha");
        labelSenha.setToolTipText("Senha");
        this.add(labelSenha);

        this.add(campoSenha);

        botaoEntrar = new JButton("Entrar");
        botaoEntrar.setToolTipText("Clique para entrar");
        this.add(botaoEntrar);
        botaoEntrar.addActionListener(new TrataEventoEntrar());

        botaoRegistrar = new JButton("Registrar");
        botaoRegistrar.setToolTipText("Clique para se registrar");
        this.add(botaoRegistrar);
        botaoRegistrar.addActionListener(new TrataEventoRegistrar());
    }

    private class TrataEventoEntrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String login = campoLogin.getText();
            String senha = new String(campoSenha.getPassword());

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mapa", "root", "root");
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, nome FROM usuario WHERE login = ? AND senha = ?");
                preparedStatement.setString(1, login);
                preparedStatement.setString(2, senha);

                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(Login.this, "Acesso Autorizado");
                } else {
                    JOptionPane.showMessageDialog(Login.this, "Acesso Negado");
                }

                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(Login.this, "Erro ao verificar as credenciais: " + e.getMessage());
            }
        }
    }

    private class TrataEventoRegistrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            Registrar rg = new Registrar();
            setVisible(false);
            rg.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }
}
