/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto.Servicios;

import com.example.proyecto.Entidades.Clientes;
import com.example.proyecto.Repositorios.RepositorioCliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioCliente {
    
    @Autowired
    RepositorioCliente rClientes;
    
    public List<Clientes> obtenerTodosLosClientes() {
        return rClientes.findAll();
    }
    
    public Optional<Clientes> obtenerCliente(Integer id) {
        return rClientes.findById(id);
    }
    
    public boolean actualizarCliente(Clientes a) {
        try {
            rClientes.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean eliminarCliente(Integer id) {
        try {
            rClientes.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean insertarCliente(Clientes a) {
        try {
            rClientes.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
