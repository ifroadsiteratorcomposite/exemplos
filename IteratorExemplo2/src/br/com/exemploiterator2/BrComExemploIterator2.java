package br.com.exemploiterator2;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import model.BarracaHotDog;
import model.BarracaTapioca;
import model.Produto;

public class BrComExemploIterator2 {

    public static void main(String[] args) {
        Iterator<Produto> iteratorArrayList = new BarracaTapioca().iterator();
        Iterator<Produto> iteratorLinkedList = new BarracaHotDog().iterator();
        Set<Produto> listaFinal = new HashSet();
        
        while(iteratorArrayList.hasNext()){
            Produto prod = iteratorArrayList.next();
            listaFinal.add(prod);
        }
        
        while(iteratorLinkedList.hasNext()){
            Produto prod = iteratorLinkedList.next();
            listaFinal.add(prod);            
        }
        
        for(Produto prod : listaFinal){
            System.out.println(prod.toString());
        }
    }

}
