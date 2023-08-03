/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;

/**
 *
 * @author italo
 */
public class DAO {
    // Módulo de conexão
     
    // Parâmetros de conexão    
    
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String password = "188988";
    
    
    // Método conexão
    
    private Connection conectar(){
        Connection con = null;
        try {
            Class.forName(driver);
        } catch (Exception e) {
        }
        
    }

    
     
}
