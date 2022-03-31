package Ted1;

public class main {
    Produto pPro = new Produto("123","mt bom",100,80,true);
    Produto pNaoPro = new Produto("123","mt bom",100,70,false);
    Vendedor v = new Vendedor("igor","V01","Logo ali");
    Venda venda = new Venda(pNaoPro,v,0.1,2,400);

    public static void main(String[] args) {
        Produto pPro = new Produto("123","mt bom",100,70,true);
        Produto pNaoPro = new Produto("123","mt bom",100,70,false);
        Vendedor v = new Vendedor("igor","V01","Logo ali");
        Venda venda = new Venda(pNaoPro,v,0.1,2,400);

        venda.calculaValor();
        venda.calcularComissao();
        venda.exibe();
        venda.efetuarDesconto(90);
    }
}
