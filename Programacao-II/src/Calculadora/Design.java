package Calculadora;

import javax.swing.*;
import java.awt.*;

public class Design extends JFrame {
    private BorderLayout borda;
    private GridLayout grade;
    private JPanel painel;
    private JButton botUm, botDois, botTres, botQuatro, botCinco, botSeis, botSete, botOito, botNove;
    private JButton botZer;
    private JTextField visor;

    Design() {
        borda = new BorderLayout(2,2);
        grade = new GridLayout(3, 3, 5, 5);
        painel = new JPanel();
        this.setLayout(grade);


        botUm = new JButton("1");
        botDois = new JButton("2");
        botTres = new JButton("3");
        botQuatro = new JButton("4");
        botCinco = new JButton("5");
        botSeis = new JButton("6");
        botSete = new JButton("7");
        botOito = new JButton("8");
        botNove = new JButton("9");

        this.setSize(250, 300);

        add(botSete);
        add(botOito);
        add(botNove);
        add(botQuatro);
        add(botCinco);
        add(botSeis);
        add(botUm);
        add(botDois);
        add(botTres);
            }

}
