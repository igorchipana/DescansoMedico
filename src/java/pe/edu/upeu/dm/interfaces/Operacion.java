/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.interfaces;

import java.util.List;

/**
 *
 * @author Rodrigo Gutierrez
 */
public interface Operacion <Entidad>{  
    public List<Entidad> readall();
    public List<Entidad> read(int id);
    public int create(Entidad x);
    public int update(Entidad x);
    public int delete(int id);
}
    
