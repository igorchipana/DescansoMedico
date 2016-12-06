/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.model;

/**
 *
 * @author Rodrigo Gutierrez
 */
public class trabajador {
    private String trabajador_id;
    private String codigo;
    private String persona_id;

    public String getTrabajador_id() {
        return trabajador_id;
    }

    public void setTrabajador_id(String trabajador_id) {
        this.trabajador_id = trabajador_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(String persona_id) {
        this.persona_id = persona_id;
    }

    public trabajador() {
    }

    public trabajador(String codigo, String persona_id) {
        this.codigo = codigo;
        this.persona_id = persona_id;
    }

    public trabajador(String trabajador_id, String codigo, String persona_id) {
        this.trabajador_id = trabajador_id;
        this.codigo = codigo;
        this.persona_id = persona_id;
    }
}
