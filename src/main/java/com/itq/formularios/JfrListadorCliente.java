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
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class JfrListadorCliente extends javax.swing.JFrame {

    /**
     * Creates new form JfrListadorCliente
     */
    public JfrListadorCliente() {
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

        jplPanelBusqueda = new javax.swing.JPanel();
        jbtBuscar = new javax.swing.JButton();
        jlbCedula = new javax.swing.JLabel();
        jTxCedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbClientes = new javax.swing.JTable();
        jbtModificar = new javax.swing.JButton();
        jbtEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jplPanelBusqueda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jplPanelBusqueda.setName(""); // NOI18N

        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });

        jlbCedula.setText("Cedula");

        javax.swing.GroupLayout jplPanelBusquedaLayout = new javax.swing.GroupLayout(jplPanelBusqueda);
        jplPanelBusqueda.setLayout(jplPanelBusquedaLayout);
        jplPanelBusquedaLayout.setHorizontalGroup(
            jplPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPanelBusquedaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtBuscar)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jplPanelBusquedaLayout.setVerticalGroup(
            jplPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPanelBusquedaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jplPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCedula)
                    .addComponent(jbtBuscar)
                    .addComponent(jTxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jtbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbClientes);

        jbtModificar.setText("Modificar");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });

        jbtEliminar.setText("Eliminar");
        jbtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(jplPanelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtEliminar)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jplPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtModificar)
                    .addComponent(jbtEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        
        int rowSeleccionado = jtbClientes.getSelectedRow();        
        if(rowSeleccionado<0){
            JOptionPane.showMessageDialog(this, "Seleccione un elemento de la tabla");
            return;
        }
        DefaultTableModel modeloTabla = (DefaultTableModel) jtbClientes.getModel();
        String cedula =  (String) modeloTabla.getValueAt(rowSeleccionado, 0);
        JfrCliente formularioCliente = new JfrCliente();
        formularioCliente.cargar(cedula);
        formularioCliente.setTipoOperacion(TipoOperacionEnum.ACTUALIZAR);
        formularioCliente.setVisible(true);
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        ClienteDao clienteDao = new ClienteDao();
        String cedula = jTxCedula.getText();
        List<ClienteModel> clientes = clienteDao.buscar(cedula);
        DefaultTableModel modeloTabla = (DefaultTableModel) jtbClientes.getModel();
        modeloTabla.setRowCount(0);
        
        for(ClienteModel cliente : clientes){
            Object[] row = new Object[3];
            row[0] = cliente.getCedula();
            row[1] = cliente.getNombre();
            row[2] = cliente.getApellido();
            modeloTabla.addRow(row);
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
        int rowSeleccionado = jtbClientes.getSelectedRow(); 
        if(rowSeleccionado<0){
            JOptionPane.showMessageDialog(this, "Seleccione un elemento de la tabla");
            return;
        }
        int confirmacionEliminacion = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el registro?","Eliminar",JOptionPane.YES_NO_OPTION);
        if(confirmacionEliminacion==0){
            DefaultTableModel modeloTabla = (DefaultTableModel) jtbClientes.getModel();
            String cedula =  (String) modeloTabla.getValueAt(rowSeleccionado, 0);
            ClienteDao clienteDao = new ClienteDao();
            List<ClienteModel> clientes = clienteDao.buscar(cedula);
            ClienteModel cliente = clientes.get(0);
            clienteDao.eliminar(cliente);            
            this.dispose();
        }
    }//GEN-LAST:event_jbtEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrListadorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrListadorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrListadorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrListadorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrListadorCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxCedula;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlbCedula;
    private javax.swing.JPanel jplPanelBusqueda;
    private javax.swing.JTable jtbClientes;
    // End of variables declaration//GEN-END:variables

    public void cargar(){
        ClienteDao clienteDao = new ClienteDao();
        List<ClienteModel> clientes = clienteDao.listarTodos();
        DefaultTableModel modeloTabla = (DefaultTableModel) jtbClientes.getModel();
        for(ClienteModel cliente : clientes){
            Object[] row = new Object[3];
            row[0] = cliente.getCedula();
            row[1] = cliente.getNombre();
            row[2] = cliente.getApellido();
            modeloTabla.addRow(row);
        }
        
    }
}
