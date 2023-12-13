package org.thc.criacional;

/**
 * Java Design Patterns - Factory Method (1)
 *
 * @author Thiago Carretero dos Santos
 */

/**
 * Vantagens:
 * -Permite trabalhar com hierarquias paralelas
 * -Mais flexibilidade para criação de objetos
 */

public class FactoryMethod_ex01 {

    // Criador Abstrato
    // Produto Abstrato
    // Criador Concreto
    // Produto Concreto

    @SuppressWarnings("unused")
    public void main(String[] args) {
        Categoria categoria = new Fisisco();
        Produto produto = categoria.novoProduto();
    }

    // Produto Abstrato
    interface Produto {
    }

    // Produto Concreto
    class ProdutorFisisco implements Produto {
        // metodos da classe e atributos
    }

    // Produto Concreto
    class ProdutorDigital implements Produto {
        // metodos da classe e atributos
    }

    // Criador Abstrato
    interface Categoria {
        Produto novoProduto();
    }

    // Criador Concreto
    class Digital implements Categoria {

        @Override
        public Produto novoProduto() {
            // ... logica de negocio
            return new ProdutorDigital();
        }
    }

    // Criador Concreto
    class Fisisco implements Categoria {

        @Override
        public Produto novoProduto() {
            return new ProdutorFisisco();
        }
    }

}
