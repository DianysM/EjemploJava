/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itq.formularios;

import com.itq.datos.ClienteDao;
import com.itq.enumeraciones.TipoOperacionEnum;
import com.itq.modelo.ClienteModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class JfrCliente extends javax.swing.JFrame {
    
    private TipoOperacionEnum tipoOperacion;
    
    /**
     * Creates new form JfrCliente
     */
    public JfrCliente() {
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

        jlbNombre = new javax.swing.JLabel();
        jlbApellido = new javax.swing.JLabel();
        jtxNombre = new javax.swing.JTextField();
        jtxApellido = new javax.swing.JTextField();
        jlbCedula = new javax.swing.JLabel();
        jtxCedula = new javax.swing.JTextField();
        jlbDireccion = new javax.swing.JLabel();
        jtxDireccion = new javax.swing.JTextField();
        jbtGuardar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlbNombre.setText("Nombre");

        jlbApellido.setText("Apellido");

        jlbCedula.setText("Cedula");

        jlbDireccion.setText("Direccion");

        jbtGuardar.setText("Guardar");
        jbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGuardarActionPerformed(evt);
            }
        });

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbNombre)
                            .addComponent(jlbApellido)
                            .addComponent(jlbCedula))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jtxApellido)
                            .addComponent(jtxCedula)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jlbDireccion)
                        .addGap(26, 26, 26)
                        .addComponent(jtxDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtCancelar)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCedula)
                    .addComponent(jtxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbApellido)
                    .addComponent(jtxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDireccion)
                    .addComponent(jtxDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtGuardar)
                    .addComponent(jbtCancelar))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGuardarActionPerformed
        boolean validacion = validar();
        //Escapa si no es valido
        if(validacion==false){
            return;
        }
        ClienteDao clienteDao = new ClienteDao();
        ClienteModel cliente = new ClienteModel();
        String cedula = jtxCedula.getText();
        String nombre = jtxNombre.getText();
        String apellido = jtxApellido.getText();
        String direccion = jtxDireccion.getText();
        cliente.setCedula(cedula);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDireccion(direccion);
        if(tipoOperacion==TipoOperacionEnum.AGREGAR)
        {
            clienteDao.agregar(cliente);
        }else if(tipoOperacion==TipoOperacionEnum.ACTUALIZAR){
            clienteDao.actualizar(cliente);
        }
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jbtGuardarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtGuardar;
    private javax.swing.JLabel jlbApellido;
    private javax.swing.JLabel jlbCedula;
    private javax.swing.JLabel jlbDireccion;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JTextField jtxApellido;
    private javax.swing.JTextField jtxCedula;
    private javax.swing.JTextField jtxDireccion;
    private javax.swing.JTextField jtxNombre;
    // End of variables declaration//GEN-END:variables

    public void setTipoOperacion(TipoOperacionEnum tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
        switch(this.tipoOperacion)
        {
            case ACTUALIZAR:
                jtxCedula.setEditable(false);
                break;
            case AGREGAR:
                jtxCedula.setEditable(true);
                break;
            default:
        }
    }
    
    public void cargar(String cedula){
        ClienteDao clienteDao = new ClienteDao();
        List<ClienteModel> clientes = clienteDao.buscar(cedula);
        ClienteModel cliente = clientes.get(0);
        jtxCedula.setText(cliente.getCedula());
        jtxNombre.setText(cliente.getNombre());
        jtxApellido.setText(cliente.getApellido());
        jtxDireccion.setText(cliente.getDireccion());
    }
    
    private boolean validar(){
        if(jtxCedula.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"La cedula es requerida");
            return false;
        }
        if(jtxNombre.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"El nombre es requerida");
            return false;
        }
        if(jtxApellido.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"El apellido es requerida");
            return false;
        }
        if(jtxDireccion.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"La direccion es requerida");
            return false;
        }
        return true;
    }
}
