/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.dm.dao.UsuarioDAO;
import pe.edu.upeu.dm.model.Usuario;


/**
 *
 * @author Rodrigo Gutierrez
 */public class testvalidar {
    static Usuario u;
    static UsuarioDAO ll = new UsuarioDAO();
    static List<Usuario> lista = new ArrayList<>();
    public  static Connection xd;
    public static void main(String[] args) {
        valida();
        // TODO code application logic here
    }
    public static void valida(){
        if(ll.validar("user", "password")=="0"){
            System.out.println("no");
        }else{
            System.out.println("si");
        }
    }

    
}