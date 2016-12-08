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
public class persona {
    private String persona_id;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String dni;
    private Date fecha_naci;
    private String nacionalidad;
    private String telefono;
    private String celular;
    private String departamento;
    private String provincia;
    private String distrito;
    private String correo_personal;
    private String correo_institucional;
    private String sexo;
    private String nivel_educativo;

    public String getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(String persona_id) {
        this.persona_id = persona_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha_naci() {
        return fecha_naci;
    }

    public void setFecha_naci(Date fecha_naci) {
        this.fecha_naci = fecha_naci;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCorreo_personal() {
        return correo_personal;
    }

    public void setCorreo_personal(String correo_personal) {
        this.correo_personal = correo_personal;
    }

    public String getCorreo_institucional() {
        return correo_institucional;
    }

    public void setCorreo_institucional(String correo_institucional) {
        this.correo_institucional = correo_institucional;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNivel_educativo() {
        return nivel_educativo;
    }

    public void setNivel_educativo(String nivel_educativo) {
        this.nivel_educativo = nivel_educativo;
    }

    public persona() {
    }

    public persona(String nombre, String apellido_p, String apellido_m, String dni, Date fecha_naci, String nacionalidad, String telefono, String celular, String departamento, String provincia, String distrito, String correo_personal, String correo_institucional, String sexo, String nivel_educativo) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.dni = dni;
        this.fecha_naci = fecha_naci;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.celular = celular;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.correo_personal = correo_personal;
        this.correo_institucional = correo_institucional;
        this.sexo = sexo;
        this.nivel_educativo = nivel_educativo;
    }

    public persona(String persona_id, String nombre, String apellido_p, String apellido_m, String dni, Date fecha_naci, String nacionalidad, String telefono, String celular, String departamento, String provincia, String distrito, String correo_personal, String correo_institucional, String sexo, String nivel_educativo) {
        this.persona_id = persona_id;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.dni = dni;
        this.fecha_naci = fecha_naci;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.celular = celular;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.correo_personal = correo_personal;
        this.correo_institucional = correo_institucional;
        this.sexo = sexo;
        this.nivel_educativo = nivel_educativo;
    }
}
