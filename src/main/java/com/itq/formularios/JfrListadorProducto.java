/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itq.formularios;

import com.itq.datos.ProductoDao;
import com.itq.enumeraciones.TipoOperacionEnum;
import com.itq.modelo.ProductoModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class JfrListadorProducto extends javax.swing.JFrame {

    /**
     * Creates new form JfrListadorProducto
     */
    public JfrListadorProducto() {
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
        jlbCodigoBarras = new javax.swing.JLabel();
        jtxCodigoBarras = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProductos = new javax.swing.JTable();
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

        jlbCodigoBarras.setText("Codigo de Barras");

        javax.swing.GroupLayout jplPanelBusquedaLayout = new javax.swing.GroupLayout(jplPanelBusqueda);
        jplPanelBusqueda.setLayout(jplPanelBusquedaLayout);
        jplPanelBusquedaLayout.setHorizontalGroup(
            jplPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplPanelBusquedaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbCodigoBarras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxCodigoBarras, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtBuscar)
                .addContainerGap())
        );
        jplPanelBusquedaLayout.setVerticalGroup(
            jplPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplPanelBusquedaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jplPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodigoBarras)
                    .addComponent(jtxCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jtbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbProductos);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jplPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtEliminar)
                                .addGap(20, 20, 20))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jplPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtModificar)
                    .addComponent(jbtEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        int rowSeleccionado = jtbProductos.getSelectedRow();        
         if(rowSeleccionado<0){
            JOptionPane.showMessageDialog(this, "Seleccione un elemento de la tabla");
            return;
        }
        DefaultTableModel modeloTabla = (DefaultTableModel) jtbProductos.getModel();
        String codigoBarras =  (String) modeloTabla.getValueAt(rowSeleccionado, 0);
        JfrProducto formularioProducto = new JfrProducto();
        formularioProducto.cargar(codigoBarras);
        formularioProducto.setTipoOperacion(TipoOperacionEnum.ACTUALIZAR);
        formularioProducto.setVisible(true);
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        ProductoDao productoDao = new ProductoDao();
        String codigoBarras = jtxCodigoBarras.getText();
        List<ProductoModel> productos = productoDao.buscar(codigoBarras);
        DefaultTableModel modeloTabla = (DefaultTableModel) jtbProductos.getModel();
        
        modeloTabla.setRowCount(0);
        
        for(ProductoModel producto : productos){
            Object[] row = new Object[3];
            row[0] = producto.getCodigoBarras();
            row[1] = producto.getNombre();
            String precio = String.valueOf(producto.getPrecio());
            row[2] = precio;
            modeloTabla.addRow(row);
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
        int rowSeleccionado = jtbProductos.getSelectedRow(); 
        if(rowSeleccionado<0){
            JOptionPane.showMessageDialog(this, "Seleccione un elemento de la tabla");
            return;
        }
        int confirmacionEliminacion = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar el registro?","Eliminar",JOptionPane.YES_NO_OPTION);
        if(confirmacionEliminacion==0){
            DefaultTableModel modeloTabla = (DefaultTableModel) jtbProductos.getModel();
            String codigoBarras =  (String) modeloTabla.getValueAt(rowSeleccionado, 0);
            ProductoDao productoDao = new ProductoDao();
            List<ProductoModel> productos = productoDao.buscar(codigoBarras);
            ProductoModel producto = productos.get(0);
            productoDao.eliminar(producto);            
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
            java.util.logging.Logger.getLogger(JfrListadorProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrListadorProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrListadorProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrListadorProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrListadorProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JLabel jlbCodigoBarras;
    private javax.swing.JPanel jplPanelBusqueda;
    private javax.swing.JTable jtbProductos;
    private javax.swing.JTextField jtxCodigoBarras;
    // End of variables declaration//GEN-END:variables

    public void cargar(){
        ProductoDao clienteDao = new ProductoDao();
        List<ProductoModel> productos = clienteDao.listarTodos();
        DefaultTableModel modeloTabla = (DefaultTableModel) jtbProductos.getModel();
        for(ProductoModel producto : productos){
            Object[] row = new Object[3];
            row[0] = producto.getCodigoBarras();
            row[1] = producto.getNombre();
            String precio = String.valueOf(producto.getPrecio());
            row[2] = precio;
            modeloTabla.addRow(row);
        }
    }
}