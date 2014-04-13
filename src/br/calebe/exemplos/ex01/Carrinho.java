package br.calebe.exemplos.ex01;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    public void add(Produto produto) {
        produtos.add(produto);
    }

    public Produto menorProduto() throws CarrinhoVazioExpected {
        if (produtos.isEmpty()) {
            throw new CarrinhoVazioExpected();
        }
        Produto menor = produtos.get(0);
        for (Produto produto : produtos) {
            if (produto.getPreco() < menor.getPreco()) {
                menor = produto;
            }
        }
        return menor;
    }
    
    public boolean exists(Produto p){
        return produtos.contains(p);
    }
    
    public void remove(Produto p) {
        produtos.remove(p);
    }
    
    
    
    public double ValorCarrinho(){
        if (produtos.isEmpty()) {
            return 0;
        }
        double saldo = 0.00;
        for (Produto produto : produtos) {
            saldo = saldo + produto.getPreco();
        }
        return saldo;
    }

}