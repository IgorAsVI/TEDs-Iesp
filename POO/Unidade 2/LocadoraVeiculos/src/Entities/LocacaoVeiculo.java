package Entities;

import Entities.Enum.MotorNave;
import Entities.Enum.TipoVeiculo;

public class LocacaoVeiculo {
    private Cliente clienteLocacao;
    private Veiculo veiculoLocacao;
    private int tempoLocacao;
    private String dataLocacao;
    private boolean seguroLocacao;
    private double descontoLocacao;

    public LocacaoVeiculo(Cliente clienteLocacao, Veiculo veiculoLocacao, int tempoLocacao, String dataLocacao, boolean seguroLocacao, double descontoLocacao) {
        this.clienteLocacao = clienteLocacao;
        this.veiculoLocacao = veiculoLocacao;
        this.tempoLocacao = tempoLocacao;
        this.dataLocacao = dataLocacao;
        this.seguroLocacao = seguroLocacao;
        this.descontoLocacao = descontoLocacao;
    }

    @Override
    public String toString() {
        return "LocacaoVeiculo{" +
                "clienteLocacao=" + clienteLocacao +
                ", \nveiculoLocacao=" + veiculoLocacao +
                ", \ntempoLocacao=" + tempoLocacao +
                ", \ndataLocacao='" + dataLocacao + '\'' +
                ", \nseguroLocacao=" + seguroLocacao +
                ", \ndescontoLocacao=" + descontoLocacao +
                ", \nvalorTotal=" + valorLocacao() +
                '}';
    }

    // VALOR TOTAL DA LOCAÇÃO
    public double valorLocacao(){
        return valorSeguro() + (locacao() * percentualDesconto());
    }

    public double locacao(){
        return veiculoLocacao.getValorDiaria() * getTempoLocacao();
    }

    public double percentualDesconto(){
        if((getDescontoLocacao() > 0) && (getDescontoLocacao() < 12)){
            return (getDescontoLocacao() / 100) + 1;
        }
        return 0;
    }

    public double valorSeguro(){
        if (isSeguroLocacao()){
            if(veiculoLocacao.getTipoVeiculo() == TipoVeiculo.CARRO){
                double numeroPassageiros = veiculoLocacao.getNumeroPassageiros();
                return 0.05 * veiculoLocacao.getValorDiaria() * ( 1 + numeroPassageiros / 20);
            }
            else if(veiculoLocacao.getTipoVeiculo() == TipoVeiculo.MOTO){
                return 0.09 * veiculoLocacao.getValorDiaria();
            }
            else if(veiculoLocacao.getTipoVeiculo() == TipoVeiculo.NAVE_ESPACIAL){
                if(veiculoLocacao.getMotorNave() == MotorNave.ATOMICO){
                    return 2.00 * veiculoLocacao.getValorDiaria() * 2;
                }
                else if(veiculoLocacao.getMotorNave() == MotorNave.COMBUSTAO){
                    return 2.00 * veiculoLocacao.getValorDiaria() * 1;
                }
            }
        }
        return 0;
    }

    public Cliente getClienteLocacao() {
        return clienteLocacao;
    }

    public void setClienteLocacao(Cliente clienteLocacao) {
        this.clienteLocacao = clienteLocacao;
    }

    public Veiculo getVeiculoLocacao() {
        return veiculoLocacao;
    }

    public void setVeiculoLocacao(Veiculo veiculoLocacao) {
        this.veiculoLocacao = veiculoLocacao;
    }

    public int getTempoLocacao() {
        return tempoLocacao;
    }

    public void setTempoLocacao(int tempoLocacao) {
        this.tempoLocacao = tempoLocacao;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public boolean isSeguroLocacao() {
        return seguroLocacao;
    }

    public void setSeguroLocacao(boolean seguroLocacao) {
        this.seguroLocacao = seguroLocacao;
    }

    public double getDescontoLocacao() {
        return descontoLocacao;
    }

    public void setDescontoLocacao(double descontoLocacao) {
        this.descontoLocacao = descontoLocacao;
    }
}
