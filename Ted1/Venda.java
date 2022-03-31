package Ted1;

public class Venda {
    Produto produto;
    Vendedor vendedor;
    double  desconto;
    int quantItens;
    double valor;

    public Venda(Produto produto, Vendedor vendedor, double desconto, int quantItens,double valor) {
        this.produto = produto;
        this.vendedor = vendedor;
        this.desconto = desconto;
        this.quantItens = quantItens;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantItens() {
        return quantItens;
    }

    public void setQuantItens(int quantItens) {
        this.quantItens = quantItens;
    }
    public void efetuarDesconto(double percent){
        this.desconto = (percent/100) - 1;
        this.valor = this.produto.getValorVenda() * this.desconto;
        if (this.valor < produto.getValorCusto()){
            System.out.println("Se fizer essa venda vai dar preju em doidão");
        }else {
            System.out.println("Bom negócio!");
        }
    }
    public void calculaValor(){
        this.valor = (this.quantItens*this.produto.getValorVenda()) - this.desconto;
        System.out.println(this.valor);
    }
    public void calcularComissao(){
        if (this.produto.isPromocao() == true){
            double valorComissao =( this.vendedor.getComissao() * this.produto.getValorVenda())/2;
            System.out.println(valorComissao);
        }
        double valorComissao =( this.vendedor.getComissao() * this.produto.getValorVenda());
        System.out.println(valorComissao);
    }

        public void exibe(){
            System.out.println(this.getVendedor().getCodigo()+" "+this.getVendedor().getNome()+" "+this.getVendedor().getComissao());
            System.out.println(this.getQuantItens());
            System.out.println(this.getProduto().getCodigo() +" "+ this.getProduto().getDescricao());
        }
}
