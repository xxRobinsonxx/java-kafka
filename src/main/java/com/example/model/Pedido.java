package com.example.model;

public class Pedido {
    private String nro;
    private String cliente;
    private String direccion;

    // Constructor vacío requerido
    public Pedido() {}

    public Pedido(String nro, String cliente, String direccion) {
        this.nro = nro;
        this.cliente = cliente;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNro() { return nro; }
    public void setNro(String nro) { this.nro = nro; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}

