package Entities;

import Entities.Enum.MotorNave;
import Entities.Enum.TipoVeiculo;

public class Veiculo {
    private TipoVeiculo tipoVeiculo;
    private double valorDiaria;
    private String descricao;
    private String identificacao;
    private int numeroPassageiros;
    private boolean partidaEletrica;
    private MotorNave motorNave;

    // CARRO
    public Veiculo(TipoVeiculo tipoVeiculo, double valorDiaria, String descricao, String identificacao, int numeroPassageiros) {
        this.tipoVeiculo = tipoVeiculo;
        this.valorDiaria = valorDiaria;
        this.descricao = descricao;
        this.identificacao = identificacao;
        this.numeroPassageiros = numeroPassageiros;
    }

    // MOTO
    public Veiculo(TipoVeiculo tipoVeiculo, double valorDiaria, String descricao, String identificacao, boolean partidaEletrica) {
        this.tipoVeiculo = tipoVeiculo;
        this.valorDiaria = valorDiaria;
        this.descricao = descricao;
        this.identificacao = identificacao;
        this.partidaEletrica = partidaEletrica;
    }

    // NAVE_ESPACIAL
    public Veiculo(TipoVeiculo tipoVeiculo, double valorDiaria, String descricao, String identificacao, MotorNave motorNave) {
        this.tipoVeiculo = tipoVeiculo;
        this.valorDiaria = valorDiaria;
        this.descricao = descricao;
        this.identificacao = identificacao;
        this.motorNave = motorNave;
    }

    @Override
    public String toString() {
        if(getTipoVeiculo() == TipoVeiculo.CARRO){
            return "Veiculo{" +
                    "tipoVeiculo=" + tipoVeiculo +
                    ", valorDiaria=" + valorDiaria +
                    ", descricao='" + descricao + '\'' +
                    ", identificacao='" + identificacao + '\'' +
                    ", numeroPassageiros=" + numeroPassageiros +
                    '}';
        }
        else if(getTipoVeiculo() == TipoVeiculo.MOTO){
            return "Veiculo{" +
                    "tipoVeiculo=" + tipoVeiculo +
                    ", valorDiaria=" + valorDiaria +
                    ", descricao='" + descricao + '\'' +
                    ", identificacao='" + identificacao + '\'' +
                    ", partidaEletrica=" + partidaEletrica +
                    '}';
        }
        else if(getTipoVeiculo() == TipoVeiculo.NAVE_ESPACIAL){
            return "Veiculo{" +
                    "tipoVeiculo=" + tipoVeiculo +
                    ", valorDiaria=" + valorDiaria +
                    ", descricao='" + descricao + '\'' +
                    ", identificacao='" + identificacao + '\'' +
                    ", motorNave=" + motorNave +
                    '}';
        }
        else{
            return "Veiculo{" +
                    "tipoVeiculo=" + tipoVeiculo +
                    ", valorDiaria=" + valorDiaria +
                    ", descricao='" + descricao + '\'' +
                    ", identificacao='" + identificacao + '\'' +
                    ", numeroPassageiros=" + numeroPassageiros +
                    ", partidaEletrica=" + partidaEletrica +
                    ", motorNave=" + motorNave +
                    '}';
        }
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public MotorNave getMotorNave() {
        return motorNave;
    }

    public void setMotorNave(MotorNave motorNave) {
        this.motorNave = motorNave;
    }
}
