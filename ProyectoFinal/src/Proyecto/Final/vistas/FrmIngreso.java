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
public class FrmIngreso extends javax.swing.JFrame {

    Ingreso ingresoB = new Ingreso();
    FrmIngresoLista frm = new FrmIngresoLista();
    List<Vendedor> lstvendedor;
    //JComboBox<Vendedor> cmbVendedor;
    List<Proveedor> lstproveedor;
    //JComboBox<Proveedor> cmbProveedor;
    public FrmIngreso() {
        
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
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscarCod = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCorrelativo = new javax.swing.JTextField();
        lblPrecioV = new javax.swing.JLabel();
        txtTipoC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        btnBuscarTipoC = new javax.swing.JButton();
        cmbVendedor = new javax.swing.JComboBox<>();
        cmbProveedor = new javax.swing.JComboBox<>();
        btnBuscarSerie = new javax.swing.JButton();
        btnBuscarCorrelativo = new javax.swing.JButton();
        btnBuscarIgv = new javax.swing.JButton();
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
        jLabel1.setText("INGRESO");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("DATOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CODIGO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("VENDEDOR");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("PROVEEDOR");

        btnBuscarCod.setText("BUSCAR");
        btnBuscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCodActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("FECHA");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("SERIE");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("CORRELATIVO");

        txtCorrelativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorrelativoActionPerformed(evt);
            }
        });

        lblPrecioV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecioV.setText("TIPO DE COMPROBANTE");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("IGV");

        btnBuscarTipoC.setText("BUSCAR");
        btnBuscarTipoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTipoCActionPerformed(evt);
            }
        });

        cmbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVendedorActionPerformed(evt);
            }
        });

        cmbProveedor.setToolTipText("");
        cmbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProveedorActionPerformed(evt);
            }
        });

        btnBuscarSerie.setText("BUSCAR");
        btnBuscarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSerieActionPerformed(evt);
            }
        });

        btnBuscarCorrelativo.setText("BUSCAR");
        btnBuscarCorrelativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCorrelativoActionPerformed(evt);
            }
        });

        btnBuscarIgv.setText("BUSCAR");
        btnBuscarIgv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIgvActionPerformed(evt);
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCod))
                            .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(61, 61, 61)
                                .addComponent(txtIgv)
                                .addGap(34, 34, 34)
                                .addComponent(btnBuscarIgv))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnBuscarSerie))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblPrecioV)
                        .addGap(25, 25, 25)
                        .addComponent(txtTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarTipoC)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorrelativo)
                        .addGap(32, 32, 32)
                        .addComponent(btnBuscarCorrelativo)))
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
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
                            .addComponent(cmbVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecioV)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarTipoC)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarSerie))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCorrelativo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarIgv))))
                .addContainerGap(40, Short.MAX_VALUE))
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
        IIngreso ingresoDao=new IngresoImpl();
        Ingreso ingreso=new Ingreso();
        
        if (ingreso != null) {
            int respuesta = JOptionPane.YES_NO_CANCEL_OPTION;
            ingreso.setIdingreso(Integer.parseInt(txtCodigo.getText()));
            respuesta = JOptionPane.showConfirmDialog(null, "Esta Seguro que desea Eliminar el Ingreso "
                    + ingreso.getIdingreso() + " ?" + respuesta);
            try {
                if (respuesta == JOptionPane.YES_OPTION) {
                    int numFilasAfectadas = ingresoDao.eliminar(ingreso);
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

    private void btnBuscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCodActionPerformed

        IIngreso ingresoDao = new IngresoImpl();
        try {
            ingresoB = ingresoDao.obtener(Integer.parseInt(txtCodigo.getText()));
            if (ingresoB != null) {
                txtCodigo.setText(Integer.toString(ingresoB.getIdingreso()));
                cmbProveedor.setSelectedItem(ingresoB.getProveedor().getSector_comercial());
                cmbVendedor.setSelectedItem(ingresoB.getVendedor().getNumero_documento());
                txtTipoC.setText(ingresoB.getTipo_comprobante());
                txtSerie.setText(ingresoB.getSerie());
                txtCorrelativo.setText(ingresoB.getCorrelativo());
                txtFecha.setText(ingresoB.getFecha().toString());
                txtIgv.setText(Float.toString(ingresoB.getIgv()));
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

    private void txtCorrelativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorrelativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorrelativoActionPerformed

    private void btnBuscarTipoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTipoCActionPerformed
        IIngreso ingresoDao = new IngresoImpl();
        try {
            ingresoB = ingresoDao.obtener_x_TipoC((txtTipoC.getText()));
            if (ingresoB != null) {
                txtCodigo.setText(Integer.toString(ingresoB.getIdingreso()));
                cmbProveedor.setSelectedItem(ingresoB.getProveedor().getSector_comercial());
                cmbVendedor.setSelectedItem(ingresoB.getVendedor().getNumero_documento());
                txtTipoC.setText(ingresoB.getTipo_comprobante());
                txtSerie.setText(ingresoB.getSerie());
                txtCorrelativo.setText(ingresoB.getCorrelativo());
                txtFecha.setText(ingresoB.getFecha().toString());
                txtIgv.setText(Float.toString(ingresoB.getIgv()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnBuscarTipoCActionPerformed

    private void cmbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVendedorActionPerformed

    private void cmbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProveedorActionPerformed

    private void btnBuscarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSerieActionPerformed
        IIngreso ingresoDao = new IngresoImpl();
        try {
            ingresoB = ingresoDao.obtener_x_Serie((txtSerie.getText()));
            if (ingresoB != null) {
                txtCodigo.setText(Integer.toString(ingresoB.getIdingreso()));
                cmbProveedor.setSelectedItem(ingresoB.getProveedor().getSector_comercial());
                cmbVendedor.setSelectedItem(ingresoB.getVendedor().getNumero_documento());
                txtTipoC.setText(ingresoB.getTipo_comprobante());
                txtSerie.setText(ingresoB.getSerie());
                txtCorrelativo.setText(ingresoB.getCorrelativo());
                txtFecha.setText(ingresoB.getFecha().toString());
                txtIgv.setText(Float.toString(ingresoB.getIgv()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnBuscarSerieActionPerformed

    private void btnBuscarCorrelativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCorrelativoActionPerformed
        IIngreso ingresoDao = new IngresoImpl();
        try {
            ingresoB = ingresoDao.obtener_x_Correlativo((txtCorrelativo.getText()));
            if (ingresoB != null) {
                txtCodigo.setText(Integer.toString(ingresoB.getIdingreso()));
                cmbProveedor.setSelectedItem(ingresoB.getProveedor().getSector_comercial());
                cmbVendedor.setSelectedItem(ingresoB.getVendedor().getNumero_documento());
                txtTipoC.setText(ingresoB.getTipo_comprobante());
                txtSerie.setText(ingresoB.getSerie());
                txtCorrelativo.setText(ingresoB.getCorrelativo());
                txtFecha.setText(ingresoB.getFecha().toString());
                txtIgv.setText(Float.toString(ingresoB.getIgv()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtCodigo.setEnabled(false);
    }//GEN-LAST:event_btnBuscarCorrelativoActionPerformed

    private void btnBuscarIgvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIgvActionPerformed
        IIngreso ingresoDao = new IngresoImpl();
        try {
            ingresoB = ingresoDao.obtener_x_Igv(Float.parseFloat(txtIgv.getText()));
            if (ingresoB != null) {
                txtCodigo.setText(Integer.toString(ingresoB.getIdingreso()));
                cmbProveedor.setSelectedItem(ingresoB.getProveedor().getSector_comercial());
                cmbVendedor.setSelectedItem(ingresoB.getVendedor().getNumero_documento());
                txtTipoC.setText(ingresoB.getTipo_comprobante());
                txtSerie.setText(ingresoB.getSerie());
                txtCorrelativo.setText(ingresoB.getCorrelativo());
                txtFecha.setText(ingresoB.getFecha().toString());
                txtIgv.setText(Float.toString(ingresoB.getIgv()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        txtCodigo.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarIgvActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmIngreso().setVisible(true);
            }
        });
    }

    /**
     * ********************METODOS******************************
     */
        public void cargarVendedores() {
        try {
       IVendedor ven=new VendedorImpl();
       lstvendedor=ven.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
        public void cargarProveedores() {
        try {
       IProveedor art=new ProveedorImpl();
       lstproveedor=art.obtener();
   
        } catch (Exception e) {System.out.println("ERROR"+e.getMessage());
        }
 
    }
    public void btnAceptarActionListener(ActionEvent e) {

        try {
             
            Ingreso ingreso = new Ingreso();
            ingreso.setIdingreso(Integer.parseInt(txtCodigo.getText()));
            ingreso.setVendedor((Vendedor)cmbVendedor.getSelectedItem());            
            ingreso.setProveedor((Proveedor)cmbProveedor.getSelectedItem());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
            ingreso.setFecha(format.parse(txtFecha.getText()));
            } catch (Exception x) {
              JOptionPane.showMessageDialog(this,"Error de fecha!!",
                "ERROR", JOptionPane.ERROR_MESSAGE);  
            }            
            ingreso.setTipo_comprobante(txtTipoC.getText());
            ingreso.setSerie(txtSerie.getText());
            ingreso.setCorrelativo(txtCorrelativo.getText());
            ingreso.setIgv(Float.parseFloat(txtIgv.getText()));

            IIngreso ingresoDao = new IngresoImpl();
            
            if(ingresoDao.insertar(ingreso)>0){
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
        txtTipoC.setText("");
        txtSerie.setText("");
        txtCorrelativo.setText("");
        txtFecha.setText("");
        txtIgv.setText("");

    }
    
    public void btnModificarActionListener(ActionEvent e){
        try {
            Ingreso ingreso = new Ingreso();
            ingreso.setIdingreso(Integer.parseInt(txtCodigo.getText()));
            ingreso.setVendedor((Vendedor)cmbVendedor.getSelectedItem());            
            ingreso.setProveedor((Proveedor)cmbProveedor.getSelectedItem());
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
            ingreso.setFecha(format.parse(txtFecha.getText()));
            } catch (Exception x) {
              JOptionPane.showMessageDialog(this,"Error de fecha!!",
                "ERROR", JOptionPane.ERROR_MESSAGE);  
            }            
            ingreso.setTipo_comprobante(txtTipoC.getText());
            ingreso.setSerie(txtSerie.getText());
            ingreso.setCorrelativo(txtCorrelativo.getText());
            ingreso.setIgv(Float.parseFloat(txtIgv.getText()));
            IIngreso ingresoDao = new IngresoImpl();
            if(ingresoDao.insertar(ingreso)>0){
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
    private javax.swing.JButton btnBuscarCod;
    private javax.swing.JButton btnBuscarCorrelativo;
    private javax.swing.JButton btnBuscarIgv;
    private javax.swing.JButton btnBuscarSerie;
    private javax.swing.JButton btnBuscarTipoC;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JComboBox<String> cmbVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JDesktopPane jdkListar;
    private javax.swing.JLabel lblPrecioV;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorrelativo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTipoC;
    // End of variables declaration//GEN-END:variables

}
