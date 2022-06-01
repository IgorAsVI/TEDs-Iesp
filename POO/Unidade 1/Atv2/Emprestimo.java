package Ted1.Atv2;

public class Emprestimo {
    private String nomeUsuario;
    private int idade;
    private float valorEmprestimo;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(float valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public float getPercentualJurosMes() {
        return percentualJurosMes;
    }

    public void setPercentualJurosMes(float percentualJurosMes) {
        this.percentualJurosMes = percentualJurosMes;
    }

    public int getMesesParaPagar() {
        return mesesParaPagar;
    }

    public void setMesesParaPagar(int mesesParaPagar) {
        this.mesesParaPagar = mesesParaPagar;
    }

    private float percentualJurosMes;
    private int mesesParaPagar;

    public void imprimir(){
        System.out.println("Nome do usuario: " + nomeUsuario);
        System.out.println("Idade do usuario: " + idade);
        System.out.println("Valor do emprestimo: " + valorEmprestimo);
        System.out.println("Percentual de juros ao mes: " + percentualJurosMes);
        System.out.println("Meses para pagar: " + mesesParaPagar);
    }

    public float calcularEmprestimo(){
        float valorCalculado = 0;
        if(idade >= 18 && idade < 23){
            valorCalculado = (valorEmprestimo/mesesParaPagar) * percentualJurosMes;
        }
        else if(idade > 23 && idade <= 33){
            valorCalculado = (valorEmprestimo*10)/100;
        }
        return valorCalculado;
    }
}
