/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author igorbueno
 */
public class BarracaTapioca implements Iterable<Produto> {
    private ArrayList<Produto> produtos;

    public BarracaTapioca() {
        this.produtos = new ArrayList<>();
        this.produtos.add(new Produto(1, "Tapioca frango", 5.00));
        this.produtos.add(new Produto(2, "Tapioca carne", 5.50));
        this.produtos.add(new Produto(3, "Tapioca chocolate", 6.50));

    }

    @Override
    public Iterator<Produto> iterator() {
        return this.produtos.iterator();
    }
}
