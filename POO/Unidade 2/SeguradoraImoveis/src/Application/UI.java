package Application;

import java.util.Scanner;

public class UI {

    public static void exibeMenu(){
        while (true) {
            UI.menu();
            int opcao = Metodos.validaInteiro("Digite a opção desejada:  ");

            if (opcao ==1 ){
                Metodos.criarClientes();
            }else if(opcao == 2){
                Metodos.criarContrato();
            }else if (opcao == 3){
                Metodos.lstCliente();
            }else if (opcao == 4){
                Metodos.lstContrato();
            }else if (opcao == 5){
                Metodos.listSinistre();
            }else if (opcao == 6){
                Metodos.lstContratoSemSinistro();
            }else if(opcao == 7 ){
                System.out.println("Obrigado por usar nosso app");
                break;
            }
        }
    }

    public static void menu(){
        System.out.println("**************** Menu ****************");
        System.out.println("1 - Cadastro de clientes             |");
        System.out.println("2 - Cadastro de contratos            |");
        System.out.println("3 - Lista de clientes                |");
        System.out.println("4 - Lista de contratos               |");
        System.out.println("5 - Lista de sinistros               |");
        System.out.println("6 - Lista de contatos sem sinistro   |");
        System.out.println("7 - Sair                             |");
        System.out.println("**************************************");
        System.out.print("Selecione a opção desejada:");

    }


}
