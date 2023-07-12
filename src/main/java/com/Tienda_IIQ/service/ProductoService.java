/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda_IIQ.service;

import com.Tienda_IIQ.domain.Producto;
import java.util.List;

/**
 *
 * @author EIVOR
 */
public interface ProductoService {
    
    //Metodo para consultar las categorias. El parametro define si se muestran solo las activas o todas
    
    public List<Producto> getProductos(boolean activos);
    //Se obtiene una categoria por subid
    public Producto getProducto(Producto Producto);
    
    //Insertar: se inserta cuando el idCategoria esta vacio(valor 0 o null)
    //Modificar: se modifica cuan el idCategoria no esta vacio
    public void save(Producto producto);
    
    //Se elimina un registro por su idCategoria
    public void delete(Producto producto);
    
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
