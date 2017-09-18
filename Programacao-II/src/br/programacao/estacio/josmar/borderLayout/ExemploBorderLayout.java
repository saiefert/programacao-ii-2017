/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.programacao.estacio.josmar.borderLayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Josmar
 */
public class ExemploBorderLayout extends JFrame {
        private BorderLayout layout;
        
        private JButton botaoNorte;
        private JButton botaoSul;
        private JButton botaoLeste;
        private JButton botaoOeste;
        private JButton botaoCentro;
        
        ExemploBorderLayout(){
            botaoSul = new JButton("Botão Sul");
            botaoNorte = new JButton("Botão Norte");
            botaoLeste = new JButton("Botão Leste");
            botaoOeste = new JButton("Botão Oeste");
            botaoCentro = new JButton("Botão Centro");
            layout = new BorderLayout();
            
            this.setLayout(layout);
            this.setSize(500, 500);
            
            
            add(botaoSul, BorderLayout.SOUTH);
            add(botaoNorte, BorderLayout.NORTH);
            add(botaoLeste, BorderLayout.EAST);
            add(botaoOeste, BorderLayout.WEST);
            add(botaoCentro, BorderLayout.CENTER);
            
        }
        
        
    }
    

