package Application.Metodos;

import Application.Validacao.Validacao;
import Entities.Enum.MotorNave;
import Entities.Enum.TipoVeiculo;
import Entities.Veiculo;

public class CadastroVeiculo {
    public static Veiculo cadastrar(){
        UI.linha();
        System.out.println("* Cadastro de veículo *");
        System.out.println();

        System.out.println("Selecione o tipos de veículo:");
        System.out.println("1 - Carro;");
        System.out.println("2 - Moto;");
        System.out.println("3 - Nave espacial;");

        while(true){
            int escolha = Validacao.validaInteiro("Insira uma opção: ");
            // CADASTRO CARRO
            if(escolha == 1){
                System.out.println();
                double valorDiaria = Validacao.validaDouble("Valor da diária: ");
                String descricao = Validacao.validaString("Descrição: ");
                String identificacao = Validacao.validaString("Identificação: ");
                int numeroPassageiros = Validacao.validaInteiro("Número passageiros: ");
                Veiculo carro = new Veiculo(TipoVeiculo.CARRO, valorDiaria, descricao, identificacao, numeroPassageiros);
                return carro;
            }
            // CADASTRO MOTO
            else if(escolha == 2){
                System.out.println();
                double valorDiaria = Validacao.validaDouble("Valor da diária: ");
                String descricao = Validacao.validaString("Descrição: ");
                String identificacao = Validacao.validaString("Identificação: ");
                int escolhaPartida;
                boolean partidaEletrica;
                while (true){
                    escolhaPartida = Validacao.validaInteiro("Possui partida elétrica [1-Sim|2-Não]: ");
                    if(escolhaPartida == 1){
                        partidaEletrica = true;
                        break;
                    }
                    else if(escolhaPartida == 2){
                        partidaEletrica = false;
                        break;
                    }
                    else{
                        System.out.println("Opção inválida. Tente novamente!");
                    }
                }
                Veiculo moto = new Veiculo(TipoVeiculo.MOTO, valorDiaria, descricao, identificacao, partidaEletrica);
                return moto;
            }
            // CADASTRO NAVE_ESPACIAL
            else if(escolha == 3){
                System.out.println();
                double valorDiaria = Validacao.validaDouble("Valor da diária: ");
                String descricao = Validacao.validaString("Descrição: ");
                String identificacao = Validacao.validaString("Identificação: ");
                int escolhaMotor;
                MotorNave motorNave;
                while (true){
                    escolhaMotor = Validacao.validaInteiro("Motor [1-Atômico|2-Combustão]: ");
                    if(escolhaMotor == 1){
                        motorNave = MotorNave.ATOMICO;
                        break;
                    }
                    else if(escolhaMotor == 2){
                        motorNave = MotorNave.COMBUSTAO;
                        break;
                    }
                    else{
                        System.out.println("Opção inválida. Tente novamente!");
                    }
                }
                Veiculo naveEspacial = new Veiculo(TipoVeiculo.NAVE_ESPACIAL, valorDiaria, descricao, identificacao, motorNave);
                return naveEspacial;
            }
            else{
                System.out.println("Opção inválida. Tente novamente!");
            }
        }
    }
}
