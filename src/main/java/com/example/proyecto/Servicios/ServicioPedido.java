/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto.Servicios;

import com.example.proyecto.Entidades.Pedidos;
import com.example.proyecto.Repositorios.RepositorioPedido;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPedido {
    
    @Autowired
    RepositorioPedido rPedidos;
    
    public List<Pedidos> obtenerTodosLosPedidos() {
        return rPedidos.findAll();
    }
    
    public Optional<Pedidos> obtenerPedido(Integer id) {
        return rPedidos.findById(id);
    }
    
    public List<Pedidos> obtenerPedidosPorCliente(Integer idCliente) {
    return rPedidos.findByIdCliente(idCliente);
    }
    
    public boolean actualizarPedido(Pedidos a) {
        try {
            rPedidos.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean eliminarPedido(Integer id) {
        try {
            rPedidos.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean insertarPedido(Pedidos a) {
        try {
            rPedidos.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}