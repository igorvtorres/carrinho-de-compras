/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.exemplos.ex01;

/**
 *
 * @author Igor
 */
public class Maquiagem extends Produto{
    
        private String cor;
        private int valMes; //A validade é em meses a partir do momento da abertura
        
        public Maquiagem(String nome, double preco, String cor, int valMes) {
               super(nome, preco);
               this.cor = cor;
               this.valMes = valMes;
        }
        
    
}
