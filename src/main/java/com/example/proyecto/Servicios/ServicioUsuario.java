/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto.Servicios;

import com.example.proyecto.Entidades.Clientes;
import com.example.proyecto.Entidades.Usuarios;
import com.example.proyecto.Repositorios.RepositorioUsuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {
    
    @Autowired
    RepositorioUsuario rUsuarios;
    
public Optional<Usuarios> obtenerUsuarioPorNombre(String nombre) {
        return rUsuarios.findByNombre(nombre);
    }

public List<Usuarios> obtenerTodosLosUsuarios() {
        return rUsuarios.findAll();
    }
    
    public Optional<Usuarios> obtenerUsuario(Integer id) {
        return rUsuarios.findById(id);
    }
    
    public boolean eliminarUsuario(Integer id) {
        try {
            rUsuarios.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public boolean insertarUsuario(Usuarios a) {
        try {
            rUsuarios.save(a);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
