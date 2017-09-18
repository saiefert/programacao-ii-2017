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
   public class GridLayoutDemo 
{
   public static void main( String args[] )
   { 
      ExemploGridLayout gridLayoutFrame = new ExemploGridLayout(); 
      gridLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      gridLayoutFrame.setSize( 300, 200 ); // set frame size
      gridLayoutFrame.setVisible( true ); // display frame
   } // end main
}