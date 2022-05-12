/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import dao.DAOCliente;
import entidades.ClsCliente;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import veterinaria_Alkhovet.Veterinaria;

/**
 *
 * @author USUARIO
 */
public class JFCliente extends javax.swing.JFrame {
    private List<ClsCliente> clientes;
    private DefaultTableModel modelo = new DefaultTableModel();
    private ClsCliente actual;

    /**
     * Creates new form JFCliente
     */
    public JFCliente() {
        initComponents();
        this.crearColumnas();
        this.activarControles(false);
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        panParte1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        rbFemenino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        chkVigencia = new javax.swing.JCheckBox();
        dchFechaNacimiento = new com.toedter.calendar.JDateChooser();
        lblFechaNacimiento = new javax.swing.JLabel();
        panParte2 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActualizar = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panParte1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblTelefono.setText("Telefono");

        lblDireccion.setText("Direccion");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtTelefono.setText(" ");
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtDireccion.setText(" ");
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        bgSexo.add(rbFemenino);
        rbFemenino.setText("Femenino");
        rbFemenino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbFemeninoMouseClicked(evt);
            }
        });

        bgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

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

        chkVigencia.setText("Vigente");
        chkVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVigenciaActionPerformed(evt);
            }
        });

        lblFechaNacimiento.setText("Fecha Nacimiento");

        javax.swing.GroupLayout panParte1Layout = new javax.swing.GroupLayout(panParte1);
        panParte1.setLayout(panParte1Layout);
        panParte1Layout.setHorizontalGroup(
            panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panParte1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panParte1Layout.createSequentialGroup()
                        .addComponent(rbFemenino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbMasculino))
                    .addGroup(panParte1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAceptar)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancelar))
                    .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panParte1Layout.createSequentialGroup()
                            .addComponent(lblTelefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panParte1Layout.createSequentialGroup()
                            .addComponent(lblDireccion)
                            .addGap(22, 22, 22)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chkVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panParte1Layout.createSequentialGroup()
                        .addComponent(lblFechaNacimiento)
                        .addGap(18, 18, 18)
                        .addComponent(dchFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panParte1Layout.createSequentialGroup()
                        .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido))
                        .addGap(28, 28, 28)
                        .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panParte1Layout.setVerticalGroup(
            panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panParte1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dchFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFemenino)
                    .addComponent(rbMasculino))
                .addGap(18, 18, 18)
                .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panParte1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblDireccion))
                    .addGroup(panParte1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkVigencia)
                .addGap(32, 32, 32)
                .addGroup(panParte1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        panParte2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tblActualizar.setModel(this.modelo);
        jScrollPane1.setViewportView(tblActualizar);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panParte2Layout = new javax.swing.GroupLayout(panParte2);
        panParte2.setLayout(panParte2Layout);
        panParte2Layout.setHorizontalGroup(
            panParte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panParte2Layout.createSequentialGroup()
                .addGroup(panParte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panParte2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar))
                    .addGroup(panParte2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panParte2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo)
                        .addGap(31, 31, 31)
                        .addComponent(btnModificar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panParte2Layout.setVerticalGroup(
            panParte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panParte2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panParte2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnCerrar.setText("cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panParte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panParte2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panParte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panParte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
            this.actual=null;
            this.limpiarControles();
            this.activarControles(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
              DAOCliente dao;
              ClsCliente cli;

         if (this.validarDatos()== true) { 
             
        cli = new ClsCliente();
        cli.setNombre(this.txtNombre.getText());
        cli.setApellido(this.txtApellido.getText());
        cli.setFecha_Nacimiento(this.dchFechaNacimiento.getDate());
        if (this.rbFemenino.isSelected()==true) {
            cli.setSexo("F");
        }else if(this.rbMasculino.isSelected()==true) {
            cli.setSexo("M");
        }
        
        cli.setTelefono(this.txtTelefono.getText());
        cli.setDireccion(this.txtDireccion.getText());
        
        if (this.chkVigencia.isSelected()== true) {
                cli.setVigencia(true);
            }else{
                cli.setVigencia(false);
            }
        
         dao = new DAOCliente();
            try {
                if( this.actual == null){
         dao.registrar(cli);
                }else{
                      cli.setCodigo( this.actual .getCodigo());
         dao.actualizar(cli);
                     }
        this.activarControles(false);
                }catch(Exception e){
                     JOptionPane.showMessageDialog(this, e.getMessage());
            }finally{
                cli = null;
                dao = null;
      }
      
            this.activarControles(false);
     }
    }//GEN-LAST:event_btnAceptarActionPerformed
   
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
     DAOCliente dao = new DAOCliente();
       
       try{
           this.clientes = dao.listar();
           this.llenarTabla();
       }catch (Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }finally{
           dao = null;
       }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int pos = this.tblActualizar.getSelectedRow();
    /*  Cuando le das al boton
        1. No te aparecen los datos correctos en el panel 1
        2. duplica la columna en el listado en el panel 2
    */
        if(pos > -1){
          this.actual = this.clientes.get(pos);
          this.presentarDatos();
          this.activarControles(true);
        }else{
         JOptionPane.showMessageDialog(this, "Debe seleccionar un producto");
         this.tblActualizar.requestFocusInWindow();
        } 
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
            this.activarControles(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Veterinaria principal = new Veterinaria();
        this.dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
               int caracteres=9;
        if (this.txtTelefono.getText().length()>=caracteres) {
            evt.consume();
        }
        char c= evt.getKeyChar();
        if (c<'0' || c> '9') evt.consume(); {

    }
        
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void chkVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkVigenciaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       
        char c = evt.getKeyChar();
        
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') ) evt.consume();
        
        
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') ) evt.consume();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void rbFemeninoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbFemeninoMouseClicked
    }//GEN-LAST:event_rbFemeninoMouseClicked

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

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
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chkVigencia;
    private com.toedter.calendar.JDateChooser dchFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panParte1;
    private javax.swing.JPanel panParte2;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tblActualizar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void activarControles(boolean estado) {
        this.panParte1.setEnabled(estado);
        this.lblNombre.setEnabled(estado);
        this.txtNombre.setEnabled(estado);
        this.lblApellido.setEnabled(estado);
        this.txtApellido.setEnabled(estado);
        this.dchFechaNacimiento.setEnabled(estado);
        this.lblFechaNacimiento.setEnabled(estado);
        this.rbFemenino.setEnabled(estado);
        this.rbMasculino.setEnabled(estado);
        this.lblTelefono.setEnabled(estado);
        this.txtTelefono.setEnabled(estado);
        this.lblDireccion.setEnabled(estado);
        this.txtDireccion.setEnabled(estado);
        this.btnAceptar.setEnabled(estado);
        this.btnCancelar.setEnabled(estado);
        this.chkVigencia.setEnabled(estado);
        
        this.panParte2.setEnabled(!estado);
        this.btnActualizar.setEnabled(!estado);
        this.tblActualizar.setEnabled(!estado);
        this.btnNuevo.setEnabled(!estado);
        this.btnModificar.setEnabled(!estado);
                
        if (estado== true) {
            this.txtNombre.requestFocusInWindow();
        }else{
            this.btnActualizar.requestFocusInWindow();
        }
    }

    private void limpiarControles() {
        this.txtNombre.requestFocusInWindow();
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.dchFechaNacimiento.setDate(Date.valueOf(LocalDate.now()));
        this.rbFemenino.setSelected(true);
        this.txtTelefono.setText("");
        this.txtDireccion.setText("");
        this.chkVigencia.setSelected(false);
        
    }

    private void presentarDatos() {
        DAOCliente dao = new DAOCliente();
        try{
            this.actual = dao.leer(this.actual);
            if (this.actual != null) {
                this.txtNombre.setText(this.actual.getNombre());
                this.txtApellido.setText(this.actual.getApellido());
                this.dchFechaNacimiento.setDate(Date.valueOf(LocalDate.now()));
            if (this.rbFemenino.isSelected()==true) {
                this.rbFemenino.setSelected(true);
            }else if((this.rbMasculino.isSelected()==true)) {
                this.rbMasculino.setSelected(true);
            }
              this.txtTelefono.setText(this.actual.getTelefono());
              this.txtDireccion.setText(this.actual.getDireccion());
             this.chkVigencia.setSelected(this.actual.isVigencia());
            }else{
                JOptionPane.showMessageDialog(this, "La categoria solicitada no se encuentra");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }finally{
            dao = null;
        
     }
    }
    
    private void crearColumnas() {
            this.modelo.addColumn("Nombre");
            this.modelo.addColumn("Apellido");
            this.modelo.addColumn("Fecha Nacimiento");
            this.modelo.addColumn("Sexo");
            this.modelo.addColumn("Telefono");
            this.modelo.addColumn("Direccion");
            this.modelo.addColumn("Vigente");
    }

    private void llenarTabla() {
        this.modelo.setRowCount(0);
      if (this.clientes != null) {
         for (ClsCliente cliente : clientes) {
        this.modelo.addRow(new Object[]{
        cliente.getNombre(),
        cliente.getApellido(),
        cliente.getFecha_Nacimiento(),
        cliente.getSexo(),
        cliente.getTelefono(),
        cliente.getDireccion(),
        cliente.isVigencia()
      });
      }
    }
  }
    
       private boolean validarDatos() {
       boolean validar=true;
           if (txtNombre.getText().isEmpty()) {
               validar=false;
               JOptionPane.showMessageDialog(null, "Ingrese Nombre","error", JOptionPane.ERROR_MESSAGE);}
           else if (txtApellido.getText().isEmpty()) {
               validar=false;
               JOptionPane.showMessageDialog(null, "Ingrese Apellido","error", JOptionPane.ERROR_MESSAGE);}
           else if (txtTelefono.getText().isEmpty()) {
               validar=false;
               JOptionPane.showMessageDialog(null, "Ingrese Teléfono","error", JOptionPane.ERROR_MESSAGE);}
           else if (txtDireccion.getText().isEmpty()) {
               validar=false;
               JOptionPane.showMessageDialog(null, "Ingrese Direccion","error", JOptionPane.ERROR_MESSAGE);}
        return validar;
    }
    
}