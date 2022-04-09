package Ted1;

import Ted1.Atividade1.Atv;
import Ted1.Atv2.Emprestimo;

public class main {
    Produto pPro = new Produto("123","mt bom",100,80,true);
    Produto pNaoPro = new Produto("123","mt bom",100,70,false);
    Vendedor v = new Vendedor("igor","V01","Logo ali");
    Venda venda = new Venda(pNaoPro,v,0.1,2,400);

    public static void main(String[] args) {
       // Atv.salário();
        Emprestimo em = new Emprestimo();
        em.setIdade(15);
        em.setMesesParaPagar(8);
        em.setNomeUsuario("sada");
        em.setPercentualJurosMes(10);
        em.setValorEmprestimo(100);
        em.imprimir();
        System.out.println(em.calcularEmprestimo());

    }
}
