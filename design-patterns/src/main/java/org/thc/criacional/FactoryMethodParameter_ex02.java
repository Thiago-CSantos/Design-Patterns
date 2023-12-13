package org.thc.criacional;

public class FactoryMethodParameter_ex02 {

    @SuppressWarnings("unused")
    public void main(String[] args) {
        Categoria categoria = new Categoria();
        Produto produtoDigital = categoria.novoProduto(TypeProductEnum.DIGITAL);
    }
    // Produto -> ProdutoFactory opcional colocar 'Factory'
    // ProcessadorPagamento -> ProcessadorPagamentoFactory

    // Criador concreto com parâmetro
    // Produto Abstrato
    // Produto concreto

    // Produto Abstrato
    interface Produto {
    }

    // Produto concreto
    class ProdutoFisico implements Produto {
        // metodos da classe e atributos
    }

    // Produto concreto
    class ProdutoDigital implements Produto {
        // metodos da classe e atributos
    }

    // Produto concreto
    class ProdutoPadrao implements Produto {
        // metodos da classe e atributos
    }

    // Criador concreto com parâmetro
    class Categoria {
        //  private String nome;
        //  private Integer prioridade;

        // ...

        public Produto novoProduto(TypeProductEnum tipoProduto) {
            switch (tipoProduto) {
                case PADRAO:
                    return new ProdutoPadrao();
                case DIGITAL:
                    return new ProdutoDigital();
                case FISICO:
                    return new ProdutoFisico();
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

}
