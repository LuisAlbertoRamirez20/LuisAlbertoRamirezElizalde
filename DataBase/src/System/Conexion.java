/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Stunt
 */
public class Conexion {
    static Connection con;
    static Statement st;
    static ResultSet rs;
    String nb = null;
    
    private void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/nombres","root" , "");
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null,"Error de conexion", "error",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"Error", "error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void parameter(String namebase){
        this.nb=namebase;
        conecta();
        
    }
    private void conecta(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+nb,"root" , "");
            
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null,"Error de conexion", "error",JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null,"Error", "error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void crear(String insertar){
        this.conecta();
		st = null;
		
		try {
			st=con.createStatement();
			st.execute(insertar);
			//JOptionPane.showMessageDialog(null, "Registro exitoso");
                        //con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
		}catch(Exception e){
			//JOptionPane.showMessageDialog(null,  "Error al consultar la BD");
		}
                
    }
    
    public void insertar(String insertar){
		this.conectar();
		st = null;
		
		try {
			st=con.createStatement();
			st.execute(insertar);
			//JOptionPane.showMessageDialog(null, "Registro exitoso");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error "+e.getMessage());
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,  "Error al consultar la BD en insertar");
		}
		
	}
        
        public ResultSet consultar(String consulta){
		this.conectar();
		rs = null;
		st = null;
		
		try 
                {
			st=con.createStatement();
			rs=st.executeQuery(consulta);
		}
                catch (SQLException e) 
                {
			JOptionPane.showMessageDialog(null,  "Error al consultar la BD\n"+e.getMessage());
		}
                catch(Exception e)
                {
			JOptionPane.showMessageDialog(null,  "Otro error al consultar la BD en consultar");
		}
		return rs;
	}
}
