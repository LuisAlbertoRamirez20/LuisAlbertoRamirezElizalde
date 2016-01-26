/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;



/**
 *
 * @author Stunt
 */
public class DataBase extends javax.swing.JFrame {
        
    DefaultTableModel dtm;
    DefaultComboBoxModel dcbm;
    JComboBox combo;
    String op[] = new String[9];
    Conexion conexion = new Conexion();
    Random rndm = new Random();
    ResultSet rs;
    ArrayList Titulo = new ArrayList();
    ArrayList Dato = new ArrayList();
    
    /**
     * Creates new form DataBase
     */
    @SuppressWarnings("empty-statement")
    public DataBase() {
        op[0] = "Nombre";
        op[1] = "Apellido_Paterno";
        op[2] = "Apellido_Materno";
        op[3] = "Telefono";
        op[4] = "Imail";
        op[5] = "Direccion";
        op[6] = "Codigo_Postal";
        op[7] = "Region";
        op[8] = "Pais";
        
        
        
        dcbm = new DefaultComboBoxModel(op);
        combo = new JComboBox(dcbm);
        
        initComponents();
        
        TableColumn tc = tabla.getColumnModel().getColumn(1);
                tc.setCellEditor(new DefaultCellEditor(combo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombrebase = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        rbSQL = new javax.swing.JRadioButton();
        rbCSV = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombretabla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Nombre de la base de datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 250, 30));

        nombrebase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrebaseActionPerformed(evt);
            }
        });
        nombrebase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombrebaseKeyReleased(evt);
            }
        });
        jPanel1.add(nombrebase, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel2.setText("Tipo de dato a generar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));
        jPanel1.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //String[][]celdas = new String[0][2];

        dtm = new DefaultTableModel(new Object [][] {
        },
        new String [] {
            "Nombre", "Tipo de dato"
        });
        tabla.setModel(dtm);
        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, 220));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 440, 240));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.setActionCommand("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 30));

        buttonGroup1.add(rbSQL);
        rbSQL.setText("SQL");
        jPanel1.add(rbSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        buttonGroup1.add(rbCSV);
        rbCSV.setText("CSV");
        jPanel1.add(rbCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Generar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Nombre de la tabla");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 400, 140));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel4.setText("Número de columnas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 190, 30));
        jPanel1.add(nombretabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombrebaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrebaseKeyReleased
        
        
    }//GEN-LAST:event_nombrebaseKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(nombrebase.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inserta el nombre de la base");
        }else if(nombretabla.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inserta el nombre de la base");
        }else if(numero.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Inserta el numero de filas que necesitas");
        }else{
        
            int filas = Integer.parseInt(numero.getText());
            
           for(int x=0;x<filas;x++){
               dtm.addRow(new Object[]{""});
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TableModel modeloT = tabla.getModel();//Obtener modelo de tabla
        int columna = modeloT.getColumnCount();//Obtener numero de columnas
        int fila = modeloT.getRowCount();//Obtener numero de filas
        String nomb = nombrebase.getText();
        String nomt = nombretabla.getText();
        String consulta = "";
        String cadenas;
        String otrac;
        if(fila>0)//Si hay filas en la tabla
        {
            
            Obtener(fila, columna, modeloT);
            
            String acumula="";
            cadenas = AConsulta(Dato);
            
            conexion.insertar("CREATE DATABASE "+nomb);
            conexion.insertar("DROP VIEW IF EXISTS ejemplo");
   
            conexion.insertar("CREATE VIEW ejemplo AS SELECT "+Dato.get(0)+""+cadenas+" FROM regis");
            conexion.insertar("SELECT * from  ejemplo into outfile 'C:\\\\ejemplo.txt' fields terminated \n" +
"by ',' lines terminated by '\\r\\n'"); 
            
            for(int w=1;w<Titulo.size();w++)
            {
                        acumula+=","+Titulo.get(w)+" varchar(51)";
            }
            conexion.parameter(nomb);
            
            conexion.crear("CREATE TABLE "+nomt+" ("+Titulo.get(0)+" varchar(51)"+acumula+")");
           for(int g=1;g<1000;g++){
            conexion.crear("load data infile 'C://ejemplo.txt' into table "+nomt+" fields terminated by ',' lines terminated by '\r\n'");
           }
             conexion.crear("SELECT * from  "+nomt+" into outfile 'C:\\\\ejemplodos.txt' fields terminated \n" +
"by ',' lines terminated by '\\r\\n'");
            
           
            
            
            
        }
        else//Si no hay filas en la tabla
        {
            JOptionPane.showMessageDialog(null, "No hay datos.");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nombrebaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrebaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrebaseActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombrebase;
    private javax.swing.JTextField nombretabla;
    private javax.swing.JTextField numero;
    private javax.swing.JRadioButton rbCSV;
    private javax.swing.JRadioButton rbSQL;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public String AConsulta(ArrayList datos)
    {
        String a="";
        for(int f=1;f<datos.size();f++)
        {
            a+=","+datos.get(f);
        }
        return a;
    }
    
    public void insercion()
    {
        
               
    }
    public void Obtener(int fila,int columna,TableModel modeloT)
    {
        for(int x=0;x<fila;x++)//Obtiene los datos de la tabla
                {
                    for(int y=0;y<columna;y++)
                    {
                        if(y==1)
                        {
                            Dato.add(modeloT.getValueAt(x,y));
                        }
                        else
                        {
                            Titulo.add(modeloT.getValueAt(x,y));
                        }
                        
                    }
                }
    }
    
    public void radios(String xx)
    {
        if(rbSQL.isSelected())//Si selecciona radioButton SQL
            {
                try{
                    Process pro = Runtime
                            .getRuntime().exec("C:/wamp/bin/mysql/mysql5.6.17/bin/mysqldump -u root -ppassword database");
                    
                    InputStream ips = pro.getInputStream();
                    FileOutputStream fios = new FileOutputStream(xx+".sql");
                    byte[] bb = new byte[1000];
                    
                    int leido = ips.read(bb);
                    while (leido > 0) {
                    fios.write(bb, 0, leido);
                    leido = ips.read(bb);
                    }
 
                    fios.close();
                    JOptionPane.showMessageDialog(null, "Proceso terminado.");
                }catch(IOException | HeadlessException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                
            }
            else if(rbCSV.isSelected())//Si selecciona radioButton CSV
            {
                String nombreArchivo = "C:\\archivo.csv";
                String texto = null;
                for(int o=0;0<Dato.size();o++){
                    texto = Dato.get(o).toString();
                }
                
                texto += "acá;allí;lejos";
                try{
                FileWriter fwriter = new FileWriter(nombreArchivo);
                fwriter.write('\ufeff'); //si no se escribe esto, excel no muestra bien el texto con tildes
                fwriter.write(texto);
                fwriter.flush();
                fwriter.close();
        }catch (IOException e){
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, e);
        }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No has seleccionado el archivo");
            }
    }
    
    
}