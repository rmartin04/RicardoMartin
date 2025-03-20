package es.examen.partesql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import es.cursojava.utils.UtilidadesBD;

public class ConsultasSql {

	
		private static final String CONSULTA_PRODUCTOS = "SELECT ID,NOMBRE,TIPO,PRECIO,STOCK FROM TB_PRODUCTOS";

		public static void main(String[] args) {
			
			Connection conexion = UtilidadesBD.crearConexion();
			Statement st = null;
			ResultSet rs = null;
			try {
				 st = conexion.createStatement();
				 rs = st.executeQuery(CONSULTA_PRODUCTOS);
				 while(rs.next()) {
					 int id = rs.getInt("ID");
					 String nombre = rs.getString("NOMBRE");
					 String tipo = rs.getString("TIPO");
					 double precio = rs.getDouble("PRECIO");
					 int stock = rs.getInt("STOCK");
					 System.out.println("Registro.[ID: " + id + ", Nombre: " + nombre +
							 ", Tipo: " + tipo + ", Precio: " + precio+ ", Stock: "+stock+"]");
				 }
				 
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				
				UtilidadesBD.cierraConexion(conexion);
				try {
					
					rs.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				}
				try {
					st.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
	         
			System.out.println("Fin de la consulta");
		}

	

	}


