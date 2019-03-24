
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
import javax.swing.JTextField;

public class Planilla extends javax.swing.JFrame {
int plan[][]= new int [10][7]; //Matriz de la planilla
int depart[]=new int [5]; //vector de los departamenos
int isr[]=new int [10];//vector para calcular el isr
int sueldo_base[]=new int [10];// vector que se encarga de almacenar los totales para asi sacar el total de la nomina
String SL; //variable de tipo strig que permite guardar el valor de sueldo_li antes de convvertirlo a entero
int totp=0;
int d1=1,d2=2,d3=3,d4=4,d5=5, tot_planilla=0;//variables para comparar en que departamento le corresponde
public static int op=0;//permite que se abra primero la ventada de isr, comisiones, etc.
public static int verificacion[]=new int [5];//este vector verifica que campos si se les asignara 0-boni, 1-comis, 2)-igss, 3)dec. judi, 4)isr 



    public Planilla() {
        
            
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarEmp();
    }
    
    
    
    void buscarEmp(String nombre) throws SQLException
    {
        PreparedStatement ps= null;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_planilla", "root", "");
        String sql =" SELECT * FROM empleado_nomina WHERE nombre_empleado = '"+nombre+"'";
        try
        {
          Statement st= con.createStatement();
          ResultSet rs = st.executeQuery(sql);
          if(rs.next()){ 
              
                sb_emp1.setText(rs.getString("sueldo_empleado"));
                dep_emp1.setText(rs.getString("codigo_departamento"));
            }
        }
        catch (Exception e){
            
        }
    }
    
    public void mostrarEmp()
    {
        try{
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/bd_planilla", "root", "");

            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from empleado_nomina");
            CB_emp1.addItem("");
                 while(rs.next())
                  {
                      this.CB_emp1.addItem(rs.getString("nombre_empleado"));
                  }
              }catch (Exception e){
                  System.out.println("Error "+e);
              }
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        CB_emp1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        lb_totPlanilla = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        date_ini = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        date_fin = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txt_codPlanilla = new javax.swing.JTextField();
        lbMostrar = new javax.swing.JLabel();

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

        CB_emp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_emp1ActionPerformed(evt);
            }
        });

        jButton6.setText("Calcular");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lb_totPlanilla.setBackground(new java.awt.Color(255, 204, 204));
        lb_totPlanilla.setOpaque(true);

        jButton7.setText("Calcular");

        jButton8.setText("Calcular");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Calcular");

        jButton10.setText("Calcular");

        jButton11.setText("Total planilla");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Guardar Datos");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Salir");

        jLabel13.setText("Fecha Inicial:");

        jLabel14.setText("Fecha final:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("*");

        jButton14.setText("jButton14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("jButton15");

        jButton16.setText("jButton16");

        jButton17.setText("jButton17");

        jButton18.setText("jButton18");

        jButton19.setText("jButton19");

        jButton20.setText("jButton20");

        jButton21.setText("jButton21");

        jButton22.setText("jButton22");

        jButton23.setText("jButton23");

        jLabel12.setText("Ingrese codigo de planilla:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox4, 0, 96, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CB_emp1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                            .addComponent(isr_2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(sb_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(17, 17, 17)
                                                    .addComponent(boni_1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(17, 17, 17)
                                                    .addComponent(comi_1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(ig_1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(desc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(isr_1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel9))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                        .addComponent(isr_3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                    .addComponent(isr_4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
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
                                            .addComponent(isr_6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                            .addComponent(isr_7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                        .addComponent(isr_8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                        .addComponent(isr_9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                                        .addComponent(isr_10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(430, 430, 430)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
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
                                .addComponent(isr_5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date_ini, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(130, 130, 130)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(st_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dep_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)))
                                .addGap(4, 4, 4)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(st_emp10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dep_emp10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_codPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(746, 746, 746)
                                .addComponent(lb_totPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(date_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(date_ini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dep_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dep_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dep_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st_emp4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dep_emp4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st_emp5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dep_emp5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(st_emp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dep_emp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dep_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(st_emp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dep_emp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(st_emp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dep_emp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(st_emp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dep_emp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel9))
                                            .addComponent(jLabel10))
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sb_emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boni_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comi_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ig_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(desc_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(isr_1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CB_emp1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sb_emp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boni_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comi_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ig_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desc_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isr_2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(sb_emp3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boni_3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comi_3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ig_3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desc_3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isr_3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sb_emp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boni_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comi_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ig_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(desc_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(isr_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(jComboBox5)
                                    .addComponent(sb_emp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boni_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comi_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ig_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(desc_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isr_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(jComboBox6)
                                    .addComponent(sb_emp6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boni_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comi_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ig_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(desc_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isr_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sb_emp7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boni_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comi_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ig_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(desc_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isr_7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox8)
                                    .addComponent(sb_emp8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boni_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comi_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ig_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(desc_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isr_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox9)
                                    .addComponent(sb_emp9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boni_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comi_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ig_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(desc_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isr_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox10)
                                    .addComponent(sb_emp10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boni_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comi_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ig_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(desc_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(isr_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_totPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_codPlanilla)
                        .addGap(6, 6, 6))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void CB_emp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_emp1ActionPerformed
        // busca con el combobox y muestra datos del empleado

        String StrCB_emp1 = CB_emp1.getSelectedItem().toString();

        try {
            buscarEmp(StrCB_emp1);
        } catch (SQLException ex) {
            Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        // busca y muestra

        

    }//GEN-LAST:event_CB_emp1ActionPerformed

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

    }//GEN-LAST:event_jButton5ActionPerformed

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

    }//GEN-LAST:event_jButton4ActionPerformed

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

    }//GEN-LAST:event_jButton3ActionPerformed

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

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
            SL=sb_emp1.getText();
            sueldo_base[0]=Integer.parseInt(SL);
            
            
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
            
            if(verificacion[0]==1)
            {
                plan[0][1]=250;
                boni_1.setText(""+plan[0][1]);
            }
            //verifica en que rango esta el suldo para calcular el isr
            if(verificacion[4]==1)
            {
                if(sueldo_base[0]>=2600 && sueldo_base[0]<=5000)
                {
                    isr[0]=(int) (sueldo_base[0]*0.03);
                    isr_1.setText(""+isr[0]);
                }
                else if(sueldo_base[0]>=5001 && sueldo_base[0]<=10000)
                {

                    isr[0]=(int) (sueldo_base[0]*0.05);
                    isr_1.setText(""+isr[0]);

                }
            }
            //hace la suma y restas para el sueldo liquido
            plan[0][5]=sueldo_base[0]+plan[0][1]+plan[0][2]-plan[0][3]-plan[0][4]-isr[0];
            st_emp1.setText(""+plan[0][5]);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
Verifica veri = new Verifica();
        veri.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        totp=plan[0][5];
        lb_totPlanilla.setText(""+totp);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
       //Codigo que permite insertar registros en al base de datos
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_planilla", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into encabezado_nomina(codigo_nomina,fecha_inicial_nomina,fecha_final_nomina,valor_nomina) values(?,?,?,?)");
        
            pst.setString(1, txt_codPlanilla.getText().trim());
            pst.setString(2,((JTextField)date_ini.getDateEditor().getUiComponent()).getText());
            pst.setString(3,((JTextField)date_fin.getDateEditor().getUiComponent()).getText());
            pst.setString(4, lb_totPlanilla.getText().trim());
            pst.executeUpdate();
            
            txt_codPlanilla.setText("");            
            lbMostrar.setText("Registro exitoso.");
        }catch (Exception e){
            System.out.println("Error "+e);
        }   
   




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_emp1;
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
    private com.toedter.calendar.JDateChooser date_fin;
    private com.toedter.calendar.JDateChooser date_ini;
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMostrar;
    private javax.swing.JLabel lb_totPlanilla;
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
    private javax.swing.JTextField txt_codPlanilla;
    // End of variables declaration//GEN-END:variables

    private static class Buscar {

        public Buscar() {
        }
    }
}
