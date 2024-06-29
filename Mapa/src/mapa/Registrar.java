package mapa;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Registrar extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField campoLogin;
    private JTextField campoSenha;
    private JTextField NomePedir;
    private JLabel Nome;
    private JLabel labelLogin;
    private JLabel labelDeEntrada;   
    private JLabel labelSenha;
    private JLabel Email;
    private JTextField EmailPedir;
    private JButton botaoSalvar;

    public Registrar() {
        super("Registrar");

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(255, 350);

        configurarTela();
    }

    private void configurarTela() {
        labelDeEntrada = new JLabel("Cadastrar Novo Usuário");
      
        //label nome
        Nome = new JLabel("Nome");
        Nome.setToolTipText("Nome");
      
        //label Email
        Email = new JLabel("Email");
        Email.setToolTipText("Email");
         
        //campoEmail
        EmailPedir = new JTextField(20);
        
        //Label nome
        NomePedir = new JTextField(20);
        NomePedir.setToolTipText("Coloque seu nome completo");
         
        //campologin
        campoLogin = new JTextField(20);
        campoSenha = new JTextField(20);
        
        //campologin
        labelLogin = new JLabel("Login");
        labelLogin.setToolTipText("Login");
        
        //fontes
        campoLogin.setFont(new Font("Serif", Font.PLAIN, 14));
        NomePedir.setFont(new Font("Serif", Font.PLAIN, 14));
        campoSenha.setFont(new Font("Serif", Font.PLAIN, 14));
        labelDeEntrada.setFont(new Font("Serif", Font.PLAIN, 21));
        
       //labelsenha
        labelSenha = new JLabel("Senha");
        labelSenha.setToolTipText("Senha");

        //botaosalvar
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setToolTipText("Clique para Salvar");
        botaoSalvar.addActionListener(new TrataEventoSalvar());
        
        //adicionando..
        this.add(labelDeEntrada);
        this.add(Nome);
        this.add(NomePedir);
        this.add(labelLogin);
        this.add(campoLogin);
        this.add(labelSenha);
        this.add(campoSenha);
        this.add(Email);
        this.add(EmailPedir);
        this.add(botaoSalvar);
    }

    private class TrataEventoSalvar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            // Aqui você pode colocar a lógica para verificar o login e a senha
            String login = campoLogin.getText();
            String senha = campoSenha.getText();
            String email = EmailPedir.getText();
            String nome = NomePedir.getText();
                                     
            // Exemplo simples de verificação (substitua por sua lógica real)
            
            if (login.equals("") || senha.equals("") || nome.equals("") || email.equals("")) {
                JOptionPane.showMessageDialog(null, "ERROR, alguns campos podem não ter sido preenchidos");
            } else {
                // Código para inserir o usuário no banco de dados
                
                try {
                    Connection conn = Conection.getConexao();
                    String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";

                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, nome);
                    ps.setString(2, login);
                    ps.setString(3, senha);
                    ps.setString(4, email);

                    int rowsAffected = ps.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário.");
                    }

                    ps.close();
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário: " + e.getMessage());
                }
            }
        }
    }
}
