package Application;

import Entities.Cliente;
import Entities.Contrato;
import Entities.ContratoEmpresarial;
import Entities.ContratoResidencial;
import Entities.Sinistro;
import Entities.Enum.TipoPessoa;
import Entities.Enum.TipoRamo;
import Entities.Enum.TipoResidencia;
import Entities.Enum.TipoZona;

import java.util.Scanner;

public class Metodos {

    public static int validaInteiro(String txt) {
        int inteiro;
        while (true) {
            try {
                System.out.print(txt);
                inteiro = new Scanner(System.in).nextInt();
                break;
            } catch (Exception exception) {
                System.out.println("Valor não é um inteiro. Tente novamente!");
            }
        }
        return inteiro;
    }
    public static long validaLong(String txt) {
        Long inteiro;
        while (true) {
            try {
                System.out.print(txt);
                inteiro = new Scanner(System.in).nextLong();
                break;
            } catch (Exception exception) {
                System.out.println("Valor não é um inteiro. Tente novamente!");
            }
        }
        return inteiro;
    }

    public static String validaString(String txt) {
        String texto;
        while (true) {
            try {
                System.out.print(txt);
                texto = new Scanner(System.in).nextLine();
                break;
            } catch (Exception exception) {
                System.out.println("Valor não é uma string. Tente novamente!");
            }
        }
        return texto;
    }

    public static double validaDouble(String txt) {
        double valor;
        while (true) {
            try {
                System.out.print(txt);
                valor = new Scanner(System.in).nextDouble();
                break;
            } catch (Exception exception) {
                System.out.println("Valor não é um  valor válido. Tente novamente!");
            }
        }
        return valor;
    }

    public static void criarClientes() {
        TipoPessoa tipopessoa = null;
        System.out.println("Criação de cliente: ");
        long doc = Metodos.validaLong("Digite seu documento: ");
        String nome = Metodos.validaString("Digite seu Nome: ");
        int tipo = Metodos.validaInteiro("\n1-Pessoa Física\n2-Pessoa Jurídica \nEscolha seu tipo de pessoa:");
        if (tipo == 1) {
            tipopessoa = TipoPessoa.valueOf("FISICA");
        } else {
            tipopessoa = TipoPessoa.valueOf("JURIDICA");
        }
        Cliente c1 = new Cliente(doc, nome, tipopessoa);
        Cliente.setUtilClientes(c1);
    }

    public static void criarContrato() {
        TipoRamo tipoRamo = null;
        TipoZona tipoZona = null;
        TipoResidencia tipoResidencia = null;
        System.out.println("Criação de contato: ");
        long doc = Metodos.validaLong("Digite seu documento do cliente : ");
        while (!Cliente.getMapClienteDoc().containsKey(doc)) {
            System.out.println("Cliente não encontrado...");
            doc = Metodos.validaInteiro("Digite seu documento do cliente : ");
        }
        Cliente cliente = Cliente.getMapClienteDoc().get(doc);
        double valor = Metodos.validaDouble("Digite o valor do contrato: ");
        int tipo = Metodos.validaInteiro("1-Empresarial\n2-Residencial\nDigite o tipo do contrato: ");
        if (tipo == 1) {
            int numeroFunc = Metodos.validaInteiro("Digite o numero de funcionários: ");
            int visitas = Metodos.validaInteiro("Digite o numero de visitas diárias: ");
            int ramo = Metodos.validaInteiro("1-Comércio\n2-Indústria\n3-Agropecuário\n Digite o ramo dam empresa: ");
            while (ramo != 1 && ramo != 2 && ramo != 3) {
                System.out.println("Ramo inesistente");
                ramo = Metodos.validaInteiro("1-Comércio\n2-Indústria\n3-Agropecuário\n Digite o ramo dam empresa: ");
            }
            if (ramo == 1) {
                tipoRamo = TipoRamo.valueOf("COMERCIO");
            } else if (ramo == 2) {
                tipoRamo = TipoRamo.valueOf("INDUSTRIA");
            } else if (ramo == 3) {
                tipoRamo = TipoRamo.valueOf("AGROPECUARIA");
            }
            int SimNao = Metodos.validaInteiro("1- Sim \n2- Não\nDeseja adicionar um sinistro: ");
            if(SimNao == 1){
                String data = Metodos.validaString("Digite a data: ");
                double porcentagem = Metodos.validaDouble("Digite a porcentagem desejada: ");

                Sinistro sinistro = new Sinistro(data, porcentagem);
                Sinistro.setListSinistre(sinistro);
                Contrato contrato = new ContratoEmpresarial(cliente,valor,sinistro, numeroFunc,visitas,tipoRamo);
                Contrato.setLstContrato(contrato);

            }else{
                Sinistro sinistro = null;
                Contrato contrato = new ContratoEmpresarial(cliente,valor,sinistro, numeroFunc,visitas,tipoRamo);
                Contrato.setLstContrato(contrato);
            }
            
        } else if (tipo == 2) {
            String endereco = Metodos.validaString("digite seu endereço: ");
            int zona = Metodos.validaInteiro("1-URBANA\n2-SUBURBANA\n3-RURAL\n Digite o a zona do seu endereço: ");
            while (zona != 1 && zona != 2 && zona != 3) {
                System.out.println("Zona inesistente");
                zona = Metodos.validaInteiro("1-URBANA\n2-SUBURBANA\n3-RURAL\n Digite o a zona do seu endereço: ");
            }
            if (zona == 1) {
                tipoZona = TipoZona.valueOf("URBANA");
            } else if (zona == 2) {
                tipoZona = TipoZona.valueOf("SUBURBANA");
            } else if (zona == 3) {
                tipoZona = TipoZona.valueOf("RURAL");
            }
            int residencia = Metodos.validaInteiro("1-Casa\n2-Apartamento\n Digite o tipo da sua residencia: ");
            while (residencia != 1 && residencia != 2 ) {
                System.out.println("Tipo inesistente");
                residencia = Metodos.validaInteiro("1-Casa\n2-Apartamento\n Digite o a zona do seu endereço: ");
            }
            if (residencia == 1) {
                tipoResidencia = TipoResidencia.valueOf("CASA");
            } else if (zona == 2) {
                tipoResidencia = TipoResidencia.valueOf("APARTAMENTO");
            }
            int SimNao = Metodos.validaInteiro("1- Sim \n2- Não\nDeseja adicionar um sinistro: ");
            if(SimNao == 1){
                String data = Metodos.validaString("Digite a data: ");
                double porcentagem = Metodos.validaDouble("Digite a porcentagem desejada: ");

                Sinistro sinistro = new Sinistro(data, porcentagem);
                Sinistro.setListSinistre(sinistro);
                Contrato contrato = new ContratoResidencial(cliente,valor,sinistro, endereco,tipoZona,tipoResidencia);
                Contrato.setLstContrato(contrato);

            }else{
                Sinistro sinistro = null;
                Contrato contrato = new ContratoResidencial(cliente,valor,sinistro, endereco,tipoZona,tipoResidencia);
                Contrato.setLstContrato(contrato);
            }
            

        }

    }

    public static void lstCliente() {
        for (Cliente c : Cliente.getLstClientes()) {
            System.out.println(c.toString());
        }

    }

    public static void lstContrato() {
        for (Contrato c : Contrato.getLstContrato()) {
            System.out.println(c.toString());
        }
    }

    public static void listSinistre(){
        for (Sinistro s: Sinistro.getListSinistre()){
            System.out.println(s.toString());
        }
    }
    public static void lstContratoSemSinistro() {
        for (Contrato c : Contrato.getLstContrato()) {
            if(c.getSinistro() == null)
            System.out.println(c.toString());
        }
    }
}

