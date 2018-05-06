/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author igorbueno
 */
public class BarracaHotDog implements Iterable<Produto>{
    private LinkedList<Produto> produtos;

    public BarracaHotDog() {
        this.produtos = new LinkedList<>();
        this.produtos.add(new Produto(1, "HotDog pequeno", 3.50));
        this.produtos.add(new Produto(2, "HotDog médio", 4.50));
        this.produtos.add(new Produto(3, "HotDog grande", 5.50));
    }

    private LinkedList<Produto> getProdutos() {
        return produtos;
    }
    
    @Override
    public Iterator<Produto> iterator() {
        return this.getProdutos().iterator();
    }    
}
