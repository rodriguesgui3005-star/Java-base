import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    JFrame janela = new JFrame("Login");
    janela.setSize(800,500);
    janela.setLayout(null);

    JLabel labelEmail = new JLabel("Email");
    labelEmail.setBounds(200, 60, 400, 40 );
    JTextField inputEmail = new JTextField();
    inputEmail.setBounds(200,90,400,40);


    JLabel labelSenha = new JLabel("Senha");
    labelSenha.setBounds(200,130,150,40);
    JTextField inputSenha = new JTextField();
    inputSenha.setBounds(200,160,400,40);

    JButton buttonLogin = new JButton("Login");
    buttonLogin.setBounds(200,250,150,40);

    buttonLogin.addActionListener(e -> {
        if("admin@senai.com".equals(inputEmail.getText()) &&
                "123456".equals(inputSenha.getText())) {
            JOptionPane.showMessageDialog(null, "acesso liberado");
        } else {
            JOptionPane.showMessageDialog(null, "negado");
        }
    });

    JButton buttonLimpar = new JButton("Limpar");
    buttonLimpar.setBounds(400,250,150,40);

    buttonLimpar.addActionListener(e -> {
        inputEmail.setText("");
        inputSenha.setText("");
    });

    janela.add(labelEmail);
    janela.add(inputEmail);
    janela.add(labelSenha);
    janela.add(inputSenha);
    janela.add(buttonLogin);
    janela.add(buttonLimpar);
    janela.setVisible(true);

}
