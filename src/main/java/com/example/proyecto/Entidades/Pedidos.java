/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto.Entidades;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pedido")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
    private int idCliente;
    private String nombreCliente;
    private Date fecha;
    private int cantidadPollos;
    private Double precioPorKilo;
    private Double totalKilogramos;
    private Double totalPagar;
    private Double abono;
    private Double resto;
    private Double pagado;

    // Puedes agregar otros campos según sea necesario
    
    @PrePersist
    protected void onCreate() {
        fecha = new Date();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidadPollos() {
        return cantidadPollos;
    }

    public void setCantidadPollos(Integer cantidadPollos) {
        this.cantidadPollos = cantidadPollos;
    }

    public Double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public void setPrecioPorKilo(Double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public Double getTotalKilogramos() {
        return totalKilogramos;
    }

    public void setTotalKilogramos(Double totalKilogramos) {
        this.totalKilogramos = totalKilogramos;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    public Double getAbono() {
        return abono;
    }

    public void setAbono(Double abono) {
        this.abono = abono;
    }
    
    public Double getResto() {
        return resto;
    }

    public void setResto(Double resto) {
        this.resto = resto;
    }
    
    public Double getPagado() {
        return pagado;
    }

    public void setPagado(Double pagado) {
        this.pagado = pagado;
    }
}
