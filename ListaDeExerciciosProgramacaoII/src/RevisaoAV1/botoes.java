package RevisaoAV1;

import javax.swing.*;
import java.awt.*;

public class botoes extends JFrame{

    private BorderLayout layout; //painel

    private JPanel claudir;

    private JButton botaoUm;
    private JButton botaoDois;
    private JCheckBox checkBox;
    private JRadioButton radioUm;
    private JTextField textField;
    private JTextField texto;

    botoes() {

        layout = new BorderLayout();


        claudir = new JPanel();

        botaoUm = new JButton("Botão Um"); //preencher o painel
        botaoDois = new JButton("Botão Dois");
        checkBox = new JCheckBox("verdadeiro");
        radioUm = new JRadioButton("Um");
        texto = new JTextField("Texto");

        claudir.setLayout(layout);

        this.getContentPane()


        this.setSize(300,300);

        claudir.add(checkBox, BorderLayout.CENTER); //acrescentar o painel ao seu próprio container
        add(botaoUm, BorderLayout.NORTH);
        add(radioUm, BorderLayout.SOUTH);
        add(texto, BorderLayout.EAST);

    }
}
