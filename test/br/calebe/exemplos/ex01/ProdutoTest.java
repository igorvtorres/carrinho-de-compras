/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Igor
 */
public class ProdutoTest {
    
    public ProdutoTest() {
    }
    
 @Test
    public void testarMesmoProdutoEmIntanciasDiferentes(){
         //Carrinho c = new Carrinho();
         Produto p1 = new Produto("Coca-cola",5.90);
         //c.add(p1);
         //boolean existe;
         Produto p2 = new Produto("Coca-cola",7.40);
         //existe = c.exists(p2);
         //assertTrue(existe);
         //if (p1.preco.equals(p2)){
             
         
        }
 
 @Test
    public void testarMudarOPrecoDoProduto(){
        double aux1 = new Float(5.000);
        double aux2 = new Float(10.000);
        Produto p = new Produto("Giully", aux1);
        p.trocaPreco(aux2);
        boolean existe;
        existe = p.existsPreco(aux1);
        assertFalse(existe);
    }
 
  @Test
    public void testarPrecoNegativo(){
        double aux1 = new Float(-5.00);
        Produto p = new Produto("Giully", aux1);
        p.PrecoNegativo();
        boolean existe;
        existe = p.PrecoNegativo();
        assertFalse(existe);
    }
}
 
 

