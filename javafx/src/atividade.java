import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atividade {
    static void main() {

        List<Pessoa> ListaFormulario = new ArrayList<>();

        JFrame janela = new JFrame("Formulario");
        janela.setSize(800, 500);
        janela.setLayout(null);

        JButton button = new JButton("Enviar");
        button.setBounds(250,250,150,40);

        JButton buttonAdicionar = new JButton("Adicionar");
        buttonAdicionar.setBounds(400,250,150,40);


        JLabel label = new JLabel("Nome");
        label.setBounds(200,-10,150,40);

        JTextField input = new JTextField();
        input.setBounds(200,20,400,40);


        JLabel labelEmail = new JLabel("Email");
        labelEmail.setBounds(200,60,150,40);

        JTextField inputEmail = new JTextField();
        inputEmail.setBounds(200,90,400,40);


        JLabel labelTelefone = new JLabel("Telefone");
        labelTelefone.setBounds(200,130,150,40);

        JTextField inputTelefone = new JTextField();
        inputTelefone.setBounds(200,160,400,40);


        button.addActionListener( e -> {
            String texto = input.getText();

            JOptionPane.showMessageDialog(null, " Dados Salvos com sucesso " + ListaFormulario);
        });

        buttonAdicionar.addActionListener(e -> {
            Pessoa p = new Pessoa(inputEmail.getText(),inputTelefone.getText(),input.getText());
            ListaFormulario.add(p);
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
        });

        janela.add(label);
        janela.add(button);
        janela.add(input);
        janela.add(inputEmail);
        janela.add(labelEmail);
        janela.add(labelTelefone);
        janela.add(inputTelefone);
        janela.add(buttonAdicionar);

        janela.setVisible(true);
    }
}
