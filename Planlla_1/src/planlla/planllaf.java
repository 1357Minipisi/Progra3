
package planlla;
import java.sql.*;

public class planllaf extends javax.swing.JFrame {
int plan[][]= new int [10][7]; //Matriz de la planilla
int depart[]=new int [5]; //vector de los departamenos
int isr[]=new int [10];//vector para calcular el isr
int d1=1,d2=2,d3=3,d4=4,d5=5;//variables para comparar en que departamento le corresponde
public static int verificacion[]=new int [5];//este vector verifica que campos si se les asignara 0-boni, 1-comis, 2)-igss, 3)dec. judi, 4)isr 



    public planllaf() {
        
            
        initComponents();
    }
//Jonathan David Gonzalez Bustamante
//0901-17-2517

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        sb_emp1 = new javax.swing.JLabel();
        boni_1 = new javax.swing.JLabel();
        comi_1 = new javax.swing.JLabel();
        st_emp1 = new javax.swing.JLabel();
        dep_emp1 = new javax.swing.JLabel();
        sb_emp2 = new javax.swing.JLabel();
        boni_2 = new javax.swing.JLabel();
        comi_2 = new javax.swing.JLabel();
        st_emp2 = new javax.swing.JLabel();
        dep_emp2 = new javax.swing.JLabel();
        sb_emp3 = new javax.swing.JLabel();
        boni_3 = new javax.swing.JLabel();
        comi_3 = new javax.swing.JLabel();
        st_emp3 = new javax.swing.JLabel();
        dep_emp3 = new javax.swing.JLabel();
        sb_emp4 = new javax.swing.JLabel();
        boni_4 = new javax.swing.JLabel();
        comi_4 = new javax.swing.JLabel();
        st_emp4 = new javax.swing.JLabel();
        dep_emp4 = new javax.swing.JLabel();
        sb_emp5 = new javax.swing.JLabel();
        boni_5 = new javax.swing.JLabel();
        comi_5 = new javax.swing.JLabel();
        st_emp5 = new javax.swing.JLabel();
        dep_emp5 = new javax.swing.JLabel();
        sb_emp6 = new javax.swing.JLabel();
        boni_6 = new javax.swing.JLabel();
        comi_6 = new javax.swing.JLabel();
        st_emp6 = new javax.swing.JLabel();
        dep_emp6 = new javax.swing.JLabel();
        sb_emp7 = new javax.swing.JLabel();
        boni_7 = new javax.swing.JLabel();
        comi_7 = new javax.swing.JLabel();
        st_emp7 = new javax.swing.JLabel();
        dep_emp7 = new javax.swing.JLabel();
        sb_emp8 = new javax.swing.JLabel();
        boni_8 = new javax.swing.JLabel();
        comi_8 = new javax.swing.JLabel();
        st_emp8 = new javax.swing.JLabel();
        dep_emp8 = new javax.swing.JLabel();
        sb_emp9 = new javax.swing.JLabel();
        boni_9 = new javax.swing.JLabel();
        comi_9 = new javax.swing.JLabel();
        st_emp9 = new javax.swing.JLabel();
        dep_emp9 = new javax.swing.JLabel();
        sb_emp10 = new javax.swing.JLabel();
        boni_10 = new javax.swing.JLabel();
        comi_10 = new javax.swing.JLabel();
        st_emp10 = new javax.swing.JLabel();
        dep_emp10 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        dep1 = new javax.swing.JLabel();
        dep2 = new javax.swing.JLabel();
        dep3 = new javax.swing.JLabel();
        dep4 = new javax.swing.JLabel();
        dep5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ig_1 = new javax.swing.JLabel();
        ig_2 = new javax.swing.JLabel();
        ig_3 = new javax.swing.JLabel();
        ig_4 = new javax.swing.JLabel();
        ig_5 = new javax.swing.JLabel();
        ig_6 = new javax.swing.JLabel();
        ig_7 = new javax.swing.JLabel();
        ig_8 = new javax.swing.JLabel();
        ig_9 = new javax.swing.JLabel();
        ig_10 = new javax.swing.JLabel();
        desc_1 = new javax.swing.JLabel();
        desc_2 = new javax.swing.JLabel();
        desc_3 = new javax.swing.JLabel();
        desc_4 = new javax.swing.JLabel();
        desc_5 = new javax.swing.JLabel();
        desc_6 = new javax.swing.JLabel();
        desc_7 = new javax.swing.JLabel();
        desc_8 = new javax.swing.JLabel();
        desc_9 = new javax.swing.JLabel();
        desc_10 = new javax.swing.JLabel();
        isr_1 = new javax.swing.JLabel();
        isr_2 = new javax.swing.JLabel();
        isr_3 = new javax.swing.JLabel();
        isr_4 = new javax.swing.JLabel();
        isr_5 = new javax.swing.JLabel();
        isr_6 = new javax.swing.JLabel();
        isr_7 = new javax.swing.JLabel();
        isr_8 = new javax.swing.JLabel();
        isr_9 = new javax.swing.JLabel();
        isr_10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 246, 246));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setText("Planilla");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel2.setText("Nombre empleado");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel3.setText("Sueldo");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel4.setText("Bonificasiones");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel5.setText("Comisiones");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel6.setText("Sueldo liquido");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel7.setText("Departamento");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        sb_emp1.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp1.setOpaque(true);

        boni_1.setBackground(new java.awt.Color(255, 255, 255));
        boni_1.setOpaque(true);

        comi_1.setBackground(new java.awt.Color(255, 255, 255));
        comi_1.setOpaque(true);

        st_emp1.setBackground(new java.awt.Color(255, 255, 255));
        st_emp1.setOpaque(true);

        dep_emp1.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp1.setOpaque(true);

        sb_emp2.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp2.setOpaque(true);

        boni_2.setBackground(new java.awt.Color(255, 255, 255));
        boni_2.setOpaque(true);

        comi_2.setBackground(new java.awt.Color(255, 255, 255));
        comi_2.setOpaque(true);

        st_emp2.setBackground(new java.awt.Color(255, 255, 255));
        st_emp2.setOpaque(true);

        dep_emp2.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp2.setOpaque(true);

        sb_emp3.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp3.setOpaque(true);

        boni_3.setBackground(new java.awt.Color(255, 255, 255));
        boni_3.setOpaque(true);

        comi_3.setBackground(new java.awt.Color(255, 255, 255));
        comi_3.setOpaque(true);

        st_emp3.setBackground(new java.awt.Color(255, 255, 255));
        st_emp3.setOpaque(true);

        dep_emp3.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp3.setOpaque(true);

        sb_emp4.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp4.setOpaque(true);

        boni_4.setBackground(new java.awt.Color(255, 255, 255));
        boni_4.setOpaque(true);

        comi_4.setBackground(new java.awt.Color(255, 255, 255));
        comi_4.setOpaque(true);

        st_emp4.setBackground(new java.awt.Color(255, 255, 255));
        st_emp4.setOpaque(true);

        dep_emp4.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp4.setOpaque(true);

        sb_emp5.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp5.setOpaque(true);

        boni_5.setBackground(new java.awt.Color(255, 255, 255));
        boni_5.setOpaque(true);

        comi_5.setBackground(new java.awt.Color(255, 255, 255));
        comi_5.setOpaque(true);

        st_emp5.setBackground(new java.awt.Color(255, 255, 255));
        st_emp5.setOpaque(true);

        dep_emp5.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp5.setOpaque(true);

        sb_emp6.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp6.setOpaque(true);

        boni_6.setBackground(new java.awt.Color(255, 255, 255));
        boni_6.setOpaque(true);

        comi_6.setBackground(new java.awt.Color(255, 255, 255));
        comi_6.setOpaque(true);

        st_emp6.setBackground(new java.awt.Color(255, 255, 255));
        st_emp6.setOpaque(true);

        dep_emp6.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp6.setOpaque(true);

        sb_emp7.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp7.setOpaque(true);

        boni_7.setBackground(new java.awt.Color(255, 255, 255));
        boni_7.setOpaque(true);

        comi_7.setBackground(new java.awt.Color(255, 255, 255));
        comi_7.setOpaque(true);

        st_emp7.setBackground(new java.awt.Color(255, 255, 255));
        st_emp7.setOpaque(true);

        dep_emp7.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp7.setOpaque(true);

        sb_emp8.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp8.setOpaque(true);

        boni_8.setBackground(new java.awt.Color(255, 255, 255));
        boni_8.setOpaque(true);

        comi_8.setBackground(new java.awt.Color(255, 255, 255));
        comi_8.setOpaque(true);

        st_emp8.setBackground(new java.awt.Color(255, 255, 255));
        st_emp8.setOpaque(true);

        dep_emp8.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp8.setOpaque(true);

        sb_emp9.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp9.setOpaque(true);

        boni_9.setBackground(new java.awt.Color(255, 255, 255));
        boni_9.setOpaque(true);

        comi_9.setBackground(new java.awt.Color(255, 255, 255));
        comi_9.setOpaque(true);

        st_emp9.setBackground(new java.awt.Color(255, 255, 255));
        st_emp9.setOpaque(true);

        dep_emp9.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp9.setOpaque(true);

        sb_emp10.setBackground(new java.awt.Color(255, 255, 255));
        sb_emp10.setOpaque(true);

        boni_10.setBackground(new java.awt.Color(255, 255, 255));
        boni_10.setOpaque(true);

        comi_10.setBackground(new java.awt.Color(255, 255, 255));
        comi_10.setOpaque(true);

        st_emp10.setBackground(new java.awt.Color(255, 255, 255));
        st_emp10.setOpaque(true);

        dep_emp10.setBackground(new java.awt.Color(255, 255, 255));
        dep_emp10.setOpaque(true);

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel58.setText("Departamento");

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel59.setText("Sueldo");

        jLabel60.setText("1");

        jLabel61.setText("2");

        jLabel62.setText("3");

        jLabel63.setText("4");

        jLabel64.setText("5");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel8.setText("IGSS");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel9.setText("Desc. Judi.");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel10.setText("ISR");

        ig_1.setBackground(new java.awt.Color(255, 255, 255));
        ig_1.setOpaque(true);

        ig_2.setBackground(new java.awt.Color(255, 255, 255));
        ig_2.setOpaque(true);

        ig_3.setBackground(new java.awt.Color(255, 255, 255));
        ig_3.setOpaque(true);

        ig_4.setBackground(new java.awt.Color(255, 255, 255));
        ig_4.setOpaque(true);

        ig_5.setBackground(new java.awt.Color(255, 255, 255));
        ig_5.setOpaque(true);

        ig_6.setBackground(new java.awt.Color(255, 255, 255));
        ig_6.setOpaque(true);

        ig_7.setBackground(new java.awt.Color(255, 255, 255));
        ig_7.setOpaque(true);

        ig_8.setBackground(new java.awt.Color(255, 255, 255));
        ig_8.setOpaque(true);

        ig_9.setBackground(new java.awt.Color(255, 255, 255));
        ig_9.setOpaque(true);

        ig_10.setBackground(new java.awt.Color(255, 255, 255));
        ig_10.setOpaque(true);

        desc_1.setBackground(new java.awt.Color(255, 255, 255));
        desc_1.setOpaque(true);

        desc_2.setBackground(new java.awt.Color(255, 255, 255));
        desc_2.setOpaque(true);

        desc_3.setBackground(new java.awt.Color(255, 255, 255));
        desc_3.setOpaque(true);

        desc_4.setBackground(new java.awt.Color(255, 255, 255));
        desc_4.setOpaque(true);

        desc_5.setBackground(new java.awt.Color(255, 255, 255));
        desc_5.setOpaque(true);

        desc_6.setBackground(new java.awt.Color(255, 255, 255));
        desc_6.setOpaque(true);

        desc_7.setBackground(new java.awt.Color(255, 255, 255));
        desc_7.setOpaque(true);

        desc_8.setBackground(new java.awt.Color(255, 255, 255));
        desc_8.setOpaque(true);

        desc_9.setBackground(new java.awt.Color(255, 255, 255));
        desc_9.setOpaque(true);

        desc_10.setBackground(new java.awt.Color(255, 255, 255));
        desc_10.setOpaque(true);

        isr_1.setBackground(new java.awt.Color(255, 255, 255));
        isr_1.setOpaque(true);

        isr_2.setBackground(new java.awt.Color(255, 255, 255));
        isr_2.setOpaque(true);

        isr_3.setBackground(new java.awt.Color(255, 255, 255));
        isr_3.setOpaque(true);

        isr_4.setBackground(new java.awt.Color(255, 255, 255));
        isr_4.setOpaque(true);

        isr_5.setBackground(new java.awt.Color(255, 255, 255));
        isr_5.setOpaque(true);

        isr_6.setBackground(new java.awt.Color(255, 255, 255));
        isr_6.setOpaque(true);

        isr_7.setBackground(new java.awt.Color(255, 255, 255));
        isr_7.setOpaque(true);

        isr_8.setBackground(new java.awt.Color(255, 255, 255));
        isr_8.setOpaque(true);

        isr_9.setBackground(new java.awt.Color(255, 255, 255));
        isr_9.setOpaque(true);

        isr_10.setBackground(new java.awt.Color(255, 255, 255));
        isr_10.setOpaque(true);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Calcular");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(sb_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(boni_2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(comi_2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ig_2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(desc_2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(isr_2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(st_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dep_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(421, 421, 421)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel2)
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3)
                            .addGap(17, 17, 17)
                            .addComponent(jLabel4)
                            .addGap(17, 17, 17)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addGap(34, 34, 34)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(sb_emp6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(boni_6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(comi_6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ig_6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(desc_6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(isr_6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(st_emp6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep_emp6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(sb_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(boni_7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(comi_7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ig_7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(desc_7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(isr_7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(st_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(sb_emp8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(boni_8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(comi_8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ig_8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(desc_8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(isr_8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(st_emp8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep_emp8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(sb_emp9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(boni_9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(comi_9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ig_9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(desc_9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(isr_9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(st_emp9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep_emp9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(sb_emp10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(boni_10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(comi_10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ig_10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(desc_10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(isr_10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(st_emp10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep_emp10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(dep3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(dep4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(sb_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(boni_1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17)
                            .addComponent(comi_1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ig_1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(desc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(isr_1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(st_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(dep_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(sb_emp5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)
                                    .addComponent(boni_5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)
                                    .addComponent(comi_5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ig_5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(desc_5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(isr_5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(st_emp5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(dep_emp5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(sb_emp4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)
                                    .addComponent(boni_4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)
                                    .addComponent(comi_4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ig_4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(desc_4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(isr_4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(st_emp4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(dep_emp4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(sb_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)
                                    .addComponent(boni_3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17)
                                    .addComponent(comi_3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ig_3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(desc_3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(isr_3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(st_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(dep_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sb_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boni_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comi_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ig_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isr_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sb_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boni_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comi_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ig_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isr_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(sb_emp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boni_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comi_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ig_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desc_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isr_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(st_emp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dep_emp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(sb_emp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boni_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comi_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ig_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desc_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isr_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(st_emp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dep_emp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jTextField5)
                    .addComponent(sb_emp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boni_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comi_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ig_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desc_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isr_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(st_emp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dep_emp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sb_emp6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boni_6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comi_6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ig_6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isr_6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_emp6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_emp6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sb_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boni_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comi_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ig_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isr_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sb_emp8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boni_8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comi_8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ig_8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isr_8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_emp8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_emp8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sb_emp9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boni_9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comi_9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ig_9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isr_9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_emp9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_emp9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sb_emp10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boni_10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comi_10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ig_10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isr_10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_emp10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dep_emp10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(dep1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dep2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(dep3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dep4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(dep5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
        
        verifica veri = new verifica();
        veri.setVisible(true);
     
          
        
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
 verifica veri = new verifica();
        veri.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
 verifica veri = new verifica();
        veri.setVisible(true);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
 verifica veri = new verifica();
        veri.setVisible(true);
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
 verifica veri = new verifica();
        veri.setVisible(true);
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
for(int i=0; i<=2;i++)
        {    
              
                plan[5][i]=2000+(int)(Math.random()*5000);
                sb_emp6.setText(""+plan[5][0]);
                boni_6.setText(""+plan[5][1]);
                comi_6.setText(""+plan[5][2]);
                
               
        }
            plan[5][3]=plan[5][0]-plan[5][1]+plan[5][2];
            st_emp6.setText(""+plan[5][3]);
        
            plan[5][4]=1+(int)(Math.random()*5);
            dep_emp6.setText(""+plan[5][4]);
            
        if(plan[5][4]==d1)
        {
            depart[0]=depart[0]+plan[5][3];
            dep1.setText(""+depart[0]);
        }
            if(plan[5][4]==d2)
        {
            depart[1]=depart[1]+plan[5][3];
            dep2.setText(""+depart[1]);
        }
            if(plan[5][4]==d3)
        {
            depart[2]=depart[2]+plan[5][3];
            dep3.setText(""+depart[2]);
        }
            if(plan[5][4]==d4)
        {
            depart[3]=depart[3]+plan[5][3];
            dep4.setText(""+depart[3]);
        }   
            if(plan[5][4]==d5)
        {
            depart[4]=depart[4]+plan[5][3];
            dep5.setText(""+depart[4]);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
for(int i=0; i<=2;i++)
        {    
              
                plan[6][i]=2000+(int)(Math.random()*5000);
                sb_emp7.setText(""+plan[6][0]);
                boni_7.setText(""+plan[6][1]);
                comi_7.setText(""+plan[6][2]);
                
               
        }
            plan[6][3]=plan[6][0]-plan[6][1]+plan[6][2];
            st_emp7.setText(""+plan[6][3]);
        
            plan[6][4]=1+(int)(Math.random()*5);
            dep_emp7.setText(""+plan[6][4]);
            
        if(plan[6][4]==d1)
        {
            depart[0]=depart[0]+plan[6][3];
            dep1.setText(""+depart[0]);
        }
            if(plan[6][4]==d2)
        {
            depart[1]=depart[1]+plan[6][3];
            dep2.setText(""+depart[1]);
        }
            if(plan[6][4]==d3)
        {
            depart[2]=depart[2]+plan[6][3];
            dep3.setText(""+depart[2]);
        }
            if(plan[6][4]==d4)
        {
            depart[3]=depart[3]+plan[6][3];
            dep4.setText(""+depart[3]);
        }      
            if(plan[6][4]==d5)
        {
            depart[4]=depart[4]+plan[6][3];
            dep5.setText(""+depart[4]);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
for(int i=0; i<=2;i++)
        {    
              
                plan[7][i]=2000+(int)(Math.random()*5000);
                sb_emp8.setText(""+plan[7][0]);
                boni_8.setText(""+plan[7][1]);
                comi_8.setText(""+plan[7][2]);
                
               
        }
            plan[7][3]=plan[7][0]-plan[7][1]+plan[7][2];
            st_emp8.setText(""+plan[7][3]);
        
            plan[7][4]=1+(int)(Math.random()*5);
            dep_emp8.setText(""+plan[7][4]);
            
        if(plan[7][4]==d1)
        {
            depart[0]=depart[0]+plan[7][3];
            dep1.setText(""+depart[0]);
        }
            if(plan[7][4]==d2)
        {
            depart[1]=depart[1]+plan[7][3];
            dep2.setText(""+depart[1]);
        }
            if(plan[7][4]==d3)
        {
            depart[2]=depart[2]+plan[7][3];
            dep3.setText(""+depart[2]);
        }
            if(plan[7][4]==d4)
        {
            depart[3]=depart[3]+plan[7][3];
            dep4.setText(""+depart[3]);
        }   
            if(plan[7][4]==d5)
        {
            depart[4]=depart[4]+plan[7][3];
            dep5.setText(""+depart[4]);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
for(int i=0; i<=2;i++)
        {    
              
                plan[8][i]=2000+(int)(Math.random()*5000);
                sb_emp9.setText(""+plan[8][0]);
                boni_9.setText(""+plan[8][1]);
                comi_9.setText(""+plan[8][2]);
                
               
        }
            plan[8][3]=plan[8][0]-plan[8][1]+plan[8][2];
            st_emp9.setText(""+plan[8][3]);
        
            plan[8][4]=1+(int)(Math.random()*5);
            dep_emp9.setText(""+plan[8][4]);
            
        if(plan[8][4]==d1)
        {
            depart[0]=depart[0]+plan[8][3];
            dep1.setText(""+depart[0]);
        }
            if(plan[8][4]==d2)
        {
            depart[1]=depart[1]+plan[8][3];
            dep2.setText(""+depart[1]);
        }
            if(plan[8][4]==d3)
        {
            depart[2]=depart[2]+plan[8][3];
            dep3.setText(""+depart[2]);
        }
            if(plan[8][4]==d4)
        {
            depart[3]=depart[3]+plan[8][3];
            dep4.setText(""+depart[3]);
        }        
            if(plan[8][4]==d5)
        {
            depart[4]=depart[4]+plan[8][3];
            dep5.setText(""+depart[4]);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
for(int i=0; i<=2;i++)
        {    
              
                plan[9][i]=2000+(int)(Math.random()*5000);
                sb_emp10.setText(""+plan[9][0]);
                boni_10.setText(""+plan[9][1]);
                comi_10.setText(""+plan[9][2]);
                
               
        }
            plan[9][3]=plan[9][0]-plan[9][1]+plan[9][2];
            st_emp10.setText(""+plan[9][3]);
        
            plan[9][4]=1+(int)(Math.random()*5);
            dep_emp10.setText(""+plan[9][4]);
            
        if(plan[9][4]==d1)
        {
            depart[0]=depart[0]+plan[9][3];
            dep1.setText(""+depart[0]);
        }
            if(plan[9][4]==d2)
        {
            depart[1]=depart[1]+plan[9][3];
            dep2.setText(""+depart[1]);
        }
            if(plan[9][4]==d3)
        {
            depart[2]=depart[2]+plan[9][3];
            dep3.setText(""+depart[2]);
        }
            if(plan[9][4]==d4)
        {
            depart[3]=depart[3]+plan[9][3];
            dep4.setText(""+depart[3]);
        }         
            if(plan[9][4]==d5)
        {
            depart[4]=depart[4]+plan[9][3];
            dep5.setText(""+depart[4]);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//crea el suldo conramdom de 2000 a 8000
        plan[0][0]=2000+(int)(Math.random()*8000);
        sb_emp1.setText(""+plan[0][0]);
        for(int i=1; i<=4;i++)
        {    
                //se asignan los valores para las sumas y restas no mayor de 500
                plan[0][i]=100+(int)(Math.random()*500);
                if(verificacion[1]==1)
                {
                   comi_1.setText(""+plan[0][2]); 
                }
                
                if(verificacion[2]==1)
                {
                   ig_1.setText(""+plan[0][3]);
                }
                
                if(verificacion[3]==1)
                {
                   desc_1.setText(""+plan[0][4]);
                }   
       
        }
            //le asigna el valor de 250 a la bonificacion
            plan[0][1]=250;
            if(verificacion[0]==1)
            {
                boni_1.setText(""+plan[0][1]);
            }
            //verifica en que rango esta el suldo para calcular el isr
            if(verificacion[4]==1)
            {    
                if(plan[0][0]>=2600 && plan[0][0]<=5000)
                {
                    isr[0]=(int) (plan[0][0]*0.03);
                    isr_1.setText(""+isr[0]);
                }    
                else if(plan[0][0]>=5001 && plan[0][0]<=10000)
                {

                    isr[0]=(int) (plan[0][0]*0.05);
                    isr_1.setText(""+isr[0]);

                }    
            }
            //hace la suma y restas para el sueldo liquido
            plan[0][5]=plan[0][0]+plan[0][1]+plan[0][2]-plan[0][3]-plan[0][4]-isr[0];
            st_emp1.setText(""+plan[0][5]);
            
            //se crea aleatoreamente en que departamento se establecera
            plan[0][6]=1+(int)(Math.random()*5);
            dep_emp1.setText(""+plan[0][6]);
            
        //verifica en cual de los 5 departamentos esta y manda el valor a el vector depart que se va acumulando
        if(plan[0][6]==d1)
        {
            depart[0]=depart[0]+plan[0][5];
            dep1.setText(""+depart[0]);
        }
            if(plan[0][6]==d2)
        {
            depart[1]=depart[1]+plan[0][5];
            dep2.setText(""+depart[1]);
        }
            if(plan[0][6]==d3)
        {
            depart[2]=depart[2]+plan[0][5];
            dep3.setText(""+depart[2]);
        }
            if(plan[0][6]==d4)
        {
            depart[3]=depart[3]+plan[0][5];
            dep4.setText(""+depart[3]);
        }
            
        if(plan[0][6]==d5)
        {
            depart[4]=depart[4]+plan[0][5];
            dep5.setText(""+depart[4]);
        }
            
                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//crea el suldo conramdom de 2000 a 8000
        plan[3][0]=2000+(int)(Math.random()*8000);
        sb_emp4.setText(""+plan[3][0]);
        for(int i=1; i<=4;i++)
        {    
                //se asignan los valores para las sumas y restas no mayor de 500
                plan[3][i]=100+(int)(Math.random()*500);
                if(verificacion[1]==1)
                {
                   comi_4.setText(""+plan[3][2]); 
                }
                
                if(verificacion[2]==1)
                {
                   ig_4.setText(""+plan[3][3]);
                }
                
                if(verificacion[3]==1)
                {
                   desc_4.setText(""+plan[3][4]);
                }   
       
        }
            //le asigna el valor de 250 a la bonificacion
            plan[3][1]=250;
            if(verificacion[0]==1)
            {
                boni_4.setText(""+plan[3][1]);
            }
            //verifica en que rango esta el suldo para calcular el isr
            if(verificacion[4]==1)
            {    
                if(plan[3][0]>=2600 && plan[3][0]<=5000)
                {
                    isr[0]=(int) (plan[3][0]*0.03);
                    isr_4.setText(""+isr[0]);
                }    
                else if(plan[3][0]>=5001 && plan[3][0]<=10000)
                {

                    isr[0]=(int) (plan[3][0]*0.05);
                    isr_4.setText(""+isr[0]);

                }    
            }
            //hace la suma y restas para el sueldo liquido
            plan[3][5]=plan[3][0]+plan[3][1]+plan[3][2]-plan[3][3]-plan[3][4]-isr[0];
            st_emp4.setText(""+plan[3][5]);
            
            //se crea aleatoreamente en que departamento se establecera
            plan[3][6]=1+(int)(Math.random()*5);
            dep_emp4.setText(""+plan[3][6]);
            
        //verifica en cual de los 5 departamentos esta y manda el valor a el vector depart que se va acumulando
        if(plan[3][6]==d1)
        {
            depart[0]=depart[0]+plan[3][5];
            dep1.setText(""+depart[0]);
        }
            if(plan[3][6]==d2)
        {
            depart[1]=depart[1]+plan[3][5];
            dep2.setText(""+depart[1]);
        }
            if(plan[3][6]==d3)
        {
            depart[2]=depart[2]+plan[3][5];
            dep3.setText(""+depart[2]);
        }
            if(plan[3][6]==d4)
        {
            depart[3]=depart[3]+plan[3][5];
            dep4.setText(""+depart[3]);
        }
            
        if(plan[3][6]==d5)
        {
            depart[4]=depart[4]+plan[3][5];
            dep5.setText(""+depart[4]);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//crea el suldo conramdom de 2000 a 8000
        plan[1][0]=2000+(int)(Math.random()*8000);
        sb_emp2.setText(""+plan[1][0]);
        for(int i=1; i<=4;i++)
        {    
                //se asignan los valores para las sumas y restas no mayor de 500
                plan[1][i]=100+(int)(Math.random()*500);
                if(verificacion[1]==1)
                {
                   comi_2.setText(""+plan[1][2]); 
                }
                
                if(verificacion[2]==1)
                {
                   ig_2.setText(""+plan[1][3]);
                }
                
                if(verificacion[3]==1)
                {
                   desc_2.setText(""+plan[1][4]);
                }   
       
        }
            //le asigna el valor de 250 a la bonificacion
            plan[1][1]=250;
            if(verificacion[0]==1)
            {
                boni_2.setText(""+plan[1][1]);
            }
            //verifica en que rango esta el suldo para calcular el isr
            if(verificacion[4]==1)
            {    
                if(plan[1][0]>=2600 && plan[1][0]<=5000)
                {
                    isr[0]=(int) (plan[1][0]*0.03);
                    isr_2.setText(""+isr[0]);
                }    
                else if(plan[1][0]>=5001 && plan[1][0]<=10000)
                {

                    isr[0]=(int) (plan[1][0]*0.05);
                    isr_2.setText(""+isr[0]);

                }    
            }
            //hace la suma y restas para el sueldo liquido
            plan[1][5]=plan[1][0]+plan[1][1]+plan[1][2]-plan[1][3]-plan[1][4]-isr[0];
            st_emp2.setText(""+plan[1][5]);
            
            //se crea aleatoreamente en que departamento se establecera
            plan[1][6]=1+(int)(Math.random()*5);
            dep_emp2.setText(""+plan[1][6]);
            
        //verifica en cual de los 5 departamentos esta y manda el valor a el vector depart que se va acumulando
        if(plan[1][6]==d1)
        {
            depart[0]=depart[0]+plan[1][5];
            dep1.setText(""+depart[0]);
        }
            if(plan[1][6]==d2)
        {
            depart[1]=depart[1]+plan[1][5];
            dep2.setText(""+depart[1]);
        }
            if(plan[1][6]==d3)
        {
            depart[2]=depart[2]+plan[1][5];
            dep3.setText(""+depart[2]);
        }
            if(plan[1][6]==d4)
        {
            depart[3]=depart[3]+plan[1][5];
            dep4.setText(""+depart[3]);
        }
            
        if(plan[1][6]==d5)
        {
            depart[4]=depart[4]+plan[1][5];
            dep5.setText(""+depart[4]);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//crea el suldo conramdom de 2000 a 8000
        plan[2][0]=2000+(int)(Math.random()*8000);
        sb_emp3.setText(""+plan[2][0]);
        for(int i=1; i<=4;i++)
        {    
                //se asignan los valores para las sumas y restas no mayor de 500
                plan[2][i]=100+(int)(Math.random()*500);
                if(verificacion[1]==1)
                {
                   comi_3.setText(""+plan[2][2]); 
                }
                
                if(verificacion[2]==1)
                {
                   ig_3.setText(""+plan[2][3]);
                }
                
                if(verificacion[3]==1)
                {
                   desc_3.setText(""+plan[2][4]);
                }   
       
        }
            //le asigna el valor de 250 a la bonificacion
            plan[2][1]=250;
            if(verificacion[0]==1)
            {
                boni_3.setText(""+plan[2][1]);
            }
            //verifica en que rango esta el suldo para calcular el isr
            if(verificacion[4]==1)
            {    
                if(plan[2][0]>=2600 && plan[2][0]<=5000)
                {
                    isr[0]=(int) (plan[2][0]*0.03);
                    isr_3.setText(""+isr[0]);
                }    
                else if(plan[2][0]>=5001 && plan[2][0]<=10000)
                {

                    isr[0]=(int) (plan[2][0]*0.05);
                    isr_3.setText(""+isr[0]);

                }    
            }
            //hace la suma y restas para el sueldo liquido
            plan[2][5]=plan[2][0]+plan[2][1]+plan[2][2]-plan[2][3]-plan[2][4]-isr[0];
            st_emp3.setText(""+plan[2][5]);
            
            //se crea aleatoreamente en que departamento se establecera
            plan[2][6]=1+(int)(Math.random()*5);
            dep_emp3.setText(""+plan[2][6]);
            
        //verifica en cual de los 5 departamentos esta y manda el valor a el vector depart que se va acumulando
        if(plan[2][6]==d1)
        {
            depart[0]=depart[0]+plan[2][5];
            dep1.setText(""+depart[0]);
        }
            if(plan[2][6]==d2)
        {
            depart[1]=depart[1]+plan[2][5];
            dep2.setText(""+depart[1]);
        }
            if(plan[2][6]==d3)
        {
            depart[2]=depart[2]+plan[2][5];
            dep3.setText(""+depart[2]);
        }
            if(plan[2][6]==d4)
        {
            depart[3]=depart[3]+plan[2][5];
            dep4.setText(""+depart[3]);
        }
            
        if(plan[2][6]==d5)
        {
            depart[4]=depart[4]+plan[2][5];
            dep5.setText(""+depart[4]);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//crea el suldo conramdom de 2000 a 8000
        plan[4][0]=2000+(int)(Math.random()*8000);
        sb_emp5.setText(""+plan[4][0]);
        for(int i=1; i<=4;i++)
        {    
                //se asignan los valores para las sumas y restas no mayor de 500
                plan[4][i]=100+(int)(Math.random()*500);
                if(verificacion[1]==1)
                {
                   comi_5.setText(""+plan[4][2]); 
                }
                
                if(verificacion[2]==1)
                {
                   ig_5.setText(""+plan[4][3]);
                }
                
                if(verificacion[3]==1)
                {
                   desc_5.setText(""+plan[4][4]);
                }   
       
        }
            //le asigna el valor de 250 a la bonificacion
            plan[4][1]=250;
            if(verificacion[0]==1)
            {
                boni_5.setText(""+plan[4][1]);
            }
            //verifica en que rango esta el suldo para calcular el isr
            if(verificacion[4]==1)
            {    
                if(plan[4][0]>=2600 && plan[4][0]<=5000)
                {
                    isr[0]=(int) (plan[4][0]*0.03);
                    isr_5.setText(""+isr[0]);
                }    
                else if(plan[4][0]>=5001 && plan[4][0]<=10000)
                {

                    isr[0]=(int) (plan[4][0]*0.05);
                    isr_5.setText(""+isr[0]);

                }    
            }
            //hace la suma y restas para el sueldo liquido
            plan[4][5]=plan[4][0]+plan[4][1]+plan[4][2]-plan[4][3]-plan[4][4]-isr[0];
            st_emp5.setText(""+plan[4][5]);
            
            //se crea aleatoreamente en que departamento se establecera
            plan[4][6]=1+(int)(Math.random()*5);
            dep_emp5.setText(""+plan[4][6]);
            
        //verifica en cual de los 5 departamentos esta y manda el valor a el vector depart que se va acumulando
        if(plan[4][6]==d1)
        {
            depart[0]=depart[0]+plan[4][5];
            dep1.setText(""+depart[0]);
        }
            if(plan[4][6]==d2)
        {
            depart[1]=depart[1]+plan[4][5];
            dep2.setText(""+depart[1]);
        }
            if(plan[4][6]==d3)
        {
            depart[2]=depart[2]+plan[4][5];
            dep3.setText(""+depart[2]);
        }
            if(plan[4][6]==d4)
        {
            depart[3]=depart[3]+plan[4][5];
            dep4.setText(""+depart[3]);
        }
            
        if(plan[4][6]==d5)
        {
            depart[4]=depart[4]+plan[4][5];
            dep5.setText(""+depart[4]);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
      
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(planllaf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(planllaf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(planllaf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(planllaf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new planllaf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boni_1;
    private javax.swing.JLabel boni_10;
    private javax.swing.JLabel boni_2;
    private javax.swing.JLabel boni_3;
    private javax.swing.JLabel boni_4;
    private javax.swing.JLabel boni_5;
    private javax.swing.JLabel boni_6;
    private javax.swing.JLabel boni_7;
    private javax.swing.JLabel boni_8;
    private javax.swing.JLabel boni_9;
    private javax.swing.JLabel comi_1;
    private javax.swing.JLabel comi_10;
    private javax.swing.JLabel comi_2;
    private javax.swing.JLabel comi_3;
    private javax.swing.JLabel comi_4;
    private javax.swing.JLabel comi_5;
    private javax.swing.JLabel comi_6;
    private javax.swing.JLabel comi_7;
    private javax.swing.JLabel comi_8;
    private javax.swing.JLabel comi_9;
    private javax.swing.JLabel dep1;
    private javax.swing.JLabel dep2;
    private javax.swing.JLabel dep3;
    private javax.swing.JLabel dep4;
    private javax.swing.JLabel dep5;
    private javax.swing.JLabel dep_emp1;
    private javax.swing.JLabel dep_emp10;
    private javax.swing.JLabel dep_emp2;
    private javax.swing.JLabel dep_emp3;
    private javax.swing.JLabel dep_emp4;
    private javax.swing.JLabel dep_emp5;
    private javax.swing.JLabel dep_emp6;
    private javax.swing.JLabel dep_emp7;
    private javax.swing.JLabel dep_emp8;
    private javax.swing.JLabel dep_emp9;
    private javax.swing.JLabel desc_1;
    private javax.swing.JLabel desc_10;
    private javax.swing.JLabel desc_2;
    private javax.swing.JLabel desc_3;
    private javax.swing.JLabel desc_4;
    private javax.swing.JLabel desc_5;
    private javax.swing.JLabel desc_6;
    private javax.swing.JLabel desc_7;
    private javax.swing.JLabel desc_8;
    private javax.swing.JLabel desc_9;
    private javax.swing.JLabel ig_1;
    private javax.swing.JLabel ig_10;
    private javax.swing.JLabel ig_2;
    private javax.swing.JLabel ig_3;
    private javax.swing.JLabel ig_4;
    private javax.swing.JLabel ig_5;
    private javax.swing.JLabel ig_6;
    private javax.swing.JLabel ig_7;
    private javax.swing.JLabel ig_8;
    private javax.swing.JLabel ig_9;
    private javax.swing.JLabel isr_1;
    private javax.swing.JLabel isr_10;
    private javax.swing.JLabel isr_2;
    private javax.swing.JLabel isr_3;
    private javax.swing.JLabel isr_4;
    private javax.swing.JLabel isr_5;
    private javax.swing.JLabel isr_6;
    private javax.swing.JLabel isr_7;
    private javax.swing.JLabel isr_8;
    private javax.swing.JLabel isr_9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public static javax.swing.JLabel jl1;
    private javax.swing.JLabel sb_emp1;
    private javax.swing.JLabel sb_emp10;
    private javax.swing.JLabel sb_emp2;
    private javax.swing.JLabel sb_emp3;
    private javax.swing.JLabel sb_emp4;
    private javax.swing.JLabel sb_emp5;
    private javax.swing.JLabel sb_emp6;
    private javax.swing.JLabel sb_emp7;
    private javax.swing.JLabel sb_emp8;
    private javax.swing.JLabel sb_emp9;
    private javax.swing.JLabel st_emp1;
    private javax.swing.JLabel st_emp10;
    private javax.swing.JLabel st_emp2;
    private javax.swing.JLabel st_emp3;
    private javax.swing.JLabel st_emp4;
    private javax.swing.JLabel st_emp5;
    private javax.swing.JLabel st_emp6;
    private javax.swing.JLabel st_emp7;
    private javax.swing.JLabel st_emp8;
    private javax.swing.JLabel st_emp9;
    // End of variables declaration//GEN-END:variables
}
