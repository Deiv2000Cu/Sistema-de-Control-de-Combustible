package com.empresa.vista;

import com.empresa.controlador.ControladorCombustible;
import com.empresa.controlador.DatosCompartidos;
import com.empresa.modelo.Vehiculo;
import javax.swing.JOptionPane;

public class RegistroVehiculoForm extends javax.swing.JFrame {

 
    public RegistroVehiculoForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Placa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 50, 60, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Marca ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 90, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Modelo ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 120, 80, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Litros ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 150, 70, 20);

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPlaca);
        txtPlaca.setBounds(220, 50, 149, 22);
        getContentPane().add(txtMarca);
        txtMarca.setBounds(220, 90, 149, 22);
        getContentPane().add(txtModelo);
        txtModelo.setBounds(220, 120, 149, 22);

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCapacidad);
        txtCapacidad.setBounds(220, 150, 149, 22);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(220, 210, 120, 26);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carga 500x500.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel5.setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 500, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                                        
    String placa = txtPlaca.getText();
    String marca = txtMarca.getText();
    String modelo = txtModelo.getText();
    double capacidadTanque = Double.parseDouble(txtCapacidad.getText());

 // Crear objeto Vehiculo y guardarlo en ControladorCombustible
    Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, capacidadTanque);
   DatosCompartidos.agregarVehiculo(vehiculo);
    JOptionPane.showMessageDialog(this, "Vehículo registrado correctamente.");

    
    
    // Limpiar los campos
    txtPlaca.setText("");
    txtMarca.setText("");
    txtModelo.setText("");
    txtCapacidad.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroVehiculoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVehiculoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVehiculoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVehiculoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVehiculoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
