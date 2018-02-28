package Proyecto.Final.vistas;

import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

public class MenuPrincipal extends javax.swing.JFrame {
    public MenuPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonArticulo1 = new javax.swing.JButton();
        jButtonCategoria1 = new javax.swing.JButton();
        jButtonCliente1 = new javax.swing.JButton();
        jButtonIngreso1 = new javax.swing.JButton();
        jButtonProveedor1 = new javax.swing.JButton();
        jButtonVendedor1 = new javax.swing.JButton();
        jButtonVenta1 = new javax.swing.JButton();
        jButtonDetalle_Ingreso1 = new javax.swing.JButton();
        jButtonDetalle_Venta1 = new javax.swing.JButton();
        jButtonKardex1 = new javax.swing.JButton();
        jLabelArticulo1 = new javax.swing.JLabel();
        jLabelCategoria1 = new javax.swing.JLabel();
        jLabelCliente1 = new javax.swing.JLabel();
        jLabelIngreso1 = new javax.swing.JLabel();
        jLabelProveedor1 = new javax.swing.JLabel();
        jLabelVendedor1 = new javax.swing.JLabel();
        jLabelVenta1 = new javax.swing.JLabel();
        jLabelDetalle_Ingreso1 = new javax.swing.JLabel();
        jLabelDetalle_Venta1 = new javax.swing.JLabel();
        jLabelKardex1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(498, 293));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 0, 51));

        jButtonArticulo1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonArticulo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-bolsa-de-la-compra-67.png"))); // NOI18N
        jButtonArticulo1.setBorderPainted(false);
        jButtonArticulo1.setContentAreaFilled(false);
        jButtonArticulo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonArticulo1.setPreferredSize(new java.awt.Dimension(67, 67));

        jButtonCategoria1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-clasificación-de-respuestas-67.png"))); // NOI18N
        jButtonCategoria1.setContentAreaFilled(false);
        jButtonCategoria1.setPreferredSize(new java.awt.Dimension(67, 67));

        jButtonCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-usuario-67.png"))); // NOI18N
        jButtonCliente1.setContentAreaFilled(false);
        jButtonCliente1.setPreferredSize(new java.awt.Dimension(67, 67));
        jButtonCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliente1ActionPerformed(evt);
            }
        });

        jButtonIngreso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-entrar-67.png"))); // NOI18N
        jButtonIngreso1.setContentAreaFilled(false);
        jButtonIngreso1.setPreferredSize(new java.awt.Dimension(67, 67));
        jButtonIngreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngreso1ActionPerformed(evt);
            }
        });

        jButtonProveedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-proveedor-67.png"))); // NOI18N
        jButtonProveedor1.setContentAreaFilled(false);
        jButtonProveedor1.setPreferredSize(new java.awt.Dimension(67, 67));

        jButtonVendedor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-tarjeta-de-empleado-67.png"))); // NOI18N
        jButtonVendedor1.setContentAreaFilled(false);
        jButtonVendedor1.setPreferredSize(new java.awt.Dimension(67, 67));

        jButtonVenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-etiqueta-de-precio-67.png"))); // NOI18N
        jButtonVenta1.setContentAreaFilled(false);
        jButtonVenta1.setPreferredSize(new java.awt.Dimension(67, 67));

        jButtonDetalle_Ingreso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-panel-de-detalles-67.png"))); // NOI18N
        jButtonDetalle_Ingreso1.setContentAreaFilled(false);
        jButtonDetalle_Ingreso1.setPreferredSize(new java.awt.Dimension(67, 67));
        jButtonDetalle_Ingreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetalle_Ingreso1ActionPerformed(evt);
            }
        });

        jButtonDetalle_Venta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-vender-propiedad-67.png"))); // NOI18N
        jButtonDetalle_Venta1.setContentAreaFilled(false);
        jButtonDetalle_Venta1.setPreferredSize(new java.awt.Dimension(67, 67));

        jButtonKardex1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/Final/Img/icons8-control-de-crédito-67.png"))); // NOI18N
        jButtonKardex1.setContentAreaFilled(false);
        jButtonKardex1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonKardex1.setPreferredSize(new java.awt.Dimension(67, 67));
        jButtonKardex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKardex1ActionPerformed(evt);
            }
        });

        jLabelArticulo1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelArticulo1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelArticulo1.setText("Articulo");

        jLabelCategoria1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelCategoria1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelCategoria1.setText("Categoria");

        jLabelCliente1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelCliente1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelCliente1.setText("Cliente");

        jLabelIngreso1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelIngreso1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelIngreso1.setText("Ingreso");

        jLabelProveedor1.setBackground(new java.awt.Color(204, 0, 0));
        jLabelProveedor1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelProveedor1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelProveedor1.setText("Proveedor");

        jLabelVendedor1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelVendedor1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelVendedor1.setText("Vendedor");

        jLabelVenta1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelVenta1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelVenta1.setText("Venta");

        jLabelDetalle_Ingreso1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelDetalle_Ingreso1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelDetalle_Ingreso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDetalle_Ingreso1.setText("D.Ingreso");
        jLabelDetalle_Ingreso1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelDetalle_Venta1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelDetalle_Venta1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelDetalle_Venta1.setText("D.Venta");

        jLabelKardex1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabelKardex1.setForeground(new java.awt.Color(0, 51, 102));
        jLabelKardex1.setText("Kardex");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVendedor1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelArticulo1)
                        .addComponent(jButtonArticulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelVenta1)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCategoria1)))))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelCliente1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDetalle_Ingreso1)
                            .addComponent(jButtonCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDetalle_Ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButtonDetalle_Venta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelIngreso1)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelDetalle_Venta1, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelKardex1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelProveedor1))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonKardex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProveedor1)
                    .addComponent(jLabelIngreso1)
                    .addComponent(jLabelCategoria1)
                    .addComponent(jLabelArticulo1)
                    .addComponent(jLabelCliente1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonProveedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonArticulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIngreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelVenta1)
                                    .addComponent(jLabelVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelKardex1)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonVenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDetalle_Ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonKardex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDetalle_Venta1)
                            .addComponent(jLabelDetalle_Ingreso1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDetalle_Venta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngreso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIngreso1ActionPerformed

    private void jButtonDetalle_Ingreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetalle_Ingreso1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDetalle_Ingreso1ActionPerformed

    private void jButtonCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCliente1ActionPerformed
        MenuCliente menu = new MenuCliente();
        menu.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonCliente1ActionPerformed

    private void jButtonKardex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKardex1ActionPerformed
        // TODO add your handling code here:
        JfrmKardex menu = new JfrmKardex();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonKardex1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArticulo1;
    private javax.swing.JButton jButtonCategoria1;
    private javax.swing.JButton jButtonCliente1;
    private javax.swing.JButton jButtonDetalle_Ingreso1;
    private javax.swing.JButton jButtonDetalle_Venta1;
    private javax.swing.JButton jButtonIngreso1;
    private javax.swing.JButton jButtonKardex1;
    private javax.swing.JButton jButtonProveedor1;
    private javax.swing.JButton jButtonVendedor1;
    private javax.swing.JButton jButtonVenta1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelArticulo1;
    private javax.swing.JLabel jLabelCategoria1;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JLabel jLabelDetalle_Ingreso1;
    private javax.swing.JLabel jLabelDetalle_Venta1;
    private javax.swing.JLabel jLabelIngreso1;
    private javax.swing.JLabel jLabelKardex1;
    private javax.swing.JLabel jLabelProveedor1;
    private javax.swing.JLabel jLabelVendedor1;
    private javax.swing.JLabel jLabelVenta1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
