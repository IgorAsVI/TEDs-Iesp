package Application;

import java.util.Scanner;

public class UI {

    public static void exibeMenu(){
        while (true) {
            UI.menu();
            int opcao = new Scanner(System.in).nextInt();
            if (opcao ==1 ){
                Metodos.criarClientes();
                System.out.flush();
            }else if(opcao == 2){
                Metodos.criarContrato();
            }else if (opcao == 4){
                Metodos.lstCliente();
            }else if (opcao == 5){
                Metodos.lstContrato();
            }else if (opcao == 6){
                Metodos.listSinistre();
            }else if (opcao == 7){
                Metodos.lstContratoSemSinistro();
            }else if(opcao == 8 ){
                System.out.println("Obrigado por usar nosso app");
                break;
            }
        }
    }

    public static void menu(){
        System.out.println("**************** Menu ****************");
        System.out.println("1 - Cadastro de clientes             |");
        System.out.println("2 - Cadastro de contratos            |");
        System.out.println("3 - Cadastro de sinistro             |");
        System.out.println("4 - Lista de clientes                |");
        System.out.println("5 - Lista de contratos               |");
        System.out.println("6 - Lista de sinistros               |");
        System.out.println("7 - Lista de contatos sem sinistro   |");
        System.out.println("8 - Sair                             |");
        System.out.println("**************************************");
        System.out.print("Selecione a opção desejada:");

    }


}
