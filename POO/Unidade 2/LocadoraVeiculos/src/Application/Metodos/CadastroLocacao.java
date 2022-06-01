package Application.Metodos;

import Application.Validacao.Validacao;
import Entities.Cliente;
import Entities.LocacaoVeiculo;
import Entities.Veiculo;


public class CadastroLocacao {

    public static LocacaoVeiculo cadastrar(Cliente clienteLocacao, Veiculo veiculoLocacao){
        int tempoLocacao = Validacao.validaInteiro("Dias de locação: ");
        String dataLocacao = Validacao.validaString("Data de locação (dd/mm/aaaa): ");
        boolean seguroLocacao;
        while(true){
            int escolhaSeguro = Validacao.validaInteiro("Vai contratar seguro? [1-Sim|2-Não]: ");
            if(escolhaSeguro == 1){
                seguroLocacao = true;
                break;
            }
            else if(escolhaSeguro == 2){
                seguroLocacao = false;
                break;
            }
            else{
                System.out.println("Opção inválida. Tente novamente!");
            }
        }
        double descontoLocacao = 0;
        while(true){
            int escolhaDesconto = Validacao.validaInteiro("Possui desconto? [1-Sim|2-Não]: ");
            if(escolhaDesconto == 1){
                descontoLocacao = Validacao.validaDouble("Percentual do desconto: ");
                break;
            }
            else if(escolhaDesconto == 2){
                descontoLocacao = 0;
                break;
            }
            else{
                System.out.println("Opção inválida. Tente novamente!");
            }
        }
        LocacaoVeiculo locacaoVeiculo = new LocacaoVeiculo(clienteLocacao, veiculoLocacao, tempoLocacao, dataLocacao, seguroLocacao, descontoLocacao);
        return locacaoVeiculo;
    }

    public static int indiceCliente(int tamanho){
        int max = tamanho - 1;
        while(true){
            int indiceCliente = Validacao.validaInteiro("Índice do cliente: ");
            if((indiceCliente >= 0) && (indiceCliente <= max)){
                return indiceCliente;
            }
            else{
                System.out.println("Índice inválido. Tente novamente!");
            }
        }
    }

    public static int indiceVeiculo(int tamanho){
        int max = tamanho - 1;
        while(true){
            int indiceVeiculo = Validacao.validaInteiro("Índice do veículo: ");
            if((indiceVeiculo >= 0) && (indiceVeiculo <= max)){
                return indiceVeiculo;
            }
            else{
                System.out.println("Índice inválido. Tente novamente!");
            }
        }
    }
}
