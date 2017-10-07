package Calculadora;

import javax.swing.*;
import java.awt.*;

public class Design extends JFrame {
    private BorderLayout borda;
    private GridLayout grade;
    private FlowLayout fluxo;
    private JPanel painelBotao;
    private JPanel painelVisor;

    private JButton botUm, botDois, botTres, botQuatro, botCinco, botSeis, botSete, botOito, botNove, botZero;
    private JButton botAdicao, botSubtracao, botDivisao, botMultiplicacao, botResultado;
    private JTextField visor;

    Design() {


        painelBotao = new JPanel();
        painelVisor = new JPanel();
        fluxo = new FlowLayout(FlowLayout.CENTER, 2, 2);
        borda = new BorderLayout(2, 2);
        grade = new GridLayout(3, 3, 5, 5);
        visor = new JTextField("",15);

        painelBotao.setLayout(grade);
        painelVisor.setLayout(fluxo);
        this.setLayout(borda);


        botZero = new JButton("0");
        botUm = new JButton("1");
        botDois = new JButton("2");
        botTres = new JButton("3");
        botQuatro = new JButton("4");
        botCinco = new JButton("5");
        botSeis = new JButton("6");
        botSete = new JButton("7");
        botOito = new JButton("8");
        botNove = new JButton("9");

        this.setSize(250, 400);

        this.add(painelVisor, BorderLayout.NORTH);
        this.add(painelBotao, BorderLayout.SOUTH);

        painelVisor.add(visor);


        
        painelBotao.add(botSete);
        painelBotao.add(botOito);
        painelBotao.add(botNove);
        painelBotao.add(botQuatro);
        painelBotao.add(botCinco);
        painelBotao.add(botSeis);
        painelBotao.add(botUm);
        painelBotao.add(botDois);
        painelBotao.add(botTres);


    }

}
