/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioDois;

import javax.swing.JOptionPane;

/**
 *
 * @author Josmar
 */
public class Planeta extends javax.swing.JFrame {

    /**
     * Creates new form Planeta
     */
    public Planeta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pesoTerra = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        mercurioRad = new javax.swing.JRadioButton();
        venusRad = new javax.swing.JRadioButton();
        marteRad = new javax.swing.JRadioButton();
        jupiterRad = new javax.swing.JRadioButton();
        saturnoRad = new javax.swing.JRadioButton();
        uranoRad = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        obrigatorioVar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(140, 240, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Calcular Peso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Peso da terra (kg):");

        pesoTerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoTerraActionPerformed(evt);
            }
        });

        mercurioRad.setSelected(true);
        mercurioRad.setText("Mercúrio");
        mercurioRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurioRadActionPerformed(evt);
            }
        });

        venusRad.setText("Vênus");
        venusRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venusRadActionPerformed(evt);
            }
        });

        marteRad.setText("Marte");
        marteRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marteRadActionPerformed(evt);
            }
        });

        jupiterRad.setText("Júpiter");
        jupiterRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupiterRadActionPerformed(evt);
            }
        });

        saturnoRad.setText("Saturno");
        saturnoRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturnoRadActionPerformed(evt);
            }
        });

        uranoRad.setText("Urano");
        uranoRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uranoRadActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione o planeta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mercurioRad)
                    .addComponent(venusRad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marteRad)
                    .addComponent(jupiterRad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saturnoRad)
                    .addComponent(uranoRad)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mercurioRad)
                    .addComponent(marteRad)
                    .addComponent(saturnoRad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venusRad)
                    .addComponent(jupiterRad)
                    .addComponent(uranoRad))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Calcule seu peso em outros planetas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pesoTerra)
                                .addComponent(obrigatorioVar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesoTerra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(obrigatorioVar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesoTerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTerraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTerraActionPerformed

    private void mercurioRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercurioRadActionPerformed
        uranoRad.setSelected(false);
        marteRad.setSelected(false);
        jupiterRad.setSelected(false);
        venusRad.setSelected(false);
        saturnoRad.setSelected(false);

    }//GEN-LAST:event_mercurioRadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double peso = Double.parseDouble(pesoTerra.getText());
        double pesoRad = 0;
        String nomePlaneta = null;        
               
        if (marteRad.isSelected()) {
            pesoRad = peso * 0.38;
            nomePlaneta = "Marte";
        } else if (jupiterRad.isSelected()) {
            pesoRad = peso * 2.64;
            nomePlaneta = "Jupiter";
        } else if (uranoRad.isSelected()) {
            pesoRad = peso * 1.17;
            nomePlaneta = "Urano";
        } else if (saturnoRad.isSelected()) {
            pesoRad = peso * 1.15;
            nomePlaneta = "Saturno";
        } else if (mercurioRad.isSelected()) {
            pesoRad = peso * 0.37;
            nomePlaneta = "Mercúrio";
        }else {
            pesoRad = peso * 0.88;
            nomePlaneta = "Vênus";           
        }
        JOptionPane.showMessageDialog(this,"O seu peso em " + nomePlaneta + " é: " + pesoRad  + " kg");
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void marteRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marteRadActionPerformed
        mercurioRad.setSelected(false);
        uranoRad.setSelected(false);
        jupiterRad.setSelected(false);
        venusRad.setSelected(false);
        saturnoRad.setSelected(false);
    }//GEN-LAST:event_marteRadActionPerformed

    private void uranoRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uranoRadActionPerformed
        mercurioRad.setSelected(false);
        marteRad.setSelected(false);
        jupiterRad.setSelected(false);
        venusRad.setSelected(false);
        saturnoRad.setSelected(false);
    }//GEN-LAST:event_uranoRadActionPerformed

    private void jupiterRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupiterRadActionPerformed
        mercurioRad.setSelected(false);
        uranoRad.setSelected(false);
        marteRad.setSelected(false);
        venusRad.setSelected(false);
        saturnoRad.setSelected(false);
    }//GEN-LAST:event_jupiterRadActionPerformed

    private void venusRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venusRadActionPerformed
        mercurioRad.setSelected(false);
        uranoRad.setSelected(false);
        marteRad.setSelected(false);
        jupiterRad.setSelected(false);
        saturnoRad.setSelected(false);
    }//GEN-LAST:event_venusRadActionPerformed

    private void saturnoRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturnoRadActionPerformed
        mercurioRad.setSelected(false);
        uranoRad.setSelected(false);
        marteRad.setSelected(false);
        jupiterRad.setSelected(false);
        venusRad.setSelected(false);

    }//GEN-LAST:event_saturnoRadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jupiterRad;
    private javax.swing.JRadioButton marteRad;
    private javax.swing.JRadioButton mercurioRad;
    private javax.swing.JLabel obrigatorioVar;
    private javax.swing.JTextField pesoTerra;
    private javax.swing.JRadioButton saturnoRad;
    private javax.swing.JRadioButton uranoRad;
    private javax.swing.JRadioButton venusRad;
    // End of variables declaration//GEN-END:variables
}
