package RevisaoAV1;

import javax.swing.*;
import java.awt.*;

public class botoes extends JFrame{
    private BorderLayout layout;

    private JButton botaoUm;
    private JButton botaoDois;
    private JCheckBox checkBox;
    private JRadioButton radioUm;
    private JTextField textField;
    private JTextField texto;

    botoes() {

        layout = new BorderLayout();
        this.setLayout(layout);

        botaoUm = new JButton("Botão Um");
        botaoDois = new JButton("Botão Dois");
        checkBox = new JCheckBox("verdadeiro");
        radioUm = new JRadioButton("Um");
        texto = new JTextField("Texto");

        this.setSize(300,300);

        add(checkBox, BorderLayout.CENTER);
        add(botaoUm, BorderLayout.NORTH);
        add(radioUm, BorderLayout.SOUTH);
        add(texto, BorderLayout.EAST);

    }
}
