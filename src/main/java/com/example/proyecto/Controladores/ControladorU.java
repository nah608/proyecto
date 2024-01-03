/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto.Controladores;

import com.example.proyecto.Entidades.Clientes;
import com.example.proyecto.Entidades.Usuarios;
import com.example.proyecto.Servicios.ServicioUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class ControladorU {
    
    @Autowired
    ServicioUsuario sUsuarios;
    
    @GetMapping("/nombre")
    public Usuarios obtenerUsuarioPorNombre(@RequestParam String nombre) {
        return sUsuarios.obtenerUsuarioPorNombre(nombre).orElse(null);
    }
    
    @GetMapping("/todos")
    public List<Usuarios> obtenerTodos() {
        return sUsuarios.obtenerTodosLosUsuarios();
    }
    
    @GetMapping("/{id}")
    public Usuarios obtenerAnimal(@PathVariable Integer id) {
        return sUsuarios.obtenerUsuario(id).orElse(null);
    }
    
    @PostMapping
    public List<Usuarios> guardar(@RequestBody Usuarios a1) {
        sUsuarios.insertarUsuario(a1);
        return sUsuarios.obtenerTodosLosUsuarios();
    }
    
    @DeleteMapping("/{id}")
    public List<Usuarios> eliminar(@PathVariable Integer id) {
        sUsuarios.eliminarUsuario(id);
        return sUsuarios.obtenerTodosLosUsuarios();
    }
}
