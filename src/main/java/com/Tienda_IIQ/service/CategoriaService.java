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
}
