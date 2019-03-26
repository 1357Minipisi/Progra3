/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planilla_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Registrar_Usuarios extends javax.swing.JFrame {

    String cb_strEmp;
    String cb_strEstado;
    
    
    public Registrar_Usuarios() {
        initComponents();
        mostrarEmp();
        this.setLocationRelativeTo(null);
    }

    //permite mostrar los empleados en el conbobox de empleados 
      public void mostrarEmp()
      {
        try{
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/bd_planilla", "root", "");

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from empleado_nomina");
              cb_emp.addItem("  ");
                 while(rs.next())
                  {
                      this.cb_emp.addItem(rs.getString("codigo_empleado"));
                  }
              }catch (Exception e){
                  System.out.println("Error "+e);
              }
      }
      
      void buscar_emple(String codigo) throws SQLException
    {
        PreparedStatement ps= null;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_planilla", "root", "");
        String sql =" SELECT * FROM empleado_nomina WHERE codigo_empleado = '"+codigo+"'";
        try
        {
          Statement st= con.createStatement();
          ResultSet rs = st.executeQuery(sql);
          if(rs.next()){
                txt_cod.setText(rs.getString("codigo_empleado"));
                txt_nombre.setText(rs.getString("nombre_empleado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }
        }
        catch (Exception e){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cb_emp = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_clave = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_estado = new javax.swing.JComboBox<>();
        lb_mostrar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel1.setText("Registro de Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 11, 170, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Codigo de Empleado:");

        cb_emp.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_empActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton2)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 100));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Codigo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, 115, 20));

        txt_cod.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 72, 139, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Clave:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 161, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 115, 139, -1));

        txt_clave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });
        jPanel1.add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 158, 139, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Estado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 194, -1, -1));

        cb_estado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        jPanel1.add(cb_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 194, 136, -1));

        lb_mostrar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lb_mostrar.setOpaque(true);
        jPanel1.add(lb_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 163, 28));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 127, -1));

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setOpaque(false);

        jMenu1.setBorder(null);
        jMenu1.setText("Administrador");

        jMenuItem1.setText("Ingreso empleado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Ingrese puesto y departamento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Concepto empleado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Planilla");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //Codigo que permite insertar registros en al base de datos
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_planilla", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into usuario_nomina(codigo_usuario,nombre_usuario,clave_usuario,codigo_empleado,estado_usuario) values(?,?,?,?,?)");
            cb_strEmp= cb_emp.getSelectedItem().toString();
            cb_strEstado= cb_estado.getSelectedItem().toString();
            pst.setString(1, txt_cod.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_clave.getText().trim());
            pst.setString(4, cb_strEmp);
            pst.setString(5, cb_strEstado);
          
            pst.executeUpdate();
            
            txt_nombre.setText("");
            txt_clave.setText("");
            txt_clave.setText("");
            
            lb_mostrar.setText("Registro exitoso.");
        }catch (Exception e){
            System.out.println("Error "+e);
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Ingreso_datos_empleado ingreEmp = new Ingreso_datos_empleado();
        ingreEmp.setVisible(true);
        ingreEmp.pack();
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Ingreso_puestoydeparta ingrePu = new Ingreso_puestoydeparta();
        ingrePu.setVisible(true);
        ingrePu.pack();
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Concepto ingreConcepto = new Concepto();
        ingreConcepto.setVisible(true);
        ingreConcepto.pack();
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        Planilla planilla = new Planilla();
        planilla.setVisible(true);
        planilla.pack();
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void cb_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_empActionPerformed

        
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_empActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String empleado= cb_emp.getSelectedItem().toString();
     
        try {
            buscar_emple(empleado);
        } catch (SQLException ex) {
            Logger.getLogger(Ingreso_datos_empleado.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_emp;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_mostrar;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
