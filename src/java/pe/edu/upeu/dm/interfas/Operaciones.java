/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dm.interfas;

import java.util.List;

/**
 *
 * @author Jesus
 */
public interface Operaciones<Entidad> {
    
    public List<Entidad> ReadAll();
    public List<Entidad> Read(int id);
    public int update(Entidad x);
    public int insert(Entidad x);
    public int delete(int id);
    
}
