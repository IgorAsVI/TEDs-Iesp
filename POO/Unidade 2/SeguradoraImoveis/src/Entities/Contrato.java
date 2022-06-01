package Entities;

import java.util.ArrayList;

public abstract class Contrato {
    private Cliente cliente;
    private double valorImovel;
    private static ArrayList<Contrato> lstContrato = new ArrayList<Contrato> ();

    public Contrato(Cliente cliente, double valorImovel) {
        this.cliente = cliente;
        this.valorImovel = valorImovel;
    }


    public static ArrayList<Contrato> getLstContrato() {
        return lstContrato;
    }

    public static void setLstContrato(Contrato contrato) {
        Contrato.getLstContrato().add(contrato);
    }

    public void setValorImovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    public abstract double valorSeguro();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "cliente=" + cliente +
                ", valorImovel=" + valorImovel +
                '}';
    }

    public void setValorImovel(Float valorImovel) {
        this.valorImovel = valorImovel;
    }
}
