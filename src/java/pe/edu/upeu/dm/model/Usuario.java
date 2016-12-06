/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.model;

/**
 *
 * @author Jesus
 */
public class Usuario {
        private String   usuario_id;
        private String   user;
        private String   pass;
        private String   trabajador_id;
        private String   rol_id;

    public Usuario() {
    }

    public Usuario(String user, String pass, String trabajador_id, String rol_id) {
        this.user = user;
        this.pass = pass;
        this.trabajador_id = trabajador_id;
        this.rol_id = rol_id;
    }

    public Usuario(String usuario_id, String user, String pass, String trabajador_id, String rol_id) {
        this.usuario_id = usuario_id;
        this.user = user;
        this.pass = pass;
        this.trabajador_id = trabajador_id;
        this.rol_id = rol_id;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTrabajador_id() {
        return trabajador_id;
    }

    public void setTrabajador_id(String trabajador_id) {
        this.trabajador_id = trabajador_id;
    }

    public String getRol_id() {
        return rol_id;
    }

    public void setRol_id(String rol_id) {
        this.rol_id = rol_id;
    }
        
        
}
