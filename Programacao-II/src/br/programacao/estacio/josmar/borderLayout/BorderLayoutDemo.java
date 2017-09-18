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
public class BorderLayoutDemo {

   public static void main(String args[]) {
        ExemploBorderLayout borderLayoutFrame = new ExemploBorderLayout();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200); // set frame size
        borderLayoutFrame.setVisible(true); // display frame
    }
}