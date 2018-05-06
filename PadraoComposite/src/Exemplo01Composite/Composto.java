/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo01Composite;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Composto extends Elemento {

    static int nivel = 1;
    protected ArrayList<Elemento> listaElementos;

    protected Composto(String texto) {
        this.texto = texto;
        this.listaElementos = new ArrayList<Elemento>();

    }

    public void add(Elemento elemento) {
        this.listaElementos.add(elemento);
    }

    @Override
    public void getTexto() {
        System.out.println(this.texto);
        for (Elemento elemento : listaElementos) {
            elemento.getTexto();
            
        }
    }


}
