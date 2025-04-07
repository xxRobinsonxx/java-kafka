package com.example.model;

public class Boleta {
    private String numero;
    private Double total;

    public Boleta() {}

    public Boleta(String numero, Double total) {
        this.numero = numero;
        this.total = total;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }
}
