package Proyecto.Final.vistas;
import Proyecto.Final.Impl.*;
import Proyecto.Final.dao.*;
import Proyecto.Final.rnegocio.entidades.*;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author FABRICIO CONSTANTE
 */
public class FrmDetalle_Venta extends javax.swing.JFrame {

    Detalle_Venta detalle_ventaB = new Detalle_Venta();
    FrmDetalle_VentaLista frm = new FrmDetalle_VentaLista();
    private List<Venta> lstventa;

    public FrmDetalle_Venta() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscarCod = new javax.swing.JButton();
        btnBuscarCantidad = new javax.swing.JButton();
        lblPrecioC = new javax.swing.JLabel();
        lblPrecioV = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioV = new javax.swing.JTextField();
        btnBuscarPrecioV = new javax.swing.JButton();
        cmbVenta = new javax.swing.JComboBox<>();
        lblPrecioC1 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        btnBuscarDescuento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jdkListar = new javax.swing.JDesktopPane();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(121, 187, 220));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        jPanel3.setBackground(new java.awt.Color(121, 187, 220));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("DETALLE VENTA");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("DATOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CODIGO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("VENTA");

        btnBuscarCod.setText("BUSCAR");
        btnBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodActionPerformed(evt);
            }
        });

        btnBuscarCantidad.setText("BUSCAR");
        btnBuscarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCantidadActionPerformed(evt);
            }
        });

        lblPrecioC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecioC.setText("CANTIDAD");

        lblPrecioV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecioV.setText("PRECIO VENTA");

        btnBuscarPrecioV.setText("BUSCAR");
        btnBuscarPrecioV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrecioVActionPerformed(evt);
            }
        });

        cmbVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVentaActionPerformed(evt);
            }
        });

        lblPrecioC1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecioC1.setText("DESCUENTO");

        btnBuscarDescuento.setText("BUSCAR");
        btnBuscarDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecioC)
                            .addComponent(lblPrecioV))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidad)
                            .addComponent(txtPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarCantidad)
                            .addComponent(btnBuscarPrecioV)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(lblPrecioC1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscarDescuento))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel4)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCod))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(380, 535, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarCod))
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addComponent(cmbVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioC)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecioV)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarPrecioV)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioC1)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDescuento))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(121, 187, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 255)));

        javax.swing.GroupLayout jdkListarLayout = new javax.swing.GroupLayout(jdkListar);
        jdkListar.setLayout(jdkListarLayout);
        jdkListarLayout.setHorizontalGroup(
            jdkListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        jdkListarLayout.setVerticalGroup(
            jdkListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdkListar)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdkListar)
        );

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizar)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        txtCodigo.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        IDetalleVenta detalle_ventaDao=new Detalle_VentaImpl();
        Detalle_Venta detalle_venta=new Detalle_Venta();
        
        if (detalle_venta != null) {
            int respuesta = JOptionPane.YES_NO_CANCEL_OPTION;
            detalle_venta.setIddetalle_venta(Integer.parseInt(txtCodigo.getText()));
            respuesta = JOptionPane.showConfirmDialog(null, "Esta Seguro que desea Eliminar el Detalle_Venta "
                    + detalle_venta.getIddetalle_venta() + " ?" + respuesta);
            try {
                if (respuesta == JOptionPane.YES_OPTION) {
                    int numFilasAfectadas = detalle_ventaDao.eliminar(detalle_venta);
                    if (numFilasAfectadas > 0) {
                        JOptionPane.showMessageDialog(this, "Se Elimino!!");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar contiene llave foranea!!");
                    }
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, "No se pudo Eliminar!!");

            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        frm.setVisible(true);
        jdkListar.add(frm);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnBuscarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCantidadActionPerformed
        IDetalleVenta detalle_ventaDao = new Detalle_VentaImpl();
        try {
           
            detalle_ventaB = detalle_ventaDao.obtener_x_Cantidad(Integer.parseInt(txtCantidad.getText()));
            if (detalle_ventaB != null) {
                txtCodigo.setText(Integer.toString(detalle_ventaB.getIddetalle_venta()));
                cmbVenta.setSelectedItem(detalle_ventaB.getVenta().getSerie());
                txtCantidad.setText(Integer.toString(detalle_ventaB.getCantidad()));
                txtPrecioV.setText(Double.toString(detalle_ventaB.getPrecio_venta()));
                txtCantidad.setText(Double.toString(detalle_ventaB.getDescuento()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnBuscarCantidadActionPerformed

    private void btnBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodActionPerformed

        IDetalleVenta detalle_ventaDao = new Detalle_VentaImpl();
        try {
            detalle_ventaB = detalle_ventaDao.obtener(Integer.parseInt(txtCodigo.getText()));
            if (detalle_ventaB != null) {
                txtCodigo.setText(Integer.toString(detalle_ventaB.getIddetalle_venta()));
                cmbVenta.setSelectedItem(detalle_ventaB.getVenta().getSerie());
                txtCantidad.setText(Integer.toString(detalle_ventaB.getCantidad()));
                txtPrecioV.setText(Double.toString(detalle_ventaB.getPrecio_venta()));
                txtCantidad.setText(Double.toString(detalle_ventaB.getDescuento()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnBuscarCodActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        btnAceptarActionListener(evt);
        jdkListar.setVisible(false);
        jdkListar.setVisible(true);
        frm.cargarTabla();

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        frm.cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        btnModificarActionListener(evt);
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarPrecioVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrecioVActionPerformed
        IDetalleVenta detalle_ventaDao = new Detalle_VentaImpl();
        try {
           
            detalle_ventaB = detalle_ventaDao.obtener_x_PrecioV(Double.parseDouble(txtPrecioV.getText()));
            if (detalle_ventaB != null) {
                txtCodigo.setText(Integer.toString(detalle_ventaB.getIddetalle_venta()));
                cmbVenta.setSelectedItem(detalle_ventaB.getVenta().getSerie());
                txtCantidad.setText(Integer.toString(detalle_ventaB.getCantidad()));
                txtPrecioV.setText(Double.toString(detalle_ventaB.getPrecio_venta()));
                txtCantidad.setText(Double.toString(detalle_ventaB.getDescuento()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnBuscarPrecioVActionPerformed

    private void cmbVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVentaActionPerformed

    private void btnBuscarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDescuentoActionPerformed
        IDetalleVenta detalle_ventaDao = new Detalle_VentaImpl();
        try {
           
            detalle_ventaB = detalle_ventaDao.obtener_x_Descuento(Double.parseDouble(txtDescuento.getText()));
            if (detalle_ventaB != null) {
                txtCodigo.setText(Integer.toString(detalle_ventaB.getIddetalle_venta()));
                cmbVenta.setSelectedItem(detalle_ventaB.getVenta().getSerie());
                txtCantidad.setText(Integer.toString(detalle_ventaB.getCantidad()));
                txtPrecioV.setText(Double.toString(detalle_ventaB.getPrecio_venta()));
                txtCantidad.setText(Double.toString(detalle_ventaB.getDescuento()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnBuscarDescuentoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDetalle_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDetalle_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDetalle_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDetalle_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDetalle_Venta().setVisible(true);
            }
        });
    }

    /**
     * ********************METODOS******************************
     */
       public void cargarVentas() {
        try {
       IVenta detalleventa=new VentaImpl();
       lstventa=detalleventa.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
       }
     public void btnAceptarActionListener(ActionEvent e) {

        try {
            Detalle_Venta detalleventa = new Detalle_Venta();
            detalleventa.setIddetalle_venta(Integer.parseInt(txtCodigo.getText()));
            detalleventa.setVenta((Venta)cmbVenta.getSelectedItem());            
            detalleventa.setCantidad(Integer.parseInt(txtCantidad.getText()));
            detalleventa.setPrecio_venta(Double.parseDouble(txtPrecioV.getText()));
            detalleventa.setDescuento(Double.parseDouble(txtDescuento.getText()));
            IDetalleVenta detalleventaDao = new Detalle_VentaImpl();
            
            if(detalleventaDao.insertar(detalleventa)>0){
                JOptionPane.showMessageDialog(this,"Registro Correcto!!",
                        "Transacción correcta",JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this,"Error de Guardado!!",
                "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        } catch (Exception x) {
              JOptionPane.showMessageDialog(this,"Proceso incorrecto!!" + x.getMessage(),
                "Transacción", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    public void limpiar() {
        txtCodigo.setText("");
        txtCantidad.setText("");
        txtPrecioV.setText("");
        txtDescuento.setText("");
    }
    
    public void btnModificarActionListener(ActionEvent e){
        try {
            Detalle_Venta detalleventa = new Detalle_Venta();
            detalleventa.setIddetalle_venta(Integer.parseInt(txtCodigo.getText()));
            detalleventa.setVenta((Venta)cmbVenta.getSelectedItem());            
            detalleventa.setCantidad(Integer.parseInt(txtCantidad.getText()));
            detalleventa.setPrecio_venta(Double.parseDouble(txtPrecioV.getText()));
            detalleventa.setDescuento(Double.parseDouble(txtDescuento.getText()));
            IDetalleVenta detalleventaDao = new Detalle_VentaImpl();
            
            if(detalleventaDao.insertar(detalleventa)>0){
                JOptionPane.showMessageDialog(this,"Registro Correcto!!",
                        "Transacción correcta",JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this,"Error de Guardado!!",
                "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        } catch (Exception x) {
              JOptionPane.showMessageDialog(this,"Proceso incorrecto!!" + x.getMessage(),
                "Transacción", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarCantidad;
    private javax.swing.JButton btnBuscarCod;
    private javax.swing.JButton btnBuscarDescuento;
    private javax.swing.JButton btnBuscarPrecioV;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JDesktopPane jdkListar;
    private javax.swing.JLabel lblPrecioC;
    private javax.swing.JLabel lblPrecioC1;
    private javax.swing.JLabel lblPrecioV;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtPrecioV;
    // End of variables declaration//GEN-END:variables

}
