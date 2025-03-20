package es.examen.partesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import es.cursojava.inicio.funciones.ejercicios.Utilidades;

public class UtilidadesBD {
	private static final String URL_DB_ORACLE = "jdbc:oracle:thin:@localhost:1522:XE";
	private static final String USER_DB_ORACLE = "ricky";
	private static final String PASSWORD_DB_ORACLE = "password";
	private static Connection connection = null;
	
	public static Connection crearConexion() {
		
		 connection = crearConexion(URL_DB_ORACLE, USER_DB_ORACLE, PASSWORD_DB_ORACLE);
		
		return connection;
    }

	public static Connection crearConexion(String url,String username, String password) {
		
		
		try {
			connection = DriverManager.getConnection(url, username, password);

			if (connection != null) {
				System.out.println("Conexion establecida");
			}

		} catch (SQLException e) {
			System.err.println("Ha habido un error al crear la sesion " + e.getMessage());

		}

		return connection;
	}
	 
    public static void cierraConexion(Connection connection) {
    	
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexion cerrada");
                
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
    }
		
	}

