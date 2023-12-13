package org.thc.criacional;

public class FactoryMethodParameter_ex02 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

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

        public Produto novoProduto(int tipoProduto) {
            return switch (tipoProduto) {
                case 1 -> new ProdutoPadrao();
                case 2 -> new ProdutoDigital();
                case 3 -> new ProdutoFisico();
                default -> throw new IllegalArgumentException();
            };
        }
    }

}
