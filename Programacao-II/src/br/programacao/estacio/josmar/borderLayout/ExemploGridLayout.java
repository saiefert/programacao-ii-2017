
package br.programacao.estacio.josmar.borderLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploGridLayout extends JFrame {
    private BorderLayout layout;
    private GridLayout layout1;
    
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    
    ExemploGridLayout(){
        one = new JButton("Um");
        two = new JButton("Dois");
        three = new JButton("Três");
        four = new JButton("Quatro");
        five = new JButton("Cinco");
        six = new JButton("Seis");
        layout1 = new GridLayout(2,2,5,5);

        
        
        this.setLayout(layout1);
        
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        
        this.setSize(500, 500);
        this.setVisible(true);
        
    }
    
}
