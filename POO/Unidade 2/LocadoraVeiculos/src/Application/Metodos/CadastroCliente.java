package Application.Metodos;

import Application.Validacao.Validacao;
import Entities.Cliente;

public class CadastroCliente {
    public static Cliente cadastrar(){
        UI.linha();
        System.out.println("* Cadastro de cliente *");
        System.out.println();
        String nome = Validacao.validaString("Nome: ").toUpperCase();
        long rg = Validacao.validaLong("RG (Somente números): ");
        long cpf = Validacao.validaLong("CPF (Somente números): ");
        long telefone = Validacao.validaLong("Telefone (Somente números): ");
        String email = Validacao.validaString("E-mail: ");
        Cliente cliente = new Cliente(nome, rg, cpf, telefone, email);
        return cliente;
    }
}
