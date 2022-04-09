package Ted1.Atividade1;

import java.util.Scanner;

public class Atv {
    static Scanner sc = new Scanner(System.in);
    //Questão 1
    public static void calculaCréditos(Double creditos,float percent){
         double novoValor = creditos *(1+(percent/100));
        System.out.println(novoValor);
    }
    //Questão 2
    public static void imparOuPar(){
        for (int i = 0 ; i<10;i++){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n%2 == 0){
                System.out.println("Múmero par");
            }else {
                System.out.println("número impar");
            }
        }
    }
    //Questão 3
    public static void salário(){
        String continuar = null;
        while (continuar != "Fim"){
            Scanner sc = new Scanner(System.in);
            System.out.println("Quanto ganha :");
            double salario  = sc.nextDouble();
            salario = salario*1.2;
            System.out.println(salario);
            System.out.println("deseja continuar?");
            continuar = sc.nextLine();
        }
    }
    //Questão 4
    public static void gasolina(){
        double refris2 = 6.00;
        System.out.println("Quantos litros ?");
        double litros =sc.nextDouble();
        double valor = ((litros*2.5)+6);
        System.out.println("Valortotal  : " + valor);
    }
    // Questão 5
    public static void emprestimo(Double salarioBruto,double prestação){
        if (prestação>salarioBruto*0.3){
            System.out.println("Empréstimo não pode ser concedido");

        }
        else {
            System.out.println("Pega esse empréstimo ai");
        }
    }
    //Questão 6
    public static void notas(){
        double nota1;
        double nota2;
        for (int i = 0 ; i<=5;i++){
            System.out.println("Nota 1:");
            nota1 = sc.nextDouble();
            System.out.println("Nota 2:");
            nota2 = sc.nextDouble();
            double media= (nota1+nota2)/2;
            System.out.println("Média : " + media);
        }
    }
    //Questão 7
    public static void sete(){
        float INICIAL = 40;
        Scanner input = new Scanner(System.in);
        float precoTotal = 0;
        String nome = "";
        while(!nome.equals("sair")){
            System.out.println("Digite o nome do próximo cliente ou 'sair' para sair");
            nome = input.nextLine();
            if (nome.equals("sair")) {
                break;
            }
            int dias = 0;
            System.out.println("Digite a quantidade de dias: ");
            dias = Integer.parseInt(input.nextLine());
            if(dias < 10){
                precoTotal = INICIAL + (dias * 15);
            }else{
                precoTotal = INICIAL + (dias * 8);
            }
            System.out.println("A conta de " + nome + " teve o valor de: R$" + precoTotal);
        }

    }
    //Questão 8
    public static void oito{
        Scanner leitor = new Scanner(System.in);
        String nome;
        String sexo;
        int idade;
        double altura;
        double peso;

        int F = 0;
        int M = 0;
        int MediaIdade = 0;
        int quantidadePessoaIdade = 0;
        int maiorIdade = 0;
        String nomeMaiorIdade = null;
        double menoralturaF = 5;
        String nomeMulherBaixa = null;


        int i;
        for (i= 0; i <= 1; i++) {
            System.out.println("Informe seu nome");
            nome = leitor.nextLine();
            System.out.println("Digite seu sexo no formato M ou F");
            sexo = leitor.nextLine();
            System.out.println("Informe sua idade");
            idade = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite sua altura");
            altura = Double.parseDouble(leitor.nextLine());
            System.out.println("Digite seu peso");
            peso = Double.parseDouble(leitor.nextLine());

            if(sexo.equals("M")){
                MediaIdade += idade;
                M++;
            }
            if(sexo.equals("F") && altura > 1.60 && altura < 1.70 && peso > 70){
                F++;
            }
            if(idade > 18 && idade <25){
                quantidadePessoaIdade++;
            }
            if(idade > maiorIdade){
                maiorIdade = idade;
                nomeMaiorIdade = nome;

            }
            if(sexo.equals("F") && altura < menoralturaF){
                nomeMulherBaixa = nome;

            }
        }
        System.out.println("numeros de paciente "+ i);
        System.out.println("Media de idade "+ MediaIdade/ M);
        System.out.println("Quantidade de Mulheres "+ quantidadePessoaIdade);
        System.out.println("Nome do paciente mais velho " + nomeMaiorIdade);
        System.out.println("Nome da mulher mais baixa " + nomeMulherBaixa);
    }
    }



