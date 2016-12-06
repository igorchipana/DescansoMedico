/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.model;

import java.sql.Date;

/**
 *
 * @author Rodrigo Gutierrez
 */
public class Descanso {
    private String descanso_id;
    private Date fecha_ini;
    private Date fecha_fin;
    private String trabajador_id;

    public String getDescanso_id() {
        return descanso_id;
    }

    public void setDescanso_id(String descanso_id) {
        this.descanso_id = descanso_id;
    }

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getTrabajador_id() {
        return trabajador_id;
    }

    public void setTrabajador_id(String trabajador_id) {
        this.trabajador_id = trabajador_id;
    }

    public Descanso() {
    }

    public Descanso(Date fecha_ini, Date fecha_fin, String trabajador_id) {
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.trabajador_id = trabajador_id;
    }

    public Descanso(String descanso_id, Date fecha_ini, Date fecha_fin, String trabajador_id) {
        this.descanso_id = descanso_id;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.trabajador_id = trabajador_id;
    }
    
}
