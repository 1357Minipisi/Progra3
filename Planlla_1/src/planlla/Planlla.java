
package planlla;


/*
 Karen Roxana Roldán Hernández 0901-17-63
 */

public class Planlla extends javax.swing.JFrame {
        
       int[] departamento =new int[10];
       int[] numeroale= new int[30];
       int[] departa = new int[5];
       int n1=1,n2=2,n3=3,n4=4,n5=5;
     
    public Planlla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        LTituloPlanilla = new javax.swing.JLabel();
        Ltitulonombre = new javax.swing.JLabel();
        Tnombre1 = new javax.swing.JTextField();
        Baceptar = new javax.swing.JButton();
        Bnuevo = new javax.swing.JButton();
        LtituloNom = new javax.swing.JLabel();
        LtituloSuelBa = new javax.swing.JLabel();
        LtituloTotDep = new javax.swing.JLabel();
        LtituloTotPer = new javax.swing.JLabel();
        LtituloSuelLiqui = new javax.swing.JLabel();
        LtituloDepart = new javax.swing.JLabel();
        Lnombre1 = new javax.swing.JLabel();
        LsuelBase1 = new javax.swing.JLabel();
        LtotDepre1 = new javax.swing.JLabel();
        LtotPer1 = new javax.swing.JLabel();
        LsueLiqui1 = new javax.swing.JLabel();
        Ldepart1 = new javax.swing.JLabel();
        Tnombre2 = new javax.swing.JTextField();
        LsuelBase2 = new javax.swing.JLabel();
        LtotDepre2 = new javax.swing.JLabel();
        LtotPer2 = new javax.swing.JLabel();
        LsueLiqui2 = new javax.swing.JLabel();
        Ldepart2 = new javax.swing.JLabel();
        Lnombre2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LTituloPlanilla.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LTituloPlanilla.setText("PLANILLA");

        Ltitulonombre.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        Ltitulonombre.setText("Ingrese el nombre del Empleado");

        Tnombre1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        Tnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tnombre1ActionPerformed(evt);
            }
        });
        Tnombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre1KeyReleased(evt);
            }
        });

        Baceptar.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        Baceptar.setText("Aceptar");
        Baceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaceptarActionPerformed(evt);
            }
        });

        Bnuevo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        Bnuevo.setText("Nuevo Registro");

        LtituloNom.setText("Nombre Empleado");

        LtituloSuelBa.setText("Sueldpo Liquido");

        LtituloTotDep.setText("Total Depreciaciones");

        LtituloTotPer.setText("Total Percepcion");

        LtituloSuelLiqui.setText("Sueldo Liquido");

        LtituloDepart.setText("Departamento");

        Lnombre1.setText("jLabel1");

        LsuelBase1.setText("jLabel2");

        LtotDepre1.setText("jLabel3");

        LtotPer1.setText("jLabel4");

        LsueLiqui1.setText("jLabel5");

        Ldepart1.setText("jLabel6");
        Ldepart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ldepart1MouseEntered(evt);
            }
        });
        Ldepart1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Ldepart1KeyReleased(evt);
            }
        });

        Tnombre2.setText("jTextField1");
        Tnombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tnombre2KeyReleased(evt);
            }
        });

        LsuelBase2.setText("jLabel1");

        LtotDepre2.setText("jLabel2");

        LtotPer2.setText("jLabel3");

        LsueLiqui2.setText("jLabel4");

        Ldepart2.setText("jLabel5");

        Lnombre2.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(LTituloPlanilla))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ltitulonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Tnombre2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(LtituloNom, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Tnombre1))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(LtituloSuelBa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LsuelBase1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(LtituloTotDep, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                                .addComponent(LtotDepre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LsuelBase2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(LtotDepre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(Lnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Baceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Bnuevo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LtituloTotPer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LtotPer1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LtituloSuelLiqui, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LsueLiqui1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LtotPer2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LsueLiqui2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LtituloDepart, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(Ldepart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ldepart2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LTituloPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Baceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bnuevo)
                    .addComponent(Ltitulonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LtituloTotDep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LtituloNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LtituloSuelLiqui, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LtituloTotPer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LtituloDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LtituloSuelBa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LsuelBase1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LtotDepre1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LtotPer1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LsueLiqui1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldepart1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LsuelBase2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LtotDepre2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LtotPer2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LsueLiqui2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldepart2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void Tnombre1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void Tnombre1KeyReleased(java.awt.event.KeyEvent evt) {                                     
      
      int totalLiquido=0; 
      
       
          for(int i =0; i<=2; i++)
          {
              numeroale[i]= 2000+(int)(Math.random()*5000);
              LsuelBase1.setText(" "+numeroale[0]);
              LtotDepre1.setText(" "+numeroale[1]);
              LtotPer1.setText(" "+numeroale[2]);
              
                
           } 
          
          totalLiquido= numeroale[0]-numeroale[1]+numeroale[2];
              LsueLiqui1.setText(" "+totalLiquido);
              
              departamento[0]= 1+(int)(Math.random()*5);
              Ldepart1.setText(" "+departamento[0]);
              
               if(departamento[0]==n1)
                {
 
                      departa[0]=departa[0]+totalLiquido;  
                      Lnombre1.setText(" "+departa[0]);
                }
         
          
    }                                    

    private void Tnombre2KeyReleased(java.awt.event.KeyEvent evt) {                                     
      String nombre2=Tnombre2.getText();
      int totalLiquido2=0;
      
       if(nombre2.equals("")==false && nombre2.matches("[a-zA-Z]*"))
       {
          for(int i =0; i<=numeroale.length; i++)
          {
              numeroale[i]= 2000+(int)(Math.random()*5000);
              LsuelBase2.setText(" "+numeroale[3]);
              LtotDepre2.setText(" "+numeroale[4]);
              LtotPer2.setText(" "+numeroale[5]);
              totalLiquido2= numeroale[3]-numeroale[4]+numeroale[5];
              LsueLiqui2.setText(" "+totalLiquido2);
              
              departamento[i]= 1+(int)(Math.random()*5);
              Ldepart2.setText(" "+departamento[1]);  
              
              
           if(departamento[1]==1)
                {
                  
                      departa[0]= totalLiquido2;  
                      Lnombre2.setText(" "+totalLiquido2);
                    
                }
          }  
       }  
    }                                    

    private void Ldepart1KeyReleased(java.awt.event.KeyEvent evt) {                                     
     
    }                                    

    private void Ldepart1MouseEntered(java.awt.event.MouseEvent evt) {                                      

    }                                     

    private void BaceptarActionPerformed(java.awt.event.ActionEvent evt) {                                         
      int total1=0;
      for(int i=0; i<=departa.length;++i)
      {
       total1=departa[0]; 
       Lnombre1.setText(" "+total1);
      }
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
            java.util.logging.Logger.getLogger(Planlla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planlla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planlla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planlla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planlla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Baceptar;
    private javax.swing.JButton Bnuevo;
    private javax.swing.JLabel LTituloPlanilla;
    private javax.swing.JLabel Ldepart1;
    private javax.swing.JLabel Ldepart2;
    private javax.swing.JLabel Lnombre1;
    private javax.swing.JLabel Lnombre2;
    private javax.swing.JLabel LsueLiqui1;
    private javax.swing.JLabel LsueLiqui2;
    private javax.swing.JLabel LsuelBase1;
    private javax.swing.JLabel LsuelBase2;
    private javax.swing.JLabel LtituloDepart;
    private javax.swing.JLabel LtituloNom;
    private javax.swing.JLabel LtituloSuelBa;
    private javax.swing.JLabel LtituloSuelLiqui;
    private javax.swing.JLabel LtituloTotDep;
    private javax.swing.JLabel LtituloTotPer;
    private javax.swing.JLabel Ltitulonombre;
    private javax.swing.JLabel LtotDepre1;
    private javax.swing.JLabel LtotDepre2;
    private javax.swing.JLabel LtotPer1;
    private javax.swing.JLabel LtotPer2;
    private javax.swing.JTextField Tnombre1;
    private javax.swing.JTextField Tnombre2;
    // End of variables declaration                   
}
