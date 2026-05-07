import javax.swing.*;

void main() {

    JFrame janela = new JFrame("Exemplo Swing");
    janela.setSize(300, 200);
    janela.setLayout(null);

    JButton button = new JButton("Clique aqui");
    button.setBounds(20,20,150,40);

    JTextField input = new JTextField();
    input.setBounds(20,80,150,40);

    button.addActionListener( e -> {
        String texto = input.getText();

        JOptionPane.showMessageDialog(null, "Você Digitou " + texto);
        IO.println("Você digitou " + texto);
    });

    janela.add(button);
    janela.add(input);

    janela.setVisible(true);
}
