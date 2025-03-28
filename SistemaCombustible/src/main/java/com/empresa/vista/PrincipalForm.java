/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.empresa.vista;

/**
 *
 * @author Usuario
 */
public class PrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalForm
     */
    public PrincipalForm() {
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

        btnRegistroVehiculo = new javax.swing.JButton();
        btnRegistroCarga = new javax.swing.JButton();
        btnCalcularConsumo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        btnRegistroVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistroVehiculo.setText("REGISTRO VEHICULO  ");
        btnRegistroVehiculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistroVehiculo.setContentAreaFilled(false);
        btnRegistroVehiculo.setFocusPainted(false);
        btnRegistroVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroVehiculoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroVehiculo);
        btnRegistroVehiculo.setBounds(10, 280, 180, 23);

        btnRegistroCarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistroCarga.setText("REGISTRO VEHICULO");
        btnRegistroCarga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistroCarga.setContentAreaFilled(false);
        btnRegistroCarga.setFocusPainted(false);
        btnRegistroCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCargaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroCarga);
        btnRegistroCarga.setBounds(310, 280, 180, 26);

        btnCalcularConsumo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalcularConsumo.setText("CALCULAR ");
        btnCalcularConsumo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcularConsumo.setContentAreaFilled(false);
        btnCalcularConsumo.setFocusPainted(false);
        btnCalcularConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularConsumoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularConsumo);
        btnCalcularConsumo.setBounds(190, 310, 120, 27);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Ebrima", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GASOLINERA LOS \"OLVIDA2\"");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 340, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gasolinera portada 500x500.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 385);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroVehiculoActionPerformed
          RegistroVehiculoForm vehiculoForm = new RegistroVehiculoForm();
    vehiculoForm.setVisible(true);
    }//GEN-LAST:event_btnRegistroVehiculoActionPerformed

    private void btnRegistroCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCargaActionPerformed
RegistroCargaForm cargaForm = new RegistroCargaForm();
    cargaForm.setVisible(true);
        
    }//GEN-LAST:event_btnRegistroCargaActionPerformed

    private void btnCalcularConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularConsumoActionPerformed
      ConsumoForm consumoForm = new ConsumoForm();
    consumoForm.setVisible(true);
        
    }//GEN-LAST:event_btnCalcularConsumoActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularConsumo;
    private javax.swing.JButton btnRegistroCarga;
    private javax.swing.JButton btnRegistroVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
