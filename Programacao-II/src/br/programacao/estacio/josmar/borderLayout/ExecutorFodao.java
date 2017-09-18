/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.programacao.estacio.josmar.borderLayout;

import javax.swing.JFrame;

/**
 *
 * @author Josmar
 */
public class ExecutorFodao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        { 
      ExercicioLayoutFodao exercicioLayoutFodao = new ExercicioLayoutFodao(); 
      exercicioLayoutFodao.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      exercicioLayoutFodao.setSize( 300, 200 ); // set frame size
      exercicioLayoutFodao.setVisible( true ); // display frame
   } // end main
}
}
