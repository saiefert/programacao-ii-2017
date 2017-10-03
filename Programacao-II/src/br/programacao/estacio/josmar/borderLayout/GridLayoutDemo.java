package br.programacao.estacio.josmar.borderLayout;

import javax.swing.JFrame;

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