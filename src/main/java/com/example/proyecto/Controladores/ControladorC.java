/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto.Controladores;

import com.example.proyecto.Entidades.Clientes;
import com.example.proyecto.Servicios.ServicioCliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ControladorC {
    
    @Autowired
    ServicioCliente sClientes;
    
    @GetMapping("/todos")
    public List<Clientes> obtenerTodos() {
        return sClientes.obtenerTodosLosClientes();
    }
    
    @GetMapping("/{id}")
    public Clientes obtenerAnimal(@PathVariable Integer id) {
        return sClientes.obtenerCliente(id).orElse(null);
    }
    
    @PostMapping
    public List<Clientes> guardar(@RequestBody Clientes a1) {
        sClientes.insertarCliente(a1);
        return sClientes.obtenerTodosLosClientes();
    }
    
    @PutMapping
    public List<Clientes> actualizar(@RequestBody Clientes a1) {
        sClientes.actualizarCliente(a1);
        return sClientes.obtenerTodosLosClientes();
    }
    
    @DeleteMapping("/{id}")
    public List<Clientes> eliminar(@PathVariable Integer id) {
        sClientes.eliminarCliente(id);
        return sClientes.obtenerTodosLosClientes();
    }
}