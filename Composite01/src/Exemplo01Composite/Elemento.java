/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo01Composite;

/**
 *
 * @author Rodrigo
 */
public abstract class Elemento {
    protected String texto;
    
    public void getTexto(){
        System.out.println(this.texto);
    }
}
