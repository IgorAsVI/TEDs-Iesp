package Application.Metodos;

public class UI {
    public static void exibirMenu(){
        System.out.println();
        System.out.println("********** MENU **********");
        System.out.println("1 - Cadastrar veículo;");
        System.out.println("2 - Cadastrar cliente;");
        System.out.println("3 - Locar veículo;");
        System.out.println("4 - Listar veículos cadastrados;");
        System.out.println("5 - Listar clientes;");
        System.out.println("6 - Listar locações;");
        System.out.println("7 - Listar veículos disponíveis;");
        System.out.println("8 - Finalizar programa;");
        System.out.println();
    }

    public static void linha(){
        System.out.println("--=----=----=----=----=----=----=----=--");
    }
    public static void finalizarPrograma(){
        linha();
        System.out.println("FINALIZANDO PROGRAMA...");
        linha();
        System.out.println();
        System.out.println("********** PROGRAMADORES **********");
        System.out.println("- ÍCARO RAPHAEL QUEIROZ CAVALCANTE");
        System.out.println("- VINÍCIUS NASCIMENTO CRUZ");
        System.out.println("- GABRIEL DE LIMA ARRUDA");
        System.out.println("- MATEUS JONAS FERREIRA");
        System.out.println("- IGOR DE ASSIS VILAR");
    }
}
