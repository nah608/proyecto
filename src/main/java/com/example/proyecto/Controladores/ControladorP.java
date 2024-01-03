/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto.Controladores;

import com.example.proyecto.Entidades.Pedidos;
import com.example.proyecto.Servicios.ServicioPedido;
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
@RequestMapping("/pedido")
public class ControladorP {
    
    @Autowired
    ServicioPedido sPedidos;
    
    @GetMapping("/todos")
    public List<Pedidos> obtenerTodos() {
        return sPedidos.obtenerTodosLosPedidos();
    }
    
    @GetMapping("/cliente/{idCliente}")
    public List<Pedidos> obtenerPedidosPorCliente(@PathVariable Integer idCliente) {
    return sPedidos.obtenerPedidosPorCliente(idCliente);
}
    
    @GetMapping("/{id}")
    public Pedidos obtenerAnimal(@PathVariable Integer id) {
        return sPedidos.obtenerPedido(id).orElse(null);
    }
    
    @PostMapping
    public List<Pedidos> guardar(@RequestBody Pedidos a1) {
        sPedidos.insertarPedido(a1);
        return sPedidos.obtenerTodosLosPedidos();
    }
    
    @PutMapping
    public List<Pedidos> actualizar(@RequestBody Pedidos a1) {
        sPedidos.actualizarPedido(a1);
        return sPedidos.obtenerTodosLosPedidos();
    }
    
    @DeleteMapping("/{id}")
    public List<Pedidos> eliminar(@PathVariable Integer id) {
        sPedidos.eliminarPedido(id);
        return sPedidos.obtenerTodosLosPedidos();
    }
}

