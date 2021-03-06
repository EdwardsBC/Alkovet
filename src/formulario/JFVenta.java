package formulario;

import dao.DAOCliente;
import dao.DAODetalleCompra;
import dao.DAOProveedor;
import entidades.ClsCliente;
import entidades.ClsDetalleCompra;
import entidades.ClsCompra;
import entidades.ClsProveedor;
import entidades.Exporter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import veterinaria_Alkhovet.Veterinaria;

public class JFVenta extends javax.swing.JFrame {

    private ClsCompra compras;
    private List<ClsCliente> clientes;
    
  private List<ClsDetalleCompra> detalles = new ArrayList<>();
  private DefaultTableModel modeloDetalles = new DefaultTableModel();

  public JFVenta() {
    initComponents();
    this.crearColumnas();
  }

  private ComboBoxModel cargarClientes() {
      DAOCliente dao = new DAOCliente();
      DefaultComboBoxModel modelo = new DefaultComboBoxModel();
      
      try {
          this.clientes = dao.listar();
            this.llenarComboClientes(modelo);
      } catch (Exception e) {
          JOptionPane.showMessageDialog(this, "No se pudo cargar los Clientes");
      }
      return modelo;
  }

  
  private void crearColumnas() {
    this.modeloDetalles.addColumn("Producto");
    this.modeloDetalles.addColumn("Cantidad");
    this.modeloDetalles.addColumn("Precio Unitario");
    this.modeloDetalles.addColumn("Sub Total");
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDocumento = new javax.swing.JLabel();
        cboDocumento = new javax.swing.JComboBox<>();
        spSerie = new javax.swing.JSpinner();
        spNumero = new javax.swing.JSpinner();
        lblNumero = new javax.swing.JLabel();
        panDetalles = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalles = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDocumento.setText("Documento");

        cboDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un documento", "Boleta", "Factura" }));
        cboDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDocumentoActionPerformed(evt);
            }
        });

        lblNumero.setText("N??mero");

        panDetalles.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        tblDetalles.setModel( this.modeloDetalles);
        jScrollPane1.setViewportView(tblDetalles);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDetallesLayout = new javax.swing.GroupLayout(panDetalles);
        panDetalles.setLayout(panDetallesLayout);
        panDetallesLayout.setHorizontalGroup(
            panDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panDetallesLayout.setVerticalGroup(
            panDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panDetallesLayout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(54, 54, 54)
                        .addComponent(btnEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jButton1.setText("Exportar a excel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        jComboBox1.setModel(cargarClientes());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblDocumento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumero)
                        .addGap(18, 18, 18)
                        .addComponent(spSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(174, 174, 174)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(cboDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(panDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
      JDDetalleCompra ventana = new JDDetalleCompra(this, true);
      ClsDetalleCompra det;

      det = ventana.agregar();
      ventana.dispose();
      if (det != null) {
        this.detalles.add(det);
        this.modeloDetalles.addRow(new Object[]{
          det.getProducto().getNombre(),
          det.getCantidad(),
          det.getPrecioUnitario(),
          det.getTotal()
        });
      }
    }//GEN-LAST:event_btnAgregarActionPerformed

  private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.compras = null;
      this.setVisible(false);
  }//GEN-LAST:event_btnCancelarActionPerformed

  private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    DAODetalleCompra dao;
    ClsCompra venta;
    
    DAOProveedor dao1;
    ClsProveedor prov;
   

    if (this.validarDatos() == true) {
      venta = new ClsCompra();
      prov = new ClsProveedor();
      venta.setTipoDocumento(
      this.cboDocumento.getSelectedItem().toString().substring(0, 1));
      venta.setSerie((int) this.spSerie.getValue());
      venta.setNumero((int) this.spNumero.getValue());
      venta.setVigencia(true);
      venta.setDetalles(this.detalles);

      dao = new DAODetalleCompra();
      try {
        dao.registrar(venta);
        this.dispose();
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
      } finally {
        dao = null;
        venta = null;
      }
      Veterinaria veterinaria = new Veterinaria();
        veterinaria.setVisible(true);
    }
    
  }//GEN-LAST:event_btnAceptarActionPerformed

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int pos = this.tblDetalles.getSelectedRow();

    if (pos > -1) {
      this.modeloDetalles.removeRow(pos);
      this.detalles.remove(pos);
    } else {
      JOptionPane.showMessageDialog(this, "Debe seleccionar un detalle");
    }

  }//GEN-LAST:event_btnEliminarActionPerformed

    private void cboDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDocumentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if (this.tblDetalles.getRowCount()==0) {
            JOptionPane.showMessageDialog(null, "No hay datos en la tabla para exportar.","Inversiones_MJC",JOptionPane.INFORMATION_MESSAGE);
            this.btnAgregar.grabFocus();
            return;
        }
        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel","xls");
        chooser.setDialogTitle("Guardar archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {
            List<JTable> tb=new ArrayList<>();
            List<String>nom=new ArrayList<>();
            tb.add(tblDetalles);
            nom.add("Socios");
            String file=chooser.getSelectedFile().toString().concat(".xls");
             try{
                Exporter e=new Exporter(new File(file),tb , nom);
                 if (e.export()) {
            JOptionPane.showMessageDialog(null, "Los datos fueron exportados a Excel.","Inversiones_MJC",JOptionPane.INFORMATION_MESSAGE);
             }
        }catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Hubo un error "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

  private boolean validarDatos() {
    return true;
  }

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
      java.util.logging.Logger.getLogger(JFVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(JFVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(JFVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(JFVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new JFVenta().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cboDocumento;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JPanel panDetalles;
    private javax.swing.JSpinner spNumero;
    private javax.swing.JSpinner spSerie;
    private javax.swing.JTable tblDetalles;
    // End of variables declaration//GEN-END:variables

    private void llenarComboClientes(DefaultComboBoxModel modelo) {
        for (ClsCliente cliente: this.clientes) {
            modelo.addElement(cliente.getNombre());
        }
    }


}
