package Calculadora;

import javax.swing.*;
import java.awt.*;

public class CalculadoraPrincipal {
    public static void main(String[] args) {
        Design design = new Design();

        design.setVisible(true);
        design.setBounds(0, 0, 240, 260);
        design.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        design.setResizable(false);
        design.setLocationRelativeTo(null);


    }
}
