package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design extends JFrame implements ActionListener {
    private BorderLayout borda;
    private GridBagLayout grade;
    private FlowLayout fluxo;
    private JPanel botoesNumericos;
    private JPanel painelVisor;
    private JPanel zeroEPonto;

    private JButton botUm, botDois, botTres, botQuatro, botCinco, botSeis, botSete, botOito, botNove, botZero;
    private JButton botAdicao, botSubtracao, botDivisao, botMultiplicacao, botResultado, botVirgula, botRaiz, botReset;
    private JLabel visor;

    GridBagConstraints gbc = new GridBagConstraints();

    Design() {
        super("Calculadora");
        botoesNumericos = new JPanel();
        painelVisor = new JPanel();
        zeroEPonto = new JPanel();
        fluxo = new FlowLayout(FlowLayout.CENTER, 2, 2);
        borda = new BorderLayout(2, 2);
        grade = new GridBagLayout();
        gbc.insets = new Insets(3, 2, 3, 2);
        this.setLayout(borda);

        //visor calculadora
        this.add(painelVisor, BorderLayout.NORTH);
        visor = new JLabel("", SwingConstants.CENTER);
        visor.setMinimumSize(new Dimension(200, 100));
        visor.setPreferredSize(new Dimension(230, 75));
        visor.setMaximumSize(new Dimension(100, 150));
        painelVisor.setLayout(fluxo);
        visor.setFont(new Font("Times", Font.PLAIN, 40));
        visor.setForeground(Color.white);
        visor.setOpaque(true);
        visor.setBackground(Color.gray);


        //painel botao
        this.add(botoesNumericos, BorderLayout.CENTER);
        botoesNumericos.setLayout(grade);

        //operações
        botAdicao = new JButton("+");
        botSubtracao = new JButton("-");
        botDivisao = new JButton("/");
        botMultiplicacao = new JButton("*");

        //digitos
        botResultado = new JButton("=");
        botRaiz = new JButton("√");
        botReset = new JButton("C");
        botVirgula = new JButton(",");
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

        //componentes
        //visor
        painelVisor.add(visor);

        //botões
        gbc.gridx = 0;
        gbc.gridy = 0;
        botoesNumericos.add(botSete, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        botoesNumericos.add(botOito, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        botoesNumericos.add(botNove, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        botoesNumericos.add(botQuatro, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        botoesNumericos.add(botCinco, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        botoesNumericos.add(botSeis, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        botoesNumericos.add(botUm, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        botoesNumericos.add(botDois, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        botoesNumericos.add(botTres, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        botoesNumericos.add(botZero, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        botoesNumericos.add(botVirgula, gbc);

        gbc.gridx = 4;
        gbc.gridy = 0;
        botoesNumericos.add(botDivisao, gbc);

        gbc.gridx = 4;
        gbc.gridy = 1;
        botoesNumericos.add(botMultiplicacao, gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        botoesNumericos.add(botSubtracao, gbc);

        gbc.gridx = 4;
        gbc.gridy = 3;
        botoesNumericos.add(botAdicao, gbc);

        gbc.gridx = 6;
        gbc.gridy = 0;
        botoesNumericos.add(botReset, gbc);

        gbc.gridx = 6;
        gbc.gridy = 1;
        botoesNumericos.add(botRaiz, gbc);

        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        botoesNumericos.add(botResultado, gbc);

        //listerners
        botUm.addActionListener(this);
        botDois.addActionListener(this);
        botTres.addActionListener(this);
        botQuatro.addActionListener(this);
        botCinco.addActionListener(this);
        botSeis.addActionListener(this);
        botSete.addActionListener(this);
        botOito.addActionListener(this);
        botNove.addActionListener(this);
        botZero.addActionListener(this);
        botVirgula.addActionListener(this);
        botDivisao.addActionListener(this);
        botSubtracao.addActionListener(this);
        botAdicao.addActionListener(this);
        botMultiplicacao.addActionListener(this);
        botResultado.addActionListener(this);
        botRaiz.addActionListener(this);
        botReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        Operacoes op = new Operacoes();

        if (evento.getSource() == botUm) {
            visor.setText(visor.getText() + "1");
            op.setNum1(1);
        } else if (evento.getSource() == botDois) {
            visor.setText(visor.getText() + "2");
        } else if (evento.getSource() == botTres) {
            visor.setText(visor.getText() + "3");
        } else if (evento.getSource() == botQuatro) {
            visor.setText(visor.getText() + "4");
        } else if (evento.getSource() == botCinco) {
            visor.setText(visor.getText() + "5");
        } else if (evento.getSource() == botSeis) {
            visor.setText(visor.getText() + "6");
        } else if (evento.getSource() == botSete) {
            visor.setText(visor.getText() + "7");
        } else if (evento.getSource() == botOito) {
            visor.setText(visor.getText() + "8");
        } else if (evento.getSource() == botNove) {
            visor.setText(visor.getText() + "9");
        } else if (evento.getSource() == botZero) {
            visor.setText(visor.getText() + "0");
        } else if (evento.getSource() == botSubtracao) {
            visor.setText(visor.getText() + "-");
        } else if (evento.getSource() == botDivisao) {
            visor.setText(visor.getText() + "/");
        } else if (evento.getSource() == botMultiplicacao) {
            visor.setText(visor.getText() + "*");
        } else if (evento.getSource() == botAdicao) {
            visor.setText(visor.getText() + "+");
            op.setNum1(Double.parseDouble(visor.getText()));
        } else if (evento.getSource() == botVirgula) {
            visor.setText(visor.getText() + ",");
        } else if (evento.getSource() == botResultado) {

        } else if (evento.getSource() == botReset) {
            visor.setText("");
        }
        Double valor = Double.parseDouble(visor.getText());
        double num1 = valor;
    }
}