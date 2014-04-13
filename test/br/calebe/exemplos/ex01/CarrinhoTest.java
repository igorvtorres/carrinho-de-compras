package br.calebe.exemplos.ex01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CarrinhoTest {

    private Carrinho carrinho;

    @Before
    public void criandoCarrinho() {
        carrinho = new Carrinho();
    }

    @Test(expected = CarrinhoVazioExpected.class)
    public void colocandoZeroProduto() throws CarrinhoVazioExpected {
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{null}, new Object[]{menor});
    }

    @Test
    public void colocandoUmProduto() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{livro}, new Object[]{menor});
    }

    @Test
    public void colocandoMaisProdutos() throws CarrinhoVazioExpected {
        Produto livro = new Produto("Java em 24 horas", 50.00);
        carrinho.add(livro);
        Produto deitel = new Produto("Java: como programar", 150.00);
        carrinho.add(deitel);
        Produto menor;
        menor = carrinho.menorProduto();
        assertArrayEquals(new Object[]{livro}, new Object[]{menor});
    }

    @Test
    public void identidadeDeProdutos() throws CarrinhoVazioExpected {
        Produto original = new Produto("Java em 24 horas", 50.00);
        carrinho.add(original);
        Produto copia = new Produto("Java em 24 horas", 50.00);
        original = carrinho.menorProduto();
        assertArrayEquals(new Object[]{original}, new Object[]{copia});
    }
    
    @Test
    public void testarRemoverUmProdutoDoCarrinho(){
        Carrinho c = new Carrinho();
        Produto p = new Produto("Giully", 5.78);
        c.add(p);
        c.remove(p);
        boolean existe;
        existe = c.exists(p);
        assertFalse(existe);
    }
    
    @Test
    public void testarSaldoDoCarrinho(){
        Carrinho c = new Carrinho();
        Produto p = new Produto("Giully", 5.000);
        c.add(p);
        Produto a = new Produto("PHP", 25.000);
        c.add(a);
        double aux = c.ValorCarrinho();
        double prc1 = p.getPreco();
        double prc2 = a.getPreco();
        boolean test;
        if(aux - prc1 - prc2 == 0) test = true;
        else test = false;
        assertTrue(test);
    }
    

    @Test
    public void testarListarProdutos(){
        Carrinho c = new Carrinho();
        Produto p = new Produto("Giully", 5.000);
        c.add(p);
        Produto a = new Produto("PHP", 25.000);
        c.add(a);
        boolean result = c.ListarProdutos();
        assertTrue(result);
    }
    
}
