/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.programacao.estacio.josmar.borderLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Josmar
 */
public class ExercicioLayoutFodao extends JFrame {
    
    private BorderLayout borderLayoutFodao;
    
      
    private FlowLayout flowLayoutNorte;
    private GridLayout gridLayoutSul;
    private BoxLayout boxLayoutLeste;
    private BorderLayout borderLayoutOeste;
    private GridBagLayout bagLayoutCentro;
    
    private JButton fodaoNorte;
    private JButton fodaoSul;
    private JButton fodaoLeste;
    private JButton fodaoOeste;
    
    private JButton borderUm;
    private JButton borderDois;
    private JButton borderTres;
    private JButton borderQuatro;
    
    private JButton FlowUm;
    private JButton FlowDois;
    private JButton FlowTres;
    
    private JButton GridUm;
    private JButton GridDois;
    private JButton GridTres;
    
    private JButton BoxUm;
    private JButton BoxDois;
    private JButton BoxTres;
    
    private JButton bagUm;
    private JButton bagDois;
    private JButton bagTres;
    
    ExercicioLayoutFodao(){
        
        fodaoNorte = new JButton();
        fodaoSul = new JButton();
        fodaoOeste = new JButton();
        fodaoLeste = new JButton();
        
        borderUm = new JButton("Border Um");
        borderDois = new JButton("Border Dois");
        borderTres = new JButton("Border Tres");
        
        FlowUm = new JButton("Border Um");
        FlowDois = new JButton("Border Dois");
        FlowTres = new JButton("Border Tres");
        
        GridUm = new JButton("Grid Um");
        GridDois = new JButton("Grid Dois");
        GridTres = new JButton("Grid Tres");
        
        BoxUm = new JButton("Grid Um");
        BoxDois = new JButton("Grid Dois");
        BoxTres = new JButton("Grid Tres");
        
        GridUm = new JButton("Grid Um");
        GridDois = new JButton("Grid Dois");
        GridTres = new JButton("Grid Tres");
        
        fodaoNorte.add(borderUm, BorderLayout.NORTH);
        fodaoSul.add(borderDois, BorderLayout.SOUTH);
        fodaoOeste.add(borderTres, BorderLayout.EAST);
        fodaoLeste.add(borderQuatro, BorderLayout.WEST);
           
        
    }
    
    
    
    
}
