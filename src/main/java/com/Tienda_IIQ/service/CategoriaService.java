/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_IIQ.service;

import com.Tienda_IIQ.domain.Categoria;
import java.util.List;

/**
 *
 * @author EIVOR
 */
public interface CategoriaService {
    
    //Metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    
    public List<Categoria> getCategorias(boolean activos);
    //Se obtiene una categoria por subid
    public Categoria getCategoria(Categoria categoria);
    
    //Insertar: se inserta cuando el idCategoria esta vacio(valor 0 o null)
    //Modificar: se modifica cuan el idCategoria no esta vacio
    public void save(Categoria categoria);
    
    //Se elimina un registro por su idCategoria
    public void delete(Categoria categoria);
    
}
