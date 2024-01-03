/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyecto.Repositorios;

import com.example.proyecto.Entidades.Pedidos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nahum
 */
public interface RepositorioPedido extends JpaRepository <Pedidos, Integer>{
    List<Pedidos> findByIdCliente(Integer idCliente);
}
