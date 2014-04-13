/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

/**
 *
 * @author Igor
 */
public class Comida extends Produto{
            private boolean perecivel ;
            private double peso; //A validade é em meses a partir do momento da abertura
    
            public Comida(String nome, double preco, boolean perecivel , double peso) {
               super(nome, preco);
               this.perecivel = perecivel;
               this.peso = peso;
            }
    
}
