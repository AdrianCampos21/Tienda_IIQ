/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda_IIQ.service.impl;

import com.Tienda_IIQ.dao.CategoriaDao;
import com.Tienda_IIQ.domain.Categoria;
import com.Tienda_IIQ.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired
    CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> categorias=categoriaDao.findAll();
        
        if(activos){
           categorias.removeIf(x -> !x.isActivo());
        }
        
        return categorias;
    }
      
}
