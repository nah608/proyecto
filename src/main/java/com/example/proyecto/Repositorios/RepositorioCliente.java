/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyecto.Repositorios;

import com.example.proyecto.Entidades.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nahum
 */
public interface RepositorioCliente extends JpaRepository <Clientes, Integer>{
    
}
