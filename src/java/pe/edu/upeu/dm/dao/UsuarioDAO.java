/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.dm.interfas.Operaciones;
import pe.edu.upeu.dm.model.Usuario;
import pe.edu.upeu.dm.util.Conexion;

/**
 *
 * @author Jesus
 */
public class UsuarioDAO implements Operaciones<Usuario>{
    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    private String SQL_CREATE   ="";
    private String SQL_READ     ="";
    private String SQL_READALL  ="";
    private String SQL_UPDATE   ="";
    private String SQL_DELETE   ="";
    private String SQL_VALIDAR   ="";

    @Override
    public List<Usuario> ReadAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> Read(int id) {
        List<Usuario> lista = new ArrayList<>();
        try {
            cx=Conexion.getConexion();
            ps=cx.prepareStatement(SQL_READ);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario p=new Usuario();
                p.setUsuario_id(rs.getString("usuario_id"));
                p.setUser(rs.getString("User"));
                p.setPass(rs.getString("Pass"));
                p.setRol_id(rs.getString("Rol_id"));
                p.setTrabajador_id(rs.getString("Trabajador_id"));
                lista.add(p);
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return lista;
    }

    @Override
    public int update(Usuario x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Usuario x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String validar (String Usuario, String Pass){
        List<Usuario> lista = new ArrayList<>();
        String i="0";
        try {
            cx=Conexion.getConexion();
            ps=cx.prepareStatement(SQL_READ);
            ps.setString(1, Usuario);
            ps.setString(2, Pass);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario p =new Usuario();
                p.setUsuario_id(rs.getString("usuario_id"));
                p.setUser(rs.getString("User"));
                p.setPass(rs.getString("Pass"));
                p.setRol_id(rs.getString("Rol_id"));
                p.setTrabajador_id(rs.getString("Trabajador_id"));
                lista.add(p);
            }
            i=lista.get(0).getUsuario_id();
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return i;
    }
    
    
}
